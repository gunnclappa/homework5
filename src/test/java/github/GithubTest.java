package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {

    @BeforeAll
    static void configure() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void githubTest() {
        // Open Github main page
        open("https://github.com/");

        // Moving mouse over Pricing
        $(byText("Pricing")).hover();

        // Click on Compare plans
        $(byText("Compare plans")).click();

        // Check that Compare plans contains text
        $("body").shouldHave(text("Choose the plan that’s right for you."));
    }
}
