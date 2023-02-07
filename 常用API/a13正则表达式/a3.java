package 常用API.a13正则表达式;

import java.util.regex.Matcher;

public class a3 {
    public static void main(String[] args) {
        //拿着一个正确的数据，从左到右依次去看。
        String regex1="1[3-9]\\d{9}";
        String phone1="17713088356";
        String phone2 = "177130883566";
        System.out.println(phone1.matches(regex1));
        System.out.println(phone2.matches(regex1));
        System.out.println("----------------------------------------------------");






        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        String phone3 = "020-565156";
        String phone4 = "020-0654221586";
        System.out.println(phone3.matches(regex2));
        System.out.println(phone4.matches(regex2));
        System.out.println("----------------------------------------------------");


        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        String email1="3153566913@qq.com";
        String email2="3153566913@qq.ccccom";
        System.out.println(email1.matches(regex3));
        System.out.println(email2.matches(regex3));


    }
}
