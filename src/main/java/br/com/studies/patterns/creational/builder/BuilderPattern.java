package br.com.studies.patterns.creational.builder;

import br.com.studies.patterns.creational.builder.models.Person;

public class BuilderPattern {

    public static void main(String[] args) {
        var person = Person.getBuilder()
                .setFirstName("Rubens")
                .setLeastName("Vechiato")
                .setAge(32)
                .build();

        System.out.println(person);
    }
}
