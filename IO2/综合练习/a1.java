package IO2.综合练习;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a1 {
    public static void main(String[] args) throws IOException {
        //定义变量用来记录网址：
        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&device=pc&from=home";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        //爬取数据

        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);
        //爬取到的就是网页源代码
        //之后进行过滤。用正则表达式进行过滤
        ArrayList<String> familyNameTempList = getDate(familyNameStr, "(.{4})(，|。)", 1);

        ArrayList<String> boyNameTempList = getDate(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);

        ArrayList<String> girlNameTempList = getDate(girlNameStr, "((.. ){4}..)", 0);

        //处理数据
        //处理姓氏
        ArrayList<String> familyNameList = new ArrayList<String>();
        for (String str : familyNameTempList) {
            //依次表示每一个元素
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }
        //处理男生名字
        //处理方案：去重
        ArrayList<String> boyNameList = new ArrayList<String>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                boyNameList.add(str);
            }
        }

        //处理女生名字
        ArrayList<String> girlNameList = new ArrayList<String>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (String s : arr) {
                girlNameList.add(s);
            }
        }
        //生成数据
        //姓名-性别-年龄
        //姓名唯一
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 8, 10);
        Collections.shuffle(list);

        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/IO2/综合练习/a.userinfo.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    /*
    作用：获取男生和女生的信息，格式：姓名-性别-年龄
    形参一：装着姓氏的集合
    形参二：装着男生名字的集合
    参数三：装着女生名字的集合
    参数四：男生的个数
    参数五：女生的个数
    */

    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        //生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<String>();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }

            //随机：
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);

            boyhs.add(familyNameList.get(0) + boyNameList.get(0));
        }
        //生成女生的
        //生成男生不重复的名字
        HashSet<String> girlhs = new HashSet<String>();

        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }
            //随机：
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);

            girlhs.add(familyNameList.get(0) + girlNameList.get(0));
        }


        Random r = new Random();
        ArrayList<String> list = new ArrayList<String>();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-" + "男" + "-" + age);
        }
        for (String girlName : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-" + "女" + "-" + age);
        }
        return list;
    }

    /*
    作用：通过正则表达式，获取字符串中的内容
    参数一：完整的字符串
    参数二：正则表达式
    参数三：获取的第几组
     */
    private static ArrayList<String> getDate(String str, String regex, int index) {
        //创建集合
        ArrayList<String> list = new ArrayList<String>();
        Pattern pattern = Pattern.compile(regex);

        //按照pattern的规则，在str中读取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(index);
            list.add(group);
        }
        return list;
    }

    /*
    作用：从网络上去爬取数据，把数据拼接成字符串然后返回。
    形参：网址
    返回值：爬取到的数据
     */
    public static String webCrawler(String net) throws IOException {
        //定义一个stringbuiler
        StringBuilder sb = new StringBuilder();
        //创建一个url对象
        URL url = new URL(net);
        //链接上
        URLConnection conn = url.openConnection();

        //读取数据
        //把字节流变成了字符流
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = (isr.read())) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        //返回数据
        return sb.toString();
    }
}
