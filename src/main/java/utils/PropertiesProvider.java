package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesProvider {
    private static final Properties PROPERTIES = new Properties();

    private PropertiesProvider() {
    }

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try (var inputStream = PropertiesProvider.class.getClassLoader().getResourceAsStream("application.properties")) {
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getFromProperties(String propertiesKey) {
        return PROPERTIES.getProperty(propertiesKey);
    }
}
