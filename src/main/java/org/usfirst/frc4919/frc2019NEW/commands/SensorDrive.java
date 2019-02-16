/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4919.frc2019NEW.commands;

import org.usfirst.frc4919.frc2019NEW.Robot;
import org.usfirst.frc4919.frc2019NEW.subsystems.Ultrasonic;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 * Add your docs here.
 */
public class AutonomousLoop extends InstantCommand {
  /**
   * Add your docs here.
   */
  public AutonomousLoop() {
    super();
    // Use requires() here to declare subsystem dependencies
    requires(Robot.ultrasonic);
    requires(Robot.drivetrain);
    // eg. requires(chassis);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    while (Robot.ultrasonic.getDistanceIn() < 50) {
      // drive backwards
      Robot.drivetrain.moveBackward();
  }
  }

}
