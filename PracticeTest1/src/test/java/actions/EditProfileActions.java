package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Hooks;

public class EditProfileActions extends Hooks {
    public String firstAvatar;
    public void enterCredentialsAndSave() {
        driver.findElement(By.id("newPassword")).sendKeys("Test321#");
        driver.findElement(By.id("confirmPassword")).sendKeys("Test321#");
        driver.findElement(By.xpath("//a[contains(text(), 'Save changes')]")).click();
    }

    public void uploadPicture() {
        WebElement avatar = driver.findElement(By.id("avatar"));
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        wait1.until(ExpectedConditions.visibilityOf(avatar));
        String avatarBefore;
        avatarBefore = driver.findElement(By.id("avatar")).getScreenshotAs(OutputType.BASE64);
        this.firstAvatar = avatarBefore;
        driver.findElement(By.id("file")).sendKeys("C:\\Users\\pega\\IdeaProjects\\PracticeTest\\src\\test\\java\\resources\\thS2G491AH.jpg");
    }

    public String checkPictureChange() {
        driver.navigate().refresh();
        WebElement avatar = driver.findElement(By.id("avatar"));
        WebDriverWait wait1 = new WebDriverWait(driver, 3);
        wait1.until(ExpectedConditions.visibilityOf(avatar));
        String avatarAfter;
        avatarAfter = driver.findElement(By.id("avatar")).getScreenshotAs(OutputType.BASE64);
        return avatarAfter;
    }
}
