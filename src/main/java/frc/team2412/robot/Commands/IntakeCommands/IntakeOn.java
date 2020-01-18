package frc.team2412.robot.Commands.IntakeCommands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.IntakeSubsystem;

public class IntakeOn extends CommandBase {
	IntakeSubsystem intakeSubsystem;

	public IntakeOn(IntakeSubsystem subsystem) {
		intakeSubsystem = subsystem;
		addRequirements(subsystem);
	}

	@Override
	public void execute() {
		// run the example method
		intakeSubsystem.intakeOn();
	}

	@Override
	public boolean isFinished() {
		return true;

	}
}
