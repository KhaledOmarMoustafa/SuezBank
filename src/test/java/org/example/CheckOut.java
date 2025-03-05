package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOut {


    public void checkOut() {
        // Step 1: Locate and click the "Checkout" button
        By clickCheckOut = By.xpath("//a[@class=\"btn_action checkout_button\"]");
        PreRequisites.driver.findElement(clickCheckOut).click();

        // Step 2: Enter First Name
        By enterFirstName =By.xpath("//input[@data-test=\"firstName\"]");
        PreRequisites.driver.findElement(enterFirstName).sendKeys(JsonFetcher.firstName); // Use data fetched from JsonFetcher

        // Step 3: Enter Last Name
        By enterLastName =By.xpath("//input[@data-test=\"lastName\"]");
        PreRequisites.driver.findElement(enterLastName).sendKeys(JsonFetcher.lastName);

        // Step 4: Enter Postal Code
        By enterPostalCode =By.xpath("//input[@data-test=\"postalCode\"]");
        PreRequisites.driver.findElement(enterPostalCode).sendKeys(JsonFetcher.postalCode);


    }
}