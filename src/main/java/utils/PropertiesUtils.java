package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    private static final Properties PROPERTIES = new Properties();

    private PropertiesUtils() {
    }

    static {
        loadProperties();
    }

    public static String getFromProperties(String propertiesKey){
        return PROPERTIES.getProperty(propertiesKey);
    }


    private static void loadProperties() {

        try (var inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream("application.properties")) {
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
