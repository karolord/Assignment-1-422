import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class cachedpool extends ThreadPoolExecutor {

    private cachedpool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
            BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
        // TODO Auto-generated constructor stub
    }

    public static ExecutorService newCachedThreadPool(int coresize) {
        return new ThreadPoolExecutor(coresize, coresize,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }
}