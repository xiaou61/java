package 常用API;


import java.sql.SQLOutput;
import java.util.Objects;

public class a8 {
    public static void main(String[] args) {
        Student s1=null;
        Student s2 = new Student("lisi",20);
        boolean result= Objects.equals(s1,s2);
        System.out.println(result);
        //1.方法的底层会判断s1是否是null。如果是就直接返回false
        //2.如果不是，就再次调用equals
        //如果没有重写，就比较属性值，重写了就比较地址值


        Student s3=new Student();
        System.out.println(Objects.isNull(s3));//false
        Student s4=null;
        System.out.println(Objects.isNull(s4));//true
        //nonNull相反就不做演示了，
    }

}
