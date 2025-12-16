package com.propentatech.formation;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscriptionConnexion {
    
    public void inscription(String email) {

        /*
            Code permettant d'inscrire un utilisateur
            ----
        */
       Email e1 = new Email("noubissie.k.w@gmail.com", "Salut et bienvenu dans notre plateforme");
       e1.sendEmail();
    }
}
