package listset;
/**
 * .分析以下需求，并用代码实现：
 * (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
 * (2)编写方法对List集合进行排序
 * (2)然后利用迭代器遍历集合元素并输出
 * (3)如：15 18 20 40 46 60 65 70 75 91
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListTest1 {
    public static List<Integer> getRandom(){
        Random r = new Random();
        List<Integer> list = new ArrayList();
        while (list.size() < 10) {
            int i = r.nextInt(99)+1;
            if (list.contains(i)){
                continue;
            }
            list.add(i);
        }
        return list;
    }
    public static void paiXu(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            for (int j = 0; j <list.size()-1-i ; j++) {
                if (list.get(j)>list.get(j+1)){
                    int tem=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,tem);
                }
            }
        }
    }
    public static void bianLi(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
    public static void main(String[] args) {
        List<Integer> listRandom = getRandom();
        System.out.println("List随机数：" + listRandom);

        System.out.println("list排序");
        paiXu(listRandom);

        System.out.println("排序后的遍历：");
        bianLi(listRandom);

    }

}
