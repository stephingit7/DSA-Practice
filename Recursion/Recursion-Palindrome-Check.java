
class Main {

    // Check palindrome using recursion
    public static boolean print(int a, String[] arr) {

        // Base case → reached middle
        if (a >= arr.length / 2) {
            return true;
        }

        // Compare current and mirror element
        if (!arr[a].equals(arr[arr.length - a - 1])) {
            return false;
        }

        // Move inward
        return print(a + 1, arr);
    }

    public static void main(String[] args) {

        // Input array
        String[] arr = {"M", "A", "D", "A", "M"};

        // Function call
        System.out.print(print(0, arr));
    }
}