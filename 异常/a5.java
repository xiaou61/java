package 异常;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //创建女朋友的对象
        GirlFriend gf=new GirlFriend();


        while (true) {
            try {
                System.out.println("输入女朋友的名字");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("请输入女朋友的年龄");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                //如果所有的数据都是正确的
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }catch (NameFormatException e) {
                e.printStackTrace();
            }catch (AgeOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        //打印信息
        System.out.println(gf);
    }
}
