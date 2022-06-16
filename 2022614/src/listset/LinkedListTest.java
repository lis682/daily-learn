package listset;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> arr =new LinkedList<String>();
        arr.add("西门吹雪");
        arr.add("西门吹雪");
        arr.add("西门吹雪");
        arr.add("西门吹风");
        arr.add("西门吹水");
//使用add方法在指定位置添加元素
        arr.add(2,"猪");
        //使用set
        arr.set(3,"龙");
        for (String str:arr){
            System.out.println(str);
        }
        System.out.println("-------------------------");
        System.out.println(arr.size());
        arr.remove(2);
        System.out.println(arr.get(2));
        System.out.println(arr.size());
        arr.clear();
        System.out.println("--------------------------------");
        System.out.println("清空之后"+arr);



    }
}
