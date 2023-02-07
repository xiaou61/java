package 异常;

import org.w3c.dom.ranges.RangeException;

public class Student {
    private int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
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
        if (age>=50){
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String toString() {
        return "Student{age = " + age + "}";
    }
}
