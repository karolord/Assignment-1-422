import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TextHandler implements Runnable {
    public  String name;
    private String words[];
    private ReadWriteLock a1lock = new ReentrantReadWriteLock();
    private ReadWriteLock a2lock = new ReentrantReadWriteLock();
    private ReadWriteLock a3lock = new ReentrantReadWriteLock();
    private int article1;
    private int article2;
    private int article3;
    private boolean finished = false;
    private ReadWriteLock statuslock = new ReentrantReadWriteLock();

    public TextHandler(String name, String[] s) {
        this.name = name;
        this.words = s;
    }

    public int getArticle1() {
        a1lock.readLock().lock();
        try {
            return this.article1;

        } finally {
            a1lock.readLock().unlock();
        }
    }

    public void setArticle1(int article1) {
        a1lock.writeLock().lock();
        try {
            this.article1 = article1;
        } finally {
            a1lock.writeLock().unlock();

        }
    }

    public int getArticle2() {
        a2lock.readLock().lock();
        try {
            return this.article2;

        } finally {
            a2lock.readLock().unlock();
        }
    }

    public void setArticle2(int article2) {
        a2lock.writeLock().lock();
        try {
            this.article2 = article2;
        } finally {
            a2lock.writeLock().unlock();

        }
    }

    public int getArticle3() {
        a3lock.readLock().lock();
        try {
            return this.article3;

        } finally {
            a3lock.readLock().unlock();
        }
    }

    public void setArticle3(int article3) {
        a3lock.writeLock().lock();
        try {
            this.article3 = article3;
        } finally {
            a3lock.writeLock().unlock();

        }
    }
    public void setStatus(boolean status) {
        statuslock.writeLock().lock();
        try {
            this.finished = status;
        } finally {
            statuslock.writeLock().unlock();

        }
    }

    public boolean getFinished() {
        statuslock.readLock().lock();
        try {
            return this.finished;
        } finally {
            statuslock.readLock().unlock();
        }
    }

    @Override
    public void run() {
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("a")) {
                a1++;
            }
            if (words[i].equals("an")) {
                a2++;
            }
            if (words[i].equals("the")) {
                a3++;
            }
        }
        setArticle1(a1);
        setArticle2(a2);
        setArticle3(a3);
       // System.out.println("Finished checking");
        setStatus(true);
    }
}
