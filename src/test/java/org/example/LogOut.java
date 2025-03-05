package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LogOut {
    public void logOut(){
        By burgerIconButton = By.xpath("//div[@class=\"bm-burger-button\"]");
        PreRequisites.driver.findElement(burgerIconButton).click();



        PreRequisites.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@id=\"logout_sidebar_link\"])")));
        By clickLogOut = By.xpath("(//a[@id=\"logout_sidebar_link\"])");
        PreRequisites.driver.findElement(clickLogOut).click();


        String currentURL = PreRequisites.driver.getCurrentUrl();

        Assert.assertEquals(currentURL,PreRequisites.webSiteURL);

    }
}
