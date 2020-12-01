
public class JavaTwoThread implements Runnable {

    long from;
    long where;
    long result = 0;

    public JavaTwoThread(long from, long where) {
        this.from = from;
        this.where = where;
    }

    public void run() {
        for (long i = from; i <= where; i++) {
            result += i;
        }
        System.out.println("from    = " + from + "\n" + "Result   = " + result);
    }

    public long getResult() {
        return result;
    }

    public static void main(String[] args) {
        long s = 0;
        JavaTwoThread s1 = new JavaTwoThread(1, 5000);
        JavaTwoThread s2 = new JavaTwoThread(5001, 10000);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        try {
            t1.start();
            t2.start();
            t1.sleep(5000);
            t2.sleep(10000);
            s = s1.getResult() + s2.getResult();
        } catch (Exception e) {
        }
        System.out.println("Result = " + s);
    }
}