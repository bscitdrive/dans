package stringservice;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class StringClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1092);
            StringService srv = (StringService) registry.lookup("StringService");

            Scanner sc = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\n--- String Operations Menu ---");
                System.out.println("1. Length");
                System.out.println("2. Reverse");
                System.out.println("3. Concat");
                System.out.println("4. To Uppercase");
                System.out.println("5. To Lowercase");
                System.out.println("6. Substring");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();  // skip newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter string: ");
                        System.out.println("Length: " + srv.length(sc.nextLine()));
                        break;

                    case 2:
                        System.out.print("Enter string: ");
                        System.out.println("Reverse: " + srv.reverse(sc.nextLine()));
                        break;

                    case 3:
                        System.out.print("Enter first string: ");
                        String s1 = sc.nextLine();
                        System.out.print("Enter second string: ");
                        String s2 = sc.nextLine();
                        System.out.println("Concat: " + srv.concat(s1, s2));
                        break;

                    case 4:
                        System.out.print("Enter string: ");
                        System.out.println("Uppercase: " + srv.toUpper(sc.nextLine()));
                        break;

                    case 5:
                        System.out.print("Enter string: ");
                        System.out.println("Lowercase: " + srv.toLower(sc.nextLine()));
                        break;

                    case 6:
                        System.out.print("Enter string: ");
                        String s = sc.nextLine();
                        System.out.print("Start index: ");
                        int start = sc.nextInt();
                        System.out.print("End index: ");
                        int end = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Substring: " + srv.substring(s, start, end));
                        break;

                    case 7:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
