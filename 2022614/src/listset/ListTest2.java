package listset;
/**
 * (1)定义List集合，存入多个字符串，其中包含三个连续的"def"
 * (2)删除集合中字符串"def"
 * (3)然后利用迭代器遍历集合元素并输出
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {
    public static void bianLi(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        String[] arr={"de","df","def","d","def","def","def"};
        for (String s : arr) {
            list.add(s);
        }
        System.out.println(list);
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).equals("def")){
                list.remove(i);
                //移掉后数组的长度会改变
                i--;
            }
        }
        bianLi(list);

    }

}
