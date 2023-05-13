package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator {
    public static String generateRandomText(int textLength) {
        return  RandomStringUtils.randomAlphabetic(textLength);
    }
}
