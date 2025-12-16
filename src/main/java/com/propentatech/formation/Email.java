package com.propentatech.formation;

public class Email {

    protected String emailDestinataire;

    public Email(String email, String message) {
        this.emailDestinataire = email;
    }
    
    public void sendEmail() {
        /*
            Code permettant d'envoyer l'email
        */
       System.out.println("Email envoyé avec succès à "+this.emailDestinataire);
    }
}
