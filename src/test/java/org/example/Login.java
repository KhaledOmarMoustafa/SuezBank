package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login {

    public void login() {


        //https://www.youtube.com/watch?v=5gU_2y0818U this link is how to setup the healinum and make it fix any broken locator


        // Define credentials
        String usernameText = "standard_user";
        String passwordText = "secret_sauce";

        // Step 1: Locate the username field and input the username
        By usernameField = By.cssSelector("input[id=\"user-name\"");
        PreRequisites.driver.findElement(usernameField).sendKeys(usernameText);


        // Step 2: Locate the password field and input the password
        By passwordField = By.xpath("(//input[@data-test=\"password\"])");
        PreRequisites.driver.findElement(passwordField).sendKeys(passwordText);


        // Step 3: Locate and click the login button
        By clickLogin = By.xpath("(//input[@id=\"login-button\"])");
        PreRequisites.driver.findElement(clickLogin).click();

    }
}