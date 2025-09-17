package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablesExamples extends OpMode {
    @Override
    public void init() {
        int teamNumber = 32200;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "StroopTech";
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("Name", teamName);
        telemetry.addData("motor angle", motorAngle);

    }

    @Override
    public void loop() {
        /*
        1.CHnage the String variable "name" to your team name .
        2. create an int called "motorAngle" and store an angle between 0-180.
         */
    }
}



