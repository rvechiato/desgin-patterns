package br.com.studies.patterns.creational.factory.models.creator;

import br.com.studies.patterns.creational.factory.models.ITransport;
import br.com.studies.patterns.creational.factory.models.Truck;

public class TruckCreator extends TransportCreator{
    @Override
    ITransport createTransport() {
        return new Truck();
    }
}
