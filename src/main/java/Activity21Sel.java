import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity21Sel {
    public static void main(String[] args) {

            WebDriver driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net/selenium/javascript-alerts");
            System.out.println("Page Title:" + driver.getTitle());

            driver.findElement(By.id("prompt")).click();
        }

    }