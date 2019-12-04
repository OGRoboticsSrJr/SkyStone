package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

//@Disabled
@Autonomous
public class Grappling_Hook extends LinearOpMode{

    private ElapsedTime runtime = new ElapsedTime();
    private Servo Servo1 = null;

    @Override
    public void runOpMode(){

        Servo1 = hardwareMap.get(Servo.class, "servo1");

        Servo1.setPosition(0);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        Servo1.setPosition(1);

        sleep(1000);
    }
}
