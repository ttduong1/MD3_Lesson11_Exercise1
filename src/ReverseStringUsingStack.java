// Đảo ngược chuỗi Stack
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println("Original string: " + str);

        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        Stack<String> stack = new Stack<>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.empty()) {
            reversedStr.append(stack.pop());
            reversedStr.append(" ");
        }

        return reversedStr.toString().trim();
    }
}