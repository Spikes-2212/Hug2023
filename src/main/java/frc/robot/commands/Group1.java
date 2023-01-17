package frc.robot.commands;

import com.spikes2212.command.drivetrains.commands.DriveTank;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

public class Group1 extends SequentialCommandGroup {

    public Group1(Drivetrain drivetrain) {
        addCommands(
        new DriveTank(drivetrain, 0.7, 0.7).withTimeout(3),
        new Turn(drivetrain, 0.7, 69),
        new DriveTank(drivetrain, 0.7, 0.7).withTimeout(3),
        new DriveTank(drivetrain, 0,0.5).withTimeout(5)
        );
    }
}
