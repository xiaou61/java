package 集合进阶;

import javax.print.attribute.standard.MediaSize;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a22 {
    public static void main(String[] args) {
        //创建一个普通的map集合
        HashMap<String,String> hm=new HashMap<String, String>();
        hm.put("1","2");
        hm.put("3","4");
        hm.put("5","6");
        hm.put("7","8");
        hm.put("11","101");
        hm.put("33","102");
        hm.put("55","103");
        hm.put("77","104");
        hm.put("99","105");
        hm.put("111","106");

        Map<String, String> map = Map.copyOf(hm);

    }
}
