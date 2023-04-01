import java.util.ArrayList;
import java.util.Iterator;

public class JoinArray {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add("Good ");
        l1.add("Morning ");
        ArrayList l2=new ArrayList();
        l2.add("to ");
        l2.add("all ");
        l1.addAll(l2);
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
