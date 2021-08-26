import java.util.Scanner;
/**
 * methods for converting binary to decimal and decimal to binary.
 * @author Arman Engin SUCU
 * @version 04.04.2020
 */
public class Lab06a{
  //variables
  
  //methods
  public static String toBinary( int a ){
    String decimal = "";
    for( ; a > 0 ; a/=2){
      if( a % 2 == 0 ){
        decimal = 0 + decimal ;
      } 
      else
        decimal = 1 + decimal ;    
    }
    return decimal;
  }
  public static int powTwo( int pow ){
    int result = 1;
    for( int i = 0 ; i < pow ; i++ ){
      result *= 2;
    }
    return result;
  }
  public static int toDecimal ( String b ){
    int result = 0; 
    for ( int i = 0 ; i < b.length() ; i++ ){
      if( Integer.valueOf(b.charAt(i)) % 2 == 1 ){
        result += powTwo(b.length()- (1 + i));
      }
    }
    return result;
  }
  
  //main method
  public static void main( String[] args ){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer");
    int input = scan.nextInt();
    System.out.println("\nThe binary representation is " + toBinary(input));
    System.out.println("The decimal value is " + toDecimal(toBinary(input)));
    if(toDecimal(toBinary(input)) == input )
      System.out.println("They are equal.");
  }
}