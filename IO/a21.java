package IO;


import java.io.*;

public class a21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\IO\\count.userinfo.txt"));
        String line = br.readLine();
        int count = Integer.parseInt(line);
        count++;
        if (count <= 3) {
            System.out.println("欢迎使用本软件，现在你是第" + count + "次使用");
        } else {
            System.out.println("本软件只能免费使用三次，欢迎您注册会员后进行使用");

        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\IO\\count.userinfo.txt"));

        bw.write(count + "");//如果写的是数字，真正写到文件里面的，是这个数字在字符集中所对应的位置。
        bw.close();
    }

}
