import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner reader = new Scanner(file);
            System.out.println("Reading file content:\n");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}
