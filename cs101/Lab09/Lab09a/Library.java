import java.util.ArrayList;
/**
 * a library having 4 libraryBooks
 * @author Arman Engin SUCU
 * @version 30.04.2020
 */
public class Library{
  //properties
  ArrayList<LibraryBook> bookList;
  
  //constructor
  public Library(){
    bookList = new ArrayList<LibraryBook>();
  }
  
  //methods
  public boolean isEmpty(){
    if(bookList.size() == 0 ){
      return true;
    }
    else 
      return false;
  }
  
  public String toString(){
    String str = "";
    if( isEmpty() ) {
      return "Library is empty!";
    }
    for(LibraryBook book : bookList){
      str += book.toString() + "\n";
    }
    return str;
  }
  
  public boolean add(String title , String author){
    LibraryBook book = new LibraryBook( title , author );
    int lexicographicSmall = 0;
    for(int i = 0 ; i < bookList.size() ; i++){
      if(bookList.get(i).getTitle().compareTo(title) < 0){
        lexicographicSmall++;
      }
      if(bookList.get(i).getTitle().compareTo(title) == 0){
        if(bookList.get(i).getAuthor().compareTo(author) < 0){
          lexicographicSmall++;
        }
      }
    }
    bookList.add(lexicographicSmall , book);
    return true;
  }
  
  public boolean remove(String title ){
    for(int i = 0; i < bookList.size() ; i++){
      if(bookList.get(i).getTitle() == title){
        bookList.remove(i);
        return true;
      }
    }
    return false;
    
  }
  
  public LibraryBook findByTitle(String title){
    for( LibraryBook book : bookList )
      if( book.getTitle().equals(title)){
      return book;
    }    
    return null;    
  }
  
  public void findByAuthor(String author){
    String str = "";
    for(LibraryBook book : bookList){
      if(book.getAuthor().equals(author)){
        str += book.toString() + "\n";
      }
    }
    if(str == ""){
      System.out.println("The author couldn't found on the library.");
    }
    else
      System.out.println(str);
  }
  
}


