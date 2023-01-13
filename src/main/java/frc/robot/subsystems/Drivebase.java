// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.Motortype;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
public class Drivebase extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  //Left Gearbox
  CANSparkMax m_leftMaster = new CANSparkMax(CAN.LEFT_MASTER, Motortype.kBrushed);
  CANSparkMax m_leftMiddleSlave = new CANSparkMax(CAN.LEFT_MID_SLAVE, Motortype.kBrushed);
  CANSparkMax m_leftSlave = new CANSparkMax(CAN.LEFT_SLAVE, Motortype.kBrushed);
  //Right Gearbox
  CANSparkMax m_rightMaster = new CANSparkMax(CAN.RIGHT_MASTER, Motortype.kBrushed);
  CANSparkMax m_rightMiddleSlave = new CANSparkMax(CAN.RIGHT_MID_SLAVE, Motortype.kBrushed);
  CANSparkMax m_rightSlave = new CANSparkMax(CAN.RIGHT_SLAVE, Motortype.kBrushed);

  // Differential drive class
  DifferentialDrive m_drive = new DifferentialDrive(m_leftMaster, m_rightMaster);
  
  public Drivebase() {
   
    //We want to invert our right motor because 
    m_leftSlave.follow(m_leftMaster, false);
    m_rightSlave.follow(m_rightMaster, false);
    m_leftMiddleSlave.follow(m_leftMaster, true);
    m_rightMiddleSlave.follow(m_rightMaster, true);
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
