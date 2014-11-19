package robotcode.subsystems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author 18AkhilA
 */

/**
 * BLeh comments and commits!
 * @author Tentair
 */

public class Drivetrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Talon talon1 = new Talon(1);// Initializes each Talon with what each port
    Talon talon2 = new Talon(2);// it is located in
    Talon talon3 = new Talon(3);
    Talon talon4 = new Talon(4);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
  
    /**
     * Makes the robot move forward at full speed
     */
    public void forward()
    {
        
        talon1.set(1);
        talon2.set(1);
        talon3.set(1);
        talon4.set(1);
        
    }
    
    /**
     * Makes the robot go backwards at full speed
     */
    public void reverse()
    {
        talon1.set(-1);
        talon2.set(-1);
        talon3.set(-1);
        talon4.set(-1);
        
    }
    
    /**
     * Sets the speed to a desired speed
     * @param speed is the speed that the talons will be set as
     */
    public void setSpeed(double speed)
    {
        talon1.set(speed);
        talon2.set(speed);
        talon3.set(speed);
        talon4.set(speed);
    }
    
    /**
     * This stops all of the Talons
     */
    public void stop()
    {
        talon1.set(0);
        talon2.set(0);
        talon3.set(0);
        talon4.set(0);
        
    }
    
    public void turnLeft()
    {
        talon1.set(-1);
        talon2.set(-1);
        talon3.set(1);
        talon4.set(1);
    }
    
    public void turnRight()
    {
        talon1.set(1);
        talon2.set(1);
        talon3.set(-1);
        talon4.set(-1);
    }
    
}
