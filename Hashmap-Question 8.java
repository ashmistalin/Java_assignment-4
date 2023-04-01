import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class Hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> m1 = new HashMap<>();
        m1.put("Apple",1);
        m1.put("Banana",2);
        m1.put("Carrot",3);
        Collection<Integer> values = m1.values();
        System.out.println(values);
    }
}


OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=12169:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Hashmap
[1, 3, 2]

Process finished with exit code 0
