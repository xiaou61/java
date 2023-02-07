package IO2.综合练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src/IO2/综合练习/userinfo.txt"));
        String line=br.readLine();
        br.close();

        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");

        String rightUserName=arr1[1];
        String rightPassWord=arr2[1];


        //用户键盘录入进行判断
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        if (rightUserName.equals(username) && rightPassWord.equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
