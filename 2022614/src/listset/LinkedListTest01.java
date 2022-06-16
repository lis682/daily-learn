package listset;

import java.util.LinkedList;

public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("周杰伦");
        linked.add("周星驰");
        linked.add("周华健");
        linked.add("周润发");
        linked.addFirst("赵正浩");
        linked.addLast("霍建华");

        for(String str:linked){
            System.out.print(str+"***");
        }
        System.out.println();
        linked.removeLast();
        linked.removeFirst();
        for(String str:linked){
            System.out.print(str+"***");
        }
        System.out.println();
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
        System.out.println("---------------------------");
        System.out.println(linked.pop());
        linked.push("赵正浩");
        for(String str:linked){
            System.out.print(str+"***");
        }
        System.out.println();
        linked.clear();
        for(String str:linked){
            System.out.print(str+"***");
        }
        System.out.println();





    }
}
