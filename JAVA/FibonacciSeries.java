//FIBONACCI SERIES WITH AND WITHOUT RECURRSION

import java.util.Scanner;
public class FibonacciSeries{

    //WITHOUT RECURRSION
     //TIME COMPLEXITY: O(N)
    //SPACE COMPLEXITY: O(1)
    static void FibonacciWithoutRecurrsion(int n){
        int a=0, b=1;
        int i=0;

        while(i<n){
            System.out.print(a + " ");

            int c = a+b;
            a = b;
            b = c;
            i = i+1;
        }
    }

    //WITH RECURRSION
     //TIME COMPLEXITY: O(2^N)
    //SPACE COMPLEXITY: O(N)
    static int FibonacciWithRecurrsion(int m){
        if (m<=1)
            return m;
        
        return FibonacciWithRecurrsion(m-1) + FibonacciWithRecurrsion(m-2);
           
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENTER THE VALUE OF n: ");
            int n = sc.nextInt();
            System.out.println("FIBONACCI SERIES WITHOUT RECURRSION");
            FibonacciWithoutRecurrsion(n);
            
            System.out.println("");
            System.out.print("ENTER THE VALUE OF m: ");
            int m = sc.nextInt();
            System.out.println("FIBONACCI SERIES WITH RECURRSION");
            for (int j=0; j<m; j++){
                System.out.print(FibonacciWithRecurrsion(j)+ " ");
            }
        }
    }
}