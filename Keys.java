import java.util.HashMap;
import java.util.Set;

public class Keys {
    public static void main(String[] args) {
        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(1, "Apple");
        m1.put(2, "Banana");
        m1.put(3, "Carrot");
        m1.put(4, "Date");
        Set<Integer> keys = m1.keySet();
        System.out.println("Set of Keys: " + keys);
    }
}