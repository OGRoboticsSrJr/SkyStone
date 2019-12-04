package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
//@Disabled
public class Auto_OP_Mode extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor motoleftfront = null;
    private DcMotor motorightfront = null;
    private DcMotor motoleftback = null;
    private DcMotor motorightback = null;


    static final double CPMR = 2240;
    static final double reduction = 1;
    static final double diameter = 3.54331;
    static final double CPI = (CPMR * reduction) / (diameter * 3.14159265363);
    static final double speed = -3.0;
    static final double turn = 0.5;

    ColorSensor coloursensor;

    @Override
    public void runOpMode() {
        coloursensor = hardwareMap.colorSensor.get("colour");

        motoleftback = hardwareMap.get(DcMotor.class, "motoleftback");
        motoleftfront = hardwareMap.get(DcMotor.class, "motoleftfront");
        motorightback = hardwareMap.get(DcMotor.class, "motorightback");
        motorightfront = hardwareMap.get(DcMotor.class, "motorightfront");

        telemetry.addData("Status", "Resetting Encoders");
        telemetry.update();

        motoleftback.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motoleftfront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorightback.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorightfront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motoleftback.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motoleftfront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorightback.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorightfront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        telemetry.addData("Path0", "Starting at 7%d :7%d",
                motoleftback.getCurrentPosition(),
                motoleftfront.getCurrentPosition(),
                motorightfront.getCurrentPosition(),
                motorightback.getCurrentPosition());
        telemetry.update();

        waitForStart();

        motoleftback.setPower(speed);
        motorightfront.setPower(-speed);

        motoleftback.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorightfront.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motoleftback.setTargetPosition(22500);
        motorightfront.setTargetPosition(2240);

        while (motorightfront.isBusy() && opModeIsActive()) {
        }
        while (motoleftback.isBusy() && opModeIsActive()) {
        }

        motoleftback.setPower(0);
        motorightfront.setPower(0);

        sleep(1000);

        telemetry.addData("Path", "Complete");
        telemetry.update();
    }
}