package br.com.studies.patterns.creational.singleton;

public class SingletonPattern {
    public static void main(String[] args) {

        Connection singleton = Connection.getInstance("foo.database.com");
        Connection anotherSingleton = Connection.getInstance("bar.sever.com.br");
        System.out.println(singleton.getUrl());
        System.out.println(anotherSingleton.getUrl());
    }
}
