
import java.io.*;

public class JavaSyncTest implements Runnable {

    static volatile int balance = 0;
    static volatile int balance1 = 0;
    static Object o = new Object();

    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (o) {
                balance++;
                System.out.println(i + " " + Thread.currentThread().getName() + " " + balance);
            }
        }
        System.out.println(Thread.currentThread().getName());
        for (int i = 100; i < 10000; i++) {
            synchronized (o) {
                balance1++;
                System.out.println(i + " " + Thread.currentThread().getName() + " " + balance1);
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        JavaSyncTest j1 = new JavaSyncTest();
        JavaSyncTest j2 = new JavaSyncTest();
        JavaSyncTest j3 = new JavaSyncTest();
        Thread t1 = new Thread(j1);
        Thread t2 = new Thread(j2);
        Thread t3 = new Thread(j3);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
        }
        System.out.println("Balance = " + j1.getBalance());
    }
}
