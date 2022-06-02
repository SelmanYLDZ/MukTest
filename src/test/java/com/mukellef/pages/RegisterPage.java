package com.mukellef.pages;

import com.github.javafaker.Faker;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RegisterPage extends BasePage {

    public RegisterPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(css ="a[href='javascript:void(0);']" )
    public WebElement KabulEdiyorumButton;

    @FindBy(css = "div[class='initial-message-avatar justify-center']")
    public WebElement RegisterStep1ChatBoxClose;

    @FindBy(css = "div[class='initial-message-bubble']")
    public WebElement RegisterMessageBubbleClose;

    @FindBy(xpath = "//button[@class='InitialMessageBubble__CloseButton-xmykpb-2 fwZvJD']")
    public WebElement RegisterBubbleClose;

    @FindBy(xpath = "//span[@class='p-top-5 display-flex p-left-6 launcher-right-align']")
    public WebElement RegisterBubbleMessageBoxClose;

    @FindBy(xpath = "//*[name()='use']")
    public WebElement RegisterBubbleClose1;

    @FindBy(xpath ="//p[@class='initial-message-text m-top-1 m-bottom-0']" )
    public WebElement RegisterBubbleClose2;

    @FindBy(xpath ="(//div[@class='VizExIcon__IconWrapper-sc-10fovfo-0 bAjuTE'])" )
    public WebElement RegisterBubbleClose3;
    @FindBy(xpath ="//div[@id='hubspot-messages-iframe-container']" )
    public WebElement RegisterBubbleClose4;






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

    @FindBy(xpath = "//div[@class='d-flex justify-content-between']")
    public WebElement BireyselİşletmeButton;

    @FindBy(xpath = "(//div[@class='row box-border'])[1]")
    public WebElement BireyselSerbestMeslekButton;

    @FindBy(xpath = "(//div[@class='row box-border'])[2]")
    public WebElement KurumsalLimitedButton;

    @FindBy(xpath = "(//div[@class='row box-border'])[3]")
    public WebElement KurumsalAnonimŞirketiButton;

    @FindBy(css = "button[class='forward w-100 h-100']")
    public WebElement Panel1DevamEt;

    @FindBy(xpath = "reservation")
    public WebElement Panel1RandevuPlanlayin;

    @FindBy(css = "input[name='id_identifier_number']")
    public WebElement PanelStep1TCKN;
    @FindBy(css = "input[name='telephone']")
    public WebElement RegisterStep1TRTelNum;
    @FindBy(css ="input[name='date']" )
    public WebElement RegisterStep1BirthDay;
    @FindBy(xpath = "(//button[@id='mobileVerifiedModalClose'])[2]")
    public WebElement BirtDayModalClose;

    @FindBy(css = "input[name='neighborhood']")
    public WebElement RegisterStep1Neighborhood;
    @FindBy(css = "input[name='street']")
    public WebElement RegisterStep1Street;
    @FindBy(css = "input[name='buildingNo']")
    public WebElement RegisterStep1Building_No;
    @FindBy(css = "input[name='flat_number']")
    public WebElement RegisterStep1FlatNo;

    @FindBy (css = "input[='date']")
    public WebElement Step1DogumTarihiCalendar;

    @FindBy(xpath = (("//tr[@class='mx-date-row'][1]/td/div[1]")))
    public WebElement Step1DogumBilgileriGunSecimi;

    @FindBy(xpath = ("//button[@class='mx-btn mx-btn-text mx-btn-current-year']"))
    public WebElement MevcutYılStep1;

    @FindBy(xpath = "//div/button[@class='mx-btn mx-btn-text mx-btn-icon-double-left']")
    public WebElement TakvimdeOnYılGeriStep1;

    @FindBy(xpath = "(//div/table[@class='mx-table mx-table-year'])[1]/tr/td[1]")
    public WebElement YılSeçimStep1;

    @FindBy(xpath = "//span/button[@class='mx-btn mx-btn-text mx-btn-current-month']")
    public WebElement MevcutAyStep1;
    @FindBy(xpath = "((//div/table[@class='mx-table mx-table-month'])/tr[1])/td[3]") //tr[1](ocak,şubat mart)
    public WebElement DoğumTarihiAySeçimi;                                             //td[3](mart)





    @FindBy(xpath = "//span[@class='p-top-5 display-flex p-left-6 launcher-right-align']")
    public WebElement ChatClose;




    public void register(){
    }

    Faker fake = new Faker();
    String RegisterName1 = fake.name().firstName();
    String RegisterSurname1=fake.name().lastName();
    String RegisterEmail1 = fake.internet().emailAddress();
    String RegisterTCKN = fake.phoneNumber().phoneNumber();
    String RegisterNeighborhood=fake.dragonBall().character();
    String RegisterCityStreet=fake.address().streetAddress();
    String RegisterCityBuildingNumber =fake.address().buildingNumber();
    String RegisterCityDoorNumber = fake.address().streetAddressNumber();

    public void TestRegister(String Test_User_Name,String Test_User_Surname,String Test_Register_Mail,String user_password,String user_password2 ){

        RegisterName.sendKeys(RegisterName1);
        RegisterSurname.sendKeys(RegisterSurname1);
        RegisterEmail.sendKeys(RegisterEmail1);
        BrowserUtils.waitFor(1);
        RegisterPassword1.sendKeys(user_password);
        RegisterPassword2.sendKeys(user_password2);
        KabulEdiyorumButton.click();

    }
    public void TestDropDown(){

         JavascriptExecutor js =(JavascriptExecutor)Driver.get();
         JavascriptExecutor jsCountry =(JavascriptExecutor)Driver.get();
         js.executeScript("window.selectCountry(1)");
         js.executeScript("window.selectChannel(10)");
         //KabulEdiyorumButton.click();
         RegisterSingUp.click();
    }
    public void MailVerificationPassword(String Test_Email_Password){
        BrowserUtils.waitFor(1);
        MailVerificationCode.sendKeys(Test_Email_Password);
        BrowserUtils.waitFor(1);
    }


    public void CloseVerificationWindow(){
     //   List<WebElement> elements = Driver.get().findElements(By.tagName("iframe"));
     //   int numberOfTags = elements.size();
     //   System.out.println("iframe on this wep pages are:" + numberOfTags);
     //    Driver.get().switchTo().frame("1");

        //System.out.println("Frame source" + Driver.get().getPageSource());
     //   Driver.get().switchTo().defaultContent();

        KabulEdiyorumButton.click();
         //BrowserUtils.waitFor(3);
         // RegisterBubbleClose4.click();
         // RegisterBubbleClose3.click();
          BrowserUtils.waitFor(1);
         // RegisterBubbleClose2.click();
         // Driver.get().findElement(By.cssSelector("[*|href='http://www.w3.org/1999/xlink']")).click();
         // RegisterBubbleClose1.click();
         // RegisterBubbleMessageBoxClose.click();
         // RegisterBubbleClose.click();
         // RegisterMessageBubbleClose.click();
         // RegisterStep1ChatBoxClose.click();
         // ChatClose.click();
         ConfirmMyEmailAddress.click();
         BrowserUtils.waitFor(1);
         EmailVerificationModelClose1.click();
         BrowserUtils.waitFor(1);
         HemenKurulumaBaşlaButton.click();
                }
        public void PanelStep0(){
        BrowserUtils.waitFor(3);
        BireyselİşletmeButton.click();
        BrowserUtils.waitFor(3);
       // RegisterBubbleClose4.click();
       // BrowserUtils.waitFor(1);
        //    WebDriverWait wait = new WebDriverWait(Driver.get(),20);
        //    wait.until(ExpectedConditions.elementToBeClickable(Panel1DevamEt));
        //    JavascriptExecutor executor =(JavascriptExecutor)Driver.get();
        //    executor.executeScript("argument[0].click()",Panel1DevamEt);
            Panel1DevamEt.click();
                }

        public void PanelStep1(String Test_User_TelNoTR,String Test_User_BirtDay){
        BrowserUtils.waitFor(1);
      //  RegisterStep1ChatBoxClose.click();
        PanelStep1TCKN.sendKeys(RegisterTCKN);
        RegisterStep1TRTelNum.sendKeys(Test_User_TelNoTR);
        RegisterStep1BirthDay.sendKeys(Test_User_BirtDay);

            RegisterStep1Neighborhood.sendKeys(RegisterNeighborhood);
            BrowserUtils.waitFor(1);
            BirtDayModalClose.click();
            BrowserUtils.waitFor(1);
            RegisterStep1Street.sendKeys(RegisterCityStreet);
            JavascriptExecutor jsAddress =(JavascriptExecutor)Driver.get();
            jsAddress.executeScript("window.selectCity(1)");
            jsAddress.executeScript("window.selectDistrict(1)");
            BrowserUtils.waitFor(3);
           // RegisterBubbleClose4.click();

            RegisterStep1Building_No.sendKeys(RegisterCityBuildingNumber);
            RegisterStep1FlatNo.sendKeys(RegisterCityDoorNumber);

         //   Step1DogumTarihiCalendar.click();
         //   YılSeçimStep1.click();
         //   DoğumTarihiAySeçimi.click();
         //   Step1DogumBilgileriGunSecimi.click();
            //JavascriptExecutor js =(JavascriptExecutor)Driver.get();


            Panel1DevamEt.click();



        }

    public void TestDropDownStep1(){
        JavascriptExecutor js =(JavascriptExecutor)Driver.get();
        JavascriptExecutor jsAddress =(JavascriptExecutor)Driver.get();
        jsAddress.executeScript("window.selectCity(1)");
        jsAddress.executeScript("window.selectDistrict(3)");
        RegisterSingUp.click();
    }



}
