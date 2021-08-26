import java.util.Scanner;
/**
 * a program for encryption
 * @author Arman Engin SUCU
 * @version 04.04.2020
 */
public class Lab06c{
  //variables
  //methods
  public static String encryption(String str){
    String output = "";
    int row;
    int column;
    for(int i = 0 ; i < str.length() ; i++){
      if(str.charAt(i) == ' '){
        str = str.substring(0 , i) + str.substring(i+1);
        i = 0;
      }
    }
    Double l = str.length()*1.0;
    if(Math.sqrt(l) == (int)Math.sqrt(l)){
      row = (int)Math.sqrt(l);
      column = (int)Math.sqrt(l);
    }
    else{
      row = (int)Math.sqrt(l);
      column = row + 1; 
    }
    for(int j = 1; j <= column ; j++){
      for(int i = 1; i < str.length() + 1 ; i++){
        if(  i % column == j % column ){
          output += str.charAt(i - 1);
        }   
      }
      output += " ";
    }
    return output;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a message");
    String str = scan.nextLine();
    System.out.println("Encoded message: " + encryption(str));
  }
}
   
