// You are using Java

class Main {

    // Recursive function to print from a to n
    public static void print(int a, int n) {

        // Base condition → stop when a becomes greater than n
        if (a > n) {
            return;
        }

        // Print current value
        System.out.println("Stephin " + a);

        // Recursive call → move to next number
        print(a + 1, n);
    }

    public static void main(String[] args) {

        // Starting value
        int n = 0;

        // Ending value
        int m = 5;

        // Function call
        print(n, m);
    }
}