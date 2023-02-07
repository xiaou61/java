package 常用API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a14 {
    public static void main(String[] args) {
        String str="目前企业用的最多的是java8和java11，下一个长期版本会是java17，相信在不久的将来，java17也会逐渐的登录历史舞台";
        //获得正则表达式的对象
        Pattern p = Pattern.compile("java\\d{0,2}");
        //获得文本匹配器
        Matcher m = p.matcher(str);
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }
}