import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class copyFile {
    public static void main(String[] args) {
        File inFile = new File("input.txt");      
        File outFile = new File("output.txt");         

        try {
            Scanner reader = new Scanner(inFile);
            FileWriter writer = new FileWriter(outFile);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                writer.write(line + "\n");
            }
            reader.close();
            writer.close();
            System.out.println("File copied");

        } catch (FileNotFoundException e) {
            System.out.println("Error file not found.");
        } catch (IOException e) {
            System.out.println("Error writing to the target file.");
            e.printStackTrace();
        }
    }
}
