package frc.team537.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team537.RobotMap;

public class SubRamps extends Subsystem {
    public enum Rside{
        right, left;
    }

    public enum LiftSide{
        right, left;
    }

    public Relay Rright = new Relay(RobotMap.ramps.upRight);
    public Relay RLeft = new Relay(RobotMap.ramps.upLeft);
    public TalonSRX liftRight = new TalonSRX(RobotMap.ramps.upRight);
    public TalonSRX liftLeft = new TalonSRX(RobotMap.ramps.upLeft);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void defaultRamp() {
        RLeft.set(Relay.Value.kOff);
        RLeft.set(Relay.Value.kOff);
    }


    public void deploy(Rside side){
        //switch uses the name of the enum
        switch (side){
            case left:
                RLeft.set(Relay.Value.kForward);
                break;
            case right:
                Rright.set(Relay.Value.kForward);
        }
    }

    public void Lift(LiftSide side, double speed){
        switch (side){
            case left:
                liftLeft.set(ControlMode.PercentOutput, speed);
                break;
            case right:
                liftRight.set(ControlMode.PercentOutput,speed);
                break;
        }
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

