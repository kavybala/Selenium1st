import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class funactivity {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=en&ictx=2&sa=X&ved=0ahUKEwjHzZTur_eJAxWz1TgGHfK-AQkQPQgJ");
        WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        search.sendKeys("Cheese");
        search.sendKeys(Keys.ENTER);
        //driver.get("https://www.google.com/search?q=cheese&rlz=1C1CHBF_enIN1136IN1136&oq=cheese&gs_lcrp=EgZjaHJvbWUqDQgAEAAY4wIYsQMYgAQyDQgAEAAY4wIYsQMYgAQyCggBEC4YsQMYgAQyEAgCEC4YxwEYsQMY0QMYgAQyDQgDEC4YsQMYyQMYgAQyCggEEC4YsQMYgAQyCggFEAAYsQMYgAQyCggGEC4YsQMYgAQyCggHEAAYsQMYgAQyBwgIEAAYgAQyCggJEAAYsQMYgATSAQkzMzAzajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
        WebElement tool = driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]"));
        tool.click();
        WebElement noresults = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        System.out.println("No. of results"+noresults.getText());

    }
}
