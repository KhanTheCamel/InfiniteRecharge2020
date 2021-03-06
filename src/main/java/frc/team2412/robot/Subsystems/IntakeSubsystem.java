package frc.team2412.robot.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2412.robot.RobotMap;
import frc.team2412.robot.Subsystems.constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {

	private static Talon intakeFront = RobotMap.intakeFront;
	private static Talon intakeBack = RobotMap.intakeBack;
	private static DoubleSolenoid intakeUpDown = RobotMap.intakeUpDown;

	public void intakeOn() {
		intakeFront.set(IntakeConstants.MOTOR_SPEED);
		intakeBack.set(IntakeConstants.MOTOR_SPEED);

	}

	public void intakeOff() {
		intakeFront.set(0);
		intakeBack.set(0);
	}

	public void intakeUp() {
		intakeUpDown.set(DoubleSolenoid.Value.kForward);
	}
	
	public void intakeDown() {
		intakeUpDown.set(DoubleSolenoid.Value.kReverse);
	}
	
}
