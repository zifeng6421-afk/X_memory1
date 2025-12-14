package fanshe;

public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("fanshe.Student");
        Class<?> bClass = Student.class;
        Class<?> cClass = new Student().getClass();

        System.out.println(aClass);
        System.out.println(bClass);
        System.out.println(cClass);
        System.out.println(aClass.getName());
        System.out.println(bClass.getSimpleName());
        System.out.println(cClass.getPackage());
        System.out.println(cClass.getPackage().getName());

    }
}
