
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class ClassName {
        public static void main(String[] args) {
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the browser
            driver.get("https://v1.training-support.net");

            // Perform testing and assertions


            // Close the browser
            // Feel free to comment out the line below
            // so it doesn't close too quickly
            driver.quit();
        }
    }

