package com.example.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class EndpointManager {

    @Autowired
    EndpointService endpointService;

    @GetMapping("/hola")
    ResponseEntity<String> hola(){
        return ResponseEntity.ok("Hola");
    }

    @GetMapping("/division/{a}/{b}")
    ResponseEntity<String> calculadora(@PathVariable int a,@PathVariable int b) {
        try {
            String resultado = String.valueOf(endpointService.dividir(a, b));
            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }


}
