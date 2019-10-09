package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

//@Disabled
@TeleOp(name="Basic: Iterative OpMode", group="Iterative OpMode")

public class Driver_Op_Mode extends OpMode {

    private ElapsedTime runtime = new ElapsedTime;
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





}
