package com.spartaglobal.PrettyLittleThing.PrettyLittleThing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PLTHomepage {
    private WebDriver driver;
    private String homepageURL = "https://www.prettylittlething.com/";


    private By maindresess = By.id("main-dresses");
    //private By whiteDress = By.cssSelector("white Woven Bardot Binding Detail Bodycon Dress");
    private By whiteDress = By.cssSelector(" //*[@id=\"products-grid-container\"]/div[2]/div/div[8]/a/div[1]/div/img");
    //#products-grid-container > div.products-grid > div > div:nth-child(6) > a
    private By selectSize = By.cssSelector("#attribute135 > div:nth-child(5)");
    private By addToBag = By.id("add-to-bag");
    private By loadMoreButton = By.className("load-more-btn");
    private By mainshoes = By.id("main-shoes");
    private By shoeFilter = By.cssSelector("#filter-wrapper > div.filter.filter-container.label > div.filter-wraper-sub > div > div.viewport > div > ol");
    private By goToCart = By.className("cart");
    private By proceedToCheckout = By.cssSelector("body > main > div > div > div.cart > div:nth-child(5) > form > button");


    public PLTHomepage(WebDriver driver) {
        this.driver = driver;
    }


    public PLTHomepage goToPLTHomepage() {
        driver.navigate().to(homepageURL);
        return this;
    }

    public PLTHomepage goToDresses() {
        driver.findElement(maindresess).click();
        return this;
    }

    public PLTHomepage goToWhiteDress() {
        driver.findElement(whiteDress).click();
        return this;
    }

    public PLTHomepage selectSize() {
        driver.findElement(selectSize).click();
        return this;
    }

    public PLTHomepage addItemToBag() {
        driver.findElement(addToBag).click();
        return this;
    }

    public PLTHomepage backButton (){
        driver.navigate().back();
        return this;
    }

    public PLTHomepage clickLoadMorebutton(){
        driver.findElement(loadMoreButton).click();
        return this;
    }

     public PLTHomepage goToShoes() {
         driver.findElement(mainshoes).click();
         return this;
     }

     public PLTHomepage selectShoeType(){
         List<WebElement> elements = driver.findElements(shoeFilter);
         for (WebElement element : elements) {
//            if (element.getText().equals(filterid)){
//                element.click();
//             }
             System.out.println(element.getAttribute("filteroptionid"));
         }
         return this;
    }

    public PLTHomepage goToCheckout(){
        driver.findElement(goToCart).click();
        return this;
    }

    public PLTHomepage proceedToCheckout (){
        driver.findElement(proceedToCheckout).click();
        return this;
    }


}