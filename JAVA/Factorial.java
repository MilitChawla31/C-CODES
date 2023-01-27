//FACTORIAL SERIES WITH AND WITHOUT RECURRSION

import java.util.Scanner;
public class Factorial {
    
    //WITHOUT RECURRSION
    //TIME COMPLEXITY: O(N)
    //SPACE COMPLEXITY: O(1) 
    static int factorialWithoutRecurrsion(int n){
        int i,fact = 1;
        for(i=1; i<=n; i++)
            fact = fact*i;
        return fact;
    }

    //WITH RECURRSION
    //TIME COMPLEXITY: O(N)
    //SPACE COMPLEXITY: O(N) 
    static int factorialWithRecurrsion(int m){
        if(m==0)
        return 1;

        return m*factorialWithRecurrsion(m-1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENTER THE VALUE OF n: ");
            int n = sc.nextInt();
            System.out.println("Factorial of "+n+ " without recursion is " + factorialWithoutRecurrsion(n));

            System.out.print("ENTER THE VALUE OF m: ");
            int m = sc.nextInt();
            System.out.println("Factorial of "+m+ " with recurrsion is " + factorialWithoutRecurrsion(m));
        }
    }
}
