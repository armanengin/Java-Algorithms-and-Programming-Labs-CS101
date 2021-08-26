import java.util.Scanner;
/**
 * a program comparing integers
 * @Arman Engin SUCU
 * @version 01.03.2020
 */
public class Lab03c{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //variables
    int integer1;
    int integer2;
    int integer3;
    
    //program code
    System.out.print("Please enter the integers.");
    integer1 = scan.nextInt();
    integer2 = scan.nextInt();
    integer3 = scan.nextInt();       
    if(string1.equals("") ){
      System.out.println( string2 );
    }
    else if(string1.charAt(string1.length()-1) == string2.charAt(0)){
      System.out.println(string1.substring(0,string1.length()-1) + string2);
    }
    else
      System.out.println(string1 + string2);
  }
}
