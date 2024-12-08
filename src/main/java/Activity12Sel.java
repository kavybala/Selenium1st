import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12Sel {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page:"+driver.getTitle());
        WebElement checkbox = driver.findElement(By.name("toggled"));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }
        checkbox.click();
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }
        driver.quit();
    }
}
