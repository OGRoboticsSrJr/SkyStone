package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

//@Disabled
@TeleOp(name="Basic: Iterative OpMode", group="Iterative OpMode")

public class Driver_Op_Mode extends OpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor motoleftback = null;
    private DcMotor motoleftfront = null;
    private DcMotor motorightback = null;
    private DcMotor motorightfront = null;


    @Override
    public void init() {
        telemetry.addData("Status", "Initializing");

        motoleftback = hardwareMap.get(DcMotor.class, "motoleftback");
        motoleftfront = hardwareMap.get(DcMotor.class, "motoleftfront");
        motorightback = hardwareMap.get(DcMotor.class, "motorightback");
        motorightfront = hardwareMap.get(DcMotor.class, "motorightfront");

        telemetry.addData("status", "Initialized");
        telemetry.update();
    }
    @Override
    public void init_loop() {
    }
    @Override
    public void start() {runtime.reset();}

    @Override
    public void loop(){

        //drive1 = rightfront + leftback
        float drive1 = gamepad1.left_stick_y;
        //drive2 = rightback + leftfront
        float drive2 = gamepad1.left_stick_x;

        float turn = gamepad1.right_trigger - gamepad1.left_trigger;

        if (turn != 0) {
            motorightfront.setPower(turn);
            motoleftback.setPower(turn);
            motorightback.setPower(turn);
            motoleftfront.setPower(turn);
        } else {
            motorightfront.setPower(drive1);
            motoleftback.setPower(-drive1);
            motorightback.setPower(-drive2);
            motoleftfront.setPower(drive2);
        }

        telemetry.addData("Status", "Run Time: " + runtime.toString());
        telemetry.addData("Motors", "left (%.2f), right (%.2f)", drive1, drive2, turn);
    }
    @Override
    public void stop(){
    }
}
