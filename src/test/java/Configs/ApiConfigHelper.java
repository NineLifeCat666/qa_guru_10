package Configs;

import org.aeonbits.owner.ConfigFactory;

public class ApiConfigHelper {
    public static String getBaseUrl() {
        return getConfig().baseUrl();
    }

    public static String assertedValue() {
        return getConfig().assertedValue();
    }

    public static ApiConfig getConfig() {
        if (System.getProperty("environment") == null) System.setProperty("environment", "api");

        return ConfigFactory.newInstance().create(ApiConfig.class, System.getProperties());
    }
}
