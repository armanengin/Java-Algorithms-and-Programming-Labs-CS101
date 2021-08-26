import java.util.Scanner;
/**
 * a progrom evaluating your bfp
 * @author Arman Engin SUCU
 * @version 01.03.2020
 */
public class Lab03b{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);  
    
    //constants
    final double bmiFac = 1.20;
    final double ageFac = 0.20;
    final double num = 16.2;
    
    //variable
    double bmi;
    double bfp;
    int weight;
    double height;
    int age;
    
    //program code
    //reading inputs
    System.out.print("Please enter the age.");
    age = scan.nextInt();
    System.out.print("\nPlease enter the weight.");
    weight = scan.nextInt();
    System.out.print("\nPlease enter the height.");
    height = scan.nextDouble();
    //calculating bfp
    bmi =  (weight) / (height * height);
    bfp = (1.20 * bmi) + (0.23 * age) - (16.2);
    System.out.printf("%s%.2f%s%d%s%d%s%.2f\n","Based on a height of ", height , " and weight of ", weight , " and age of " , age , ", your BFP is " , bfp );
    if(age < 18){
      System.out.println("Age is too smal to calculate BFP.");
    }
    else if(age >= 18 && age <= 40){
      if(bfp < 21){
        System.out.println("UNDERFAT");
      }
      if(bfp >= 21 && bfp < 33){
        System.out.println("HEALTHY");
      }
      if(bfp >= 33 && bfp <= 39){
        System.out.println("OVERWEÝGHT");
      }
      if(bfp > 39){
        System.out.println("OBESE");
      }
      
      else if(age >= 41 && age <= 60){
        if(bfp < 23){
          System.out.println("UNDERFAT");
        }
        if(bfp >= 23 && bfp < 35){
          System.out.println("HEALTHY");
        }
        if(bfp >= 35 && bfp <= 40){
          System.out.println("OVERWEÝGHT");
        }
        if(bfp > 40){
          System.out.println("OBESE");
        }
        
        else if(age >= 61 && age <= 79){
          if(bfp < 24){
            System.out.println("UNDERFAT");
          }
          if(bfp >= 24 && bfp < 36){
            System.out.println("HEALTHY");
          }
          if(bfp >= 36 && bfp <= 42){
            System.out.println("OVERWEÝGHT");
          }
          if(bfp > 42){
            System.out.println("OBESE");
          }
        }
      }
    }
  }
}