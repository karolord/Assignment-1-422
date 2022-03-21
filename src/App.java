import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class App {
    public static void main(String[] args) throws Exception {
        Cthread c = new Cthread();
        String x = "the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE ";
        ExecutorService pool = cachedpool.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            TextHandler t = new TextHandler(x);
            c.addTextHandler(t);
            pool.execute(t);
        }
        c.start();

    }
}
