package frc.robot.commands;

import com.spikes2212.command.drivetrains.TankDrivetrain;
import com.spikes2212.command.drivetrains.commands.DriveArcade;
import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

public class Turn extends DriveArcade {

    public Turn(Drivetrain drivetrain, double speed, double angle) {
        super(drivetrain, 0, speed, Math.abs(drivetrain.getAngle()) >= angle);
    }
}
