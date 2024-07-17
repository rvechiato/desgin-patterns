package br.com.studies.patterns.creational.factory.emuns;

public enum TransportTypeEnum {
    SHIP(1),
    TRUCK(2),
    PLANE(3);

    private final Integer type;

    TransportTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType(){
        return type;
    }
}
