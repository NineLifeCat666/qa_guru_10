package Sites;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import Configs.WebConfig;
import Configs.WebConfigHelper;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class GitWebTests {
    static final WebConfig config = ConfigFactory.create(WebConfig.class);

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
        Configuration.browserVersion = config.browserVersion();
        Configuration.remote = config.remoteWebDriver();

    }

    @Test
    public void gitOpenTest() {
         String baseUrl = WebConfigHelper.getBaseUrl();
         String searchResult = WebConfigHelper.getSearchResult();

    open(baseUrl);
        $("[class='application-main ']").shouldHave(Condition.text(searchResult));
    }
}
