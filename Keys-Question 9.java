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

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=12375:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Keys
Set of Keys: [1, 2, 3, 4]

Process finished with exit code 0
