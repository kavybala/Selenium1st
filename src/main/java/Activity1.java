import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        // Set up Firefox driver
        //WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
        System.out.println("Title of the page is:" + driver.getTitle());
        // Find About Us link using id and click it
        driver.findElement(By.id("about-link")).click();
        // Print the title of the new page
        System.out.println("About page title: " + driver.getTitle());

        // Close the browser
        driver.close();
    }
}