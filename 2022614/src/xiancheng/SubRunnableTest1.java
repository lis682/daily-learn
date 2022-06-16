package xiancheng;

public class SubRunnableTest1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        SubRunnable st= new SubRunnable();
        Thread t = new Thread(st);
        t.start();
    }
}
