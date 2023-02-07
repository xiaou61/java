package 方法引用;

import java.util.ArrayList;
import java.util.Collections;

public class a3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张傻逼", "张三丰", "张无忌", "张三");
        StringOperation so = new StringOperation();
        list.stream().filter(so::stringJudge).forEach(s-> System.out.println(s));
    }
}
