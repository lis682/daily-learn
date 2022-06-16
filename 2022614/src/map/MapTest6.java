package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest6 {
    public static void main(String[] args) {
        HashMap<person,String> pi =new HashMap<>();
        person per1 = new person("张三",19);
        person per2 = new person("李四",19);
        person per3 = new person("王五",20);
        pi.put(per1,"乐观开朗");
        pi.put(per2,"成熟稳重");
        pi.put(per3,"积极向上");
        //keyset方法遍历map集合
        Set<person> keyset = pi.keySet();
        for (person per:keyset) {
            String xingge = pi.get(per);
            System.out.println("姓名 " + per.getName() + " 年龄 " + per.getAge() + " 性格 " + xingge);
        }
        System.out.println("------------------------------------------------------");
            //entryset遍历map集合
            Set <Map.Entry<person,String>> entrySet= pi.entrySet();
            for (Map.Entry<person,String>entry:entrySet) {
                person per5= entry.getKey();
                String xinggeentry = entry.getValue();
                System.out.println("姓名 "+per5.getName()+" 年龄 "+per5.getAge()+" 性格 "+xinggeentry);


            }


        }






    }

