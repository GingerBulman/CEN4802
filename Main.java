import java.util.Scanner;

public class Main {

    public static int fibonacci(int n)    {
   
    if (n <= 1)
       return n;
    return fibonacci(n-1) + fibonacci(n-2);
  }
  
    public static void main (String args[])  {
   
    	int n;
    
    Scanner scan=new Scanner(System.in);
   
    System.out.println("Enter a value of n: ");
    n=scan.nextInt();
   
    System.out.println("The "+n+"th term of the Fibonacci sequence is "+fibonacci(n));
    }
}
