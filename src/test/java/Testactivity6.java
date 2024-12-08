import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Testactivity6 {


    public class LoginFormTest {
        WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net/selenium/login-form");
        }

        @Test
        @Parameters({"username", "password"})
        public void loginTest(String username, String password) {
            // Find the username field
            WebElement usernameField = driver.findElement(By.id("username"));
            // Find the password field
            WebElement passwordField = driver.findElement(By.id("password"));
            // Find the login button
            WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));

            // Enter the username and password
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);

            // Click the login button
            loginButton.click();
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }

}
