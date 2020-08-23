package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-8:48
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Eric");
        map.put(2,"Lisa");
        map.put(3,"Mike");

        //对map集合进行遍历：
        //方式一：
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator1 = set.iterator();
        while(iterator1.hasNext()){
            Integer key = iterator1.next();
            String value = map.get(key);
            System.out.println(key+"::"+value);
        }
        //方式二：
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator2 = entries.iterator();
        while (iterator2.hasNext()){
            Map.Entry<Integer, String> entry = iterator2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"::"+value);
        }
        //方式三：
        Set<Integer> set1 = map.keySet();
        for(Integer key1:set1){
            String value = map.get(key1);
            System.out.println(key1+"::"+value);
        }
    }
}
