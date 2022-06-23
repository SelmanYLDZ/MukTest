package com.mukellef.pages;


import com.mukellef.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    // these are for landing page

    @FindBy(xpath = "a[Class='nav-link nuxt-link-exact-active nuxt-link-active'][1]")
    public WebElement TurkiyeNasikCalisir;

    @FindBy(xpath = "(//a[@Class='nav-link'])[1]")
    public  WebElement TurkiyeOzellikler;

    @FindBy(xpath = "(//a[@Class='nav-link'])[2]")
    public  WebElement TurkiyeFiyatlar;

    @FindBy(xpath = "(//a[@Class='nav-link'])[3]")
    public  WebElement TurkiyeBlog;

    @FindBy(xpath = "(//a[@Class='nav-link'])[4]")
    public  WebElement TurkiyeDestek;

    @FindBy(xpath = "(//a[@Class='nav-link'])[5]")
    public  WebElement TurkiyeMaliMusavirlericin;

    @FindBy(xpath = "(//a[@Class='nav-link'])[6]")
    public WebElement GirisYapin;

    @FindBy(xpath = "//select[@id='__BVID__12']")
    public WebElement DilTurkce;

    @FindBy(xpath = "(//select/option[@value='en'])[2]")
    public WebElement DilEnglish;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement myUserName;



public BasePage(){
    PageFactory.initElements(Driver.get(), this);
}


}
