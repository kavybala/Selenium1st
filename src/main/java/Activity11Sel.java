import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class Activity11Sel {
    public static void main(String[] args){




                // Set the path to the ChromeDriver executable
               // System.setProperty("WebDriver.firefox.driver", "path/to/chromedriver");

                // Initialize the WebDriver
                WebDriver driver = new FirefoxDriver();

                try {
                    // Open the URL
                    driver.get("https://v1.training-support.net/selenium/ajax");

                    // Get and print the title of the page
                    String pageTitle = driver.getTitle();
                    System.out.println("Page title: " + pageTitle);

                    // Find and click the "Change content" button
                    WebElement changeContentButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button"));
                    changeContentButton.click();

                    // Wait for the text to say "HELLO!"
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

                    // Print the "HELLO!" message
                    WebElement helloMessage = driver.findElement(By.id("ajax-content"));
                    System.out.println("Message: " + helloMessage.getText());

                    // Wait for the text to change to "I'm late!"
                    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

                    // Print the "I'm late!" message
                    WebElement lateMessage = driver.findElement(By.id("ajax-content"));
                    System.out.println("Message: " + lateMessage.getText());

                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                } finally {
                    // Close the browser
                    //driver.quit();
                }
            }
        }



