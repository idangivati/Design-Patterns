package creational.pattern.singleton;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    private Singleton() {
        data = "Test of Singleton class";
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }
    public static Singleton Singleton() {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }
}
