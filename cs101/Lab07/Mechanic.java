/**
 * mechanic class
 * @author Arman Engin SUCU
 * @version 16.04.2020
 */
public class  Mechanic{
  
  //static data members
  private static int mechanicCounter = 10;
  //properties  
  private String mechanicID;
  private int xCoordinate;
  private int yCoordinate;
  
  //constructor
  public  Mechanic(){
    setMechanicID();
    setXcoordinate(xCoordinate);
    setYcoordinate(yCoordinate);
    mechanicCounter++;
  }
  
//accessor methods
  public String getMechanicID(){
    return mechanicID;
  }
  public int getXcoordinate(){
    return xCoordinate;
  }
  public int getYcoordinate(){
    return yCoordinate;
  }
  
  //mutator methods 
  private void setMechanicID(){
    mechanicID = "Mechanic-" + mechanicCounter;
  }
  public void setXcoordinate(int xCoordinate){
    this.xCoordinate = xCoordinate;
  }
  public void setYcoordinate(int yCoordinate){
    this.yCoordinate = yCoordinate;
  }
  
  public void teleportation(int x , int y){
    setXcoordinate(x);
    setYcoordinate(y);
  }
  public void fixRobot(ScoutRobot robot){
    if(!robot.getCondition()){
      teleportation(getXcoordinate(),getYcoordinate());
      robot.setBatteryLeft(robot.getMaxBattery());
      System.out.println("The Robot has been fixed.");
      teleportation(0,0);
      System.out.println("I have returned to the base.");
    } 
  }
  public String toString(){
    return "Mechanic{mechanicID\'" + mechanicID + "', xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + "}";
  } 
}







