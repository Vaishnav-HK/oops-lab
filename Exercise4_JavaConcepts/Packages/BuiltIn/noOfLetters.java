import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class noOfLetters {
    public static void main(String[] args) {
        int length=0;
        try {
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);
            System.out.println("Reading file content:\n");
            while (reader.hasNextLine()) {
                String line = reader.nextLine().replace(" ","");
                length=length+line.length();
            }
            reader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
        System.out.println("There are "+length+" letters");
    }
}
