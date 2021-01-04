package Configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${environment}.properties"
})

public interface WebConfig extends Config {
    @Key("search.result")
    String searchResult();

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("base.url")
    String baseUrl();

    @Key("remote.webDriver")
    String remoteWebDriver();
}