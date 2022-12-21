package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LaunchToeventcampagin {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\EventCampaign.properties");

	final Logger logger = LogManager.getLogger(LaunchToeventcampagin.class);

	@Test
	public void event_to_launch() throws InterruptedException, SQLException

	{
		Thread.sleep(4000);
		EventToCampagin eve_to = new EventToCampagin();
		eve_to.event_Tocampaign();
		Thread.sleep(4000);

		
		  AutoResponsesEventcampaign ar_eve1=new AutoResponsesEventcampaign(); //method call for autoresponses 
		  ar_eve1.autoResponsesevent();
		 
		  Thread.sleep(4000);
		
		driver.findElement(By.xpath(properties.getProperty("eve_now"))).click(); // click NOW
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("eve_launch"))).click(); // click LAUNCH

		Thread.sleep(4000);

		String eve_launch = driver.findElement(By.xpath(properties.getProperty("eve_response_msg"))).getText(); // response
		// message

		Thread.sleep(3000);

		String expectedtitle = "Campaign launched successfully";

		if (expectedtitle.equals(eve_launch)) {
			System.out.println(" Event Campaign launched successfully");
		} else {
			System.out.println(" Event Campaign failed");
		}

		logger.info("Event Campaign Launched Successfully");
		driver.navigate().refresh();
		Thread.sleep(8000);

	}
	
	
}
