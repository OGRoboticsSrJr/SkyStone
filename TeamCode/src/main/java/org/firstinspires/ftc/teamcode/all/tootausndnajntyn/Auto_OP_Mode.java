package org.firstinspires.ftc.teamcode.all.tootausndnajntyn;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Pushbot: Auto Drive By Encoder", group="Pushbot")
//@Disabled
public class Auto_OP_Mode extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor motoleftfront = null;
    private DcMotor motorightfront = null;
    private DcMotor motoleftback = null;
    private DcMotor motorightback = null;



    static final double CPMR = 2240;
    static final double reduction = 0.025;
    static final double diameter = 3.54331;
    static final double CPI = (CPMR*reduction)/(diameter*3.14159265363);
    static final double speed = 2.0;
    static final double turn = 0.5;

    ColorSensor coloursensor;

    @Override
    public void runOpMode() {
        coloursensor = hardwareMap.colorSensor.get("colour");

        motoleftback = hardwareMap.get(DcMotor.class, "left_back");
        motoleftfront = hardwareMap.get(DcMotor.class, "left_front");
        motorightback = hardwareMap.get(DcMotor.class, "right_back");
        motorightfront = hardwareMap.get(DcMotor.class, "right_front");


    }

}