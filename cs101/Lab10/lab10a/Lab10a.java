import java.util.Scanner;
/** polinoms
  *@author Arman Engin Sucu
  *@version 14.05.2020
  */
public class Lab10a{
  //methods
  public static int calculatePolynomial( int[] coeff , int x){
    int result = 0;
    for(int i = 0 ; i < coeff.length ; i++){
      result += coeff[i]*Math.pow(x,i);
    }
    return result;
  }
  
  public static void printPolynomia(int[] coeff , int x , int r){
    String result = "";
    for(int i = coeff.length-1 ; i >= 1 ; i--){
      result += coeff[i]+"("+x+"^"+ i + ")" + " + ";
    }
    result += coeff[0] + " = " + r;
    System.out.print(result);
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //variables
    int[] coeffs;
    int n;
    int x;
    
    //code    
    System.out.println("Start of Lab10a");
    System.out.print("Please enter the value of N:"); 
    n =scan.nextInt();
    coeffs = new int[n+1];
    while(n >= 0){
      System.out.print("\nPlease enter the coefficient a" + n + ":");
      coeffs[n] = scan.nextInt();
      n--;
    }
    
    // to not get error x is initialised
    x = 1;
    while(x != 0){
      
      System.out.print("\nPlease enter the X value:"); 
      x = scan.nextInt();
      if(x != 0){
        System.out.println("\n************************");
        System.out.println("for X = " + x);
        printPolynomia(coeffs , x , calculatePolynomial(coeffs , x));
        System.out.println();
      }
    }
    System.out.println("--- End of Lab10a ---");
  }  
}
