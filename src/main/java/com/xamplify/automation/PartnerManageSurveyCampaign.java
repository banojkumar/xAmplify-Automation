package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PartnerManageSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");
	final Logger logger = LogManager.getLogger(PartnerManageSurveyCampaign.class);

	@Test

	public void manage_redsurveycamp() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 50); // Wait till the element is not visible
		WebElement s_element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("re_Surveycampaignhover"))));
		s_element.click(); // hover the Campaign
		logger.info("Hover the campaign module");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_resurvey_manage_camp"))).click();// Click on Manage
																									// campaigns
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("resurvey_click_survey_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Edit");
		driver.findElement(By.xpath(properties.getProperty("click_rs_edit"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_edit_update"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_close"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Preview");
		driver.findElement(By.xpath(properties.getProperty("click_rs_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_cross"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Archieve");
		driver.findElement(By.xpath(properties.getProperty("click_rs_archieve"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_archievedcampaigns"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("drdwn_archd_camp"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_unarchieve"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_active_campaigns"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("resurvey_click_survey_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_drpdown_to_delete"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("click_re_survey_camp_Delete"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_yes_del"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("resurvey_click_survey_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_re_Survey_Analytics"))).click();
		Thread.sleep(3000);

		logger.info("Click on the Recepients");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByClassName('fa fa-user')");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_recepients_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_recepients_search_box")))
				.sendKeys("automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_recepients_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_recepients_cross_click"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_email_sent"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_email_search_box")))
				.sendKeys("automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_emailsent_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_emailsent_cross_click"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_deliverability"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_delivered_email_search_box")))
				.sendKeys("automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_delivered_email_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_delivered_cross_click"))).click();
		Thread.sleep(3000);

		logger.info("Click on the Open_rate");

		WebElement openrat = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_openrate")));
		if (openrat.isEnabled()) {
			openrat.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search")))
					.click();
			Thread.sleep(3000);

			WebDriverWait wait_time_drdn = new WebDriverWait(driver, 50);
			WebElement w_time = wait_time_drdn.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("re_surveycamp_time_dropdown")))); // select
			// dropdown
			Thread.sleep(2000);

			Select w_t1 = new Select(w_time);
			w_t1.selectByValue("1: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("2: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("3: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("4: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("5: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("6: Object");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_op_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_openrate_cross_click"))).click();
			Thread.sleep(3000);
		} else {
			System.out.println("openrate count is zero");
		}

		logger.info("Click on Active Recepients");

		WebElement activerec = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_active_recepients")));
		if (activerec.isEnabled()) {

			activerec.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search")))
					.click();
			Thread.sleep(3000);

			WebDriverWait wait_time_drdn_2 = new WebDriverWait(driver, 50);
			WebElement w_time2 = wait_time_drdn_2.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("re_surveycamp_time_dropdown")))); // select
			// time
			// dropdown
			Thread.sleep(2000);

			Select w_t2 = new Select(w_time2);
			w_t2.selectByValue("1: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("2: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("3: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("4: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("5: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("6: Object");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_active_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_active_cross_click"))).click();
			Thread.sleep(3000);

		} else {
			System.out.println("activerecepients count is zero");
		}
		logger.info("Click on the Clicked URL tile");

		WebElement clickedurl = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_clicked_URL")));
		if (clickedurl.isEnabled()) {

			clickedurl.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_recepients_clicked_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_recepients_clicked_search"))).click();
			Thread.sleep(3000);

			WebDriverWait wait_time_drdn_3 = new WebDriverWait(driver, 50);
			WebElement w_time3 = wait_time_drdn_3.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("re_surveycamp_time_dropdown1")))); // select
			// time
			// dropdown
			Thread.sleep(2000);

			Select w_t3 = new Select(w_time3);
			w_t3.selectByValue("1: Object");
			Thread.sleep(2000);
			w_t3.selectByValue("2: Object");
			Thread.sleep(2000);
			w_t3.selectByValue("3: Object");
			Thread.sleep(2000);
			w_t3.selectByValue("4: Object");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_url_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_url_cross_click"))).click();
			Thread.sleep(3000);
		}

		else {

			System.out.println("Clicked URL count is zero");
		}

		logger.info("Click on Hard bounce");

		WebElement hardbounce = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_click_Hardbounce")));
		if (hardbounce.isEnabled()) {
			hardbounce.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_hardbounce_close")));
			Thread.sleep(3000);
		}

		else {
			System.out.println("Hard bounce value is Zero");
		}

		logger.info("Click on soft bounce");

		WebElement softbounce = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_click_softbounce")));
		if (softbounce.isEnabled()) {
			softbounce.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_softbounce_close")));
			Thread.sleep(3000);
		}

		else {
			System.out.println("soft bounce value is Zero");
		}

		logger.info("Click on unsubscribe");

		WebElement unsubscribe = driver
				.findElement(By.xpath(properties.getProperty("re_surveycamp_click_unsubscribe")));
		if (unsubscribe.isEnabled()) {
			unsubscribe.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_unsubscribe_close")));
			Thread.sleep(3000);
		}

		else {
			System.out.println("unsubscribe value is Zero");
		}

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		WebDriverWait wait_eml_sortby = new WebDriverWait(driver, 50);
		WebElement eml_sort = wait_eml_sortby.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(properties.getProperty("re_surveycamp_total_email_camp_sort_by")))); // select
		// totla
		// email
		// opned_dropdown
		Thread.sleep(2000);

		Select eml_sort1 = new Select(eml_sort);

		eml_sort1.selectByValue("1: Object");
		Thread.sleep(2000);
		eml_sort1.selectByValue("2: Object");
		Thread.sleep(2000);
		eml_sort1.selectByValue("3: Object");
		Thread.sleep(2000);
		eml_sort1.selectByValue("4: Object");
		Thread.sleep(2000);

		WebElement s_analytics_search = driver
				.findElement(By.xpath(properties.getProperty("re_survey_analytics_search")));
		s_analytics_search.sendKeys("mounika");
		s_analytics_search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		s_analytics_search.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("re_survey_analytics_cross"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("re_survey_export_excel"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_survey_click_export_Excel"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_on_email_details"))).click();
		Thread.sleep(5000);
