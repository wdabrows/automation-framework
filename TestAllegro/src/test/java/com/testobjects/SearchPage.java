package com.testobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	private static WebElement element = null;
	 
    public static WebElement find_sort_menu(WebDriver driver){
 
         element = driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/section/div[3]/div[1]/div[3]/div[1]/span/span"));
 
         return element;
 
         }
 
     public static WebElement find_sort_type(WebDriver driver){
 
         element = driver.findElement(By.linkText("od najwyższej"));
 
         return element;
 
         }
     
     public static WebElement find_first_item(WebDriver driver){
    	 
         element = driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/section/div[3]/section/article[1]/div/div[3]/header/h2/a"));
 
         return element;
 
         }
 
}