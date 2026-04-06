// You are using Java
import java.util.*;

class Main {

    // Recursive function to reverse array
    public static void print(int a, int b, int[] arr) {

        // Base condition → stop when pointers cross
        if (a >= b) {
            System.out.print(Arrays.toString(arr)); // print final reversed array
            return;
        }

        // Swap elements at index a and b
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        // Recursive call → move inward
        print(a + 1, b - 1, arr);
    }

    public static void main(String[] args) {

        int start = 0;

        int[] arr = {1, 2, 3, 4, 5, 6};

        int end = arr.length - 1;

        // Call function
        print(start, end, arr);
    }
}