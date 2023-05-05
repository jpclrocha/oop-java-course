package section19generics.exercise3.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (map.containsKey(name)) {
                    int votes = map.get(name);
                    map.put(name, count + votes);
                } else {
                    map.put(name, count);
                }

                line = br.readLine();
            }

            for (String candidato : map.keySet()) {
                System.out.println(candidato + "," + map.get(candidato));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
