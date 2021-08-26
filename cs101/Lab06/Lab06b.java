

import java.util.Scanner;
/**
 * generating special strings
 * @author Arman Engin SUCU
 * @version 04.04.2020
 */
public class Lab06b{
  //variables
  static int n;
  static String random;
  static String output;
  static String temp;
  static int count;
  
  //program code 
  public static String generateTheString(){
    random = "abcdefghijklmnoprstuvyzwxq";    
    do{
      //System.out.println("3");
      output = "";
      count = 0;
      for(int i = 0 ; i < n ; i++){
        output += random.charAt((int)(Math.random()*26));
      }
      temp = output;
      for(int i = 0 ; i < temp.length() - 1 ; i++){
        if(temp.charAt(i) == temp.charAt(i + 1)){
          temp = temp.substring(0,i) + temp.substring(i +1);
          i = 0;
        }
      }
      for(int i = 0 ; i < temp.length() ; i++){        
        for(int j = 0; j < output.length() ; j++){          
          if( temp.charAt(i) == output.charAt(j)){
            count++;
          }
        }
        if( count % 2 == 0 ){
          i = temp.length();
        }
        else{
          count = 0;          
        }
      }           
    }while( count != 0 ); 
    
    return output;
  }   
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    do{
      do{
        System.out.println("Please enter an positive integer.");
        n = scan.nextInt();
        if( n < 0 ){
          System.out.println("You have entered negative value!");
        }       
      }while( n < 0 );
      System.out.println(generateTheString());
    }while( n != 0 ); 
  }
}














