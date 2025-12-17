package com.propentatech.formation;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Hello {

    LocalDateTime dateHeure;

    public Hello(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String sayHello(String name) {
        return "Bonjour "+name+
        " Ce message vous est envoyé à "+this.dateHeure;
    }
    
}
