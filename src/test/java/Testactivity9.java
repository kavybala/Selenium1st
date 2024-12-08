import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class Testactivity9 {
    WebDriver driver = new FirefoxDriver();
    Logger logger = Logger.getLogger(Testactivity9.class.getName());
    @BeforeTest
    void beforeTest() {
        logger.info("Driver initialized.");
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        logger.info("Website opened: " + driver.getCurrentUrl());

    }
    @AfterTest
    void afterTest(){
        driver.quit();
        logger.info("Browser closed.");
    }
    @BeforeMethod
    void beforeMethod(){
        driver.switchTo().defaultContent();
        logger.info("Switched back to the main page.");
    }
    @Test
    public void simpleAlertTestCase() {
        // Trigger the Simple Alert
        driver.findElement(By.id("simple")).click();
        logger.info("Simple Alert button clicked.");

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();

        Reporter.log(alert.getText());

        // Assert the alert text
        Assert.assertEquals(alertText, "This is a JavaScript Alert!");
        //logger.info("Assertion passed for Simple Alert text.");

        // Accept the alert
        alert.accept();
        //logger.info("Simple Alert accepted.");
    }

    @Test
    public void confirmAlertTestCase() {
        // Find and click the Confirm Alert button
        driver.findElement(By.id("confirm")).click();
        logger.info("Confirm Alert button clicked.");

        // Switch to alert and get its text
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Reporter.log(alertText);

        // Assert the alert text
        Assert.assertEquals(alertText, "This is a JavaScript Confirmation!");
        //logger.info("Assertion passed for Confirm Alert text.");

        // Dismiss the alert
        alert.dismiss();
        //logger.info("Confirm Alert dismissed.");
    }
    @Test
    public void promptAlertTestCase() {
        // Find and click the Prompt Alert button
        driver.findElement(By.id("prompt")).click();
        logger.info("Prompt Alert button clicked.");

        // Switch to alert and get its text
        Alert alert2 = driver.switchTo().alert();
        String alertText = alert2.getText();
        logger.info("Prompt Alert text: " + alertText);

        // Assert the alert text

        //logger.info("Assertion passed for Prompt Alert text.");

        // Send input to the prompt and accept it
        //String inputText = "Test Input";
        alert2.sendKeys("test");
        //logger.info("Text entered in Prompt Alert: " + inputText);

        alert2.accept();
        Assert.assertEquals(alertText, "This is a JavaScript Prompt!");
        Reporter.log(alertText);
    }
}
