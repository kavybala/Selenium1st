import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class Activity19Sel {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Page Title:"+getTitle());
        WebElement dropdown = driver.findElement(By.id("multi-select"));
        Select multiselect = new Select(dropdown);
        multiselect.selectByVisibleText("Javascript");
        System.out.println("Eighth Option:"+multiselect.getFirstSelectedOption().getText());
        multiselect.selectByIndex(3);
        System.out.println("Fourth Option:"+multiselect.getFirstSelectedOption().getText());
        multiselect.selectByIndex(4);
        System.out.println("Fifth Option:"+multiselect.getFirstSelectedOption().getText());
        multiselect.selectByIndex(5);
        System.out.println("Sixth Option:"+multiselect.getFirstSelectedOption().getText());



    }
}
