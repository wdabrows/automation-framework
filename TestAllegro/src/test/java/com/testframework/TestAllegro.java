package com.testframework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.testobjects.*;

public class TestAllegro {
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		this.driver = new FirefoxDriver();
		driver.get("http://www.allegro.pl");
	}
	
	@Test
	public void testSearch() {
		
		HomePage.find_search_field(driver).sendKeys("smartwatch");
		HomePage.find_search_btn(driver).click();
		SearchPage.find_sort_menu(driver).click();
		SearchPage.find_sort_type(driver).click();
		try {
			TimeUnit.SECONDS.sleep(5);
		}
		catch (InterruptedException e) {
		}
		SearchPage.find_first_item(driver).click();
		
		String PRICE = ItemPage.get_price(driver).getText();
		String DIGITS = PRICE.replaceAll("[^0-9.]", "");
		int x = Integer.parseInt(DIGITS);
		
	    	if (x>1000){
	    		ItemPage.find_shipment_btn(driver).click();
	    		String Log = ItemPage.get_shipment_data(driver).getText();
	    		try {
	    			 
	     
	    			File file = new File("log.txt");
	     
	    			if (!file.exists()) {
	    				file.createNewFile();
	    			}
	     
	    			FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    			BufferedWriter bw = new BufferedWriter(fw);
	    			bw.write(Log);
	    			bw.close();
	     
	     
	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	    	}
	    	else {
	    		return;
	    	}
	    	
	    
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
