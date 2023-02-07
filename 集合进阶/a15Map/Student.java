package 集合进阶.a15Map;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

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

    @Override
    public int compareTo(Student o) {
        //按照学生年龄的升序排列，年龄一样按照名字的字母排列
        int i = this.getAge() - o.getAge();
        i=i==0?this.getName().compareTo(o.getName()):i;
        return i;
    }
}
