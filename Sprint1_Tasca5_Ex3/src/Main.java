import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        if (!root.isDirectory()) {
            System.out.println("The path is not a valid directory.");
            scanner.close();
            return;
        }

        System.out.println("Enter the path (including the filename.txt at the end of path) where you want to save the TXT file:");
        String savePath = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(savePath);

            listDirectoryRecursively(root, 0, writer);

            writer.close();

            System.out.println("Directory tree saved successfully to: " + savePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }

    public static void listDirectoryRecursively(File folder, int level, FileWriter writer) throws IOException {
        File[] elements = folder.listFiles();

        if (elements != null) {
            Arrays.sort(elements);

            for (File element : elements) {
                String type = element.isDirectory() ? "D" : "F";

                String modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                        .format(new Date(element.lastModified()));

                String indent = "  ".repeat(level);

                writer.write(indent + type + " - " + element.getName()
                        + " (Last modified: " + modified + ")\n");

                if (element.isDirectory()) {
                    listDirectoryRecursively(element, level + 1, writer);
                }
            }
        }
    }

}
