package br.com.studies.patterns.creational.builder.models;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;

    public PersonBuilder setFirstName(String name){
        this.firstName = name;
        return this;
    }

    public PersonBuilder setLeastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Person build() {
        return new Person(this);
    }
}
