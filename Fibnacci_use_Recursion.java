import java.util.Scanner;

public class Fibnacci_use_Recursion {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term:");
        int n= sc.nextInt();

        if(n==0){
         System.out.println(a);
        }
        else{
            System.out.println(a+" "+b);
        }

        PrintFebnocii(n);
      sc.close();
    }

    static void PrintFebnocii(int n) {

        if (n >= 1) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

            PrintFebnocii(n-1);

        }

    }

    

}
