package br.com.studies.patterns.creational.singleton;

public class Connection {

    private static Connection instance;
    private String url;

    public String getUrl(){
        return this.url;
    }

    private Connection(String url) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.url = url;
    }

    public static Connection getInstance(String value) {
        if (instance == null) {
            instance = new Connection(value);
        }
        return instance;
    }
}
