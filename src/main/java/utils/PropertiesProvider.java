package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesProvider {

    private static Properties properties;

    public static String getFromProperties(String propertyKey) {
        if( properties == null) {
            properties = FileUtils.loadProperties("src/main/application.properties");
            return properties.getProperty(propertyKey);
        }
        return properties.getProperty(propertyKey);
    }
}
