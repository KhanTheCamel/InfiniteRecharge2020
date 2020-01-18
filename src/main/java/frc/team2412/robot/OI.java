package frc.team2412.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.team2412.robot.Commands.ExampleCommand;
import frc.team2412.robot.Commands.IntakeCommands.IntakeOff;
import frc.team2412.robot.Commands.IntakeCommands.IntakeOn;

//This is the class in charge of all the buttons and joysticks that the drivers will use to control the robot
public class OI {

	// Joysticks
	public Joystick driverStick = new Joystick(0);

	// Buttons
	public Button exampleSubsystemMethod = new JoystickButton(driverStick, 1);
	public Button intakeOnButton = new JoystickButton(driverStick, RobotMap.INTAKE_ON_BUTTON_ID);
	public Button intakeOffButton = new JoystickButton(driverStick, RobotMap.INTAKE_OFF_BUTTON_ID);
	// Constructor to set all of the commands and buttons
	public OI() {
		// telling the button that when its pressed to execute example command with the
		// robot container's instance of example subsystem
		exampleSubsystemMethod.whenPressed(new ExampleCommand(RobotMap.robotContainer.m_ExampleSubsystem));
		intakeOnButton.whenPressed(new IntakeOn(RobotMap.robotContainer.intakeSubsystem));
		intakeOffButton.whenPressed(new IntakeOff(RobotMap.robotContainer.intakeSubsystem));
	}
}
