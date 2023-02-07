package fanshe.综合练习;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student s=new Student("小啊",20,'男',167.5,"睡觉");
        Teacher t=new Teacher("你好",10000);
        saveObject(s);
    }

    private static void saveObject(Object obj) throws IllegalAccessException, IOException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/反射/综合练习/a.txt"));
        for (Field field : fields) {
            field.setAccessible(true);

            //获取成员变量名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);

            bw.write(name+"="+value);
            bw.newLine();
        }
        bw.close();
    }
}
