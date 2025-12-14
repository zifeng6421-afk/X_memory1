package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflect5 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Student> clazz = Student.class;
        //通过反射创建对象注意抛异常
        //方案1：通过无参构造创建对象
        Student s1 = clazz.newInstance();
        System.out.println(s1);

        //方案2
        //通过全参构造 1.先获取构造方法对象
        Constructor<Student> c = clazz.getConstructor(String.class, int.class);
        //从刚刚获取到的构造方法对象中注入属性
        Student student = c.newInstance("nn", 6);
        System.out.println(student);

    }
}
