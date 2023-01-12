import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class ConflictTest {
    @Test
    void JustTestForLesson() {

        open("https://github.com");
        sleep(5000);
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(withText("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));

        sleep(5000);

    }
}
