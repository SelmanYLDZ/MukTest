package com.mukellef.step_definitions;

import com.mukellef.pages.ConsolePage;
import com.mukellef.pages.RegisterPage;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.ConfigurationReader;
import com.mukellef.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterStepDefs {

        // @Given("I am on the TempMail page")
        //public void ı_am_on_the_TempMail_page() {

        // Driver.getDriver().get(ConfigurationReader.get("urlTempMail"));
        // Driver.getDriver().manage().window().maximize();
        // BrowserUtils.wait(6);
        // Driver.getDriver().navigate().refresh();
        // BrowserUtils.wait(10);
        // System.out.println("Opening the TempMail Page");

        //}

        //@Given("I Delete actual mail and get ActualMail")
        //public void ı_Delete_actual_mail_and_get_ActualMail() {

        //  TempMailPage TempDelete = new TempMailPage();
        //  BrowserUtils.wait(3);
        //  TempDelete.TempMailDeleteMethod();
        //  System.out.println("Delete current mail");

        // TempMailPage tempMailPage =new TempMailPage();
        // tempMailPage.TempMailGetTextMethod();
        // System.out.println("ActualMail = " + tempMailPage.TempMailText);
        // Driver.getDriver().quit();
        // System.out.println("Copy Actual Mail");
        // }


        @Given("I am on the Register Page")
        public void ı_am_on_the_Register_Page() {
            System.out.println("Opening the login Page");
            Driver.get().get(ConfigurationReader.get("urlRegister"));
            BrowserUtils.waitFor(5);
           // Driver.getDriver().navigate().refresh();
           // Driver.getDriver().manage().window().maximize();


        }

        @When("I Register with valid Credentials")
        public void ı_Register_with_valid_Credentials() {
            String RegisterName =ConfigurationReader.get("Test_User_Name");
            String RegisterSurname =ConfigurationReader.get("Test_User_Surname");
            String RegisterMail=ConfigurationReader.get("Test_Register_Mail");
            String RegisterPassword1=ConfigurationReader.get("user_password");
            String RegisterPassword2=ConfigurationReader.get("user_password2");

            RegisterPage registerPage =new RegisterPage();
            registerPage.TestRegister(RegisterName,RegisterSurname,RegisterMail,RegisterPassword1,RegisterPassword2);
            BrowserUtils.waitFor(1);
            System.out.println("I register as a user");



            RegisterPage testDropDown = new RegisterPage();
            testDropDown.TestdropDown();
            System.out.println("Verifying PanelPage");





        }

        @Then("Title should be Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi")
        public void title_should_be_Mükellef_Anasayfa_Uçtan_Uca_İşletme_Yönetimi() {


            BrowserUtils.waitFor(3);
            Assert.assertTrue(Driver.get().getTitle().contains("Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi"));
            Driver.get().quit();

        }


    }

