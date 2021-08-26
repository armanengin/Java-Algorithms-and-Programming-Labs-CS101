/**
 * Tests the LibraryBook class
 * @author Arman Engin SUCU
 * @version 30.04.2020
 */
public class TestLibraryBook{
  public static void main(String[] args){
    //a.
    LibraryBook bookA = new LibraryBook( "Mustafa Kemal" , "Yýlmaz Özdil");
    LibraryBook anotherBookA = bookA;
    
    //b.
    LibraryBook bookB = new LibraryBook("Brave New World" , "Aldous Huxley");
    LibraryBook anotherBookB = new LibraryBook("Lord Of The Rings" , "J.R.R. Tolkien");
    
    //c.
    LibraryBook bookC = new LibraryBook("Harry Potter" , "J.K. Rowling");
    LibraryBook anotherBookC = new LibraryBook("Harry Potter" , "J.K. Rowling");
    
    System.out.println("a)");
    System.out.println(bookA == anotherBookA);
    System.out.println(bookA.equals(anotherBookA));
    
    System.out.println("\nb)");
    System.out.println(bookB == anotherBookB);
    System.out.println(bookB.equals(anotherBookB));
    
    System.out.println("\nc)");
    System.out.println(bookC == anotherBookC);
    System.out.println(bookC.equals(anotherBookC));
  }
}


