package com.testobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {

	private static WebElement element = null;
	 
    public static WebElement getPrice(WebDriver driver){
 
         element = driver.findElement(By.id("priceValue"));
 
         return element;
 
         }
 
     public static WebElement findShipmentBtn(WebDriver driver){
 
         element = driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/div[2]/div[4]/div[1]/ul/li[2]/a"));
 
         return element;
 
         }
     
     public static WebElement getShipmentData(WebDriver driver){
    	 
         element = driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/div[2]/div[4]/div[2]"));
 
         return element;
 
         }
 
}