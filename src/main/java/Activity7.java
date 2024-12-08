import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class Activity7 {
    public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Page Title:"+getTitle());
        // Press the key
        builder.sendKeys("S").build().perform();
        // Press CTRL+A and CTRL+C
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        // Close the browser
        driver.close();
    }
}
