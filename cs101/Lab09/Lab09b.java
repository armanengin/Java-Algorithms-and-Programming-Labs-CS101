import java.util.Scanner;
import java.util.ArrayList;

/* Lab09b 
 * testing the numbers are monotonic or not
 * @author Arman Engin Sucu
 * @version 06.05.2020
 * 
 */
public class Lab09b {
  
  public static void main( String[] args ) {
    
    Scanner scan = new Scanner( System.in );
    
    /************* You should not change here unless you want to add more test cases ************/                      
    // constants
    final String test1 = "1 2 2 31";
    final String test2 = "6 5 4 4";
    final String test3 = "1 3 2";
    final String test4 = "1 2 4 5";
    final String test5 = "1 1 1";
    final String test6 = "19 11 7 8 5";
    final String test7 = "";
    
    // variables
    ArrayList<String> testList;
    ArrayList<Boolean> correctResultList;
    
    // program code
    testList = new ArrayList<String>();
    testList.add( test1 );
    testList.add( test2 );
    testList.add( test3 );
    testList.add( test4 );
    testList.add( test5 );
    testList.add( test6 );
    testList.add( test7 );
    
    correctResultList = new ArrayList<Boolean>();
    correctResultList.add( true );
    correctResultList.add( true );
    correctResultList.add( false );
    correctResultList.add( true );
    correctResultList.add( true );
    correctResultList.add( false );
    correctResultList.add( true );
    
    /***********************************************************************************************/
    System.out.println("             Run   | Expected|" );
    System.out.println("| Test1 |   " + isMonotonic(parseString(test1)) + "   | " + "true" + "    |");
    System.out.println("| Test2 |   " + isMonotonic(parseString(test2)) + "   | " + "true" + "    |");
    System.out.println("| Test3 |   " + isMonotonic(parseString(test3)) + "  | " +  "false" + "   |");
    System.out.println("| Test4 |   " + isMonotonic(parseString(test4)) + "   | " + "true" + "    |");
    System.out.println("| Test5 |   " + isMonotonic(parseString(test5)) + "   | " + "true" + "    |");
    System.out.println("| Test6 |   " + isMonotonic(parseString(test6)) + "  | " + "false" +  "   |");
    System.out.println("| Test7 |   " + isMonotonic(parseString(test7)) + "   | " + "true" + "    |");
  }
  
  
  // TODO
  /**
   * Parses the given string and creates a ArrayList with the values
   * @param str String to be parsed
   * @return ArrayList with values parsed from the String str
   */
  public static ArrayList<Integer> parseString( String str ) {
    ArrayList<Integer> bunchOfNums = new ArrayList<Integer>();
    for(int i = 0 ; i < str.length(); i++){
      if(str.charAt(i) == ' '){
        bunchOfNums.add(Integer.parseInt(str.substring(0 , i)));
        str = str.substring(i+1);
        i = 0;
      }     
    }
    if(str == ""){
      bunchOfNums.add(null);
    }
    else{
      bunchOfNums.add(Integer.parseInt(str));
    }
    return bunchOfNums;
  }  
  
  // TODO
  /**
   * Finds out whether the given ArrayList is monotonic or not
   * @param list ArrayList to be checked whether it is monotonic or not
   * @return true or false
   */
  public static boolean isMonotonic( ArrayList<Integer> list ) {
    if(list.get(0) == null){
      return true;
    }
    if(list.get(0) <= list.get(list.size()-1)){
      for(int i = 0; i < list.size() -1 ; i++){
        if(list.get(i) > list.get(i+1)){
          return false;
        }    
      }
      return true;  
    }
    else
      for(int i = 0; i < list.size() -1 ; i++){
      if(list.get(i) < list.get(i+1)){
        return false;
      }    
    }
    return true;  
  }
}


