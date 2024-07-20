package Addition;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO {

    // read and write files
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("");
            BufferedReader bf = new BufferedReader(fr);
            String line = bf.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
