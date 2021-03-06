package ca.team2994.frc.autonomous.modes;

import ca.team2994.frc.autonomous.AutoBuilder;
import ca.team2994.frc.autonomous.AutoCommand;
import ca.team2994.frc.autonomous.AutoMode;
import ca.team2994.frc.autonomous.commands.DriveTurn;

public class TestAutoMode extends AutoMode {

	@Override
	protected AutoCommand[] initializeCommands() {
		AutoBuilder builder = new AutoBuilder();
		
//		builder.add(new DriveStraight(5));
		builder.add(new DriveTurn(360));
		
		return builder.toArray();
	}

}
