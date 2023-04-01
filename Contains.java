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