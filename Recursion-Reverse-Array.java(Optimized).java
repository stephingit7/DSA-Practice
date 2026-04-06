// You are using Java
import java.util.*;

class Main {

    // Function to reverse array using recursion
    public static void print(int a, int[] arr) {

        // Base condition → stop when middle is reached
        if (a >= arr.length / 2) {
            System.out.print(Arrays.toString(arr)); // print reversed array
            return;
        }

        // Swap current element with its mirror element
        int temp = arr[a];
        arr[a] = arr[arr.length - a - 1];
        arr[arr.length - a - 1] = temp;

        // Recursive call → move to next index
        print(a + 1, arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6}; // input array

        print(0, arr); // function call
    }
}