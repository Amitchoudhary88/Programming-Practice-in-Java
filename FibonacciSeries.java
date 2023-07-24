
// Fibonacci Series Example----> 0 1 1 2 3 5 8 13 21 34 ---------?

//1.Fibonacci Series in Java without using recursion
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create the scanner class
        int a = 0, b = 1, c;

        System.out.println("Enter The Term :");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(a);
        }
        else
        System.out.println(a + "\n" + b);

        int i = 2;

        while (i < n) {

            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
            i++;

        }

        sc.close();
    }
}