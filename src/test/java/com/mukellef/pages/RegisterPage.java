package com.mukellef.pages;

import java.sql.*;
import java.io.Console;

import com.github.javafaker.Faker;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.Callable;


public class RegisterPage extends BasePage {




    public RegisterPage(){
        PageFactory.initElements(Driver.get(),this);
    }



    @FindBy (xpath = "(search)[1]")
    public WebElement RegisterSelectLanguage;

    @FindBy(css = "input[name= 'name']")
    public WebElement RegisterName;

    @FindBy(css = "input[name='surname']")
    public WebElement RegisterSurname;

    @FindBy(css ="input[name='email']")
    public WebElement RegisterEmail;

    @FindBy(css = "input[name='password1']")
    public WebElement RegisterPassword1;

    @FindBy(css="input[name='password2']")
    public WebElement RegisterPassword2;

  //  @FindBy (xpath = "(//input[@class= 'form-control'])[3]")
  //  public WebElement RegisterSelectCountry2;

  // @FindBy(xpath = "((//div[@class='clearfix'])/ul/li)[1]")
  // public  WebElement RegisterSelectFlagTR;


   // @FindBy(css ="#span[='recaptcha-anchor-label']")
   // @FindBy (xpath = "recaptcha-anchor")
   // @FindBy(css = "span[='polite']")
   // @FindBy(xpath = "div/div[@class='recaptcha-checkbox-checkmark']")
   // @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
   // public WebElement RegisterRecaptcha;

    //@FindBy (css = "#mt-3 submit")
    //@FindBy(xpath = "//*[@id=\"middle-wizard\"]/div[2]/button")
    @FindBy(css = "button[name='process']")
    public WebElement RegisterSingUp;

    @FindBy(css = "dropdown-menu")
    public WebElement dropdownMenu;

    @FindBy(css = "referrer")
    public WebElement RegisterDetayVerebilirmisiniz;

    @FindBy(css = "hs-eu-confirmation-button")
    public WebElement KabulEdiyorum;

    public void register(){

    }

    public void TestRegister(String Test_User_Name,String Test_User_Surname,String Test_Register_Mail,String user_password,String user_password2 ){
        Faker fake = new Faker();
        String RegisterName1 = fake.name().firstName();
        String RegisterSurname1=fake.name().lastName();
        String RegisterEmail1 = fake.internet().emailAddress();

     //  BrowserUtils.waitFor(1);
        RegisterName.sendKeys(RegisterName1);
        RegisterSurname.sendKeys(RegisterSurname1);
        RegisterEmail.sendKeys(RegisterEmail1);
        BrowserUtils.waitFor(1);
        RegisterPassword1.sendKeys(user_password);
        RegisterPassword2.sendKeys(user_password2);
        //BrowserUtils.waitFor(1);




    }



    public void TestDropDown(){


         JavascriptExecutor js =(JavascriptExecutor)Driver.get();
         JavascriptExecutor jsCountry =(JavascriptExecutor)Driver.get();
         js.executeScript("window.selectCountry(1)");
        // BrowserUtils.waitFor(1);
         js.executeScript("window.selectChannel(10)");

        RegisterSingUp.click();


        //RegisterPage registerSingUp =new RegisterPage();
        //registerSingUp.KabulEdiyorum.click();
        //registerSingUp.RegisterSingUp.click();
        //RegisterSingUp.click();



    }

    public void singUp(){

       // RegisterPage registerSingUp =new RegisterPage();
         //   RegisterSingUp.sendKeys(Keys.ENTER);
         //   registerSingUp.RegisterSingUp.click();
       // RegisterSingUp.click();
        }
}
