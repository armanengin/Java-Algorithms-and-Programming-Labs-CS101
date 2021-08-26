import java.util.Scanner;
/**
 * a program to use escape sequences
 * @author Arman Engin SUCU
 * 27.02.2020
 */
public class Lab02b{
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  //variables
  int studentId;
  String studentName;
  String firstCourse;
  String secondCourse;
  String thirdCourse;
  String fourthCourse;
  //program code
  System.out.println("Student information");
  System.out.print("Enter ID: ");
  studentId = scan.nextInt();
  System.out.print("\nEnter full name: ");
  studentName = scan.nextLine();
  System.out.println("\n\nCourse information");
  System.out.print("Enter the first course: ");
  firstCourse = scan.nextLine();
  System.out.println("\nEnter the second course: ");
  secondCourse = scan.nextLine();
  System.out.println("\nEnter the third course: ");
  thirdCourse = scan.nextLine();
   System.out.println("\nEnter the forth course: ");
  fourthCourse = scan.nextLine();
  System.out.println("The student is \"" + studentName + "\". His/Her ID is " + studentId);
  System.out.println("Schedule");
  System.out.println("| Hour       | Monday     | Tuesday    |");
  System.out.println("| 8:40       |" + firstCourse +     "| Tuesday    |");
  System.out.println("| 9:40       |" + firstCourse +     "| Tuesday    |");
  System.out.println("|10.40      |" + firstCourse +     "| Tuesday    |");
  System.out.println("|11.40       |" + firstCourse +     "| Tuesday    |");
}
}
  
  
  
  