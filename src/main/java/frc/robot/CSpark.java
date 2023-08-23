package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class CSpark{
  public static CANSparkMax mC1;
  
  

  public CSpark(int device1){
    mC1 = new CANSparkMax(device1, null);
    
  }
  //public double Move(double speed1, double speed2){
  //  return speed1;
  //}



  public void set(double speed){
    
  }



  

}


