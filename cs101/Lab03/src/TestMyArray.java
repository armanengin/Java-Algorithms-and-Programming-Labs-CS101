import java.util.Arrays;

/**
 * program testing MyArray
 * @author Arman Engin SUCU
 * @version 21.05.2020
 */
public class TestMyArray {
 public static void main(String[] args) {
  // variables
  MyArray myArray1 = new MyArray();
  MyArray myArray3 = new MyArray();
  MyArray myArray4 = new MyArray();
  
  int[] array1 = new int[] { 1, 2, 2, 3, 3, 3 };
  int[] array2 = new int[] { 10, 1, 2, 7, 0, 6 };
  int[] array3 = new int[] { 99, 65, 45, 21, 31 };
  int[] array4 = new int[] { 89, -3, 5, 9, 4, 4 };
  int[] array5 = new int[] { 0, 0, 0, 0, 0, 0 };


  System.out.println("---------------- find lucky() ---------------");
  System.out.println("Array: " + myArray1);
  myArray1.setArray(array1);
  System.out.println("Array: " + myArray1);
  System.out.println("The lucky integer is " + myArray1.findLucky());
  
  System.out.println();
  
  System.out.println("---------------- find lucky() Case2 ---------------");
  System.out.println("Array: " + myArray3);
  myArray3.setArray(array4);
  System.out.println("Array: " + myArray3);
  System.out.println("The lucky integer is " + myArray3.findLucky());  
  
  System.out.println();

  System.out.println("---------------- isBalanced() ---------------");
  myArray1.setArray(array2);
  System.out.println("Array: " + myArray1);
  if (myArray1.isBalanced().getIsBalanced()) {
   System.out.println("The array is balanced and the last index of the first part is "
     + myArray1.isBalanced().getIndexOfLast());
  } else
   System.out.println("The array is not balanced.");

  System.out.println();

  System.out.println("---------------- isBalanced() Case2 ---------------");
  myArray3.setArray(array5);// trying the set empty array which should be ignored
  System.out.println("Array: " + myArray3);
  if (myArray3.isBalanced().getIsBalanced()) {
   System.out.println("The array is balanced and the last index of the first part is "
     + myArray3.isBalanced().getIndexOfLast());
  } else
   System.out.println("The array is not balanced.");
  
  System.out.println();

  System.out.println("---------------- merge() ---------------");
  MyArray myArray2 = new MyArray(10);
  System.out.println("Array: " + myArray2);
  myArray4.setArray(array3);
  System.out.println("Array to be merged with: " + myArray4);
  myArray2.merge(myArray4.getArray());
  System.out.println("Merged array: Array: " + myArray2);

  System.out.println();

  System.out.println("---------------- randomize() ---------------");
  System.out.println("Array: " + myArray2);
  myArray2.randomize();
  System.out.println("Array: " + myArray2);

  System.out.println();

  System.out.println("---------------- sort() ---------------");
  System.out.println("Array: " + myArray2);
  myArray2.sort();
  System.out.println("Array: " + myArray2);
 }
}
