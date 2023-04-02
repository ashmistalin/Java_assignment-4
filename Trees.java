import java.util.TreeMap;
import java.util.Set;

public class Trees {
    public static void main(String[] args) {
        TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
        t1.put(2, "two");
        t1.put(1, "one");
        t1.put(3, "three");
        t1.put(4, "four");
        t1.put(5, "five");
        Set set = t1.entrySet();
        int key = 5;
        Integer leastKey = t1.ceilingKey(key);
        System.out.println("Least key greater than or equal to " + key + " is " + leastKey);
    }
}