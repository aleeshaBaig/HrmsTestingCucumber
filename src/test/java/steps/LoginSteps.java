package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @Given("user is navigated to hrms application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLauchApplication();
    }

    @When("user enters valid admin username and password")
    public void userEntersValidAdminUsernameAndPassword() {
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys(ConfigReader.getPropertyValue("username"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
    }

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("Test passed");
    }

    @When("user enters different {string} and {string} and verify the {string} for all the combination")
    public void user_enters_different_and_and_verify_the_for_all_the_combination(String username, String password, String error) {
        WebElement usernamelo = driver.findElement(By.id("txtUsername"));
        usernamelo.sendKeys(username);
        WebElement passwordlo = driver.findElement(By.id("txtPassword"));
        passwordlo.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String expError =errorMsg.getText();
        Assert.assertEquals("Values do not match",error,expError);
     }

}
