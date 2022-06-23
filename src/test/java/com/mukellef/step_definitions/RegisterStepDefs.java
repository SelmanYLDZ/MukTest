package com.mukellef.step_definitions;

import com.mukellef.pages.BasePage;
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

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;

public class RegisterStepDefs {

        @Given("I am on the Register Page")
        public void ı_am_on_the_Register_Page() {
            System.out.println("Opening the login Page");
            Driver.get().get(ConfigurationReader.get("urlRegister"));
            BrowserUtils.waitFor(2);
            Driver.get().manage().window().maximize();
        }
        @When("I Register with valid Credentials")
        public void ı_Register_with_valid_Credentials() throws InterruptedException {
            BrowserUtils.waitFor(1);

            String RegisterName =ConfigurationReader.get("Test_User_Name");
            String RegisterSurname =ConfigurationReader.get("Test_User_Surname");
            String RegisterMail=ConfigurationReader.get("Test_Register_Mail");
            String RegisterPassword1=ConfigurationReader.get("user_password");
            String RegisterPassword2=ConfigurationReader.get("user_password2");

            RegisterPage registerPage =new RegisterPage();
            registerPage.TestRegister(RegisterName,RegisterSurname,RegisterMail,RegisterPassword1,RegisterPassword2);
            BrowserUtils.waitFor(1);
            registerPage.TestDropDown();
            System.out.println("I register as a user");
        }
        @Then("Title should be Mükellef | Anasayfa | Uçtan Uca İşletme Yönetimi")
        public void title_should_be_Mükellef_Anasayfa_Uçtan_Uca_İşletme_Yönetimi() {
            BrowserUtils.waitFor(1);
            Assert.assertTrue(Driver.get().getTitle().contains("Mükellef | Kayıt | Şirketinizi Kurun, Yönetin ve Büyütün"));

        }
        @Given("enter valid MailVerificationCode")
        public void enter_valid_MailVerificationCode() {

        BrowserUtils.waitFor(2);
        String MailVerificationCode = ConfigurationReader.get("Test_Email_Password");
        BrowserUtils.waitFor(2);
        RegisterPage registerPage = new RegisterPage() ;
        registerPage.MailVerificationPassword(MailVerificationCode);
        BrowserUtils.waitFor(3);

    }

    @Given("I should be able to click {string} button")
    public void ı_should_be_able_to_click_button(String string) {
        RegisterPage registerPage = new RegisterPage() ;
        registerPage.CloseVerificationWindow();

    }

    @Given("Title should be {string}")
    public void title_should_be(String string) {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(Driver.get().getTitle().contains("Mükellef"));
        System.out.println("Kullanıcı Register ekranında yönergelere uygun şekilde step1'e geçmiştir");
    }
    @Given("the user should be able to complete all the steps step by step")
    public void the_user_should_be_able_to_complete_all_the_steps_step_by_step() {
        String RegisterStep1TRTelNum=ConfigurationReader.get("Test_User_TelNoTR");
        String RegisterStep1BirthDay=ConfigurationReader.get("Test_User_BirthDay");
        BrowserUtils.waitFor(2);

        RegisterPage registerPage = new RegisterPage();
        registerPage.tcKimlikOlustur();
        registerPage.PanelStep0();
        BrowserUtils.waitFor(2);
        registerPage.PanelStep1(RegisterStep1TRTelNum, RegisterStep1BirthDay);


                }
            }






