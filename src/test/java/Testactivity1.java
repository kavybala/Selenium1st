import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IBeforeMethod;

public class Testactivity1 {


            // Set up Firefox driver
            //WebDriverManager.firefoxdriver().setup();
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();
            @BeforeClass
            public void beforeMethod(){
                System.out.println("Test");
            }
            @Test
            public void openBrowser() {
                driver.get("https://v1.training-support.net/");
                System.out.println("Title of the page is:" + driver.getTitle());
            }
                @Test
                public void testPageTitle() {
                    // Get the title of the page
                    String actualTitle = driver.getTitle();
                    // Assert the title is "Training Support"
                    Assert.assertEquals(actualTitle, "Training Support");
                }
                @Test
                        public void newTitle() {
                    // Find About Us link using id and click it
                    driver.findElement(By.id("about-link")).click();
                    // Print the title of the new page
                    System.out.println("About page title: " + driver.getTitle());
                }

            @AfterClass
                    public void closeBrowser() {
                // Close the browser
                driver.close();
            }
        }


