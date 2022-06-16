package map;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;
import java.util.function.BiConsumer;

public class MapStringTest {




    public static void main(String[] args) {
        String s ="sdhvflgknc,m,d,b,g,lreljgdnvekjfdcml";
        Set<Character>str_set=new HashSet<Character>();
        char[] ca = s.toCharArray();
        for (Character C:ca) {
          Boolean b=  str_set.add(C);

        }
        System.out.println("去重后"+str_set+"共有"+str_set.size()+"个字符");
        Map<Character,Integer> map1 = new HashMap<Character, Integer>() ;
        for (Character c:ca) {
            map1.put(c,map1.containsKey(c)?(map1.get(c)+1):1);
        }
        for(Character c:ca){
            Integer value = map1.get(c);
            System.out.println(c+"= ="+value);
        }


        System.out.println(map1);
        }




    }

