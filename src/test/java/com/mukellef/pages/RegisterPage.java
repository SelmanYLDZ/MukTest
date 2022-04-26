package com.mukellef.pages;


import java.io.Console;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    @FindBy (xpath = "(//input[@class= 'form-control'])[3]")
    public WebElement RegisterSelectCountry2;

   @FindBy(xpath = "((//div[@class='clearfix'])/ul/li)[1]")
   public  WebElement RegisterSelectFlagTR;

    // @FindBy(xpath = "//input[@type='search']")
    // public WebElement SelecktCountryDeneme;
    //"((//div[@class='clearfix'])/ul/li)[1]"
    //(//div[@class='clearfix'])/ul/li/a[text()='Türkiye']"


   // @FindBy (xpath = "(search)[2]")
   // public WebElement RegisterSelectCountry;
    //---> Dropdown Gizli İsmet'le konuşulacak

    @FindBy (css = "recaptcha-checkbox-border")
    public WebElement RegisterRecaptcha;

    @FindBy (css = "process")
    public WebElement RegisterSingUp;

    @FindBy(css = "dropdown-menu")
    public WebElement dropdownMenu;



    public void register(){

    }

    public void TestRegister(String Test_User_Name,String Test_User_Surname,String Test_Register_Mail,String user_password,String user_password2 ){
        BrowserUtils.waitFor(3);
        RegisterName.sendKeys(Test_User_Name);
        RegisterSurname.sendKeys(Test_User_Surname);
        RegisterEmail.sendKeys(Test_Register_Mail);
        BrowserUtils.waitFor(1);
        RegisterPassword1.sendKeys(user_password);
        RegisterPassword2.sendKeys(user_password2);
        BrowserUtils.waitFor(2);
        RegisterSelectCountry2.click();
        System.out.println("Click");





    }

    public void TestdropDown(){

        RegisterRecaptcha.click();
        BrowserUtils.waitFor(2);
        RegisterSingUp.click();
    }



}
