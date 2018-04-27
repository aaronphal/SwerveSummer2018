package frc.team537.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team537.Robot;
import frc.team537.RobotMap;

import java.util.TimerTask;

public class SubCubeMinipulator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private TalonSRX elevate = new TalonSRX(RobotMap.cubeMinipulator.elevate);
    private TalonSRX inRight = new TalonSRX(RobotMap.cubeMinipulator.right);
    private TalonSRX inLeft = new TalonSRX(RobotMap.cubeMinipulator.left);
    private DigitalInput topSwitch = new DigitalInput(RobotMap.cubeMinipulator.top);
    private DigitalInput bottomSwitch = new DigitalInput(RobotMap.cubeMinipulator.bottom);

    private double currentHeight;
    private boolean zero;





    public void succIn(double speedIn){
        inRight.set(ControlMode.PercentOutput, speedIn);
        inLeft.set(ControlMode.PercentOutput,speedIn);
    }

    public void disable(){
        inRight.set(ControlMode.PercentOutput, 0);
        inLeft.set(ControlMode.PercentOutput, 0);
    }

    public void disableLift(){
        elevate.set(ControlMode.PercentOutput, 0);
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public void Smart(){
        SmartDashboard.putNumber("Height", currentHeight);
        SmartDashboard.putBoolean("Found Zero", topSwitch.get());
    }

    public void findZero() {
        if (topSwitch.get()){
            elevate.set(ControlMode.PercentOutput, 0);
            currentHeight = 0.00;
        } else if (bottomSwitch.get()) {
            elevate.set(ControlMode.PercentOutput, 0);
        }
    }

    public void liftSpeeds(double liftSpeed){
        currentHeight = elevate.getSelectedSensorPosition(0);

        elevate.set(ControlMode.PercentOutput, liftSpeed);
    }
}

