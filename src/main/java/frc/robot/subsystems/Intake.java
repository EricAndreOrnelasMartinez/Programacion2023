// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Victor;
import frc.robot.VictorIntake;

public class Intake extends SubsystemBase {
  private VictorIntake mVin;
  private VictorIntake mVout;
  /** Creates a new ExampleSubsystem. */
  public Intake() {
    mVin= new VictorIntake(0, 0);
    mVout= new VictorIntake(0,0);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }
  public void In(double G1){
    mVin.set(ControlMode.PercentOutput, G1);
  }
  public void Out(double G2){
    mVout.set(ControlMode.PercentOutput, G2);
  }
  public void Stop(double speed){
    mVin.set(ControlMode.PercentOutput, speed);
    mVout.set(ControlMode.PercentOutput, speed);
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
