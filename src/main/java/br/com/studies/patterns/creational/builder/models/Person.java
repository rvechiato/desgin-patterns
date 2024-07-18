package br.com.studies.patterns.creational.builder.models;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    // Other attributes and methods

    Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName =  builder.getLastName();
        this.age = builder.getAge();
    }

    public static PersonBuilder getBuilder(){
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return String.format("First name: %s, \nLast Name: %s, \nAge: %s", this.firstName, this.lastName, this.age);
    }
}
