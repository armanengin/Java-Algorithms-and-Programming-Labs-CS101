/**
 * main method for the robot
 * @author Arman Engin SUCU
 * @version 16.04.2020
 */
public class RobotApp{
  public static void main(String[] args){
    
    ScoutRobot robot1 = new ScoutRobot(0,0,100.0);
    ScoutRobot robot2 = new ScoutRobot(0,0,100.0);
    Mechanic mechanic = new Mechanic();
    int comparing;
    
    System.out.println(robot1);
    System.out.println(robot2);
    System.out.println(mechanic);
    System.out.println("---------------------------" + robot1.getRobotID() + "------------------------------");
    robot1.goToLocation(2,3);
    robot1.goToLocation(-2,0);
    robot1.goToLocation(3,0);
    robot1.goToLocation(0,5);
    robot1.callMechanic(mechanic);
    robot1.goToLocation(0,5);
    System.out.println("---------------------------" + robot2.getRobotID() + "------------------------------");   
    robot2.goToLocation(3,-4);
    robot2.goToLocation(0,3);
    robot2.goToLocation(0,-4);
    robot2.callMechanic(mechanic);
    robot2.goToLocation(0,-4);
    robot2.goToLocation (1,2);
    System.out.println("-----------------------------------------------------------------------");
    comparing = robot1.compareRobots(robot2);
    if(comparing == 1){
      System.out.println(robot1.getRobotID() + " is closer to the base than " +  robot2.getRobotID());
    }
    if(comparing == -1){
      System.out.println(robot2.getRobotID() + " is closer to the base than " +  robot1.getRobotID());
    }
    if(comparing == 0){
      System.out.println(robot1.getRobotID() + " and " + robot2.getRobotID() + " have same distance to the base.");
    }    
  }
}
