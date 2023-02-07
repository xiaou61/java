package IO;

import java.io.*;

public class a18 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
//        method1();这个占用时间太过长了，所以不做测试了
//        method2();0.596秒
//        method3(); 4.887秒
//        method4();0.543秒
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000.0+"秒");
    }
    public static void method1() throws IOException {
        FileInputStream fis=new FileInputStream("E:\\视频素材\\1月14日.mp4");
        FileOutputStream fos = new FileOutputStream("E:\\视频素材\\copy1.mp4");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    public static void method2() throws IOException {
        FileInputStream fis=new FileInputStream("E:\\视频素材\\1月14日.mp4");
        FileOutputStream fos = new FileOutputStream("E:\\视频素材\\copy2.mp4");
        byte[] bytes=new byte[8192];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\视频素材\\1月14日.mp4"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\视频素材\\copy3.mp4"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\视频素材\\1月14日.mp4"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\视频素材\\copy4.mp4"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
