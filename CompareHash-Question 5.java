import java.util.HashSet;
public class CompareHash {

    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<String>();
        HashSet<String> h2 = new HashSet<String>();
        h1.add("1");
        h1.add("Mango");
        h1.add("Grapes");
        h1.add("Orange");
        h2.add("Strawberry");
        h2.add("Banana");
        h2.add("Grapes");
        h2.add("Mango");
        System.out.println("Elements of first hash set: "+h1);
        System.out.println("Elements of second hash set: "+h2);
        if(h1.equals(h2))
        {
            System.out.println("Both the hash sets are equal.");
        }
        else {
            System.out.println("\nBoth hash-sets are not equal.\n");
            h1.removeAll(h2);
            h2.removeAll(h1);
            System.out.println("Difference between two HashSet: " + h1);
            System.out.println("Difference between two HashSet: " + h2);
        }

    }
}

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=11139:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi CompareHash
Elements of first hash set: [1, Grapes, Mango, Orange]
Elements of second hash set: [Grapes, Strawberry, Mango, Banana]

Both hash-sets are not equal.

Difference between two HashSet: [1, Orange]
Difference between two HashSet: [Grapes, Strawberry, Mango, Banana]

Process finished with exit code 0
