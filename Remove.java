import java.util.*;

public class Remove {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("1");
        t1.add("2");
        t1.add("3");
        t1.add("4");
        t1.add("5");


        Iterator itr = t1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        String lastElement = t1.pollLast();
        System.out.println("Tree Set after removing the last element: " + t1);
    }
}