package fanshe;

import java.lang.reflect.Method;

//获取类的成员方法
public class TestReflect3 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------");
        Class<Student> studentClass = Student.class;
        for (Method m : studentClass.getMethods()) {
            System.out.println(m);//方法对象
            System.out.println(m.getName());//方法名
            Class<?>[] parameterTypes = m.getParameterTypes();//获取到方法对象所有参数
        }

    }
}
