package 方法引用.a7综合练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class a1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"你好,12","晚安,13");

       // Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        //System.out.println(Arrays.toString(students));
    }
}
