import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import aquality.selenium.core.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsTest {

    @Test
    public void test() {
        Logger logger = AqualityServices.getLogger();

        Browser browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo("https://wikipedia.org");
        browser.waitForPageToLoad();

        final String TEXT = "Hello World!";

        Assert.assertEquals(TEXT, "Hello World!", "Texts don't match");
        logger.info("Test is done");

        browser.quit();
    }
}