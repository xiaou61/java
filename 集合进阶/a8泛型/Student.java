package 集合进阶.a8泛型;

public class Student {
    private int name;

    public Student() {
    }

    public Student(int name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public int getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(int name) {
        this.name = name;
    }

    public String toString() {
        return "Student{name = " + name + "}";
    }
}
