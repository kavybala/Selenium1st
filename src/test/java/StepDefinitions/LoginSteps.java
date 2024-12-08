package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class LoginSteps {
    WebDriver driver;
    WebDriverWait wait;


    @Given("^User is on Login page$")
    public void UseronLoginpage() throws Throwable {
        // Set up the Firefox driver
        //WebDriverManager.firefox().setup();

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    /*@When("^User enters username and password$")
    public void usernameandpassword() throws Throwable {
        //Find the username and password fields
        WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/input"));

        //Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");

        //Click login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }*/
    @When("User enters {string} and {string}")
    public void EnteringUsernameAndPassword(String username, String password) {
        //Enter username from Feature file
        driver.findElement(By.id("username")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("password")).sendKeys(password);
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("Read the page Title and Confirmation message")
            public void readconfirmation() throws Throwable{
        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }

    @And("Close Browser act4")
    public void closebrowser() throws Throwable{
        //Close browser
        driver.quit();
    }
}
