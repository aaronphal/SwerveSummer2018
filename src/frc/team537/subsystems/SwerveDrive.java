package frc.team537.subsystems;


import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SwerveDrive extends Subsystem {

    public String name;
    public TalonSRX drive;
    public TalonSRX rotate;

    public void swerveMod(String name, int drive, int rotate) {
        this.drive = new TalonSRX(drive);
        this.rotate = new TalonSRX(rotate);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void straight(double x){
        if (x > 1){

        } else {

        }
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

