package com.example.Robot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Robot.controller.RobotRequest;
import com.example.Robot.controller.RobotResponse;
import com.example.Robot.service.RobotService;

@Service
public class RobotServiceImpl implements RobotService {
    // una vez agrego el implemets le doy CTRL . y me sale lo del add unimplemets methods para agregar lo de @override
    @Override
    public RobotResponse solucion(RobotRequest instructions) {
        RobotResponse respuesta = new RobotResponse();
/* 
        for (List<String> lista : instructions.getInstructions()) {
            for(String instruccion : lista) {
                System.out.println("instruccion: "+  instruccion);
                if (instruccion.equals("LEFT")){
                    respuesta.getRespuesta().set(i,-1); 
                } else if (instruccion.equals("RIGHT")){
                    respuesta.getRespuesta().set(i,1); 
                }else if (instruccion.equals("SAME AS")){

                }

            }
        }*/

        for (int i=0; i<instructions.getInstructions().size();i++) // si son dos listas devuelve el 2
        {
            List<String> lista = instructions.getInstructions().get(i);
            respuesta.getRespuesta().add(0);
            for (int j=0; j < lista.size();j++){
                String instruccion = getInstruccion(lista, j);
                System.out.println("instruccion: "+  instruccion);
                int valorActual = respuesta.getRespuesta().get(i);
                System.out.println("Valor actual:"+ valorActual);
                if (instruccion.equals("LEFT")){
                    respuesta.getRespuesta().set(i,valorActual-1); 
                    System.out.println("Decrementando");
                } else if (instruccion.equals("RIGHT")){
                    respuesta.getRespuesta().set(i,valorActual+1); 
                    System.out.println("Aumentando");
                }
            }
        }
        return respuesta;
    }
    
    public String getInstruccion (List<String> lista, int posicion){
        String instruccion = lista.get(posicion);
        if(instruccion.equals("RIGHT") || instruccion.equals("LEFT"))
        {
            return instruccion;
        } 
        posicion = Integer.parseInt(instruccion.split(" ")[2]);
        return getInstruccion(lista, posicion-1);
    }
}



