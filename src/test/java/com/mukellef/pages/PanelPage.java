package com.mukellef.pages;

import com.mukellef.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.WeakReference;

public class PanelPage {
    public PanelPage(){
        PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath ="(//input[@name='code'])[1]" )
    public WebElement MailVerificationCode;
    @FindBy(xpath = "//button[@class='btn btn-primary'][1]")
    public WebElement ConfirmMyEmailAddress;

    @FindBy(css = "XxPVvD2kR")
    public WebElement SendVerificationCodealert;

    @FindBy(xpath = "(//a[@class='btn-mukellef'])[1]")
    public WebElement ŞirketimYokKurmakİstiyorumButton;

    @FindBy(xpath = "(//a[@class='btn-mukellef'])[2]")
    public WebElement VergiMuafiyetBelgesiİleDevamEdecegimButton;

    @FindBy(xpath = "(//a[@class='btn-mukellef'])[3]")
    public WebElement ŞirketimVarHizmetSatınAlmakİstiyorumButton;

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

    @FindBy(css = "company_title")
    public WebElement Panel1CompanyTitle;

    @FindBy(xpath= "(//span[@class='checkmark mt-2'])[1]")
    public WebElement Kampanya1RadioButton;

    @FindBy(xpath= "(//span[@class='checkmark mt-2'])[2]")
    public WebElement Kampanya2RadioButton;

    @FindBy(xpath = "(//a[@id='commitmentModal'])[1]")
    public WebElement CaymaBedeliRadioButton1;

    @FindBy(xpath = "(//a[@id='commitmentModal'])[2]")
    public WebElement CaymaBedeliRadioButton2;

    @FindBy(css = "telephone")
    public WebElement Step1TelNoİnputBox;

    @FindBy(css = "checkmark")
    public WebElement YabancıVatandaşRadioButton;

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



    @FindBy(xpath = ("//button[@class='close'][3]"))
    public WebElement DogumTarihiNedenDogruGirmeliyimAlert;


    public void MailVerification(String Test_Email_Password){
        MailVerificationCode.sendKeys(Test_Email_Password);
        ConfirmMyEmailAddress.click();
    }




















    public void HemenKurulumaBaşla(){


    }
    public void VergiMuafiyetBelgesi(){

    }

    public void HizmetSatinAlmakİstiyorum(){

    }




}
