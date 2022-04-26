package com.mukellef.step_definitions;

import com.mukellef.pages.LandingPage;
import com.mukellef.pages.LoginPage;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.ConfigurationReader;
import com.mukellef.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class LoginStepDefs {




    @Given("I am on the Login page")
    public void ı_am_on_the_Login_page() {

        System.out.println("Opening the login Page");
        Driver.get().get(ConfigurationReader.get("urlPanel"));
        BrowserUtils.waitFor(2);
       // Driver.getDriver().navigate().refresh();
       // Driver.getDriver().manage().window().maximize();


    }

    @When("I login as a user")
    public void ı_login_as_a_user() {
        System.out.println("Login in as a user");
        String UserName= ConfigurationReader.get("user_name");
        String password = ConfigurationReader.get("user_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(UserName,password);
    }

    @Then("I should be able to see the PanelPage")
    public void ı_should_be_able_to_see_the_PanelPage() {

        System.out.println("Verifying PanelPage");
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains("Anasayfa"));
        Driver.get().close();
    }



}
