package section19generics.exercise1.application;

import section19generics.exercise1.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("");

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader file = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();


            String line = file.readLine();
            while (line != null) {
                String[] fields = line.split(" ");

                set.add(new LogEntry(fields[0], Instant.parse(fields[1])));
                line = file.readLine();
            }

            System.out.println("Total users: " + set.size());


        } catch (IOException e) {
            e.printStackTrace();
        }


        sc.close();
    }
}
