package com.navfort.step_definitions;

import com.navfort.pages.DashboardPage;
import com.navfort.pages.LoginPage;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.navfort.utilities.BrowserUtils.waitForPresenceOfElement;

public class LoginPageStep_definitions  {

    LoginPage lgn = new LoginPage();
    DashboardPage dashboard = new DashboardPage();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nav.url"));

    }
    @When("The user enter driver username")
    public void the_user_enter_driver_username() {
        lgn.inputUsername.sendKeys(ConfigurationReader.getProperty("nav.driver.username"));


    }
    @When("The user enter driver password")
    public void the_user_enter_driver_password() {
        lgn.inputPassword.sendKeys(ConfigurationReader.getProperty("nav.password"));

    }
    @When("The user click on the LOG IN button")
    public void the_user_click_on_the_log_in_button() {
        lgn.loginBtn.click();
    }
    @Then("The user is on the Quick Launchpad page")
    public void the_user_is_on_the_quick_launchpad_page() {
        String expected= "Quick Launchpad";
        waitForPresenceOfElement(By.xpath("//h1[@class='oro-subtitle']"),25);
        String actual= dashboard.quickLaunchpad.getAttribute("textContent");

        Assert.assertEquals("Quick Lounchpad verification Failed",expected,actual);

    }

    @When("The user enter sales manager username")
    public void the_user_enter_sales_manager_username() {
        lgn.inputUsername.sendKeys(ConfigurationReader.getProperty("nav.sales.manager.username"));

    }
    @When("The user enter sales manager password")
    public void the_user_enter_sales_manager_password() {
        lgn.inputPassword.sendKeys(ConfigurationReader.getProperty("nav.password"));

    }
    @Then("The user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        String expectedD= "Dashboard";
        waitForPresenceOfElement(By.xpath("//h1[@class='oro-subtitle']"),25);
        String actualD= dashboard.dashboard.getAttribute("textContent").trim();

        Assert.assertEquals("Dashboard verification failed",expectedD,actualD);

    }

    @When("The user enter store manager username")
    public void the_user_enter_store_manager_username() {
        lgn.inputUsername.sendKeys(ConfigurationReader.getProperty("nav.store.manager.username"));
    }
    @When("The user enter store manager password")
    public void the_user_enter_store_manager_password() {
        lgn.inputPassword.sendKeys(ConfigurationReader.getProperty("nav.password"));
    }

    @When("The user enter invalid username")
    public void the_user_enter_invalid_username() {
        lgn.inputUsername.sendKeys("abc");
    }
    @When("The user enter invalid password")
    public void the_user_enter_invalid_password() {
        lgn.inputPassword.sendKeys("123");
    }
    @Then("The user is should see Invalid username or password.")
    public void the_user_is_should_see_invalid_username_or_password() {
        String expectedM="Invalid user name or password.";
       // waitForPresenceOfElement(By.xpath("//h1[@class='oro-subtitle']"),25);
        String actualM= lgn.invalidM.getText();

        Assert.assertEquals("İnvalid verification failed",expectedM,actualM);

    }

    @When("The user enter valid password")
    public void the_user_enter_valid_password() {
        lgn.inputPassword.sendKeys(ConfigurationReader.getProperty("nav.password"));
    }

    @When("The user enter valid username")
    public void the_user_enter_valid_username() {
        lgn.inputUsername.sendKeys(ConfigurationReader.getProperty("nav.driver.username"));
    }

    @When("The user do not enter username")
    public void the_user_do_not_enter_username() {
        lgn.inputUsername.sendKeys("");
    }
    @When("The user do not enter password")
    public void the_user_do_not_enter_password() {
        lgn.inputPassword.sendKeys("");
    }
    @Then("The user is should see pop up coming from username field Please fill out this field.")
    public void the_user_is_should_see_pop_up_coming_from_username_field_please_fill_out_this_field() {
        String expectedR = "Lütfen bu alanı doldurun.";
       // waitForPresenceOfElement(By.xpath("//h1[@class='oro-subtitle']"),25);
         String actualR = lgn.inputUsername.getAttribute("validationMessage");
        Assert.assertEquals("Required verification failed",expectedR,actualR);



    }

    @Then("The user is should see pop up coming from password field Please fill out this field.")
    public void the_user_is_should_see_pop_up_coming_from_password_field_please_fill_out_this_field() {
        String expectedR = "Lütfen bu alanı doldurun.";
       // waitForPresenceOfElement(By.xpath("//h1[@class='oro-subtitle']"),25);
        String actualR = lgn.inputPassword.getAttribute("validationMessage");
        Assert.assertEquals("Required verification failed",expectedR,actualR);
    }




    @Then("the username on the login page should match the username top right corner on the home page")
    public void the_username_on_the_login_page_should_match_the_username_top_right_corner_on_the_home_page() {
        String expectedU=ConfigurationReader.getProperty("nav.driver.username");
        waitForPresenceOfElement(By.xpath("//h1[@class='oro-subtitle']"),25);
        String actualU=dashboard.username.getAttribute("textContent").trim();
        Assert.assertEquals("Username verification failed",expectedU,actualU);
        System.out.println("dashboard.username.getText() = " + dashboard.username.getText());
    }






}
