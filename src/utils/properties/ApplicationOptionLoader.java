package utils.properties;

import entities.ApplicationOption;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationOptionLoader {

    private static final String PROPERTIES_PATH = "main.properties";
    private ApplicationOption applicationOption;

    public void loadOptions() throws IOException {

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(PROPERTIES_PATH);

        properties.load(fis);

        System.out.println(properties.getProperty("readPath"));
    }

    public static void main(String[] args) throws IOException {
        ApplicationOptionLoader applicationOptionLoader = new ApplicationOptionLoader();
        applicationOptionLoader.loadOptions();
    }

}
