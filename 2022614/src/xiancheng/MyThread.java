package xiancheng;

public class MyThread extends Thread {
    @Override
    public void run() {
        //String name =getName();
        //System.out.println(name);
     //Thread st = Thread.currentThread();
        //System.out.println(st);
       ///String name =st.getName();
        //System.out.println(name);

        System.out.println(Thread.currentThread().getName());
}

    public MyThread() {
    }
    public MyThread(String name) {
        super(name);
    }

}
