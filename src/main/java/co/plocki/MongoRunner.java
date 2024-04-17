package co.plocki;

import co.plocki.driver.MongoDriver;

public class MongoRunner {

    private static MongoDriver driver;

    public void start() {
        driver = new MongoDriver();
    }

    public static MongoDriver getMongoDriver() {
        return driver;
    }

    public void stop() {
        driver.close();
    }

}
