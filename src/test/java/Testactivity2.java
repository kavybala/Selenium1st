import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testactivity2 {
    WebDriver driver = new FirefoxDriver();

        @BeforeClass
               void beforeClass() {

            driver.get("https://v1.training-support.net/selenium/target-practice");
        }
            @Test
            void testOne() {
                System.out.println("Title of the page is:" + driver.getTitle());
            }
            @Test
            public void testBlackButton() {
                // Attempt to find the black button and assert incorrect condition
                String blackButtonText = driver.findElement(By.id("blackButton")).getText();
                Assert.assertEquals(blackButtonText, "Green", "Incorrect assertion to trigger a test failure.");
            }

            @Test(enabled = false)
            public void testSkippedEnabled() {
                // This test is disabled and will not run or appear in results
                System.out.println("This test is disabled and will not appear.");
            }

            @Test
            public void testSkippedWithException() {
                // Skip this test programmatically
                throw new SkipException("Skipping this test case intentionally.");
            }
        @AfterClass
        void afterClass() {
                driver.quit();
            }

        }


