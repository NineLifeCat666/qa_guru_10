package Configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${environment}.properties"
})

public interface ApiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("assertedValue")
    String assertedValue();

}
