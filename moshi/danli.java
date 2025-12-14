package moshi;

public class danli {
    public volatile static danli unique;
    private danli() {}
    public static danli getUnique() {
        if(unique == null) {
            synchronized (danli.class) {
                if(unique == null) {
                    unique=new danli();
                }
            }
        }
        return unique;
    }
}
