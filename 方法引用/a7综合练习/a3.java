package 方法引用.a7综合练习;

import java.util.ArrayList;
import java.util.Arrays;

public class a3 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        System.out.println(list);
        String[] arr = list.stream().map(Student::pingjie).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
