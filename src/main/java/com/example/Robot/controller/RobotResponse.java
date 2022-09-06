package com.example.Robot.controller;

import java.util.ArrayList;
import java.util.List;

public class RobotResponse {
    private List<Integer> respuesta = new ArrayList<Integer>();

    public RobotResponse() {
    }

    public List<Integer> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(List<Integer> respuesta) {
        this.respuesta = respuesta;
    }
    
}
