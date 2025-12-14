import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("a.txt");
        int b;
        byte[] buffer = new byte[1024];
        while((b=fos.read(buffer))!=-1){
            System.out.print(new String(buffer,0,b));
        }
        fos.close();
    }
}
