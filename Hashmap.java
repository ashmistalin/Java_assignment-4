import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class Hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> m1 = new HashMap<>();
        m1.put("Apple",1);
        m1.put("Banana",2);
        m1.put("Carrot",3);
        Collection<Integer> values = m1.values();
        System.out.println(values);
    }
}