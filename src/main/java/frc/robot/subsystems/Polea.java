// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.CSpark;
import frc.robot.Victor;
import frc.robot.commands.Brazo_ex;

public class Polea extends SubsystemBase {
 private CANSparkMax mC1;
 


  /** Creates a new ExampleSubsystem. */
  public Polea() {
  mC1 = CSpark.mC1;
  
  }

 public void Up(double speed){
  mC1.set(0.3);
  
   
 }

 public void Down(double speed){
  mC1.set(0.3);
 }
 public void stop(double speed){
  mC1.set(0.0);


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
