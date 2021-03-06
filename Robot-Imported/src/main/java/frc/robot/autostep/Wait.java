package frc.robot.autostep;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.DriveTrain;

public class Wait extends AutoStep {

    public Timer driveTimer;
    public float length;
    
    public DriveTrain driveTrain;

    public Wait(DriveTrain driveTrain, float length) {
        super();
        this.length = length;
        driveTimer = new Timer();
        this.driveTrain = driveTrain;
    }

    public void Begin() {
        driveTimer = new Timer();
        driveTimer.reset();
        driveTimer.start();
        driveTrain.SetBothSpeed(0.0f);
    }

    public void Update() {
        if (driveTimer.get() > length) {
            System.out.println("is it printing");
            isDone = true;
        }
    }
}