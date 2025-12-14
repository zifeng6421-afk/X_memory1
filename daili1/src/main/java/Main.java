import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


//Clib代理
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();//增强雷
        enhancer.setSuperclass(Tank.class);//指定父类
        enhancer.setCallback(new Time());
        Tank o =(Tank) enhancer.create();
        o.move();
    }
}


class Time implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("生成的类名"+o.getClass().getName());
        System.out.println("父类"+o.getClass().getSuperclass().getName());
        System.out.println("被代理的方法名称"+method.getName());
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("方法执行后，被代理的方法"+method.getName());
        return o1;

    }
}

class Tank{
    public  void move(){
        System.out.println("Tank move");
    }
}
