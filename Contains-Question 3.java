import java.util.LinkedList;

public class Contains {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Good");
        list.add("Morning");
        list.add("To");
        list.add("All");
        String e="Good";
        if (list.contains(e)) {
            System.out.println("The element '"+e+"' exists.");
        }
        else {
            System.out.println("Element does not exist.");
        }
    }
}

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=10753:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Dell\IdeaProjects\Ashmi\out\production\Ashmi Contains

The element 'Good' exists.

Process finished with exit code 0
