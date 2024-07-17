package br.com.studies.patterns.creational.factory.models;

public class Ship implements ITransport{

    @Override
    public void deliver() {
        System.out.println("delivery by Ship");
        System.out.println("Get Navegation map");
        System.out.println("take off anchor");
        System.out.println("go");
    }
}
