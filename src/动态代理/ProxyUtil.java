package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
创建一个代理
形参：被代理的明星对象
返回值：给明星创建的代理

需求：1.获取到代理的对象
2.在调用代理的唱歌的方法
 */
public class ProxyUtil {
    public static Star createProxy(BigStar bigStart){

        Star star =(Star) Proxy.newProxyInstance(

                ProxyUtil.class.getClassLoader(),//参数一，用于指定用哪个类的加速器，去加载生成的代理类
                new Class[]{Star.class},//参数二：指定接口，这些接口是用来指定代理张什么样子的。
                new InvocationHandler() {//参数三：指定生成对象的代理要干什么
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       /*
                       参数一：代理的对象
                       参数二：要运行的方法
                       参数三：调用方法的时候，传递的实参
                        */
                        if ("sing".equals(method.getName())){
                            System.out.println("准备话筒，收钱");
                        }else if ("dance".equals(method.getName())){
                            System.out.println("准备场地，收钱");
                        }
                        //去找大明星开始
                        return method.invoke(bigStart,args);
                    }
                }
        );
    return star;
    }
}
