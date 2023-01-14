// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public cla<<<<<<< HEAD
public class Drive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drive m_subsystem;
  private double forwardAndBackward;
  private double leftAndRight;
=======
public class ExampleCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ExampleSubsystem m_subsystem;

>>>>>>> 4c5b1933c17dcc17b8bb0c1ad349e571bb3b5791
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
<<<<<<< HEAD
  public Drive(Drivebase subsystem, double forwardAndBackward, double leftAndRight) {
    m_subsystem = subsystem;
    this.forwardAndBackward = forwardAndBackward;
    this.leftAndRight = leftAndRight
=======
  public ExampleCommand(ExampleSubsystem subsystem) {
    m_subsystem = subsystem;
>>>>>>> 4c5b1933c17dcc17b8bb0c1ad349e571bb3b5791
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
<<<<<<< HEAD
  public void execute() {
    m_subsystem.arcadeDrive(forwardAndBackward, leftAndRight); // Excuting arcadeDrive
  }
=======
  public void execute() {}
>>>>>>> 4c5b1933c17dcc17b8bb0c1ad349e571bb3b5791
 is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
