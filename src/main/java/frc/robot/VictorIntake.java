package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Victor{
  public static VictorSPX mV1;
  
  

  public Victor(int device1){
    mV1 = new VictorSPX(device1);
    
  }
  //public double Move(double speed1, double speed2){
  //  return speed1;
  //}



  public void set(ControlMode percentoutput, double speed) {
  }

}


