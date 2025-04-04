import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class noOfLines {
    public static void main(String[] args) {
        int c=0;
        try {
            File file = new File("input.txt");
            Scanner reader = new Scanner(file);
            System.out.println("Reading file content:\n");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                c+=1;
            }
            reader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
        System.out.println("There are "+c+" lines");
    }
}
