// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {

    public static CANSparkMax motorChassis_R1;
    public static CANSparkMax motorChassis_R2;
    public static CANSparkMax motorChassis_L1;
    public static CANSparkMax motorChassis_L2;

    public static void init(){
      motorChassis_R1 = new CANSparkMax(0, MotorType.kBrushless);
      motorChassis_R2 = new CANSparkMax(1, MotorType.kBrushless);
      motorChassis_L1 = new CANSparkMax(2, MotorType.kBrushless);
      motorChassis_L2 = new CANSparkMax(3, MotorType.kBrushless);
    }

    public static final int kDriverControllerPort = 0;
  }
}
