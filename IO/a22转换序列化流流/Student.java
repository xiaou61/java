package IO.a22转换序列化流流;

import java.io.Serial;
import java.io.Serializable;
/*
Serializable接口是没有抽象方法的。
这样叫做标记性接口。
打了这个标记之后，那么就表示，当前的student类可以被序列化。
可以理解为一个对象的合格证
 */

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -322251504902827914L;
    private String name;
    private int age;
    private String index;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
