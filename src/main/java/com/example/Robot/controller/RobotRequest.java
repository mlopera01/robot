package com.example.Robot.controller;

import java.util.List;

public class RobotRequest {
    private List<List<String>> instructions;

    public RobotRequest() {
    }

    public RobotRequest(List<List<String>> instructions) {
        this.instructions = instructions;
    }

    public List<List<String>> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<List<String>> instructions) {
        this.instructions = instructions;
    }

    
}
