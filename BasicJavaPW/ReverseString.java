import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Think twice");

        // Reverse first 5 characters (substring 0 to 5)
        StringBuilder firstPart = new StringBuilder(" " +sb.substring(0, 5));
        firstPart.reverse();

        // Reverse remaining characters (substring from index 5 onward)
        StringBuilder secondPart = new StringBuilder(sb.substring(5));
        secondPart.reverse();

        // Combine the two parts
        StringBuilder result = new StringBuilder();
        result.append(firstPart).append(secondPart);

        System.out.print(result);
    }
}
