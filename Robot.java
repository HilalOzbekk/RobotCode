package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class Robot extends IterativeRobot {
  Joystick stick;
  RobotDrive myRobotDrive ;
  Timer timer;
}



/**
 * 
 */
public void robotInit(){
  myRobotDrive = new RobotDrive(0,1);
  stick = new Joystick(1);
  timer = new Timer();
}


public class Robot extends TimedRobot {
  private final DifferentialDrive m_robotDrive ;
  = new DifferentialDrive =(New PWMVictorSPX(0), PWMVictorSPX(1));
}



  public Robot() {
  super(0.03); 
}

  
  public void autonomousInit() {
   timer.start(0);
   timer.reset(1);
  }

  public void autonomousPeriodic() { 
    // 2 saniye boyunca robotu sur
    if (timer.get() < 2.0) {
         myRobot.drive(-0.5, 0.0); 
    } else {
         myRobot.drive(0.0, 0.0); // Robotu durdur
    }
}

public void testPeriodic() {
     LiveWindow.run();
}


  