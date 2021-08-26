import java.util.ArrayList;
/** represents site 
  *@author Arman Engin Sucu
  *@version 14.05.2020
  */
public class Site{
  
  //properties
  final int MAX_HOUSES = 10;
  House[]houseList;
  int houseCount;
  String siteName;
  int residents;
  
  //constructor
  public Site(String siteName){
    this.siteName = siteName;
    houseList = new House[10];
    houseCount = 0;
    residents = 0;
  }
  
//methods
  public boolean addHouse(String name, String address, int residents, double ChPerRes){
    House house = new House(name , address , residents , ChPerRes);
    if(houseCount <= MAX_HOUSES){
      houseList[houseCount] = house;
      houseCount++;
      this.residents += residents;
      System.out.println("House succesfully added to Site");
      return true;
    }
    else
      System.out.println("Sorry! site is full.");
      return false;    
  }
  
  
  public String viewHouses(){
    String entrance = "List of Houses in " + siteName + "\n------------------------\n\n";
    String result = "";
    for(int i = 0; i < houseList.length ; i++){
      if(houseList[i] != null){
        result += houseList[i].toString() +"\n\n";
      }
    }
    return entrance + result + "Total Residents on Site: " + residents;                       
  }
  
  
  public ArrayList<House> searchHouseByFee (double min , double max){
    ArrayList<House> newList = new ArrayList<House>();
    for(int i = 0; i < houseList.length ; i++){
      if(houseList[i] != null){
        if((houseList[i].calculateTotalServiceFee() >= min) && (houseList[i].calculateTotalServiceFee() <= max)){
          newList.add(houseList[i]);
        }
      }
    }
    return newList;
  }
  
}                            