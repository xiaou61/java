package 集合进阶.a15Map;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a3 {
    public static void main(String[] args) {
        //创建对象
        HashMap<Student,String> hm=new HashMap<>();
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lsi",11);
        Student s3=new Student("wangwu",63);

        hm.put(s1,"江苏");
        hm.put(s2,"浙江");
        hm.put(s3,"福建");

        hm.forEach((key,value) -> {
            System.out.println(key + ": "+value);
        });

    }
}
