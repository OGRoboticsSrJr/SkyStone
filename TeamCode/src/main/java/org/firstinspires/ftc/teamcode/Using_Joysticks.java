package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Using_Joysticks extends OpMode {

    public void init() {
        DcMotor left_drive;
        DcMotor right_drive;

        right_drive = hardwareMap.dcMotor.get("right");
        left_drive = hardwareMap.dcMotor.get("left");


        float left_power = -gamepad1.left_stick_y;
        float right_power = -gamepad1.right_stick_y;


        left_drive.setPower(left_power);
        right_drive.setPower(right_power);
    }
    public void loop() {


    }
}
