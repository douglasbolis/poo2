package singleton.telefone;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Gerando números de telefone:");
        for (int i = 0; i < 6; i++) {
            usingThreads();
        }
    }
  
    public static void usingThreads() {
        Runnable hello = new TelefoneSingleTon();
        Thread thread1 = new Thread(hello);
        thread1.start();
    }
}
