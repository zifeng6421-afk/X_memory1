import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputstreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("a.txt",true);
        String str="world";
        fos.write(str.getBytes());
        fos.close();
    }
}
