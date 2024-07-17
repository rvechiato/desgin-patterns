package br.com.studies.patterns.creational.factory;

import br.com.studies.patterns.creational.factory.emuns.TransportTypeEnum;
import br.com.studies.patterns.creational.factory.models.creator.PlaneCreator;
import br.com.studies.patterns.creational.factory.models.creator.ShipCreator;
import br.com.studies.patterns.creational.factory.models.creator.TransportCreator;
import br.com.studies.patterns.creational.factory.models.creator.TruckCreator;

public class FactoryMethodPattern {

    private static TransportCreator transportCreator;

    public static void main(String[] args) {
        configure(TransportTypeEnum.TRUCK);
        transportCreator.delivery();
    }

    private static void configure(TransportTypeEnum type){

        switch (type){
            case SHIP -> transportCreator = new ShipCreator();
            case TRUCK -> transportCreator =  new TruckCreator();
            case PLANE -> transportCreator = new PlaneCreator();
        }

    }
}
