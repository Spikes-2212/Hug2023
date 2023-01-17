package frc.robot.subsystems;

import com.spikes2212.command.drivetrains.TankDrivetrain;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class Drivetrain extends TankDrivetrain {

    private final Gyro gyro;

    public Drivetrain(MotorController left, MotorController right, Gyro gyro) {
        super("", left, right);
        this.gyro = gyro;
    }

    public double getAngle() {
        return gyro.getAngle();
    }
}
