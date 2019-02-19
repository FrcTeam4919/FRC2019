/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4919.frc2019NEW.commands;

import org.usfirst.frc4919.frc2019NEW.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 * Add your docs here.
 */
public class TimedBackPiston extends TimedCommand {
  /**
   * Add your docs here.
   */
  public TimedBackPiston(double timeout) {
    super(timeout);
    // Use requires() here to declare subsystem dependencies
    requires(Robot.pneumatics);
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    System.out.println("Extending back pistons");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    new BackPistonsDown().retract();
  }

  // Called once after timeout
  @Override
  protected void end() {
    System.out.println("Extended back pistons");
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
