package br.com.studies.patterns.creational.factory.models.creator;

import br.com.studies.patterns.creational.factory.models.ITransport;
import br.com.studies.patterns.creational.factory.models.Plane;

public class PlaneCreator extends TransportCreator{
    @Override
    ITransport createTransport() {
        return new Plane();
    }
}
