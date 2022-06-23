package com.mukellef.pages;

import com.github.javafaker.Faker;
import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RegisterPage extends BasePage {

    public RegisterPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = "a[href='javascript:void(0);']")
    public WebElement KabulEdiyorumButton;

    @FindBy(css = "div[class='initial-message-avatar justify-center']")
    public WebElement RegisterStep1ChatBoxClose;

    @FindBy(css = "div[class='initial-message-bubble']")
    public WebElement RegisterMessageBubbleClose;

    @FindBy(xpath = "//button[@class='InitialMessageBubble__CloseButton-xmykpb-2 fwZvJD']")
    public WebElement RegisterBubbleClose;

    @FindBy(xpath = "//span[@class='p-top-5 display-flex p-left-6 launcher-right-align']")
    public WebElement RegisterBubbleMessageBoxClose;

    @FindBy(css = "use[*|href='#cloae__a']")
    public WebElement RegisterBubbleClose1;

    @FindBy(xpath = "//p[@class='initial-message-text m-top-1 m-bottom-0']")
    public WebElement RegisterBubbleClose2;

    @FindBy(xpath = "(//div[@class='VizExIcon__IconWrapper-sc-10fovfo-0 bAjuTE'])")
    public WebElement RegisterBubbleClose3;
    @FindBy(xpath = "//div[@id='hubspot-messages-iframe-container']")
    public WebElement RegisterBubbleClose4;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/button/div[@class='VizExIcon__IconWrapper-sc-10fovfo-0 bAjuTE']")
    public WebElement RegisterBubbleClose5;
    @FindBy(xpath = "//div[@class='TwistFadeTransition__TransitionComponent-sc-19crmjc-0 bkabCS']")
    public WebElement RegisterBubbleClose6;
    @FindBy(xpath = "//button[@class='IconLauncher__BaseLauncher-sc-16pp531-0 IconLauncher__CircleLauncher-sc-16pp531-2 irXSZp reagan--widget-loaded undefined']")
    public WebElement RegisterBubbleClose7;

    @FindBy(css = "/*[@name()='path']")
    public WebElement RegisterBubbleClose8;
    @FindBy(xpath = "//*[name()='use' and @*[contains(.,'#close__a')]]")
    //@FindBy(xpath ="//*[name()='use' and @*='#close__a']")
    public WebElement RegisterBubbleClose9;
    @FindBy(xpath = "//button[@class='InitialMessageBubble__CloseButton-jyh7io-2 dPpHEo']")
    public WebElement RegisterBubbleClose10;

    @FindBy(xpath = "/*[name()='svg']/*[name()='path']")
    public WebElement RegisterBubbleClose11;


    @FindBy(xpath = "(search)[1]")
    public WebElement RegisterSelectLanguage;

    @FindBy(css = "input[name= 'name']")
    public WebElement RegisterName;

    @FindBy(css = "input[name='surname']")
    public WebElement RegisterSurname;

    @FindBy(css = "input[name='email']")
    public WebElement RegisterEmail;

    @FindBy(css = "input[name='password1']")
    public WebElement RegisterPassword1;

    @FindBy(css = "input[name='password2']")
    public WebElement RegisterPassword2;

    @FindBy(css = "button[name='process']")
    public WebElement RegisterSingUp;

    @FindBy(xpath = "//*[@id=\"email-verify-modal\"]/div/div/div[2]/form/div[1]/div[1]/input")
    public WebElement MailVerificationCode;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
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
    @FindBy(css = "input[name='date']")
    public WebElement RegisterStep1BirthDay;
    @FindBy(xpath = "(//button[@id='mobileVerifiedModalClose'])[2]")
    public WebElement BirtDayModalClose;

    @FindBy(xpath = "(//input[@class='form-control mytextwithicon'])[1]")
    public WebElement RegisterStep1Neighborhood;
    @FindBy(xpath = "(//input[@class='form-control mytextwithicon'])[2]")
    public WebElement RegisterStep1Street;
    @FindBy(xpath = "(//input[@class='form-control mytextwithicon'])[3]")
    public WebElement RegisterStep1Building_No;
    @FindBy(xpath = "(//input[@class='form-control mytextwithicon'])[4]")
    public WebElement RegisterStep1FlatNo;

    @FindBy(css = "input[='date']")
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


    public void register() {
    }

    public void tcKimlikOlustur() {
        Integer pool1 = new Double(Math.floor(Math.random() * 90000 + 10000)).intValue();
        String[] p1Chars = toStringArray(pool1);
        System.out.println("poo1 = " + pool1);
        Integer pool1Sum = arraySum(p1Chars);
        System.out.println("pool1Sum = " + pool1Sum);

        Integer pool2 = new Double(Math.floor(Math.random() * 9000 + 1000)).intValue();
        String[] p2Chars = toStringArray(pool2);

        System.out.println("poo1 = " + pool2);
        Integer pool2Sum = arraySum(p2Chars);
        System.out.println("pool2Sum = " + pool2Sum);

        int digit10 = calculateDigit10(pool1Sum, pool2Sum);

        int digit11 = calculateDigit11(pool1Sum, pool2Sum, digit10);

        String tckn = p1Chars[0] + p2Chars[0] + p1Chars[1] + p2Chars[1] + p1Chars[2] + p2Chars[2] + p1Chars[3] + p2Chars[3] + p1Chars[4] + digit10 + digit11;
        System.out.println("tckn = " + tckn);

        PanelStep1TCKN.sendKeys(tckn);
    }

    private String[] toStringArray(Integer integer) {
        String string = integer.toString();
        char[] chars = string.toCharArray();
        String[] strings = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            strings[i] = chars[i] + "";
        }

        return strings;
    }

    private int calculateDigit11(int pool1Sum, int pool2Sum, int digit10) {
        return (pool1Sum + pool2Sum + digit10) % 10;
    }

    private int calculateDigit10(Integer pool1Sum, Integer pool2Sum) {
        int i = pool1Sum * 7;
        int digit10 = (i - pool2Sum) % 10;
        return digit10;
    }

    private Integer arraySum(String[] arr) {
        Integer sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += new Integer(arr[i]);
        }

        return sum;
    }


    Faker fake = new Faker();
    String RegisterName1 = fake.name().firstName();
    String RegisterSurname1 = fake.name().lastName();
    String RegisterEmail1 = fake.internet().emailAddress();
   // String RegisterTCKN = fake.phoneNumber().phoneNumber();
    String RegisterNeighborhood = fake.dragonBall().character();
    String RegisterCityStreet = fake.address().streetAddress();
    String RegisterCityBuildingNumber = fake.address().buildingNumber();
    String RegisterCityDoorNumber = fake.address().buildingNumber();

    public void ClosePopUp() {

        Driver.get().switchTo().frame("__privateStripeMetricsController6730");
        Actions action = new Actions(Driver.get());
        action.moveToElement(Driver.get().findElement(By.xpath("//div[contains(@class,'InitialMessageBubble__CloseButton-jyh7io-2 dPpHEo')]"))).build().perform();
        Driver.get().findElement(By.xpath("//div[contains(@class,'VizExIcon__IconWrapper-sc-10fovfo-0 bAjuTE')]//use")).click();


    }


    public void TestRegister(String Test_User_Name, String Test_User_Surname, String Test_Register_Mail, String user_password, String user_password2) {


        RegisterName.sendKeys(RegisterName1);
        RegisterSurname.sendKeys(RegisterSurname1);
        RegisterEmail.sendKeys(RegisterEmail1);
        BrowserUtils.waitFor(1);
        RegisterPassword1.sendKeys(user_password);
        RegisterPassword2.sendKeys(user_password2);
        KabulEdiyorumButton.click();


    }

    public void TestDropDown() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        JavascriptExecutor jsCountry = (JavascriptExecutor) Driver.get();
        js.executeScript("window.selectCountry(1)");
        js.executeScript("window.selectChannel(10)");
        //KabulEdiyorumButton.click();
        RegisterSingUp.click();
    }

    public void MailVerificationPassword(String Test_Email_Password) {
        BrowserUtils.waitFor(1);
        MailVerificationCode.sendKeys(Test_Email_Password);
        BrowserUtils.waitFor(1);
    }


    public void CloseVerificationWindow() {

        // KabulEdiyorumButton.click();

        // JavascriptExecutor jsClose =(JavascriptExecutor)Driver.get();
        // jsClose.executeScript("window.hubspot_live_messages_running");
        // jsClose.executeScript("window.hubspot_live_messages_running.click()");
        BrowserUtils.waitFor(3);
        ConfirmMyEmailAddress.click();
        BrowserUtils.waitFor(1);
        EmailVerificationModelClose1.click();
        BrowserUtils.waitFor(1);
        HemenKurulumaBaşlaButton.click();
    }

    public void PanelStep0() {
        BrowserUtils.waitFor(1);

        BrowserUtils.waitFor(1);
        BireyselİşletmeButton.click();
        BrowserUtils.waitFor(2);

        BrowserUtils.waitFor(1);
        Panel1DevamEt.click();
    }

    public void PanelStep1(String Test_User_TelNoTR, String Test_User_BirtDay) {


        BrowserUtils.waitFor(1);

        //PanelStep1TCKN.sendKeys(RegisterTCKN);
        RegisterStep1TRTelNum.sendKeys(Test_User_TelNoTR);
        RegisterStep1BirthDay.sendKeys(Test_User_BirtDay);

        RegisterStep1Neighborhood.sendKeys(RegisterNeighborhood);
        BrowserUtils.waitFor(1);
        BirtDayModalClose.click();
        BrowserUtils.waitFor(1);
        JavascriptExecutor jsAddress = (JavascriptExecutor) Driver.get();
        jsAddress.executeScript("window.selectCity(1)");
        BrowserUtils.waitFor(1);
        jsAddress.executeScript("window.selectDistrict(1)");
        BrowserUtils.waitFor(1);

        RegisterStep1Street.sendKeys(RegisterCityStreet);
        RegisterStep1Building_No.sendKeys(RegisterCityBuildingNumber);
        RegisterStep1FlatNo.sendKeys(RegisterCityBuildingNumber);


        BrowserUtils.waitFor(1);
        Panel1DevamEt.click();


    }

    public void TestDropDownStep1() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        JavascriptExecutor jsAddress = (JavascriptExecutor) Driver.get();
        jsAddress.executeScript("window.selectCity(1)");
        jsAddress.executeScript("window.selectDistrict(3)");
        RegisterSingUp.click();
    }


}







