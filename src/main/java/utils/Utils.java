package utils;

public class Utils {
    public static String extractDigits(String initialString) {
        return initialString.replaceAll("\\D+", "");
    }
}
