package com.solvd.carina.demo.gui.android.components;

import com.solvd.carina.demo.gui.android.pages.PlayStorePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterComponent extends AbstractUIObject {

    @FindBy(xpath = "//android.widget.TextView[@text=\"Download the free eBay app\"]")
    private ExtendedWebElement downloadButton;

    public FooterComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public PlayStorePage clickDownloadButton() {
        downloadButton.click();
        return new PlayStorePage(driver);
    }
}
