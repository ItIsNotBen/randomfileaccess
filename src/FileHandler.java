import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileHandler {

    // random file access: read one character from the file at a given position
    public static char randomRead(String fileName, int startPos) {
        try(RandomAccessFile rs = new RandomAccessFile(fileName, "rws")) {
            rs.seek(startPos);
            char letter = (char)rs.readLine();
            System.out.println(letter);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;

        }
    }
}