package br.com.studies.patterns.creational.factory.models;

import java.util.SortedMap;

public class Truck implements ITransport{
    @Override
    public void deliver() {
        System.out.println("delivery by truck");
        System.out.println("full fuel");
        System.out.println("set route on de GPS");
        System.out.println("going now");
    }
}
