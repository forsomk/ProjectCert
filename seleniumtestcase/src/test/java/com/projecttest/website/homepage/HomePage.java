package com.automatedtest.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "192.168.56.101:8081/index.php";


    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToAboutPage(){
        driver.get("192.168.56.101:8081/content/about-us.php");
        wait.forLoading(5);
    }

    void checkAboutInfo(String title) {
        String displayedTitle = driver.getTitle();
        Assert.assertTrue("Displayed title is " + displayedTitle + " instead of " + title,
                title.equals(displayedTitle));
    }
}
