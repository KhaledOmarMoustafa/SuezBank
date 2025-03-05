package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortOrder {
    public void sortOrder(){
        By sortingDropDown = By.xpath("//select[@class=\"product_sort_container\"]");
        WebElement sorting = PreRequisites.driver.findElement(sortingDropDown);
        Select orderSorting =new Select(sorting);
        orderSorting.selectByVisibleText("Price (high to low)");

    }
}
