package 常用API.a13正则表达式;

public class a1 {
    public static void main(String[] args) {
        //校验一个qq号是否满足规则
        String qq="123a4567890";
        boolean b = checkQQ(qq);
        System.out.println(b);
    }
    public static boolean checkQQ(String qq) {
        int len = qq.length();
        if(len<6||len>20){
            return false;
        }


        if(qq.startsWith("0")){
            return false;
        }


        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c <'0' || c>'9' ) {
                return false;
            }
        }
        return true;
    }
}
