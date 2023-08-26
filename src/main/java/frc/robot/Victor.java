package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Victor{
  public static VictorSPX mV1;
  
  

  public Victor(int device1){
    mV1 = new VictorSPX(device1);
    
  }

  public void set(ControlMode percentoutput, double speed) {
  }

}


