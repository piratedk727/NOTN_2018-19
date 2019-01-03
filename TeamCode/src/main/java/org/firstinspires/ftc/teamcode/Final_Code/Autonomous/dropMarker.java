package org.firstinspires.ftc.teamcode.Final_Code.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class dropMarker extends LinearOpMode{

  private static Servo dropper;

  public static void drop() throws InterruptedException{

    dropper = hardwareMap.servo.get("dropper");

    for(int x = 0; x<1; x+=.1){
       dropper.setPosition(x);
       Thread.sleep(1);
    }
    
  }
}
