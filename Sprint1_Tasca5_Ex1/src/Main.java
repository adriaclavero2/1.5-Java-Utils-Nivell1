import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path of the directory you want to list:");
        String path = scanner.nextLine();

        File folder = new File(path);

        if (folder.isDirectory()) {
            String[] elements = folder.list();

            if (elements != null) {
                Arrays.sort(elements);

                System.out.println("Contents of the directory " + path + " sorted alphabetically:");
                for (String name : elements) {
                    System.out.println(name);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The path is not a valid directory.");
        }

        scanner.close();
    }
}