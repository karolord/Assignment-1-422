import java.util.ArrayList;
import java.util.concurrent.Future;

// public class Cthread extends Thread {
//     public ArrayList<Future> results = new ArrayList<Future>();
//     public void addFuture(Future f){
//         results.add(f);
//     }
//     @Override
//     public void run() {
//         while (true) {

//         }
//     }
// }
public class Cthread extends Thread {

    public ArrayList<TextHandler> arr = new ArrayList<TextHandler>();

    public void addTextHandler(TextHandler t) {
        arr.add(t);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        for (int i = 0; i < arr.size(); i++) {
            Thread t = new Thread(new TextPrinter(arr.get(i), "Thread " + (i + 1)));
            t.start();
        }
    }
}

class TextPrinter implements Runnable {

    public TextHandler t;
    public String name;

    public TextPrinter(TextHandler t, String name) {
        this.t = t;
        this.name = name;
    }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    t.text.writeLock().lock();
    try {
      //System.out.println("Waiting");
      t.c.await();
      System.out.println(name + " : " +"a : " +t.getArticle1() +" an : " +t.getArticle2() +" The : " + t.getArticle3() );
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      t.text.writeLock().unlock();
    }
  }
}
