package threads;

public class Mythread extends Thread {
    int multiplicand;

    public Mythread(String dbThread, int i) {
        super(dbThread);
        multiplicand = i;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
                System.out.println(Thread.currentThread().getName() + "-" + i * multiplicand);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
    }
}
