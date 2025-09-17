package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // runs 50x* a second
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double diffXJoysticks = gamepad1.left_stick_x - gamepad1.left_stick_y;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData(" left x",gamepad1.left_stick_x);
        telemetry.addData("left y",speedForward );
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("right x",gamepad1.right_stick_x);
        telemetry.addData("right y", gamepad1.right_stick_y);
        telemetry.addData(" rear trgiggers", sumTriggers);

        telemetry.addData("sum triggers", diffXJoysticks);
    }

    /*
    1. add telemtry for the right joystick
    2. add telemtry for the b button.
    3. add telemtry data to report the difference between X left joystick and x right joystick
    4. add telemerty data to report the sum of both rear triggers.
     */
}
