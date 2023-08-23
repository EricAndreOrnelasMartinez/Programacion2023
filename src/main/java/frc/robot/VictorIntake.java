package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class VictorIntake{
  public static VictorSPX mVI1;
  public static VictorSPX mVI2;
  
  

  public VictorIntake(int device1, int device2){
    mVI1 = new VictorSPX(device1);
    mVI2 = new VictorSPX(device2);
    
  }
  //public double Move(double speed1, double speed2){
  //  return speed1;
  //}



  public void set(ControlMode percentoutput, double speed) {
  }

}


