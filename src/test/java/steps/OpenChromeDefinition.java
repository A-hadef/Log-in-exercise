package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDefinition {

    private WebDriver chromeDriver;

    //Open the link in Chrome
    public OpenChromeDefinition() {
        System.setProperty("webdriver.chrome.driver", "D://.selenium_driver//chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://login.dev.qa-experience.com");
    }

    // find the log in details elements
    public void checkelements() {
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/div[1]/input"));
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/div[2]/input"));

    }

    //Check the log in details are on the page and set the values
    public void login() {
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/div[1]/input")).sendKeys("test@qa-experience.com");
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/div[2]/input")).sendKeys("Password1");
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/button")).click();
    }

    // setting up the incorrect user name
    public void incorretusername() {
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/div[1]/input")).sendKeys("test@qa-experience.com ");
    }

    // setting up the incorrect password
    public void incorrectpassword() {
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/div[2]/input")).sendKeys("XYZ");
    }
//user name error message
    public void errormessage() {
        chromeDriver.findElement(By.xpath("/html/body/app-root/div/app-login/form/div[1]/div"));
    }
//incorrect password error message
    public void wrongpassword() {
        chromeDriver.findElement(By.xpath(""));
    }

    public void successfullogin() {
        chromeDriver.findElement(By.xpath(""));
    }

    @Given("I am on the landing page")
    public void iAmOnTheLandingPage() {
        checkelements();
    }

    @And("I enter my correct credentials")
    public void iEnterMyCorrectCredentials() {
        login();
    }

    @Then("I should be able to see successful log in message")
    public void iShouldBeAbleToSeeSuccessfulLogInMessage() {
        successfullogin();
    }

    @And("I enter my incorrect username")
    public void iEnterMyIncorrectUsername() {
        incorretusername();
    }

    @Then("I should be able to see error message")
    public void iShouldBeAbleToSeeErrorMessage() {
        errormessage();
    }

    @And("I enter my incorrect password")
    public void iEnterMyIncorrectPassword() {
        incorrectpassword();
    }

    @Then("I should be able to see unsuccessful log in message")
    public void iShouldBeAbleToSeeUnsuccessfulLogInMessage() {
        wrongpassword();
    }
}
