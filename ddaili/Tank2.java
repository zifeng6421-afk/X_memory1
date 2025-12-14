package ddaili;

//组合
public class Tank2 implements Moveable{
    @Override
    public void move() {
        System.out.println("Tank 2 move");
    }

    public static void main(String[] args) {
        Tank2 t = new Tank2();
        new LogProxy(t).move();
    }
}
class  LogProxy implements Moveable{
    private Moveable moveable;
    public LogProxy(Moveable moveable) {
        this.moveable = moveable;
    }
    @Override
    public void move() {
        System.out.println("方法执行前");
        moveable.move();
        System.out.println("方法执行后");
    }
}


interface Moveable {
    void move();
}
