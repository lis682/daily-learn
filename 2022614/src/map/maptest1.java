package map;

import java.util.HashMap;

public class maptest1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

// 2.使用put添加元素
        hm.put("赵1", 18);
        hm.put("赵2", 19);
        hm.put("赵2", 20);
        hm.put("赵3", 21);
        System.out.println(hm);

// 3.使用put修改元素
        Integer v1 = hm.put("赵1",50);
        System.out.println(v1);


// 4.使用get获取元素
        Integer i2= hm.get("赵2");
        System.out.println(i2);

// 5.使用remove删除元素
        Integer v2 = hm.remove("赵1");
        System.out.println(v2);

// 6.打印集合中的元素
        System.out.println(hm);
    }
}
