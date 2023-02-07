package 动态代理;

public class Test {
    public static void main(String[] args) {
        //获取代理的对象
        BigStar bigStar=new BigStar("小u");
        Star proxy = ProxyUtil.createProxy(bigStar);

        //调用唱歌的方法
        String result = proxy.sing("晚安");
        System.out.println(result);
    }
}
