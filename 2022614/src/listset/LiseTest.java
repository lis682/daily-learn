package listset;

import java.util.ArrayList;
import java.util.List;

public class LiseTest {
    private static int  frequency(List<String> list, String a) {
        int num=0;
        for (String s : list) {
            if (s.equals(a)){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");

        System.out.println(frequency(list, "a"));	// 3
        System.out.println(frequency(list, "b"));	// 2
        System.out.println(frequency(list, "c"));	// 1
        System.out.println(frequency(list, "d"));	// 5
        System.out.println(frequency(list, "xxx"));	// 0
    }

}
