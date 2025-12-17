package com.propentatech.formation;

public class InscriptionConnexion {

    Hello hello;

    public InscriptionConnexion(Hello hello) {
        this.hello = hello;
    }

    public void salutation() {

        System.out.println(hello.sayHello("Wilfried"));
    }

}
