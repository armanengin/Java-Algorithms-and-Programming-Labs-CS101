import java.util.Scanner;
/**
 * a program about pi
 * @author Arman Engin SUCU
 * @version 26.02.2020
 */
public class Lab02a{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //variables
    int input;
    
    //program code
    // 1-Asteriks pattern
    //first line
    System.out.printf("****" + "%4s","*");
    System.out.printf("%6s","*");
    System.out.println();
    //second line
    System.out.printf("%4s","*");
    System.out.printf("%4s","*");
    System.out.printf("%5s","*" );
    System.out.println();
    //third line
    System.out.printf("****" + "%4s","*");
    System.out.printf("%4s","*" );
    System.out.println();
    //fourth line
    System.out.printf("%4s","*");
    System.out.printf("%4s","*");
    System.out.printf("%3s","*");
    System.out.printf("%4s","*" );
    System.out.println();
    //fifth line
    System.out.printf("****" + "%2s","*");
    System.out.printf("%2s","*" );
    System.out.printf("%2s","*" );
    System.out.printf("%2s","*****" );
    System.out.println();
    //sixth line
    System.out.printf("%15s","*" );
    
    
    //2- pi test program 
    System.out.println();
    input = scan.nextInt();
    System.out.printf("Enter the desired number of digits of pi: " + "%.15f\n",Math.PI );
    System.out.println(Math.PI);
  }
}


