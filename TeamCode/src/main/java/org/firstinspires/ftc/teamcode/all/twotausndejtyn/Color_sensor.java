package org.firstinspires.ftc.teamcode.all.twotausndejtyn;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

public class Color_sensor extends OpMode {

    ColorSensor colour_sensor;

    public void init	() {

        colour_sensor = hardwareMap.colorSensor.get("colour");
    }
    public void loop() {

        colour_sensor.red(); //Total red value
        colour_sensor.green(); //Total green value
        colour_sensor.blue(); //Total blue value

        colour_sensor.alpha(); //Total luminosity
        colour_sensor.argb(); //Combined colour value

        telemetry.addData("Status", "Initialized");

        //Example of use below
        while (colour_sensor.alpha() < 20) {
            //Drive forward
        }

    }
}
