// Đảo ngược phần tử:
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        printArray(arr);

        reverseArray(arr);
        System.out.println("Reversed array: ");
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}