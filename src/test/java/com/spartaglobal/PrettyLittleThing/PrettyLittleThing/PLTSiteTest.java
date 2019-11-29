package com.spartaglobal.PrettyLittleThing.PrettyLittleThing;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.PrettyLittleThing.PrettyLittleThing.SeleniumConfig.SeleniumConfig;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PLTSiteTest {

    private static PLTSite pltSite;

    @BeforeClass
    public static void setup(){
        SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\danaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
        pltSite = new PLTSite(chromeDriverConfig.getDriver());

        pltSite.pltHomepage()
                .goToPLTHomepage()
                .goToDresses()
                .goToWhiteDress()
                .selectSize()
                .addItemToBag()
                .backButton()
                .goToCheckout()
                .proceedToCheckout();
//                .goToShoes()
//                .selectShoeType();
    }

    private String emailErrorMessage1 = "Please enter a valid email address. For example johndoe@domain.com";



    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }



    @Test
    public void invalidEmailTest(){

        //Assert.assertEquals(emailErrorMessage1, pltSite.pltHomepage().goToDresses().goToWhiteDress().addItemToBag().goToCheckout().proceedToCheckout().;

    }
}


