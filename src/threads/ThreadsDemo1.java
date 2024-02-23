package threads;

public class ThreadsDemo1 {
    public static void main(String[] args) {
        RThread rThread = new RThread();
        Thread t1 = new Thread(rThread);
        t1.start();


        //Mythread dbT = new Mythread("dbThread", 10);
        //dbT.start();


        //Mythread netT = new Mythread("netThread", 100);
        //netT.start();
    }
}
