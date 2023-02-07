package fanshe.a12;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //和配置文件结合
        //读取配置文件
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("src/fanshe/a12/prop.properties");
        prop.load(fis);
        fis.close();

        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("method");

        //利用反射
        Class clazz = Class.forName(className);
        //获得构造方法
        Constructor<?> con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();

        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);


    }


}
