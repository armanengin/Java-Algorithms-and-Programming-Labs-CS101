import java.util.Scanner;
/**
 * a program to adjust the string
 * @author Arman Engin SUCU
 * @version 23.03.2020
 */
public class Lab05a{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    //variables
    String input;
    int count = 1;
    String reverse = "";
    
    //program code
    System.out.print("Please enter a string");
    input = scan.nextLine();
    
    do{
      count = 0;
      for( int i = 0; i < input.length() - 1; i++){
        if( input.charAt(i) == input.charAt(i + 1) - ' '){
          input = input.substring(0 , i) + input.substring(i + 2);
          count++;
        }
        else if( input.charAt(i) - ' ' == input.charAt(i + 1) ){
          input = input.substring(0 , i) + input.substring(i + 2);
          count++;
        }
        else if( input.charAt(i) == input.charAt(i + 1) ){
          input = input.substring(0 , i) + input.substring(i + 2);
          count++;
        }
      }
    }while(count != 0);
    
    if(input.length() > 0){
      System.out.println( input );    
      for(int i = input.length() -1 ; i >= 0 ; i--){
        reverse += input.charAt(i);
      }
      System.out.println("Reverse: " + reverse);
    }
    else
      System.out.println("Empty String");
  }
}