import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

/**
 * 使用jdk的动态代理
 */
public class Tank3 implements Movable{
    @Override
    public void move() {
        System.out.println("Tank moving cla....");
    }

    public static void main(String[] args) {
        Tank3 tank = new Tank3();
        // reflection 反射 通过二进制字节码分析类的属性和方法

        //newProxyInstance: 创建代理对象
        // 参数一: 被代理类对象
        // 参数二：接口类对象  被代理对象所实现的接口
        // 参数三：调用处理器。 被调用对象的那个方法被调用后该如何处理
        Movable o = (Movable)Proxy.newProxyInstance(Tank3.class.getClassLoader()
                ,new Class[]{Movable.class}
                ,new LogProxy(tank));
        o.move();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        String  a= "sadas";
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();


        Collections.sort(list,(o1,o2)->
             o1-o2);
        Collections.sort(list,
                (o1,o2)->{
            return o2-o1;
                });
    }
}

class LogProxy implements InvocationHandler {
    private Movable movable;

    public LogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法:"+method.getName()+"()执行前");
        Object invoke = method.invoke(movable, args);  // 此处相当于 movable.move()
        System.out.println("方法:"+method.getName()+"()执行后");
        return invoke;
    }
}

interface Movable {
    void move();
}
