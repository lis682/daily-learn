package xiancheng;

public class SubThreadTest {
    public static void main(String[] args) {
        SubThread st = new SubThread();
        System.out.println(Thread.currentThread().getName());
        st.start();
       // st.run();
    }
}
