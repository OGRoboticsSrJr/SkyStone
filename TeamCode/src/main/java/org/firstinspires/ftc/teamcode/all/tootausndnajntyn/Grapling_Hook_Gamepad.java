package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name="Basic: Linear OpMode", group="Linear OpMode")
public class Grapling_Hook_Gamepad extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private Servo servo1 = null;
    private Servo servo2 = null;

    @Override
    public void runOpMode(){

        servo1 = hardwareMap.get(Servo.class, "servo1");
        servo2 = hardwareMap.get(Servo.class, "servo2");

        runtime.reset();

        waitForStart();

        boolean right = gamepad1.x;
        boolean left = gamepad1.y;

        if (right=true){
            servo1.setPosition(1);
            servo2.setPosition(1);
        }
    }
}
