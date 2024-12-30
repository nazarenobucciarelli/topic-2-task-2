package com.solvd.carina.demo.gui.android.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PlayStorePage extends AbstractPage {

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.vending:id/0_resource_name_obfuscated\"]")
    private ExtendedWebElement signInButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"identifierId\"]")
    private ExtendedWebElement identifierField;

    public PlayStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public boolean isIdentifierFieldDisplayed() {
        return identifierField.isVisible();
    }

}
