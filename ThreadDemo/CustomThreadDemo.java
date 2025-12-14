package ThreadDemo;


import java.util.ArrayList;
import java.util.concurrent.*;

//自定义线程池以及submit execute方法
public class CustomThreadDemo {
    public static void main(String[] args) {
        NamingThreadFactory namingThreadFactory = new NamingThreadFactory("junjie");
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                2,
                4,
                60, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(2),
                namingThreadFactory,
                new ThreadPoolExecutor.AbortPolicy()
        );

        pool.execute(()->{

        });
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        Future<String> submit = pool.submit(() -> {
            return "正常";
        });
    }
}
