package ddaili;

//继承
public class Tank1 {
    public void move(){
        System.out.println("Tank move");
    }

    public static void main(String[] args) {
        new ProxyTank().move();
    }
}
class ProxyTank extends  Tank1{
    @Override
    public void move() {
        System.out.println("方法执行前");
        super.move();
        System.out.println("方法执行后");
    }
}
