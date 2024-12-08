import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class Activity17Sel {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Page Title:"+getTitle());
        WebElement username = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input"));
        username.sendKeys("Kavya");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input"));
        username.sendKeys("flower");
        WebElement confpassword = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[3]/input"));
        username.sendKeys("flower");
        WebElement email = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[4]/input"));
        username.sendKeys("xyz@gmail.com");

        WebElement signupbutton = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        signupbutton.click();

        // Wait for the login message to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
        WebElement loginmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"action-confirmation\"]")));
        System.out.println(loginmsg.getText());
        driver.quit();
    }
}
