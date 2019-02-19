/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc4919.frc2019NEW.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoPlatform extends CommandGroup {
  /**
   * Add your docs here.
   */
  public AutoPlatform() {
    // Add Commands here:
    addSequential(new TimedGearShifter(3));
    addSequential(new TimedFrontPistons(3));
    addSequential(new TimedDriveForwards(4));
    addSequential(new TimedBackPiston(3));
    addSequential(new TimedFrontPistonsUp(3));
    addSequential(new TimedDriveForwards(4));
    addSequential(new TimedBackPistonsUp(3));
    addSequential(new TimedDriveForwards(4));
    // e.g. addSequential(new Command1);
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
