import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class Activity5sel {
    public void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("The page title is:" + getTitle());
        WebElement thirdheader = driver.findElement(By.xpath("//h3[@id='third-header']"));
        System.out.println("The third header is:"+thirdheader);
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println(fifthHeaderColor);

        // Find the violet button and print its classes
        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);
        // Find the grey button and print its text
        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(greyButtonText);

        // Close the browser
        driver.quit();
    }
}
