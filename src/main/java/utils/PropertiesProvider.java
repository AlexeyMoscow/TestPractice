package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesProvider {
    private final static Properties PROPERTIES = new Properties();

    private PropertiesProvider(){
    }

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try (InputStream inputStream = PropertiesProvider.class.getClassLoader().getResourceAsStream("application.properties")) {
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getFromProperties(String PropertyKey){
        return PROPERTIES.getProperty(PropertyKey);
    }
}
