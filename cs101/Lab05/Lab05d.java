import java.util.Scanner;

/** display a menu to the user
  * @author Arman Engin Sucu
  * @version 25.02.2020
  */
public class Lab05d{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    //variables
    String input;
    String first;
    String second;
    Double r;
    Double a;
    Double precision;
    Double increment = 500000.0;
    Double sum = 0.0;
    int count = 0;
    int test = 1;
    int powernum = 0;
    Double power = 1.0;
    String common = "";
    boolean semazen;
    boolean check;
    
    //program code
    do{
      do{
        System.out.println("**** Make your selection ****");
        System.out.println("Strings");
        System.out.println("Math");
        System.out.println("Exit");
        System.out.print("Your selection: ");
        input = scan.nextLine();
        input = input.toLowerCase();
      }while( !(input.equals("strings")) && !(input.equals("math")) && !(input.equals("exit")));
      
      if(input.equals("strings")){
        semazen = false;
        System.out.println("\n** Semazen-Strings **"); 
        System.out.print("Enter a string:"); 
        first = scan.nextLine();
        first = first.toLowerCase();
        System.out.print("\nEnter another string:"); 
        second = scan.nextLine();
        second = second.toLowerCase();  
        for(int i = 0 ; i < first.length() ; i++){
          first += first.charAt(0);
          first = first.substring(1);
          if (first.equals(second)){
            semazen = true ;
            System.out.println("They are semazen-strings.");
          }       
        }
        if( !semazen ){         
          for( int i = 0 ; i < second.length() ; i++ ){
            check = true;
            for( int j = 0 ; j < first.length() ; j++ ){              
              if ( first.charAt(j) == second.charAt(i) ) {
                for( int z = 0 ; z < common.length() ; z++){
                  if(common.charAt(z) == first.charAt(j)){
                    check = false;
                  }                  
                }
                if(check){
                  common += first.charAt(j) + " " ;
                }
              }            
            }         
          } 
          System.out.println("Common characters: " + common);
        }          
      }  
//        for(int j = 0 ; j < second.length() ; j++){          
//          if(first.charAt(0) == second.charAt(j)){            
//            while( test + j - 1 < second.length() && test < first.length()){              
//              test++;
//              if(first.charAt( test ) == second.charAt( j + test )){
//                count++;
//              }
//            }
//            if( count == second.length() - j - 1 ){
//              count = 0;
//              for(int i = test +1 ; i < first.length() ; i++ ){
//                if( first.charAt( i ) == second.charAt(0)){
//                  count++;
//                }
//                if( count == ( first.length() - ( test + 1 ))){
//                  semazen = true;
//                  System.out.println("They are semazen-strings.");
//                  j = second.length();                  
//                }
//              }               
//            }            
//          }
//          //finding the common letters
//          int yenij = j;
//          while( yenij < second.length() ){
//            for( int i = 0 ; i < first.length() ; i++ ){
//              if(second.charAt(yenij) == first.charAt(i)){
//                check = true;
//                for(int c = 0 ; c < common.length() ; c++ ){
//                  if(common.charAt(c) == second.charAt(yenij)){
//                    check = false;
//                  }
//                }
//                if(check){
//                  common += " " + second.charAt(yenij);
//                }
//              }
//            }
//            if( yenij == second.length() - 1){
//             yenij = second.length();
//            }
//            yenij++;
//          }
//        }
//        if(!semazen){
//          System.out.println("Common characters: " + common);
//        }    
//      }
      
      //math option
      if(input.equals("math")){
        increment = 500000.0;
        sum = 0.0;
        System.out.println("\n** Infinite Geometric Sum Calculation **"); 
        System.out.print("Enter an r: "); 
        r = scan.nextDouble();        
        System.out.print("\nEnter an a: "); 
        a = scan.nextDouble();
        System.out.print("\nEnter precision: "); 
        precision = scan.nextDouble(); 
        
        while(precision <= Math.abs(increment)){        
          power = Math.pow( r , powernum );
          increment = a*power;
          sum += increment;
          System.out.println( "Current result is: " + sum );
          powernum++;  
        }
        System.out.println( "Result is: " + sum );
      }
      
    }while( input != "exit" );
  }
}







