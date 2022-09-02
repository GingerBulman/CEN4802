import java.util.Scanner;

public class Main {

    public static int fibonacci(int n)    {
    	// the Fibonacci sequence, in which each number is the sum of the two preceding ones. 
    	//The sequence commonly starts from 0 and 1, 
    	//although some authors omit the initial terms and start the sequence from 1 and 1 or from 1 and 2. 
    	//Starting from 0 and 1, the next few values in the sequence are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
    	//hey are named after the Italian mathematician Leonardo of Pisa, later known as Fibonacci, 
    	//who introduced the sequence to Western European mathematics in his 1202 book Liber Abaci.
   
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
