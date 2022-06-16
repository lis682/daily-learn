package xiancheng;

public class Demo01GetThreadName {
    public static void main(String[] args) {
        Thread mt =new Thread();
        mt.setName("小强");
        mt.start();
        System.out.println(mt.getName());
        new MyThread("小花").start();
        System.out.println(Thread.currentThread().getName());
    }


            }


