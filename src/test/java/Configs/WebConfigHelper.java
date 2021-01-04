package Configs;

import org.aeonbits.owner.ConfigFactory;

public class WebConfigHelper {


    public static String getSearchResult() {
        return getConfig().searchResult();
    }

    public static String getBaseUrl() {
        return getConfig().baseUrl();
    }

    private static WebConfig getConfig() {
        if (System.getProperty("environment") == null) System.setProperty("environment", "local");

        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }
}

