package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTracks {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(AddTracks.class);


	@Test 
	public void addingtrack() throws InterruptedException, IOException {	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Add_tracks"))).click(); //click on add tracks
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).sendKeys(properties.getProperty("track_name") + "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection"))).click(); //select folder
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("camera_icon"))).click(); //click on camera icon
		Thread.sleep(8000);	
		driver.findElement(By.xpath(properties.getProperty("select_image"))).sendKeys("D:\\images\\jpg_file.jpg"); //click on select image icon and uploa dimage
		Thread.sleep(5000);
		//Runtime.getRuntime().exec("D:\\Selenium\\track_featured_image.exe"); //upload featured image
		//Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("save_changes"))).click(); //click on savechanges after selecting featured image
		Thread.sleep(5000);
		logger.info("image uploaded");
		driver.findElement(By.xpath(properties.getProperty("tag_plusicon_tc"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_text_click_tp"))).click();
		//	driver.findElement(By.xpath(properties.getProperty("tag_text_click"))).sendKeys(properties.getProperty("tag_name_tp"));
		WebElement enter=driver.findElement(By.xpath(properties.getProperty("tag_text_click_tp")));
		enter.sendKeys(properties.getProperty("tag_name_tp")+ "_" + System.currentTimeMillis());
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("tag_savebutton_tp"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_select_tp"))).click();
		Thread.sleep(5000);
		logger.info("tag selected");
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button
		logger.info("track details provided"); //details provided
	    Thread.sleep(60000);	
		//selecting first asset
		driver.findElement(By.xpath(properties.getProperty("add_media"))).click();//click on add media
		Thread.sleep(5000);
		WebElement firstasset = driver.findElement(By.xpath(properties.getProperty("firstasset_click")));
		if(firstasset.isDisplayed()) {
			driver.findElement(By.xpath(properties.getProperty("firstasset_click"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("display_text"))).sendKeys("Asset");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("confirm_button"))).click();
			logger.info("asset selected");  	 
		}else {
			driver.findElement(By.xpath(properties.getProperty("close_popup_media"))).click();
			logger.info("no asset selected");
		}

		Thread.sleep(5000);

		//selecting first form
		driver.findElement(By.xpath(properties.getProperty("add_forms"))).click(); //click on add forms
		Thread.sleep(5000);

		WebElement firstform = driver.findElement(By.xpath(properties.getProperty("firstform_click")));

		if(firstform.isDisplayed()) {
			driver.findElement(By.xpath(properties.getProperty("firstform_click"))).click();
			logger.info("form selected");
		}else {
			driver.findElement(By.xpath(properties.getProperty("close_popup_form"))).click();
			logger.info("no form selected");

		}

		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).click();  
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).sendKeys("Track_Description"); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(5000);
		logger.info("description entered");
		

		//selecting first quiz
		driver.findElement(By.xpath(properties.getProperty("select_quiz"))).click();//click on select quiz
		Thread.sleep(5000);
		WebElement firstquiz = driver.findElement(By.xpath(properties.getProperty("firstquiz_click")));

		if(firstquiz.isDisplayed()) {
			driver.findElement(By.xpath(properties.getProperty("firstquiz_click"))).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("close_popup_quiz"))).click(); 	 
			logger.info("quiz form selected");
		}else {
			driver.findElement(By.xpath(properties.getProperty("close_popup_quiz"))).click();
			logger.info("no quiz form selected");

		}
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("search_txt"))).click(); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("search_txt"))).sendKeys("mp4"); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("Search_click"))).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("first_asset_selection"))).click();	//select first asset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button  
		logger.info("mp4 first asset selected");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Search_publish"))).sendKeys("automatedPartner"); //select automatedPartner in search field
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_searchicon"))).click();		
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click_track"))).click(); //select arrow of partner company
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_select_track"))).click(); //select partner
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("save&publish_button"))).click(); //click on save&publish button
		Thread.sleep(5000);
		logger.info("track published to partner succesfully");	

		//assertion for success message
		WebElement published = driver.findElement(By.xpath(properties.getProperty("afterpublish_success")));	
		String actualresult2 = published.getText();
		String expectedresult2 = "Track created successfully";				
		Assert.assertEquals(actualresult2, expectedresult2);
		logger.info("Assertion for published succesfull");	
		Thread.sleep(5000);	

	}	
}
