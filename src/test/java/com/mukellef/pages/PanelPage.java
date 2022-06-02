package com.mukellef.pages;

import com.mukellef.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PanelPage {
    public PanelPage(){
        PageFactory.initElements(Driver.get(),this);}



    @FindBy(css = "XxPVvD2kR")
    public WebElement SendVerificationCodealert;

    @FindBy(xpath = "(//a[@class='btn-mukellef'])[1]")
    public WebElement HemenKurulumaBaşlaButton;

    @FindBy(xpath = "(//a[@class='btn-mukellef'])[2]")
    public WebElement VergiMuafiyetBelgesiİleDevamEdecegimButton;

    @FindBy(xpath = "(//a[@class='btn-mukellef'])[3]")
    public WebElement ŞirketimVarHizmetSatınAlmakİstiyorumButton;

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





    @FindBy(xpath = ("//button[@class='close'][3]"))
    public WebElement DogumTarihiNedenDogruGirmeliyimAlert;























    public void HemenKurulumaBaşla(){


    }
    public void VergiMuafiyetBelgesi(){

    }

    public void HizmetSatinAlmakİstiyorum(){

    }




}
