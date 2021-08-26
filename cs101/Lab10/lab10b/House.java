/** houses
  *@author Arman Engin Sucu
  *@version 14.05.2020
  */
public class House{
  //properties
 private String ownerName;
 private String address;
 private int residents;
  private double serviceChargePerResident;
  
  //constructor
  public House (String name, String address , int residents , double ChPerRes){
    ownerName = name;
    this.address = address;
    this.residents = residents;
    serviceChargePerResident = ChPerRes;
  }
  
  //mutators
  public void setName(String name){
    ownerName = name;
  }
  public void setAddress(String address){
    this.address = address;
  }
  public void setResidentsNum(int residents){
    this.residents = residents;
  }
  public void setChargePerResidents(double ChPerRes){
    serviceChargePerResident = ChPerRes;
  }
  
  
  //accessors
  public String getName(){
    return ownerName; 
  }
  
  public String getAddress(){
    return address; 
  }
  
  public int getResidentsNum(){
    return residents; 
  }
  
  public double getChargePerRes(){
    return serviceChargePerResident; 
  }
  
  public double calculateTotalServiceFee(){
    return residents*serviceChargePerResident;
  }
  
 public String toString(){
  return "Owner:" + ownerName + "\nAddress: " + address + "\nResidents number: " + residents +
    "\nMonthly Fee: "  + calculateTotalServiceFee();
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    