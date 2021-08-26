/**
 * a class representing the book properties
 * @author Arman Engin SUCU
 * @version 30.04.2020
 */
public class LibraryBook{
  //properties
  private String title; //stores the title of the book as String
  private String author; //stores the author of the book as String
  private String dueDate; //stores the due date of the loaned book as String
  private int timesLoaned; //stores the number of times the book is loaned as integer
  
//constructor
  public LibraryBook(String title , String author){
    this.title = title;
    this.author = author;
    dueDate = "";
    timesLoaned = 0;
  }
  
  public LibraryBook(LibraryBook book){
    this.title = book.getTitle();
    this.author = book.getAuthor();
    dueDate = "";
    timesLoaned = 0;
  }
  
  //Methods
  
  //Mutators
  public void setTitle( String title){
    this.title = title;
  }
  public void setAuthor( String author){
    this.author = author;
  }
  public void setDueDate( String dueDate){
    this.dueDate = dueDate ;
  }
  //Accesors
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public String getDueDate(){
    return dueDate;
  }
  public int getTimesLoaned(){
    return timesLoaned;
  }
  //other methods
  public void loan(String dueDate){
    timesLoaned++;
    this.dueDate = dueDate ;
  }
  public void returnBook(){    
    dueDate = "";
  }
  public boolean onLoan(){
    if( !dueDate.equals( "" )){
      return true;
    }
    else 
      return false;
  }
  public String toString(){
    return "{Title: " + getTitle() + ", " + "Author: " + getAuthor() + ", " + "Due Date: " + getDueDate() + ", " + "Times Loaned: " + 
      getTimesLoaned() + "}";
  }
  
  public boolean equals(LibraryBook other){
    if((other.getAuthor().equals(author)) && (other.getTitle().equals(title))){
      return true;
    }
    else
      return false;
  }
  
  public boolean hasSameTitle(LibraryBook other){
    if((other.getAuthor().equals(author))){
      return true;
    }
    else
      return false;
  }
  
  public boolean hasSameAuthor(LibraryBook other){
    if(other.getTitle().equals(title)){
      return true;
    }
    else
      return false;
  }
}
