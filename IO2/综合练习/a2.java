package IO2.综合练习;

import cn.hutool.Hutool;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class a2 {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&device=pc&from=home";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        //爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //利用正则表达式
        List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("((.. ){4}..)", girlNameStr, 0);

        //处理数据
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
        //细节：相对路径是相对于class文件而言的。
        FileUtil.writeLines(list,"a.userinfo.txt","UTF-8");
    }
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
}
