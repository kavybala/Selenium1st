import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class Activity16Sel {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Page Title:" +getTitle());
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input"));
        usernameField.sendKeys("admin");

        // Locate the password field using XPath and enter the password
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input"));
        passwordField.sendKeys("password");

        // Locate and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        loginButton.click();

        // Wait for the login message to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
        WebElement loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"action-confirmation\"]")));

        WebElement message = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        System.out.println(message.getText());
        driver.quit();
    }
}
