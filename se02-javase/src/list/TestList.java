package list;


import java.util.*;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/20-16:23
 */
public class TestList {

    /**
     * 测试list集合迭代器
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1.给集合进行赋值
        for(int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println(list);
        //2.使用迭代器进行遍历：
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }
        //关于Set集合的迭代与去重：
        Set<Student> set = new HashSet<>();
        set.add(new Student("张三",18));
        set.add(new Student("武大郎",20));
        set.add(new Student("潘金莲",23));
        set.add(new Student("张三",18));
        System.out.println(set);
        Iterator<Student> iterator1 = set.iterator();
        while(iterator1.hasNext()){
            Student student = iterator1.next();
            System.out.println(student);
        }
        //创建map集合，并进行遍历测试：
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Eric");
        map.put(2,"Lisa");
        map.put(3,"Mike");
        
        //1.遍历方式1：
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator2 = entries.iterator();
        while(iterator2.hasNext()){
            Map.Entry<Integer, String> next = iterator2.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println(key+":"+value);
        }
        //2.遍历方式2：
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator3 = keySet.iterator();
        while(iterator3.hasNext()){
            Integer key = iterator3.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

    }
}

class Student{
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
