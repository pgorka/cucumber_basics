package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import setup.TestBase;

public class Hooks extends TestBase {
    @Before
    public void setUp() {
        driver = getDriver();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
