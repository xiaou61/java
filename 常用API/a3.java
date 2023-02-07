package 常用API;

public class a3 {
    public static void main(String[] args) {
        //统计一下有多少个水仙花数
        //范围：100~999
        int count=0;
        for (int i = 100; i < 999; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            //判断：
            double sum=Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);
            if (sum==i){
                System.out.println(i);
                count++;
            }
        }
    }
}
