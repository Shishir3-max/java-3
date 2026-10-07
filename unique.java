import java.util.Scanner;

public class Task1UniqueStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] arr = new String[10];
        int count = 0;

        System.out.println("Enter 10 unique strings:");

        while (count < 10) {
            System.out.print("Enter string " + (count + 1) + ": ");
            String str = input.nextLine();

            boolean duplicate = false;

            // Check whether the string already exists
            for (int i = 0; i < count; i++) {
                if (arr[i].equalsIgnoreCase(str)) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                System.out.println("Duplicate string! Please enter another string.");
            } else {
                arr[count] = str;
                count++;
                System.out.println("String added successfully.");
            }
        }

        System.out.println("\nUnique Strings in the Array:");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }

        input.close();
    }
}