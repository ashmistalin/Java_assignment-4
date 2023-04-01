import java.util.PriorityQueue;

public class PriorityToString
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("Apple");
        pQueue.add("Banana");
        pQueue.add("Ice-cream");
        pQueue.add("Lychee");
        System.out.println("Priority Queue: " + pQueue);
        StringBuilder sb = new StringBuilder();
        while (!pQueue.isEmpty())
        {
            sb.append(pQueue.poll() + " ");
        }
        System.out.println("String Representation of the Priority Queue: " + sb);
    }
}

OUTPUT:
C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=11772:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi PriorityToString
Priority Queue: [Apple, Banana, Ice-cream, Lychee]
String Representation of the Priority Queue: Apple Banana Ice-cream Lychee 

Process finished with exit code 0
