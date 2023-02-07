package IO2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class a2 {
    public static void main(String[] args) throws IOException {
        File src = new File("src/IO2/a.userinfo.txt");

        File dest = new File("src/IO2");

        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));

        ZipEntry entry = new ZipEntry("a.userinfo.txt");

        zos.putNextEntry(entry);

        FileInputStream fis=new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();

    }
}
