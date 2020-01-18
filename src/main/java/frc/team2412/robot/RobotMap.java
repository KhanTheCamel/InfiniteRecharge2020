package frc.team2412.robot;

import edu.wpi.first.wpilibj.Talon;

//This is the class in charge of all the motors, motor ids, and any other sensors the robot uses. 
//remember to declare robot container at the bottom of this class 
public class RobotMap {

	// IDs
	public static int exampleID = 1;
	
	public static final int INTAKE_MOTOR_FRONT_ID = 1;
	public static final int INTAKE_MOTOR_BACK_ID = 1;
	public static final int INTAKE_ON_BUTTON_ID = 1;
	public static final int INTAKE_OFF_BUTTON_ID = 1;
	
	public static Talon intakeFront = new Talon (INTAKE_MOTOR_FRONT_ID);
	public static Talon intakeBack = new Talon (INTAKE_MOTOR_BACK_ID);
	
	
	// Robot container
	public static RobotContainer robotContainer = new RobotContainer();
}
