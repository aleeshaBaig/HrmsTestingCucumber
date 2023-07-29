package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeSearchSteps  extends CommonMethods {
    @When("user navigates to employee list page")
    public void user_navigates_to_employee_list_page() {
    WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
    pim.click();
    WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
    employeeList.click();
    }
    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {
        WebElement empId = driver.findElement(By.id("empsearch_id"));
        empId.sendKeys("5655");
    }
    @When("user click on search button")
    public void user_click_on_search_button() {
         WebElement searchButton = driver.findElement(By.id("searchBtn"));
         searchButton.click();
    }
    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("Your search results are here !");
    }

    @When("user enter valid employee name")
    public void userEnterValidEmployeeName() {
        WebElement empName = driver.findElement(By.id("empsearch_employee_name_empName"));
        empName.clear();
        empName.sendKeys("Asli D");
    }

    @Then("browser close")
    public void browserClose() {
        driver.quit();
    }
}
