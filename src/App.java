import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
public class App {
    public static void main(String[] args) throws Exception {
        int coresize = 8;
        String input = new Scanner(System.in).nextLine();
        String words[] = input.split(" ");
        TextHandler[] handler = new TextHandler[coresize];
        int size = words.length/coresize;
        Cthread c = new Cthread();
        for (int i = 0; i < coresize; i++){
            if(i == coresize - 1){
                handler[i] = new TextHandler("Thread "+ (i+1),Arrays.copyOfRange(words, i*size, words.length));
            }else{
                handler[i] = new TextHandler("Thread "+ (i+1),Arrays.copyOfRange(words, i*size, (i+1)*size));
            }
            c.addTextHandler(handler[i]);
        }
        
        ExecutorService pool = cachedpool.newCachedThreadPool(coresize);
        
        c.start();
        for (int i = 0; i < coresize; i++){
            pool.execute(handler[i]);
        }
        pool.shutdownNow();
    }
}
