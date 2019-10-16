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

        motoleftback.setDirection(DcMotor.Direction.REVERSE);
        motoleftfront.setDirection(DcMotor.Direction.REVERSE);
        motorightback.setDirection(DcMotor.Direction.REVERSE);
        motorightfront.setDirection(DcMotor.Direction.REVERSE);

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
         double drive1Power;
         double drive2Power;

         //drive1 = rightfront + leftback
        float drive1 = gamepad1.left_stick_y;
        //drive2 = rightback + leftfront
        float drive2 = gamepad1.left_stick_x;

        drive1Power = Range.clip(drive1 + drive2, -1.0, 1.0);
        drive2Power = Range.clip(drive1 - drive2, -1.0, 1.0);

        motorightfront.setPower(drive1Power);
        motoleftback.setPower(drive1Power);
        motorightback.setPower(drive2Power);
        motoleftfront.setPower(drive2Power);

        telemetry.addData("Status", "Run Time: " + runtime.toString());
        telemetry.addData("Motors", "left (%.2f), right (%.2f)", drive1Power, drive2Power);
    }
    @Override
    public void stop(){
    }
}
