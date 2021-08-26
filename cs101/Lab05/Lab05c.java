import java.util.Scanner;
/**
 * a program to make walls
 * @author Arman Engin SUCU
 * 23.02.2020
 */
public class Lab05c{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    //variables
    int width;
    int height;
    int thickness;
    int count;
    char control;
    
    //program code
    do{
      count = 0;
      System.out.print("Enter a width, height and thickness: ");
      width = scan.nextInt();
      height = scan.nextInt();
      thickness = scan.nextInt();
      if((width <= 0 || height <= 0 ) || thickness <= 0){
        System.out.println("\nError all values must be positive!");
      }
      else{
        for( int i = 0; i < height; i++){
          if ( i < thickness || i >= (height - thickness)){          
            for( int j = 0; j < width; j++){            
              System.out.print("*");            
            }
          }
          else         
            for( int j = 0; j < width; j++){
            if ( j < thickness || j >= (width - thickness)){
              System.out.print("*");            
            }
            else{            
              System.out.print(" ");
              count++;
            }
          }
          System.out.println();
        }
        if( count == 0){
          System.out.println("\nOops... no hole!");
        }
      }
      System.out.print("Enter Y or y to continue : ");
      control = scan.next().charAt(0);
    }while( control == 'y' || control == 'Y' );
  }
}



