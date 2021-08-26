/**
 * a library having 4 libraryBooks
 * @author Arman Engin SUCU
 * @version 30.04.2020
 */
public class Library{
  //properties
  private LibraryBook b1;
  private LibraryBook b2;
  private LibraryBook b3;
  private LibraryBook b4;
  
  //constructor
  public Library(){
    b1 = null;
    b2 = null;
    b3 = null;
    b4 = null;
  }
  
  //methods
  public boolean isEmty(){
    if( b1 == null && b2 == null && b3 == null && b4 == null ){
      return true;
    }
    else 
      return false;
  }
  
  public String toString(){
    String strB1 = "";
    String strB2 = "";
    String strB3 = "";
    String strB4 = "";
    if( b1 == null && b2 == null && b3 == null && b4 == null ){
      return "Library is empty.";
    }
    if( b1 != null ){
      strB1 = b1.toString() + "\n";
    }
    if( b2 != null ){
      strB2 = b2.toString() + "\n";
    }
    if( b3 != null ){
      strB3 = b3.toString() + "\n";
    }
    if( b4 != null ){
      strB4 = b4.toString();
    }
    return strB1 + strB2 + strB3 + strB4;
  }
  
  public boolean add(String title , String author){
    if( b1 == null ){
      b1 = new LibraryBook(title , author);
      return true;
    }
    else if( b2 == null ){
      b2 = new LibraryBook(title , author);
      return true;
    }
    else if( b3 == null ){
      b3 = new LibraryBook(title , author);
      return true;
    }
    else if( b4 == null ){
      b4 = new LibraryBook(title , author);
      return true;
    }
    else
      return false;
  }
  
  public boolean remove(String title ){
    if( b1.getTitle().equals(title)) { //&& b1.getAuthor().equals(author) 
      b1 = null;
      return true;
    }
    else if( b2.getTitle().equals(title) ){//&& b2.getAuthor().equals(author) 
      b2 = null;
      return true;
    }
    else if( b3.getTitle().equals(title) ){//&& b3.getAuthor().equals(author)
      b3 = null;
      return true;
    }
    else if( b4.getTitle().equals(title) ){// && b4.getAuthor().equals(author)
      b4 = null;
      return true;
    }
    else
      return false;
  }
  
  public LibraryBook findByTitle(String title){
    if(isEmty()){
      return null;
    }
    else if( b1.getTitle().equals(title)){    
      return b1;
    }
    else if( b2.getTitle().equals(title) ){
      return b2;
    }
    else if( b3.getTitle().equals(title) ){
      return b3;
    }
    else if( b4.getTitle().equals(title) ){
      return b4;
    }
    else
      return null;
  }
}