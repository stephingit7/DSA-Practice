
class Main {

    // Recursive function to find nth Fibonacci number
    public static int fibo(int a) {

        // Base case → first two values
        if (a == 1) return 1;
        if (a == 0) return 0;

        // Recursive relation → sum of previous two
        return fibo(a - 1) + fibo(a - 2);
    }

    public static void main(String[] args) {

        int n = 100;

        // Function call
        System.out.print(fibo(n));
    }
}