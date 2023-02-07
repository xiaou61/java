package IO2.综合练习;

import java.util.Properties;
import java.util.Set;

public class a6 {
    public static void main(String[] args) {
        Properties prop=new Properties();
        //可以添加任意的数据类型
        //细节：虽然我们可以添加任意的数据类型，但是我们不会这样干，一般只会添加字符串的数据
        prop.put("aaa","bbb");
        prop.put("ccc","bbb");
        prop.put("ddd","bbb");


        Set<Object> objects = prop.keySet();
        for (Object object : objects) {
            Object value = prop.get(object);
            System.out.println(object+"="+value);
        }
    }


}
