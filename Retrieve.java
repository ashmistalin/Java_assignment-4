import java.util.Iterator;
import java.util.LinkedList;

public class Retrieve {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("Good ");
        l1.add("Morning ");
        l1.add("to ");
        l1.add("all ");
        System.out.println("First element:  "+l1.peekFirst());
        System.out.println("The original list:");
        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }
    }
}
