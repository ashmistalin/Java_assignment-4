import java.util.*;

public class Keyss {
    public static void main(String[] args) {
        TreeMap<Integer, String> t1 = new TreeMap<>();
        t1.put(1, "One");
        t1.put(2, "Two");
        t1.put(3, "Three");
        t1.put(4, "Four");
        int key = 3;
        Map.Entry<Integer,String> entry = t1.ceilingEntry(key);
        if(entry != null){
            System.out.println("Key-Value mapping associated with the least key greater than or equal to " + key + " is : " + entry);
        } else
        {
            System.out.println("There is no such key.");
        }
    }
}

OUTPUT:
C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=13263:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Keyss
Key-Value mapping associated with the least key greater than or equal to 3 is : 3=Three

Process finished with exit code 0
