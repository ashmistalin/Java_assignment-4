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

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=10415:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Retrieve

First element:  Good 
The original list:
Good Morning to all 

Process finished with exit code 0

