import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity8 {


        public static void main(String[] args) {
            // Set up WebDriver
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();

            try {
                // Open the webpage
                driver.get("https://v1.training-support.net/selenium/drag-drop");

                // Get the title of the page and print it
                String pageTitle = driver.getTitle();
                System.out.println("Page Title: " + pageTitle);

                // Locate the ball and drop zones
                WebElement ball = driver.findElement(By.id("draggable"));
                WebElement dropzone1 = driver.findElement(By.id("droppable"));
                WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

                // Initialize Actions class
                Actions actions = new Actions(driver);

                // Drag and drop the ball into Dropzone 1
                actions.dragAndDrop(ball, dropzone1).perform();

                // Verify if the ball has entered Dropzone 1
                String dropzone1Text = dropzone1.getText();
                if (dropzone1Text.contains("Dropped!")) {
                    System.out.println("Ball successfully dropped into Dropzone 1.");
                } else {
                    System.out.println("Failed to drop the ball into Dropzone 1.");
                }

                // Drag and drop the ball into Dropzone 2
                actions.dragAndDrop(ball, dropzone2).perform();

                // Verify if the ball has entered Dropzone 2
                String dropzone2Text = dropzone2.getText();
                if (dropzone2Text.contains("Dropped!")) {
                    System.out.println("Ball successfully dropped into Dropzone 2.");
                } else {
                    System.out.println("Failed to drop the ball into Dropzone 2.");
                }

            } finally {
                // Close the browser
                driver.quit();
            }
        }
    }


