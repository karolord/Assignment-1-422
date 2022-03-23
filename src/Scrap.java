import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Scrap {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future f = ex.submit(new Runnable() {@Override
        public void run() {
            System.out.println("Sdwdadwa");
        }});
        Future e = ex.submit(new Runnable() {@Override
        public void run() {
            System.out.println("Sdwdadwa");
        }});
        int x = 0;
        while (!f.isDone()) {
            System.out.println(x++);
            System.out.println(f.isDone());
        }
        System.out.println("Done");
        System.out.println(e.isDone());
    }
}
