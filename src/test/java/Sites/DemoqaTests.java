package Sites;

import Configs.ApiConfigHelper;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;

public class DemoqaTests {

    @Test
    void demoqaTest() {
        String baseUrl = ApiConfigHelper.getBaseUrl();
        String assertedValue = ApiConfigHelper.assertedValue();

        get(baseUrl)
            .then()
            .body("books[6].title", is(assertedValue));
    }
}


