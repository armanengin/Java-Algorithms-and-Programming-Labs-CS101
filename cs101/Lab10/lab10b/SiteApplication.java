import java.util.Scanner;
/** site application
  *@author Arman Engin Sucu
  *@version 14.05.2020
  */
public class SiteApplication{
  public static void main(String [] args){ 
    Scanner scan = new Scanner(System.in);
    //variables
    String siteName;
    int menuOp;
    Site site;
    String houseName;
    String houseAddress;
    int houseResidents;
    int min;
    int max;
    double ChPerRes;
    //program code    
    System.out.print("Enter name of site: ");
    siteName = scan.nextLine();
    System.out.println();
    site = new Site(siteName);
    do{     
      System.out.println("1-Add House");
      System.out.println("2-View Houses");
      System.out.println("3-Search Houses by Fee");
      System.out.println("4-Exit");
      System.out.print("Enter choice:");       
      menuOp = scan.nextInt();
      if(menuOp < 1 || menuOp > 4){
        System.out.println("Invalid Choice.");
      }
      scan.nextLine();// to prevent bug
      if(menuOp == 1){
        System.out.print("Enter Owner Name:");
        houseName = scan.nextLine();
        System.out.print("\nEnter Address:");
        houseAddress = scan.nextLine();
        System.out.print("\nEnter number of residents:"); 
        houseResidents = scan.nextInt();
        System.out.println("\nEnter service charge:"); 
        ChPerRes = scan.nextDouble();
        site.addHouse(houseName , houseAddress , houseResidents , ChPerRes);          
      }
      if(menuOp == 2){
        System.out.println(site.viewHouses());
      }
      if(menuOp == 3){
        System.out.print("Enter minimum and maximum fee: ");
        min = scan.nextInt();
        max = scan.nextInt();
        System.out.println("Houses on Site with fee between " + min + " and " + max ); 
        System.out.println(site.searchHouseByFee(min , max));
      }        
    }while(menuOp != 4);
    System.out.println(" --- End of Lab10b ---");
  }
}




