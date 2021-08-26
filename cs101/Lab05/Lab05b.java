import java.util.Scanner;
/**
 * a program to print fibonacci numbers
 * @author Arman Engin SUCU
 * @version 23.03.2020
 */
public class Lab05b{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    //variables    
    int n = 1; 
    int first = 0;
    int second = 1;
    int temp;
    
    //program code
    System.out.print("Please enter a value for n:");
    n = scan.nextInt();
    
    while( n < 0 ){
      System.out.println("\nInvalid value has been entered.");
      System.out.print("Please enter a value for n:");
      n = scan.nextInt();
    }
    
    System.out.println();
    System.out.println("Fib(" + first + ") = " + first);
    System.out.println("Fib(" + second + ") = " + second);
    for( int i = 2 ; i <= n ; i++){      
      System.out.println("Fib(" + i + ") = " + (first + second));
      temp = first;
      first = second;
      second += temp;
    }
  }
}

