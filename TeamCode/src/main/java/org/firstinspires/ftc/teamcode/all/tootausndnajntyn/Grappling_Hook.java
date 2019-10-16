package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

//@Disabled
@Autonomous(name="Pushbot: Auto Drive By Encoder", group="Pushbot")
public class Grappling_Hook extends LinearOpMode{

    private ElapsedTime runtime = new ElapsedTime();
    private Servo Servo = null;
    static final double speed = 1.0;


    @Override
    public void runOpMode(){

        Servo = hardwareMap.get(Servo.class, "Servo");
        telemetry.addData("Status", "Initializes");
        telemetry.update();

        waitForStart();

        Servo.setPosition(0);
        Servo.setPosition(0.5);
    }
}
