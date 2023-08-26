package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class TankModule{
  public static CANSparkMax m1;
  public static CANSparkMax m2;
  private RelativeEncoder encoder;
  

  public TankModule(int device1, int device2, boolean inverted){
    m1 = new CANSparkMax(device1, MotorType.kBrushless);
    m2 = new CANSparkMax(device2, MotorType.kBrushless);
    m1.restoreFactoryDefaults();
    m2.restoreFactoryDefaults();
    m1.setInverted(inverted);
    m2.follow(m1);
    encoder = m1.getEncoder();
    
  }

  public void setMD(double speedD) {
    m1.set(speedD);
  }
  public void setMI(double speedI) {
    m1.set(speedI);
  }

}


