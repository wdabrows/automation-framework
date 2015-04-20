package com.testobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	 
    public static WebElement find_search_field(WebDriver driver){
 
         element = driver.findElement(By.cssSelector("#main-search-text"));
 
         return element;
 
         }
 
     public static WebElement find_search_btn(WebDriver driver){
 
         element = driver.findElement(By.cssSelector(".sprite.search-btn"));
 
         return element;
 
         }
 
}
