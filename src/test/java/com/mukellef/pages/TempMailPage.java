package com.mukellef.pages;

import com.mukellef.utilities.BrowserUtils;
import com.mukellef.utilities.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TempMailPage extends BasePage {

    public TempMailPage(){
        PageFactory.initElements(Driver.get(),this);}

    @FindBy(css = "click-to-delete")
    public WebElement TempMailDelete;

    @FindBy (css = "click-to-copy")
    public WebElement TempMailCopy;

    @FindBy(css = "mail")
    public WebElement TempMailText;

    public void TempMailDeleteMethod(){
        BrowserUtils.waitFor(5);
        TempMailDelete.click();

    }
    public void TempMailGetTextMethod() {
        TempMailText.click();
    }


}