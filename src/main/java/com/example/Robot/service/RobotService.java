package com.example.Robot.service;

import com.example.Robot.controller.RobotRequest;
import com.example.Robot.controller.RobotResponse;

public interface RobotService {
    RobotResponse solucion(RobotRequest instrucciones);
}
