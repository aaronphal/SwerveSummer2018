/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team537;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
    public static class Robot {
        public static final double length = 26.00;
        public static final double width = 20.70;
    }

    public static class Buttons{
        public static final int cubeIn = 6;
        public static final int cubeOut = 5;
        public static final int cubeUp = 1;
        public static final int cubeDown = 4;
        public static final int rampDeployRight = 5;
        public static final int rampDeployLeft = 6;
        public static final int rampLiftRight = 7;
        public static final int rampLiftLeft = 8;
    }
    public static class DriveTrain {
        public static final int frontLeftDrive = 1;
        public static final int frontLeftRotate = 2;

        public static final int frontRightDrive = 3;
        public static final int frontRightRotate = 4;

        public static final int rearLeftDrive = 5;
        public static final int rearLeftRotate = 6;

        public static final int rearRightDrive = 7;
        public static final int rearRightRotate = 8;
    }

    public static class cubeMinipulator{
        public static final int elevate = 9;
        public static final int left = 11;
        public static final int right = 12;
        public static final int top = 13;
        public static final int bottom = 13;
    }

    public static class ramps {
        public static final int deployLeft = 13;
        public static final int deployRight = 14;

        public static final int upRight = 15;
        public static final int upLeft = 16;
    }

}
