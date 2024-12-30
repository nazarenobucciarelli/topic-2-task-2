package com.solvd.carina.demo.gui.common.pages;

import com.solvd.carina.demo.gui.common.enums.Category;
import com.zebrunner.carina.utils.mobile.IMobileUtils;

import org.openqa.selenium.WebDriver;


public abstract class HomePageBase extends PageBase implements IMobileUtils {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CategoryPageBase selectCategory(Category category);
}
