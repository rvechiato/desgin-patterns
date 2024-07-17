package br.com.studies.patterns.creational.factory.models;

public class Plane implements ITransport{
    @Override
    public void deliver() {
        System.out.println("delivery by plane");
        System.out.println("reserve tickets");
        System.out.println("made checkin");
        System.out.println("take off");
    }
}
