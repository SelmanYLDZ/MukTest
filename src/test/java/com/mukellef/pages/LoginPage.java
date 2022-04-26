package com.mukellef.pages;

import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(name = "email")
    public WebElement UserNameElement;

    @FindBy(name="password2")
    public WebElement passwordElement;

    @FindBy(name="process")
    public  WebElement LoginBtn;

    public void login(String user_name,String user_password){

        UserNameElement.sendKeys(user_name);
        passwordElement.sendKeys(user_password);
        BrowserUtils.waitFor(3);
        LoginBtn.click();




            }


}
