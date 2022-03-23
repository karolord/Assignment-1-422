import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class App {
    public static void main(String[] args) throws Exception {
        int coresize = 8;
        String x = "the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE the a a a a a a a an ana an AN THE ";
        String words[] = x.split(" ");
        TextHandler[] handler = new TextHandler[coresize];
        int size = words.length/coresize;
        Cthread c = new Cthread();
        for (int i = 0; i < coresize; i++){
            handler[i] = new TextHandler(Arrays.copyOfRange(words, i*size, (i+1)*size));
            c.addTextHandler(handler[i]);
        }
        
        ExecutorService pool = cachedpool.newCachedThreadPool(coresize);
        
        c.start();
        Thread.sleep(2000);
        for (int i = 0; i < coresize; i++){
            pool.execute(handler[i]);
        }
        
    }
}
