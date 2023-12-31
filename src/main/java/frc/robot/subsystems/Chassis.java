// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.TankModule;

public class Chassis extends SubsystemBase {
  private  TankModule motorD;
  private TankModule motorI;
 
  private RelativeEncoder encoder;

  /** Creates a new ExampleSubsystem. */
  public Chassis() {
  motorD = new TankModule(6, 7, true); 
  motorI = new TankModule(1, 5, false); 

 
 // m2 = new CANSparkMax(0, null);



  }
  public void move(double x, double y){
    
      double speedI= y+(x*0.8); 
      double speedD= y-(x*0.8); 
      if ((x >= -0.1 && x <= 0.1)&&(y >= -0.1 && y <= 0.1)){
        speedI = 0; 
        speedD = 0;
    }
    motorD.setMD(speedD*0.2);
    motorI.setMI(speedI*0.2);
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
