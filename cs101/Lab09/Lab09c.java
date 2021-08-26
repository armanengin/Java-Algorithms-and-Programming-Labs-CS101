import java.util.ArrayList;
import java.util.Scanner;
/* Lab09c 
 * creating a special int arrayList
 * @author Arman Engin Sucu
 * @version 06.05.2020
 * 
 */
public class Lab09c{  
  //methods  
  
  //solution1
  public static ArrayList<Integer> Solution1(ArrayList<Integer> list){
    ArrayList<Integer> result = new ArrayList<Integer>();
    int product = 1;
    
    for(int i = 0; i < list.size() ; i++){
      if(list.get(i) != 0){
        product *= list.get(i);
      }
      else 
        i = list.size();
    }
    for(int i = 0; i < list.size() ; i++){
      if(list.get(i) != 0){
        result.add( product/list.get(i));
      }
      else 
        i = list.size();
    }
    return result;
  }
  
  //solution2
  public static ArrayList<Integer> Solution2(ArrayList<Integer> list){
    ArrayList<Integer> result = new ArrayList<Integer>();   
    
    for(int i = 0; i < list.size() ; i++){
      int product = 1;
      if(list.get(i) != 0){
        for(int j = 0; j < list.size() ; j++){
          if(list.get(j) == 0){
            j = list.size();
          }
          if(list.get(j) != i){
            product *= list.get(j);
          }
        }
        result.add(product);
      }
      else 
        i = list.size();
    }
    return result;
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);    
    //variables
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> list3 = new ArrayList<Integer>();
    //program code
    System.out.print("Please enter the values:");
    while(scan.hasNextInt()){
      list.add(scan.nextInt());
    }
    System.out.println("\nThe output list for solution1:" + Solution1(list));   
    System.out.println("\nThe output list for solution2:" + Solution1(list)); 
  }  
}






