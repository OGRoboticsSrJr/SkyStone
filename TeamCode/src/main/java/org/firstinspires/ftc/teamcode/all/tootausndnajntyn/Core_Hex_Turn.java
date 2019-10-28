package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;

import com.qualcomm.hardware.motors.RevRoboticsCoreHexMotor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
//@Disabled
public class Core_Hex_Turn extends LinearOpMode{
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor hex = null;

    static final double speed = 1.0;

    @Override
    public void runOpMode(){
        hex = hardwareMap.get(DcMotor.class, "hex");

        telemetry.addData("Status", "Initialized");
        waitForStart();

        hex.setPower(speed);
        while(opModeIsActive() && runtime.seconds() < 1.0) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        hex.setPower(0);
        telemetry.addData("Path", "Completed");
        telemetry.update();
        sleep(1000);
    }

}
