package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestBase {
    public static WebDriver driver;
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(7000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(7000, TimeUnit.MILLISECONDS);
        return driver;
    }

    public void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
