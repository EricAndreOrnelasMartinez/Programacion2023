// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Victor;
import frc.robot.commands.Brazo_ex;

public class Brazo extends SubsystemBase {
 private Victor mVex;
 private Victor mVrev;


  /** Creates a new ExampleSubsystem. */
  public Brazo() {
  mVex = new Victor(1);
  mVrev = new Victor(2);
  }

 public void extender(double speed){
  
  mVex.set(ControlMode.PercentOutput, speed); 
 }

 public void reversa(double speed){
mVrev.set(ControlMode.PercentOutput, speed); 
 }
 public void stop(double speed){
  mVex.set(ControlMode.PercentOutput,speed); 
  mVrev.set(ControlMode.PercentOutput,speed);


 }

  /**
   * Example command factory method.
   
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
