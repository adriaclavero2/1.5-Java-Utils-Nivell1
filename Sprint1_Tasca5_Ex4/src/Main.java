import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demanar la ruta del fitxer TXT
        System.out.println("Enter the path of the TXT file you want to read:");
        String path = scanner.nextLine();

        File file = new File(path);

        // Comprovar si és un fitxer vàlid
        if (!file.exists() || !file.isFile()) {
            System.out.println("The path is not a valid TXT file.");
            scanner.close();
            return;
        }

        // Llegir el fitxer línia per línia
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Contents of the file:\n");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}