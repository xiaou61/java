package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class a4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,"你好,12","是不是,20");

        List<Student> newList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}
