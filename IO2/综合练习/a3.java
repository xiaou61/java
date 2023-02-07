package IO2.综合练习;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class a3 {
    public static void main(String[] args) throws IOException {
        //把文件中所有信息读取
        ArrayList<Student> list = new ArrayList<Student>();
        BufferedReader br = new BufferedReader(new FileReader("src/IO2/综合练习/a.userinfo.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            //按照-进行切割
            String[] arr = line.split("-");
            Student stu = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();
        //带权重的随机
        //首先计算权重总和
        double weight = 0;
        for (Student stu : list) {
            weight = weight + stu.getWeight();
        }
        //计算每一个人的实际占比
        double[] arr = new double[list.size()];
        int index = 0;
        for (Student student : list) {
            arr[index] = student.getWeight() / weight;
            index++;
        }

        //计算每一个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        //随机抽取
        //获得0~1.0之间的随机数
        double number = Math.random();

        //判断number在arr中的位置
        //这里用二分查找法进行查找
        //方法返回 -插入点-1


        int result = -Arrays.binarySearch(arr, number) - 1;

        Student stu = list.get(result);

        System.out.println(stu);
        //修改权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        //重新写入数据
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/IO2/综合练习/a.userinfo.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            //这里是改写了tostring方法的
            /*
            public String toString() {
            return name + "-" + gender + "-" + age + "-" + weight;
                }
             */
            bw.newLine();
        }
        bw.close();
    }
}
