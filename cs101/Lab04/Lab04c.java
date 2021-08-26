import java.util.Scanner;
/**
 * a program finding the perfect square
 * @author Arman Engin SUCU
 * @version 12.02.2020
 */
public class Lab04c{
  public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);
//variables
  int n;
  int x = 0;
//program code
  System.out.print("Please enter a value for n: ");
  n = scan.nextInt();
  while( x*x < n ){
    x++;
  }
  System.out.println("\nThe largest perfect square less than " + n + " is " + x*x + " ( " + x + " ^ 2 )");
  }
}