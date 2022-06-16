package xiancheng;

public class MyThread1Test {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        mt.start();
        mt.run();
        for (int i = 0; i <= 100; i++) {
            if (i %2 == 0) {
                System.out.println("母线程输出偶数" + i);
            }
        }
    }
}

