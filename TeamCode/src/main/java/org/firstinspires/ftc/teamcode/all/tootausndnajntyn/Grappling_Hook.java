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
    private Servo Servo = null;
    static final double speed = 1.0;


    @Override
    public void runOpMode(){

        Servo = hardwareMap.get(Servo.class, "servo1");
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        Servo.setPosition(0);

        waitForStart();

        Servo.setPosition(1);

        sleep(1000);
    }
}
