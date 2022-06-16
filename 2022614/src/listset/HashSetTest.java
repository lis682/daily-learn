package listset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<person> hashSet = new HashSet<person>();

        // 3.添加多个Person到HashSet中
        hashSet.add(new person("王昭君", 21));
        hashSet.add(new person("西施", 21));
        hashSet.add(new person("杨玉环", 20));
        hashSet.add(new person("貂蝉", 19));
        hashSet.add(new person("杨玉环", 20));
        hashSet.add(new person("貂蝉", 19));

        // 4.遍历获取HashSet中的内容
        for (person p : hashSet) {
            System.out.println(p);
        }
    }
}
