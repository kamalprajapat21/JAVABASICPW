import java.util.*;

public class ArrayDequeFunction {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.offer(100);
        ad1.offer(300);
        ad1.offer(200);
        ad1.offer(200);
        ad1.offer(200);
        
        System.out.println(ad1);
    }
}
