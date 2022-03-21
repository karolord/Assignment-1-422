import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class App {
    public static void main(String[] args) throws Exception {
        String x = "the a a a a a a a an ana an AN THE";
        TextHandler t = new TextHandler(x);
        Thread y = new Thread(t);
        y.start();
    }
}
