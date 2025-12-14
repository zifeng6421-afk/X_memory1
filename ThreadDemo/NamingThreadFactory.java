package ThreadDemo;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

//定义线程池工厂 给线程取名字 设置优先级
public class NamingThreadFactory implements ThreadFactory {
    private final AtomicInteger threadNum=new AtomicInteger(0);
    private final String name;


    public NamingThreadFactory(String name) {
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t=new Thread(r);
        t.setName(name + "-" + threadNum.getAndIncrement());
        return t;
    }
}
