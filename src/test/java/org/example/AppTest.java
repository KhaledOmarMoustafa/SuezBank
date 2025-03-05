package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest extends JsonFetcher {



    JsonFetcher jsonFetcher = new JsonFetcher();
    PreRequisites preRequisites = new PreRequisites();
    Login login = new Login();
    AddingProducts addingProducts = new AddingProducts();
    CheckCart checkCart = new CheckCart();
    CheckOut checkOut = new CheckOut();
    LogOut logOut = new LogOut();
    SortOrder sortOrder = new SortOrder();

    @BeforeClass
    public void preRequisites() throws IOException, InterruptedException {
        jsonFetcher.jsonFetcher();
        preRequisites.openBrowser();
    }



    @Test(priority = 1)
    public void login() throws InterruptedException {
        login.login();

    }
    @Test(priority = 2)
    public void sortingPageOrder(){
        sortOrder.sortOrder();
    }

    @Test(priority = 3)
    public void addingProducts() {
       addingProducts.addingProducts();
    }

    @Test(priority = 4)
    public void checkCart() {
        checkCart.checkCart();
    }

    @Test(priority = 5)
    public void checkOut() {
        checkOut.checkOut();
    }

    @Test(priority = 6)
    public void logOut() {
        logOut.logOut();
    }



    @AfterClass
    public void closeBrowser() {
        preRequisites.closeBrowser();
    }
}