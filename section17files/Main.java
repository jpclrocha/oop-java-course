package section17files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String sourcePath = sc.nextLine();

        List<Product> list = new ArrayList<>();

        File sourceFileStr = new File(sourcePath);
        String sourceFolderStr = sourceFileStr.getParent();

        boolean sucess = new File(sourceFolderStr + "/out").mkdir();

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
            String item = br.readLine();
            while (item != null) {
                String[] itemProps = item.split(",");
                Product p = new Product(itemProps[0], Double.parseDouble(itemProps[1]), Integer.parseInt(itemProps[2]));
                list.add(p);
                item = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product p : list) {
                    bw.write(p.getName() + ',' + p.getTotalPrice());
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
