import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fra = new FileReader("d.txt");
    int ch;
    char[] bytes=new char[1024];
    while((ch=fra.read(bytes))!=-1){
        System.out.println(new String(bytes,0,ch));
    }
    fra.close();
    }
}
