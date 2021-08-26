import java.util.Scanner;
/**
 * tests the Library class
 * @author Arman Engin SUCU
 * @version 30.04.2020
 */
public class LibraryTest{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //variables
    Library library = new Library();
    int input;
    int input2;
    String strTitle;
    String strAuthor;
    String strDueDate;
    
    do{
      System.out.println("1-Show");
      System.out.println("2-Find");
      System.out.println("3-Add");
      System.out.println("4-Exit");
      System.out.print("Choose an option.");      
      input = scan.nextInt();
      System.out.println();
      if( input == 1){
        System.out.println(library);
      }    
      else if( input == 2){
        scan.nextLine();
        System.out.print("Enter a title.");  
        strTitle = scan.nextLine();
        System.out.println();
        if(library.findByTitle(strTitle) == null){
          System.out.println("No book has found.");
        }
        else{
          System.out.println("1-Loan");
          System.out.println("2-Return");
          System.out.println("3-Remove");
          System.out.println("4-Return to Menu");
          System.out.print("Choose an option.");     
          input2 = scan.nextInt();
          System.out.println();
          if(input2 == 1){
            if(library.findByTitle(strTitle).onLoan()){
              System.out.println("The book is on loan to someone else. We are sorry.");
            }
            else{
              System.out.print("Please enter the due date.");     
              strDueDate = scan.nextLine();
              System.out.println();
              library.findByTitle(strTitle).loan(strDueDate);            
            }
          }
          else if(input2 == 2){
            if(library.findByTitle(strTitle).getDueDate() == ""){
              System.out.println("The book has already returned.");
            }
            else
              library.findByTitle(strTitle).returnBook();
            System.out.println("The book with title \"" + strTitle +"\" has been returned to the library.");
          }
          else if(input2 == 3){
            if(library.remove(strTitle)){
              System.out.println("The book is succesfully removed.");
            }
            else
              System.out.println("The can not be found.");
          }                 
        }
      }      
      if( input == 3){
        scan.nextLine();
        System.out.print("Enter a title.");  
        strTitle = scan.nextLine();
        System.out.println();
        System.out.print("Enter an author."); 
        strAuthor = scan.nextLine();
        System.out.println();          
        if(library.add(strTitle , strAuthor)){
          System.out.println("The book with title \"" + strTitle +"\" has been added to the library.");
        }
        else{
          System.out.println("Library is full.");
        }
      }
    }while(input != 4);
    System.out.println("Yine bekleriz...");
  }
}

//  Write a program, LibraryTest, that allows the user to manage a library by
//selecting options from a menu that includes: Show, Find, Add, and Exit. If the Find
//option locates a book with the requested title it should show it to the user and then
//allow them to Loan or Return it, or Remove it from the library, or simply return to the
//main menu. There are so many possibilities than we can show in sample runs. Try to
//cover them all in your test cases before presenting your work to your TAs. You can
//find one example in the output.txt file as an example.