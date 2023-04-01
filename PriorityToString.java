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