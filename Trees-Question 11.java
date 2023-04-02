import java.util.TreeMap;
import java.util.Set;

public class Trees {
    public static void main(String[] args) {
        TreeMap<Integer, String> t1 = new TreeMap<Integer, String>();
        t1.put(2, "two");
        t1.put(1, "one");
        t1.put(3, "three");
        t1.put(4, "four");
        t1.put(5, "five");
        Set set = t1.entrySet();
        int key = 5;
        Integer leastKey = t1.ceilingKey(key);
        System.out.println("Least key greater than or equal to " + key + " is " + leastKey);
    }
}

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=13530:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Trees
Least key greater than or equal to 5 is 5

Process finished with exit code 0
