package xiancheng;

public class SubThread extends Thread {
    @Override
    public void run() {
        System.out.println("SubThread"+Thread.currentThread().getName());
        System.out.println("默认执行");
    }
}
