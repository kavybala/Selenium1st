import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {
        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();


            driver.get("https://v1.training-support.net/");
            System.out.println("Title of the page is: " + driver.getTitle());


            driver.findElement(By.xpath("//a[@id='about-link']")).click();


            System.out.println("About page title: " + driver.getTitle());


            driver.close();
        }
}


