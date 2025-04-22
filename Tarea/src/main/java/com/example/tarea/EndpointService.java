package com.example.tarea;

import org.springframework.stereotype.Service;

@Service
public class EndpointService {
    double dividir(int a, int b) {
        if (0 == b){
            throw new RuntimeException("b no puede ser 0");
        }
        else if (a/b <= 0){
            throw new RuntimeException("La division no puede ser negativo");
        }
        return (double) a/b;
    }

}
