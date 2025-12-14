package fanshe;

import java.lang.reflect.Field;
import java.util.Arrays;

public class TestReflect2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Student s1 = new Student("张三", 3);
        Student s2 = new Student("李四", 4);
        Student s3 = new Student("王五", 5);
        Student[] s = {s1, s2, s3};
        //3.直接打印数组，查看数组中的元素
        System.out.println(Arrays.toString(s));
        //4.遍历学生数组，拿到每一个学生对象，做进一步的操作
        for (Student stu : s) {
            //System.out.println(stu);
            stu.play();//通过遍历到的对象，执行play()
            System.out.println(stu.age);//通过遍历到的对象，打印age属性

        }

        Class<?> aClass = Class.forName("fanshe.Student");
        Field[] field = aClass.getFields();
        for (Field f : field) {
            System.out.println(f.getName());
            System.out.println(f.getType());
        }
    }
}
