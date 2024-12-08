import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Testactivity7 {



        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            // Create a FirefoxDriver instance and open the login page
            driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net/selenium/login-form");
        }

        @DataProvider(name = "Authentication")
        public Object[][] credentials() {
            // Provide test data for username and password
            return new Object[][] {
                    {"admin", "password"},
                    {"user", "pass123"}
            };
        }

        @Test(dataProvider = "Authentication")
        public void loginTest(String username, String password) {
            // Find username and password fields
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Enter credentials and click login
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();

            // Optional: Print success message
            System.out.println("Test completed for username: " + username);
        }

        @AfterMethod
        public void tearDown() {
            // Close the browser
            driver.close();
        }
    }


