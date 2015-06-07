package com.testobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
// test //
	private static WebElement element = null;
	 
    public static WebElement findSearchField(WebDriver driver){
 
         element = driver.findElement(By.cssSelector("#main-search-text"));
 
         return element;
 
         }
 
     public static WebElement findSearchBtn(WebDriver driver){
 
         element = driver.findElement(By.cssSelector(".sprite.search-btn"));
 
         return element;
 
         }
 
}
