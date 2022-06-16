package map;

import java.util.*;

public class MapTest7 {
    public static void main(String[] args) {
        //创建Map集合存储字符串
        Map<String, String> smallMap=new HashMap<String, String>();
        smallMap.put("a", "1");
        smallMap.put("b", "2");
        smallMap.put("c", "3");
        smallMap.put("d", "4");
        Map<String, String>smallMap1=new HashMap<String, String>();
        smallMap.put("e", "1");
        smallMap.put("f", "2");
        smallMap.put("g", "3");
        smallMap.put("h", "4");
        //创建List集合存储Map
        List<Map<String, String>> bigList=new ArrayList<Map<String,String>>();
        bigList.add(smallMap);
        bigList.add(smallMap1);
        inter(bigList);
    }
    /*
     *  遍历大集合List
     */
    public static void inter(List<Map<String, String>> bigList) {
//迭代器遍历List集合
        Iterator<Map<String, String>> bigit= bigList.iterator();
        while (bigit.hasNext()) {
            //取出list集合元素
            Map<String, String> map=bigit.next();//集合元素是Map集合
            //遍历MA集合,keyset()方法
            Set<String>set=map.keySet();
            //迭代器遍历Set集合
            Iterator<String>setit=set.iterator();
            while (setit.hasNext()) {
                //取出Set集合元素,是Map集合的键
                String keyString=setit.next();
                String valueString=map.get(keyString);
                System.out.println(keyString+"=="+valueString);

            }
        }
    }

}
