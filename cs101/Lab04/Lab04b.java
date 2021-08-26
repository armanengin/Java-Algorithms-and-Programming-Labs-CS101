import java.util.Scanner;
/**
 * a program determines whether the string issy balance
 * @author Arman Engin SUCU
 * @version 12.02.2020
 */
public class Lab04b{
  public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);
//variables
    String str;
    int count = 0;
//program code
    System.out.print("Please enter a string: ");
    str = scan.nextLine();   
    while( str.length() > count ){
      if( str.charAt(count) == 'y'){
        int temp = count;
        while( str.length() > temp + 1){        
          temp++;
          if(str.charAt(temp) == 'x'){
            System.out.println("This string is not xy - balanced.");
            count = str.length() + 1;
            temp = str.length();
          }
        }        
      }      
      else if( str.charAt(count) == 'x'){
        int temp = count;
        int num = 0;
        while( str.length() > temp + 1 ){         
          temp++;          
          if(str.charAt(temp) == 'y'){
            num++;           
          }          
        }
        if(num == 0){
          System.out.println("This string is not xy - balanced."); 
          count = str.length() + 1;
        }
      }
      else
        count++;
    }
    if(count == str.length()){
      System.out.println("This string is xy - balanced.");
    }
  }
}









