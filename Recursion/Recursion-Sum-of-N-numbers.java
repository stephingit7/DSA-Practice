// You are using Java

class Main {

    // Recursive function to calculate sum from a to 1
    public static void print(int a, int sum) {

        // Base condition → when a becomes 0
        if (a < 1) {
            System.out.println(sum); // print final sum
            return;
        }

        // Recursive call → reduce a and add current value to sum
        print(a - 1, sum + a);
    }

    public static void main(String[] args) {

        int n = 50;  // starting number
        int m = 0;   // initial sum

        print(n, m);
    }
}