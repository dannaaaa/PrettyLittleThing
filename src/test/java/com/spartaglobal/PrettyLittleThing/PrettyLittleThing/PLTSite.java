package com.spartaglobal.PrettyLittleThing.PrettyLittleThing;

import com.spartaglobal.PrettyLittleThing.PrettyLittleThing.Pages.PLTHomepage;
import org.openqa.selenium.WebDriver;

public class PLTSite {
    private WebDriver driver;
    private PLTHomepage pltHomepage;

    public PLTSite(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();

        this.pltHomepage = new PLTHomepage(driver);
    }

    public PLTHomepage pltHomepage(){
        return pltHomepage;
    }
}
