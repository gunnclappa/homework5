package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @BeforeAll
    static void configure() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void dragAndDropTest() {
        // Open Test page
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Drag and drop
        $("#column-a").dragAndDropTo($("#column-b"));

        // Check that A and B are swapped
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