//		
		logger.info("Click on Register lead button");
		driver.findElement(By.xpath(properties.getProperty("click_on_register_lead_button"))).click();
		Thread.sleep(5000);

		logger.info("Click on Select pipeline Dropdown");
		WebDriverWait wait_pipeline_dropdwn = new WebDriverWait(driver, 50);
		WebElement sel_pipeline = wait_pipeline_dropdwn.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("click_pipeline_dropdown"))));

		Select pipeline = new Select(sel_pipeline);
		pipeline.selectByVisibleText("Opened");
		Thread.sleep(2000);
		pipeline.selectByVisibleText("Contacted");
		Thread.sleep(2000);
		pipeline.selectByVisibleText("Converted");
		Thread.sleep(2000);
		pipeline.selectByVisibleText("Closed - Lost");
		Thread.sleep(2000);
		logger.info("click on Firstname");
		WebElement lead_firstname = driver.findElement(By.xpath(properties.getProperty("re_survey_leadfirstname")));
		lead_firstname.clear();
		Thread.sleep(3000);
		lead_firstname.sendKeys(properties.getProperty("leadfirstname") + "_" + System.currentTimeMillis());
		Thread.sleep(3000);
		logger.info("click on Lastname");
		WebElement lead_lastname = driver.findElement(By.xpath(properties.getProperty("re_survey_leadlastname")));
		lead_lastname.clear();
		Thread.sleep(3000);
		lead_lastname.sendKeys(properties.getProperty("leadlastname") + "_" + System.currentTimeMillis());
		Thread.sleep(3000);
		logger.info("click on Address");
		driver.findElement(By.xpath(properties.getProperty("click_on_address"))).sendKeys("Lead_address");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_on_city"))).sendKeys("Hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_on_state"))).sendKeys("Telangana");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_on_postalcode"))).sendKeys("500050");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_on_phonenum"))).sendKeys("9959710197");
		Thread.sleep(3000);

		WebDriverWait wait_country_dropdwn = new WebDriverWait(driver, 50);
		WebElement country = wait_country_dropdwn.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("click_country_dropdown"))));
		Select county_Lead = new Select(country);

		county_Lead.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_submit_lead"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_lead_Close_button"))).click();
		Thread.sleep(3000);

		logger.info("Click on Leads");

		WebElement leads = driver.findElement(By.xpath(properties.getProperty("click_leads")));

		if (leads.isEnabled()) {
			leads.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("lead_search_click"))).sendKeys("auto_lead");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("lead_search_icon_click"))).click();
			// Search icon click
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("lead_clear"))).click();
			Thread.sleep(3000);

			logger.info("click on Register Deal button");
			driver.findElement(By.xpath(properties.getProperty("click_on_register_deal_button"))).click();
			Thread.sleep(3000);

			WebDriverWait wait_dealpipeline_dropdwn = new WebDriverWait(driver, 50);
			WebElement sel_deal_pipeline = wait_dealpipeline_dropdwn.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("click_pipeline_dropdown"))));

			Select deal_pipeline = new Select(sel_deal_pipeline);
			deal_pipeline.selectByVisibleText("Opened");
			Thread.sleep(2000);
			deal_pipeline.selectByVisibleText("Hold");
			Thread.sleep(2000);
			deal_pipeline.selectByVisibleText("Rejected");
			Thread.sleep(2000);
			deal_pipeline.selectByVisibleText("Approved");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("click_on_deal_title")))
					.sendKeys("Automation_deal" + "_" + System.currentTimeMillis()); // Click on deal_title
			Thread.sleep(3000);

			WebDriverWait wait_dealtypedropdown = new WebDriverWait(driver, 50);
			WebElement w_dealdropdown = wait_dealtypedropdown.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("click_deal_type_dropdown"))));
			Thread.sleep(2000);

			Select deal_type = new Select(w_dealdropdown);
			deal_type.selectByValue("New Customer");
			Thread.sleep(2000);
			deal_type.selectByValue("New Product");
			Thread.sleep(2000);
			deal_type.selectByValue("Upgrade");
			Thread.sleep(2000);
			deal_type.selectByValue("Services");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("click_deal_amount"))).sendKeys("1000"); // Click on
																										// dealamount
			Thread.sleep(8000);
			driver.findElement(By.xpath(properties.getProperty("click_estimate_date"))).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath(properties.getProperty("select_estimate_date"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("click_on_save_deal"))).click();
			Thread.sleep(3000);

			logger.info("Click on Filter");
			driver.findElement(By.xpath(properties.getProperty("click_filter"))).click(); // Click on filter
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("select_from_date"))).click(); // Select From date
			Thread.sleep(7000);

			driver.findElement(By.xpath(properties.getProperty("choose_from_date"))).click(); // Select From date
			Thread.sleep(7000);
			driver.findElement(By.xpath(properties.getProperty("select_to_date"))).click(); // Select To date
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("choose_to_date"))).click(); // Select To date
			Thread.sleep(3000);

			WebDriverWait wait_statusdropdown = new WebDriverWait(driver, 50);
			WebElement w_statusdropdown = wait_statusdropdown.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("status_select_dropdown"))));
			Thread.sleep(2000);

			Select status_dropdown1 = new Select(w_statusdropdown);
			status_dropdown1.selectByValue("Opened");
			Thread.sleep(2000);

			status_dropdown1.selectByValue("Closed - Lost");
			Thread.sleep(2000);

			status_dropdown1.selectByValue("Converted");
			Thread.sleep(2000);

			status_dropdown1.selectByValue("Contacted");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("click_filter_button"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("apply_filter_cross"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("click_download"))).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("leads_close"))).click();
			Thread.sleep(3000);
		}

		else {
			System.out.println("leads count is Zero");
		}

	}

}
