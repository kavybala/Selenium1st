import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Activity9Sel {



        public static void main(String[] args) {
            // Set the path to the ChromeDriver executable
            System.setProperty("WebDriver.firefox.driver", "path/to/chromedriver");

            // Initialize the WebDriver
            WebDriver driver = new FirefoxDriver();

            try {
                // Open the URL
                driver.get("https://v1.training-support.net/selenium/dynamic-controls");

                // Get and print the title of the page
                String pageTitle = driver.getTitle();
                System.out.println("Page title: " + pageTitle);

                // Locate the checkbox toggle button
                WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));

                // Click the toggle button to remove the checkbox
                toggleButton.click();

                // Wait until the checkbox disappears
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));

                // Click the toggle button to make the checkbox appear again
                toggleButton.click();

                // Wait until the checkbox is visible
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));

                // Locate and check the checkbox
                WebElement checkbox = driver.findElement(By.id("dynamicCheckbox"));
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }

            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                // Close the browser
                driver.quit();
            }
        }
    }


