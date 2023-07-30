package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps  extends CommonMethods {

    @When("user  clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pim = driver.findElement(By.xpath("//b[normalize-space()='PIM']"));
        pim.click();
    }
    @When("user clicks on Add employee button")
    public void user_clicks_on_add_employee_button() {

        WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
        addEmp.click();
    }
    @When("user enters firstname and second name")
    public void user_enters_firstname_and_second_name() {
        WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstname.sendKeys("Gul");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastname.sendKeys("Naz");

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveButton = driver.findElement(By.xpath("//input[@id='btnSave']"));
        saveButton.click();
    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee is added");
    }
    @Then("user close the browser")
    public void user_close_the_browser() {
         driver.quit();
    }
    @When("user enters  {string}, {string}, and {string}")
    public void user_enters_and(String firstname, String middlename, String lastname) {
        WebElement firstnameloc = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstnameloc.sendKeys(firstname);
        WebElement middlenameloc = driver.findElement(By.xpath("//input[@id='middleName']"));
        middlenameloc.sendKeys(middlename);
        WebElement lastnameloc = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastnameloc.sendKeys(lastname);
    }
    @When("user add multiple employees and verify they are added")
    public void user_add_multiple_employees_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> employeeNames = dataTable.asMaps();
       for (Map<String, String> emp : employeeNames){
     String firstNameValue = emp.get("firstname");
     String middleNameValue = emp.get("middlename");
     String lastNameValue = emp.get("lastname");
     WebElement firstnameloc = driver.findElement(By.xpath("//input[@id='firstName']"));
     firstnameloc.sendKeys(firstNameValue);
     WebElement middlenameloc = driver.findElement(By.xpath("//input[@id='middleName']"));
     middlenameloc.sendKeys(middleNameValue);
     WebElement lastnameloc = driver.findElement(By.xpath("//input[@id='lastName']"));
     lastnameloc.sendKeys(lastNameValue);
     WebElement saveButton = driver.findElement(By.xpath("//input[@id='btnSave']"));
     saveButton.click();
     Thread.sleep(5000);
     WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
     addEmp.click();
     Thread.sleep(3000);

 }
    }
}
