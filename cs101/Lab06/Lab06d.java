import java.util.Scanner;
/**
 * a gamble game
 * @author Arman Engin SUCU
 * @version 09.04.2020
 */
public class Lab06d{
  //variables
  static double total = 0;
  static int prediction;
  static int bet;
   
  /**
   *calculator method 
   * @param p is prediction
   * @param b is bet
   * @return a string outputs the sum of dice and my total money
   */
  public static String calculator(int p , int b){
    int dice1 = 6;
    int dice2 = 6;
    dice1 = (int)(dice1*Math.random()) + 1;
    dice2 = (int)(dice1*Math.random()) + 1;
    if(((dice1 + dice2) % 2 == (p % 2)) && (p == 1 ||  p == 2)){
      total += b/2.0;
    }
    else if(((dice1 + dice2) % 2 != (p % 2)) && (p == 1 || p == 2)){
      total -= b/4.0;
    }
    else if((((dice1 + dice2) == 2) || ((dice1 + dice2) == 12)) && p == 3){
      total += b;
    }
    else if((((dice1 + dice2) != 2) && ((dice1 + dice2) != 12)) && p == 3)
      total -= b;
    return "The sum of the dice is " + (dice1 + dice2) + "\nYour total money is " + total;
  }
  
  //program code        
  public static void main(String[] args){    
   Scanner scan = new Scanner(System.in); 
    System.out.print("Enter your total money");
    total = scan.nextInt();
    do{
      System.out.print("\nEnter prediction( 1 for ODD, 2 for EVEN, 3 for EXTREME):");
      prediction = scan.nextInt();
      do{
        System.out.print("\nEnter the amount of money you want to bet:");
        bet = scan.nextInt();
        if(bet > total){
          System.out.print("\nYour money is not enough!");
        }
      }while( bet > total );
      System.out.println("\n" + calculator( prediction , bet ));
      System.out.print("*************************************************************************");
    }while(total > 0 && bet != 0);
  }
}







