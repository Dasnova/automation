package io.general.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final String GLOBAL_PROPERTIES_PATH = "src//main//java//io/general/"
            + "config//global.properties";

    public static void populateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.readProperty();
    }

    private void readProperty() throws IOException {

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(GLOBAL_PROPERTIES_PATH);
        properties.load(fis);

        Settings. qa_siteUrl =  properties.getProperty("qa_siteUrl");
        Settings.staging_siteUrl=  properties.getProperty("staging_siteUrl");
        Settings.ebuyer_siteUrl = properties.getProperty("ebuyer_siteUrl");
    }
}
