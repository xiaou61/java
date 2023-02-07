package fanshe;

public class a1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //全类名：包名+类名
        Class<?> clazz = Class.forName("fanshe.Student");
        System.out.println(clazz);
        //第二种
        System.out.println("-------------------------");
        System.out.println(Student.class);
        //第三种
        System.out.println("-------------------------");
        Student s=new Student();
        System.out.println(s.getClass());

    }
}
