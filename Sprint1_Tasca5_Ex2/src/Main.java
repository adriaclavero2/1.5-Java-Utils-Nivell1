import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path of the directory you want to list recursively:");
        String path = scanner.nextLine();

        File root = new File(path);

        if (root.isDirectory()) {
            listDirectoryRecursively(root, 0);
        } else {
            System.out.println("The path is not a valid directory.");
        }

        scanner.close();
    }

    public static void listDirectoryRecursively(File folder, int level) {
        File[] elements = folder.listFiles();

        if (elements != null) {
            Arrays.sort(elements);

            for (File element : elements) {
                String type = element.isDirectory() ? "D" : "F";
                String modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(element.lastModified()));
                String indent = "  ".repeat(level);

                System.out.println(indent + type + " - " + element.getName() + " (Last modified: " + modified + ")");

                if (element.isDirectory()) {
                    listDirectoryRecursively(element, level + 1);
                }
            }
        }
    }
}