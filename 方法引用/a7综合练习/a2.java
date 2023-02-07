package 方法引用.a7综合练习;

import java.util.ArrayList;
import java.util.Arrays;


public class a2 {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
        //添加对象
        list.add(new Student("zhangsan",20));
        list.add(new Student("lisi",30));
        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }

}
