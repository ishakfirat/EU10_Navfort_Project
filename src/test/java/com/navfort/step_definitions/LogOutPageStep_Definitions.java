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

public class LogOutPageStep_Definitions {
     LoginPage lgn = new LoginPage();
     DashboardPage dashboard = new DashboardPage();

    @Given("Driver on the home page")
    public void driver_on_the_home_page() {
        lgn.login(ConfigurationReader.getProperty("nav.driver.username"),ConfigurationReader.getProperty("nav.password"));

    }
    @When("User go to profile menu and click the down arrow icon")
    public void driver_go_to_profile_menu_and_click_the_down_arrow_icon() {
        dashboard.profileArrow.click();

    }
    @When("User sees Logout button and click it")
    public void driver_sees_logout_button_and_click_it() {
        dashboard.logoutBtn.click();

    }
    @Then("User should see login page")
    public void driver_should_see_login_page() {
        String expectedHeader="Login";
        waitForPresenceOfElement(By.xpath("//div[@class='title-box']/h2"),25);
        String actualHeader= lgn.loginPageHeader.getText();

        Assert.assertEquals("Logout functionality failed!!!",expectedHeader,actualHeader);

    }

    @Given("Sales manager on the home page")
    public void sales_manager_on_the_home_page() {
        lgn.login(ConfigurationReader.getProperty("nav.sales.manager.username"),ConfigurationReader.getProperty("nav.password"));
    }

    @Given("Store manager on the home page")
    public void store_manager_on_the_home_page() {
        lgn.login(ConfigurationReader.getProperty("nav.store.manager.username"),ConfigurationReader.getProperty("nav.password"));
    }

    @When("User click the step back arrow")
    public void user_click_the_step_back_arrow() {
        Driver.getDriver().navigate().back();

    }
    @Then("User should not go back homa page again")
    public void user_should_not_go_back_homa_page_again() {
        String expectedUrl="https://qa.navfort.com/user/login";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("Home page verification failed!!!",expectedUrl,actualUrl);
    }






}
