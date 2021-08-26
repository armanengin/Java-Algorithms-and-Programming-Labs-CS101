/**
 * robot class
 * @author Arman Engin SUCU
 * @version 16.04.2020
 */
public class ScoutRobot{
  //constants
  private final int VELOCITY = 2;
  private final int CONSUMED_ENERGY_PER_UNIT = 5;  
  //static data members
  private static int scoutCounter = 100;
  //properties  
  private String robotID;
  private int xCoordinate;
  private int yCoordinate;
  private int direction;
  private Double maxBattery;
  private Double batteryLeft;
  private Boolean condition;
  //constructor
  public ScoutRobot(int xCoordinate , int yCoordinate , Double maxBattery ){
    setRobotID();
    setXcoordinate(xCoordinate);
    setYcoordinate(yCoordinate);
    setMaxBattery(maxBattery);
    scoutCounter++;
    batteryLeft = maxBattery;
    direction = 1000;
    condition = true;
  }
  
//accessor methods
  public String getRobotID(){
    return robotID;
  }
  public int getXcoordinate(){
    return xCoordinate;
  }
  public int getYcoordinate(){
    return yCoordinate;
  }
  public int getDirection(){
    return direction;
  }
  public Double getMaxBattery(){
    return maxBattery;
  }
  public Double getBatteryLeft(){
    return batteryLeft;
  }
  public Boolean getCondition(){
    return condition;
  }
  //mutator methods 
  private void setRobotID(){
    robotID = "Scout-" + scoutCounter;
  }
  public void setXcoordinate(int xCoordinate){
    this.xCoordinate = xCoordinate;
  }
  public void setYcoordinate(int yCoordinate){
    this.yCoordinate = yCoordinate;
  }
  public void setDirection(int direction){
    this.direction = direction;
  }
  public void setMaxBattery(Double maxBattery){
    this.maxBattery = maxBattery;
  }
  public void setBatteryLeft(Double batteryLeft){
    this.batteryLeft = batteryLeft;
  }
  public void setCondition(Boolean condition){
    this.condition = condition;
  }
  
  public Boolean goToLocation(int x , int y){
    int directionX = 1000;
    int directionY = 1000;
    int distanceX = Math.abs(xCoordinate-x);
    int distanceY = Math.abs(yCoordinate-y);
    Double time = (distanceX + distanceY)/2.0;
    String path = "";    
    
    if(xCoordinate > x){
      directionX = 3;
    }
    if(xCoordinate < x){
      directionX = 1;
    }
    if(yCoordinate > y){
      directionY = 2;
    }
    if(yCoordinate < y){
      directionY = 0;
    }
    
    if( yCoordinate == 0 && (x*xCoordinate < 0 && Math.abs(xCoordinate) < Math.abs(x))){
      path = 1 + " unit(s) on Direction " + 0 + " --> (" + xCoordinate + "," + (yCoordinate +1) + ")\n"
        + distanceX + " unit(s) on Direction " + directionX + " --> (" + x + "," + (yCoordinate +1) + ")\n"
        + 1 + " unit(s) on Direction " + 2 + " --> (" + xCoordinate + "," + (yCoordinate ) + ")";
      distanceY +=2;
    }
    else if( xCoordinate == 0 && (y*yCoordinate < 0 && Math.abs(yCoordinate) < Math.abs(y))){
      path = 1 + " unit(s) on Direction " + 1 + " --> (" + (xCoordinate +1) + "," + (yCoordinate) + ")\n"
        + distanceY + " unit(s) on Direction " + directionY + " --> (" + (xCoordinate +1) + "," + y + ")\n"
        + 1 + " unit(s) on Direction " + 3 + " --> (" + xCoordinate + "," + (yCoordinate ) + ")";
      distanceX +=2;
    }
    else{
      path = distanceX + " unit(s) on Direction " + directionX + " --> (" + x + "," + yCoordinate + ")\n" +
        distanceY + " unit(s) on Direction " + directionY + " --> (" + x + "," + y + ")";
    }
            
    if((distanceX + distanceY)*5 <= batteryLeft){ 
      System.out.println("Starting from (" + xCoordinate + "," + yCoordinate + ")");
      System.out.println(path);         
      System.out.println("This move took " + time + " time  unit(s). The battery left is " + (batteryLeft-((distanceX + distanceY)*5.0)) + "/" + maxBattery);
      this.setBatteryLeft(batteryLeft-(distanceX + distanceY)*5.0);
      condition = true;  
      this.setXcoordinate(x);
      this.setYcoordinate(y);
      return true;      
    }
    else{
      System.out.println("There is no enough battery.");
      condition = false;
      return false;
    }    
  }
  
  public void callMechanic(Mechanic m){
    System.out.println(" A mechanic has been summoned.");
    m.fixRobot(this);    
  }
  public String toString(){
    return "ScoutRobot{robotID=\'" + robotID + "', xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + 
      ", direction=" + direction + ", batteryLeft=" + batteryLeft + "}";
  }
  
  public int compareRobots(ScoutRobot robot ){
    Double first = Math.sqrt(Math.pow(xCoordinate,2) + Math.pow(yCoordinate,2));
    Double second = Math.sqrt(Math.pow(robot.getXcoordinate(),2) + Math.pow(robot.getYcoordinate(),2));   
    if( first > second ){
      return 1;
    }
    else if(second > first){
      return -1;
    }
    else
      return 0;
  }   
}

