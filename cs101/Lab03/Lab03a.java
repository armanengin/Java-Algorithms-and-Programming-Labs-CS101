import java.util.Scanner;
/**
 * a program to concatanete the strings
 * @Arman Engin SUCU
 * @version 01.03.2020
 */
public class Lab03a{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //variables
    String string1;
    String string2;
    
    //program code
    System.out.print("Please enter the first string.");
    string1 = scan.nextLine();
    System.out.print("\nPlease enter the second string.");
    string2 = scan.nextLine();
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
