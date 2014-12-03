/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotcode.commands;


/**
 *
 * @author Tentair
 */
public class SwashingCommand extends CommandBase {
    
    public SwashingCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //Sets a direction variable and turns robot right while moving forward
        String direc = "L";
        driveTrain.turnMoveLeft();
        
        //Does swashing for 5 directions
        for(int swashOn = 0; swashOn < 5; swashOn = swashOn+1){
            //Gets time of 3 seconds after current time
            long timeFinal = System.currentTimeMillis()+3000;
            
            //Compares current time with stored time, if reaches final time limit 
            //switches direction
            if(System.currentTimeMillis() >= timeFinal){
                   driveTrain.stop();
                if(direc.equals("L")){
                    direc = "R";
                    driveTrain.turnMoveRight();
                }else{
                    direc = "L";
                    driveTrain.turnMoveLeft();
                }
            }
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
