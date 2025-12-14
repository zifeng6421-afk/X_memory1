package fanshe;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Reflect4 {
    public static void main(String[] args) {
        Class<? extends Student> aClass = new Student().getClass();
        //通过字节码对象获取到目标类的构造方法
        Constructor<?>[] cs = aClass.getConstructors();
        for (Constructor<?> c : cs) {
            System.out.println(c.getName());//构造方法名称
            Class<?>[] pt = c.getParameterTypes();//参数类型
            System.out.println(Arrays.toString(pt));
        }
    }
}
