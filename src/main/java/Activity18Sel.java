import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class Activity18Sel {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Page Title:"+getTitle());
        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select selectvar = new Select(dropdown);
        // Select the second option using visible text
        selectvar.selectByVisibleText("Option 2");
        // Print the selected option
        System.out.println("Second option: " + selectvar.getFirstSelectedOption().getText());

        // Select the third option using index
        selectvar.selectByIndex(3);
        // Print the selected option
        System.out.println("Third option: " + selectvar.getFirstSelectedOption().getText());

        // Select the fourth option using value attribute
        selectvar.selectByValue("4");
        // Print the selected option
        System.out.println("Fourth option: " + selectvar.getFirstSelectedOption().getText());

        // Print all the options
        List<WebElement> allOptions = selectvar.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();


    }
}
