class Main {

    // Recursive function to print numbers from a to n
    public static void print(int a, int n) {

        // Base condition → stop when a > n
        if (a > n) {
            return;
        }

        // Recursive call FIRST
        print(a + 1, n);

        // Print AFTER recursion
        System.out.println(a);
    }

    public static void main(String[] args) {

        int n = 0;   // start
        int m = 5;   // end

        print(n, m);
    }
}