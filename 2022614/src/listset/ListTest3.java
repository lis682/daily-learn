package listset;
/**
 * 1)定义List集合，存入多个字符串
 * (2)删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
 * (3)然后利用迭代器遍历集合元素并输出
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {
    public static void bianLi(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        String[] arr={"a","a0","b","b1","c","9","d","d9"};
        for (String s : arr) {
            list.add(s);
        }
        System.out.println(list);
        for (int i=0;i<list.size();i++) {
            if ( list.get(i).toString().matches(".*[0-9].*")){
                list.remove(i);
                i--;
            }
        }
        bianLi(list);
    }

}
