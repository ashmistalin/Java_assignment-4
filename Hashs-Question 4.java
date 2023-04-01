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

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=10931:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Hashs
The original hashset:
1
2
3
4
The new hashset after removing elements:
[]

Process finished with exit code 0
