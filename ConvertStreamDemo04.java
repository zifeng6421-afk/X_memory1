import sun.nio.cs.ext.GBK;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConvertStreamDemo04 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\temp\\g.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f.txt"), StandardCharsets.UTF_8);
        char[] buf = new char[1024];
        int len;
        while ((len = isr.read(buf)) != -1) {
            osw.write(buf, 0, len);
        }
        isr.close();
        osw.close();

    }
}
