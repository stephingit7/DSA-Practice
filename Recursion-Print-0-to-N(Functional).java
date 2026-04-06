// You are using Java

class Main {

    // Recursive function to return sum from a to 1
    public static int print(int a) {

        // Base condition → when a becomes 0
        if (a == 0) {
            return 0;
        }

        // Return current value + recursive call
        return a + print(a - 1);
    }

    public static void main(String[] args) {

        int n = 50;

        // Print final result
        System.out.print(print(n));
    }
}