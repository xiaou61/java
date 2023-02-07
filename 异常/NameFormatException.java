package 异常;

public class NameFormatException extends RuntimeException{
    //起名技巧：NameFormat表示名字
    //exception表示当前类是一个异常类
    //运行时异常：继承RuntimeException
    //编译时：继承Exception


    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
