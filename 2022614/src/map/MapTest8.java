package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest8 {
    public static void main(String[] args) {
        //阶段集合,包含学号,姓名
        Map<String, String> firstMap=new HashMap<String, String>();
        firstMap.put("001", "张三");
        firstMap.put("002", "李四");
        firstMap.put("003", "王五");
        Map<String, String>secondMap=new HashMap<String, String>();
        secondMap.put("004", "赵六");
        secondMap.put("005", "钱七");
        //创建学科集合键是阶段名,值应该是阶段集合
        Map<String, Map<String, String>>javaMap=new HashMap<String, Map<String,String>>();
        javaMap.put("第一", firstMap);
        javaMap.put("第二", secondMap);
        //keySet(javaMap);
        entrySet(javaMap);
    }
    /*
     * 遍历javaMap集合,keySet()方式
     */
    public static void keySet(Map<String, Map<String, String>> javaMap) {
        //学科Map集合遍历方法KeySet()存储键的Set集合
        Set<String> javaSet=javaMap.keySet();
        Iterator<String> javaIterator=javaSet.iterator();
        while (javaIterator.hasNext()) {
            //取出Set集合元素,是javaMap集合的键
            String javaMapkey=javaIterator.next();
            ///取出javaMap学科集合的值,值是个阶段的Map集合
            Map<String, String> jieduanMap=javaMap.get(javaMapkey);
            //遍历阶段的Map集合,调用方法KeySet(),拿出阶段的Map集合
            Set<String> jieduanSet=jieduanMap.keySet();
            //迭代器遍历Set集合
            Iterator<String> jieduanIterator=jieduanSet.iterator();
            while (jieduanIterator.hasNext()) {
                //
                String key=jieduanIterator.next();
                //
                String valueString=jieduanMap.get(key);
                System.out.println(javaMapkey+"=="+key+"=="+valueString);

            }
        }

    }
    /*
     *  方法遍历javaMap集合,entrySet()方式
     */
    public static void entrySet(Map<String, Map<String, String>> javaMap) {
        //学科集合javaMap,方法entryset(),获取学科集合的键值对,映射关系对象Entry
        Set<Map.Entry<String, Map<String, String>>>javaMapEntrySet=javaMap.entrySet();
        //迭代器遍历Set集合
        Iterator<Map.Entry<String, Map<String, String>>> javaMapEntryit=javaMapEntrySet.iterator();
        while (javaMapEntryit.hasNext()) {
            ///取出Set集合元素,元素是javaMap学科集合的键值对关系对象
            Map.Entry<String, Map<String, String>> javaMapEntry=javaMapEntryit.next();
            //获取//获取javaMap阶段集合的键,是阶段名
            String javaMapkey=javaMapEntry.getKey();
            ///获取javaMap集合值,是阶段的集合(姓名,学号)
            Map<String,String> jieDuanMap = javaMapEntry.getValue();
            //遍历阶段jieDuanMap,方法entrySet()取出集合的键值对映射关系对象
            Set<Map.Entry<String,String>> jieDaunEntrySet = jieDuanMap.entrySet();
            //迭代器遍历Set
            Iterator<Map. Entry<String, String>> jieDuanEntryIt = jieDaunEntrySet. iterator();
            while(jieDuanEntryIt. hasNext()) {
                //取出Set集合的键,是阶段集合的键值对映射关系对象
                Map . Entry<String, String> jieDuanMapEntry = jieDuanEntryIt .next();
                //阶段集合的键,学号
                String key = jieDuanMapEntry. getKey();
                //阶段集合的值,姓名
                String value = jieDuanMapEntry . getValue();
                System . out. println(javaMapkey+"=="+key+"=="+value);
            }
        }
    }

}
