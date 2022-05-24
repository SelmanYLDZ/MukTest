package com.mukellef.pages;

import com.github.javafaker.Faker;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(css = "button[name='process']")
    public WebElement RegisterSingUp;

    @FindBy(css = "hs-eu-confirmation-button")
    public WebElement KabulEdiyorum;

    @FindBy(xpath = "//*[@id=\"email-verify-modal\"]/div/div/div[2]/form/div[1]/div[1]/input" )
    public WebElement MailVerificationCode;

    @FindBy(xpath = "//button[@class='btn btn-primary'][1]")
    public WebElement ConfirmMyEmailAddress;

    @FindBy(xpath = "//button[@id='emailVerifiedModalClose']")
    public WebElement EmailVerificationModelClose1;

    @FindBy(xpath = "(//a[@class='btn-mukellef'])[1]")
    public WebElement HemenKurulumaBaşlaButton;

    @FindBy(xpath = "//button[@class='mukellef-secondary-btn panel-button']")
    public WebElement PaneleDönButton;

    @FindBy(css = "howToChoose")
    public WebElement VideoyuİzleButton;

    @FindBy(css = "row box-border selected")
    public WebElement BireyselİşletmeButton;

    @FindBy(xpath = "(//div[@class='row box-border'])[1]")
    public WebElement BireyselSerbestMeslekButton;

    @FindBy(xpath = "(//div[@class='row box-border'])[2]")
    public WebElement KurumsalLimitedButton;

    @FindBy(xpath = "(//div[@class='row box-border'])[3]")
    public WebElement KurumsalAnonimŞirketiButton;

    @FindBy(css = "forward")
    public WebElement Panel1DevamEt;

    @FindBy(css = "reservation")
    public WebElement Panel1RandevuPlanlayin;

    public void register(){
    }
    Faker fake = new Faker();
    String RegisterName1 = fake.name().firstName();
    String RegisterSurname1=fake.name().lastName();
    String RegisterEmail1 = fake.internet().emailAddress();
    public void TestRegister(String Test_User_Name,String Test_User_Surname,String Test_Register_Mail,String user_password,String user_password2 ){

        RegisterName.sendKeys(RegisterName1);
        RegisterSurname.sendKeys(RegisterSurname1);
        RegisterEmail.sendKeys(RegisterEmail1);
        BrowserUtils.waitFor(1);
        RegisterPassword1.sendKeys(user_password);
        RegisterPassword2.sendKeys(user_password2);
    }
    public void TestDropDown(){
         JavascriptExecutor js =(JavascriptExecutor)Driver.get();
         JavascriptExecutor jsCountry =(JavascriptExecutor)Driver.get();
         js.executeScript("window.selectCountry(1)");
         js.executeScript("window.selectChannel(10)");
         RegisterSingUp.click();
    }
    public void MailVerificationPassword(String Test_Email_Password){
        MailVerificationCode.sendKeys(Test_Email_Password);
        BrowserUtils.waitFor(1);
    }
    public void CloseVerificationWindow(){
         ConfirmMyEmailAddress.click();
         BrowserUtils.waitFor(1);
         EmailVerificationModelClose1.click();
         BrowserUtils.waitFor(1);
         HemenKurulumaBaşlaButton.click();
                }

                public void PanelStep0(){
        BrowserUtils.waitFor(1);
        BireyselİşletmeButton.click();
        Panel1DevamEt.click();
                }






}
