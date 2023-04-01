import java.util.*;

public class Remove {
    public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("1");
        t1.add("2");
        t1.add("3");
        t1.add("4");
        t1.add("5");


        Iterator itr = t1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        String lastElement = t1.pollLast();
        System.out.println("Tree Set after removing the last element: " + t1);
    }
}

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=11528:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Remove
1
2
3
4
5
Tree Set after removing the last element: [1, 2, 3, 4]

Process finished with exit code 0
