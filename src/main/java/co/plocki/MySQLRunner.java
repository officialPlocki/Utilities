package co.plocki;

import co.plocki.driver.MySQLDriver;

public class MySQLRunner {

    private static MySQLDriver driver;

    public void start() {
        driver = new MySQLDriver();
    }

    public static MySQLDriver getMySQLDriver() {
        return driver;
    }

    public void stop() {
        driver.close();
    }

}
