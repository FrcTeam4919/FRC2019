// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc4919.frc2019NEW.subsystems;

import java.math.RoundingMode;

import org.usfirst.frc4919.frc2019NEW.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
*
*/
public class Ultrasonic extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private AnalogInput analog;

    public static Ultrasonic usSensorDown;

    public static Ultrasonic getUltrasonic() {

        if (usSensorDown == null) {
            usSensorDown = new Ultrasonic(0);
        }
        return usSensorDown;

    }

    private final double INCHES_PER_VOLT = 130;
    private static final double CM_PER_VOLT = 102;
    private static final double MM_PER_VOLT = 1023;

    public Ultrasonic(int channel) {
        analog = new AnalogInput(channel);
        // Test code
        System.out.println("Analog Global Sample Rate: " + AnalogInput.getGlobalSampleRate());
        System.out.println("LSBWeigth: " + analog.getLSBWeight());
        System.out.println("Oversample Bits: " + analog.getOversampleBits());
        System.out.println("Average Bits: " + analog.getAverageBits());
        analog.setOversampleBits(8);
        System.out.println("Updated over sample rate to: " + analog.getOversampleBits());
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    public double get() {
        return analog.getVoltage();
    }

    public double getVoltage() {
        return analog.getVoltage();
    }

    public int getChannel() {
        return analog.getChannel();
    }

    public double getDistanceIn() {
        return Math.round(analog.getVoltage() * INCHES_PER_VOLT);
    }

    // public double getDistanceIn(double limit) {

    // double in = Math.round(analog.getVoltage() * INCHES_PER_VOLT);

    // if (in > limit)
    // return limit;
    // else
    // return in;

    // }

    public double getDistanceCM() {
        return analog.getVoltage() * CM_PER_VOLT;
    }

    public double getDistanceCM(double limit) {

        double cm = analog.getVoltage() * CM_PER_VOLT;

        if (cm > limit)
            return limit;
        else
            return cm;

    }

    public double getDistanceMM() {
        return analog.getVoltage() * MM_PER_VOLT;
    }

    public double getDistanceMM(double limit) {
        double mm = analog.getVoltage() * MM_PER_VOLT;

        if (mm > limit)
            return limit;
        else
            return mm;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // LiveWindow.addSensor("Down Distance", "Ultrasonic", uSSensorDownward);
        SmartDashboard.putNumber("Ultrasonic inches", getDistanceIn());
        SmartDashboard.putNumber("Ultrasonic average", analog.getAverageVoltage() * INCHES_PER_VOLT);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
}
