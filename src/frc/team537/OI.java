/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team537;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team537.commands.ComCubeMinipulatorElevate;
import frc.team537.commands.ComCubeMinipulatorSucc;
import frc.team537.commands.ComRampsDeploy;
import frc.team537.subsystems.SubRamps;
import frc.team537.commands.ComRampsLift;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
    Joystick thicc = new Joystick(0);
    public Joystick controlBox = new Joystick(1);
    public OI(){
        new JoystickButton(controlBox, RobotMap.Buttons.cubeUp).whileHeld(new ComCubeMinipulatorElevate(0.10));
        new JoystickButton(controlBox, RobotMap.Buttons.cubeDown).whileHeld(new ComCubeMinipulatorElevate(-0.10));
        new JoystickButton(controlBox, RobotMap.Buttons.cubeIn).whileHeld(new ComCubeMinipulatorSucc(0.65));
        new JoystickButton(controlBox, RobotMap.Buttons.cubeOut).whileHeld(new ComCubeMinipulatorSucc(-0.65));

        new JoystickButton(controlBox, RobotMap.Buttons.rampDeployLeft).whileActive(new ComRampsDeploy(SubRamps.Rside.left));
        new JoystickButton(controlBox, RobotMap.Buttons.rampDeployRight).whileActive(new ComRampsDeploy(SubRamps.Rside.right));
        new JoystickButton(controlBox, RobotMap.Buttons.rampLiftLeft).whileHeld(new ComRampsLift(SubRamps.LiftSide.left, 0.30));
        new JoystickButton(controlBox, RobotMap.Buttons.rampDeployRight).whileHeld(new ComRampsLift(SubRamps.LiftSide.right, 0.30));
    }
}
