// You are using Java

class Main {

    // Recursive function to print numbers from a to n
    public static void print(int a, int n) {

        // Base condition → stop recursion when a becomes greater than n
        if (a > n) {
            return;
        }

        // Print current number
        

        // Recursive call → increase a and call function again
        print(a + 1, n);
        System.out.println(a);
    }

    public static void main(String[] args) {

        // Starting value
        int n = 0;

        // Ending value
        int m = 5;

        // Call the recursive function
        print(n, m);
    }
}