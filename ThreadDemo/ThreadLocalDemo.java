package ThreadDemo;

public class ThreadLocalDemo {
    //使用threadLocal存储变量副本
    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            int finalI = i;
            new Thread(new Runnable() {
                public void run() {
                   threadLocal.set(finalI);
                   try{Thread.sleep(100);}catch(InterruptedException e){}
                    System.out.println(finalI);
                   threadLocal.remove();
                }
            }).start();

        }
    }
}
