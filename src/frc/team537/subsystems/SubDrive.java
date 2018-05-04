package frc.team537.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team537.Robot;
import frc.team537.RobotMap;

public class SubDrive extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private SwerveModule frontLeft = new SwerveModule("FrontLeft", RobotMap.DriveTrain.frontLeftDrive, RobotMap.DriveTrain.frontLeftRotate);
    private SwerveModule frontRight = new SwerveModule("FrontRight", RobotMap.DriveTrain.frontRightDrive, RobotMap.DriveTrain.frontRightRotate);
    private SwerveModule rearLeft = new SwerveModule("rearLeft", RobotMap.DriveTrain.rearLeftDrive, RobotMap.DriveTrain.rearLeftRotate);
    private SwerveModule rearRight = new SwerveModule("rearRight", RobotMap.DriveTrain.rearRightDrive, RobotMap.DriveTrain.rearRightRotate);

    public void forward(double y) {
        if (y > .3){

        }
        else if (y < -0.3){

        }
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

