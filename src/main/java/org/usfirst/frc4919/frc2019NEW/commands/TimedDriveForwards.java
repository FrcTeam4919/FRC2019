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
public class TimedDriveForwards extends TimedCommand {
  /**
   * Add your docs here.
   */
  public TimedDriveForwards(double timeout) {
    super(timeout);
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drivetrain);
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    // System.out.println("Moving Forwards");
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.drivetrain.moveForward();
    System.out.println("Moving Forwards");
  }

  // Called once after timeout
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
