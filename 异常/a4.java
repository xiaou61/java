package 异常;

public class a4 {
    public static void main(String[] args) {
        int[] arr = {};
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            }
        System.out.println(max);
    }

    public static int getMax(int[] arr){

        if (arr == null) {
            //手动创建一个异常对象,并把这个异常交给方法的调用者处理
            //此时方法会结束，下面的代码就不会再执行了
            throw new NullPointerException();
        }
        if (arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }


        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
