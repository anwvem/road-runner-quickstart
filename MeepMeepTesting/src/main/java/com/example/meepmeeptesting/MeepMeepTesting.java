package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, Math.toRadians(180), Math.toRadians(180), 11.36)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -62, Math.toRadians(90)))
                                .strafeRight(24)
                                .forward(50)
                                .strafeLeft(24)
                                .turn(Math.toRadians(-45))
                                .turn(Math.toRadians(135))
                                .forward(12)
                                .turn(Math.toRadians(180))
                                .forward(12)
                                .turn(Math.toRadians(180))
                                .forward(12)
                                .turn(Math.toRadians(180))
                                .forward(12)
                                .turn(Math.toRadians(180))
                                .forward(12)
                                .turn(Math.toRadians(180))
                                .forward(12)
                                .turn(Math.toRadians(180))
                                .forward(12)
                                .turn(Math.toRadians(180))
                                .forward(12)




                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}