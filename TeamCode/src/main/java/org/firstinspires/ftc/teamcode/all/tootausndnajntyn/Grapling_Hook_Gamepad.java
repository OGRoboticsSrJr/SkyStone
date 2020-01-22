package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp
public class Grapling_Hook_Gamepad extends OpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private Servo servo1 = null;

    @Override
    public void init(){

        servo1 = hardwareMap.get(Servo.class, "servo1");

        runtime.reset();

        servo1.setPosition(0);
    }
    @Override
    public void init_loop(){}

    @Override
    public void start(){runtime.reset();}

    @Override
    public void loop(){
        boolean right = gamepad1.x;
        boolean left = gamepad1.y;

        if (right==true){
            servo1.setPosition(0.666666666);
        }
        if (left==true){
            servo1.setPosition(0);
        }
    }
    @Override
    public void stop(){
    }
}
