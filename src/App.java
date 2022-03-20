public class App {
    public static void main(String[] args) throws Exception {
        String x = "the a a a a a a a an ana an AN THE";
        TextHandler t = new TextHandler(x);
        Thread y = new Thread(t);
        y.start();
    }
}

class TextHandler implements Runnable {
    private String s;
    private int article1;
    private int article2;
    private int article3;

    public TextHandler(String s) {
        this.s = s.toLowerCase();
    }

    @Override
    public void run() {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("a")) {
                article1++;
            }
            if (words[i].equals("an")) {
                article2++;
            }
            if (words[i].equals("the")) {
                article3++;
            }

        }
    }
}
