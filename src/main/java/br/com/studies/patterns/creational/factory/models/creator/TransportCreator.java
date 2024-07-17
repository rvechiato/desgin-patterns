package br.com.studies.patterns.creational.factory.models.creator;

import br.com.studies.patterns.creational.factory.models.ITransport;

public abstract class TransportCreator {

    public void delivery(){
        ITransport transport = createTransport();
        transport.deliver();
    }

    abstract ITransport createTransport();
}
