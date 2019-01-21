package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Hooks;

public class RestoreTestDataActions extends Hooks {
    LoginPageActions login = new LoginPageActions();
    MainViewActions mainView = new MainViewActions();

    public void restoreProfilePicture()  {
        login.loadPage();
        login.enterNewCredentials();
        login.clickLogin();
        mainView.openUserProfile();
        WebElement avatar = driver.findElement(By.id("avatar"));
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        wait1.until(ExpectedConditions.visibilityOf(avatar));
        driver.findElement(By.id("file")).sendKeys("C:\\Users\\pega\\IdeaProjects\\PracticeTest\\src\\test\\java\\resources\\avatar.jpg");
        login.logout();
    }

    public void restorePassword() {
        login.loadPage();
        login.enterNewCredentials();
        login.clickLogin();
        mainView.openUserProfile();
        driver.findElement(By.id("newPassword")).sendKeys("Test123!");
        driver.findElement(By.id("confirmPassword")).sendKeys("Test123!");
        driver.findElement(By.xpath("//a[contains(text(), 'Save changes')]")).click();
        login.logout();

    }

}
