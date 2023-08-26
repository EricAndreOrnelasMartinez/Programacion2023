package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class CSpark{
  public static CANSparkMax mC1;
  
  

  public CSpark(int device1){
    mC1 = new CANSparkMax(device1, MotorType.kBrushless);
    
  }

  public void set(double speed){
    mC1.set(speed);
    
  }



  

}


