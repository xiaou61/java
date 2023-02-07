package 常用API.a7;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[]data={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1=new User(1,"zhangshan","123","girl1",data);

        //克隆对象
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去
        //书写细节
        //1.重写object中的clone方法
        //2.让javabean类实现cloneable接口
        //3.创建原对象并且进行调用。
        User u2 =(User) u1.clone();

        int []arr=u1.getData();
        System.out.println(arr);
        arr[0]=100;


        System.out.println(u1);
        System.out.println(u2);


    }
}
