import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class Hashs {
    public static void main(String[] args) {
        HashSet h1=new HashSet<>();
        h1.add(1);
        h1.add(4);
        h1.add(2);
        h1.add(3);
        System.out.println("The original hashset:");
        Iterator itr=h1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        h1.clear();
        System.out.println("The new hashset after removing elements:");
        System.out.println(h1);
    }
}
