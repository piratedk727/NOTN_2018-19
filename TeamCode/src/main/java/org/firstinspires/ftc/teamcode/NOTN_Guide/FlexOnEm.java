package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="FlexOnEm"); // Name of the Task
public class FlexOnEm extends OpMode {

    // The physical components of the robot
    private DcMotor leftFront, rightFront, leftBack, rightBack, ArmRotate, ArmLift;
    private Servo item, dropper, sweeper, rotate;

    // Initialization period, what happens at the start
    public void init() {

        leftFront   =  hardwareMap.dcMotor.get("leftFront");
        rightFront  =  hardwareMap.dcMotor.get("rightFront");
        leftBack    =  hardwareMap.dcMotor.get("leftBack");
        rightBack   =  hardwareMap.dcMotor.get("rightBack");
        ArmRotate   =  hardwareMap.dcMotor.get("ArmRotate");
        ArmLift     =  hardwareMap.dcMotor.get("ArmLift");

        item        =  hardwareMap.servo.get("item");
        rotate      =  hardwareMap.servo.get("rotate");
        sweeper     =  hardwareMap.servo.get("sweeper");
        dropper     =  hardwareMap.servo.get("dropper");

    }

    // Repeat this
    public void loop() {
        int countperrotation = 1120;
    }
}
