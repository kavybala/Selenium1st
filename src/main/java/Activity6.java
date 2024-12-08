import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // Open the webpage
        driver.get("https://v1.training-support.net/selenium/input-events");

        // Get the title of the page and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Locate the cube element
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        // Initialize Actions class
        Actions actions = new Actions(driver);

        // Perform a left click and print the value on the front of the cube
        actions.click(cube).perform();
        WebElement frontSide = driver.findElement(By.className("active"));
        System.out.println("Front side after left click: " + frontSide.getText());

        // Perform a double click and print the value on the random side
        actions.doubleClick(cube).perform();
        WebElement randomSide = driver.findElement(By.className("active"));
        System.out.println("Front side after double click: " + randomSide.getText());

        // Perform a right click and print the value on the front of the cube
        actions.contextClick(cube).perform();
        WebElement rightClickSide = driver.findElement(By.className("active"));
        System.out.println("Front side after right click: " + rightClickSide.getText());

        // Close the browser
        driver.close();
    }
}


