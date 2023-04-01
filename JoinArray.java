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

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=10148:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi JoinArray

Good Morning to all 

Process finished with exit code 0

