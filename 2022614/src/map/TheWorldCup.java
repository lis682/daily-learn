package map;

import java.util.*;

public class TheWorldCup {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        System.out.println("请输入年份");
        Scanner sc =new Scanner(System.in);
        Integer year = sc.nextInt();
        Set<Integer> keys= map.keySet();
      boolean isFindYear = false;
      boolean isFindContury=false;
      for (Integer key:keys){
          if(year.equals(key)){
              System.out.println(map.get(key));
              isFindYear=true;
          }
      }
      if (isFindYear=false){
          System.out.println("没有举办世界杯");
      }
        System.out.println("请输入国家");
      String country=sc.next();
      Set<Integer> totleYearSet = new HashSet<>();
      for (Integer str:keys) {
          if (country.equals(map.get(str))) {

              totleYearSet.add(str);
              isFindContury = true;
          }
      }
          for (Integer reyearr:totleYearSet){
              System.out.println(reyearr);
          }
          if(isFindContury == false){
              System.out.println("没有获得过世界杯");

          }

      }

    }

