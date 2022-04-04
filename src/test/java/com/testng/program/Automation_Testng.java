package com.testng.program;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.automation.pom.Pom_Class;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.base_class.Base_Class;

public class Automation_Testng extends Base_Class  {
	
    public static WebDriver driver = browser_launch("Chrome");
	public static Pom_Class pom = new Pom_Class(driver);
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter spark_reports;
	public static Logger log = Logger.getLogger(Automation_Testng.class);
	
	@BeforeTest
	private void extent_Report() {
		
		spark_reports = new ExtentSparkReporter
				("C:\\Users\\om\\eclipse-workspace\\mavenproject\\Extent-Report\\extentreport.xml");
		
		reports = new ExtentReports();
		
		reports.attachReporter(spark_reports);	
	}
	
	@AfterTest
	private void flush() {
		
		reports.flush();
	}
	

	@BeforeClass
	private void url_Launch() {
		
		PropertyConfigurator.configure("log4j.properties");
		
		getUrl("http://automationpractice.com/index.php?");
		
		log.info("Url Launch Successfully");
	}
	@BeforeMethod
	private void login() throws IOException {
		
		implicitwait(30, "SECONDS");
		
		clickElement(pom.getP1().getSigin_btn());
		
		inputElement(pom.getP2().getUsername(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 25, 5));
		
		inputElement(pom.getP2().getPassword(),getdata("C:\\Users\\om\\Pictures\\PROJECT\\Programs\\Test Cases\\Automation Testcase.xlsx", 
				0, 26, 5));
		
		clickElement(pom.getP2().getSubmit_btn());
		
		log.info("Login Successfully");
		
	}

	@Test(priority = -1)
	private void tshirt() {
		
		    clickElement(pom.getP3().getSelectoption());
			
			dropdown("Index",pom.getP3().getPrize(), "1");
			
			clickElement(pom.getP3().getIconview());
			
			clickElement(pom.getP3().getColor_btn());
			
			clear(pom.getP4().getQuantity());
			inputElement(pom.getP4().getQuantity(), "2");
			
			dropdown("Visibletext", pom.getP4().getSize(), "M");
			
			clickElement(pom.getP4().getAddtocard());
			
			clickElement(pom.getP5().getContinoueshopping());
			
			log.info("T-Shirt Purchase Finished");		
	}
	@AfterMethod
	private void sigout() {
		
		clickElement(pom.getP7().getSignout());
		
		log.info("Logout Successfully");
	}
	@Test(priority = 0)
	private void women() {
		
        clickElement(pom.getP7().getWomendress());
		
		clickElement(pom.getP3().getIconview());
		
		clickElement(pom.getP3().getColor_btn());
		
		clear(pom.getP4().getQuantity());
		
		inputElement(pom.getP4().getQuantity(), "2");
		
		dropdown("Visibletext", pom.getP4().getSize(), "M");
		
		clickElement(pom.getP4().getAddtocard());
		
		clickElement(pom.getP5().getContinoueshopping());
		
		log.info("Women Dress Purchased Finished");
		
	}
	@Test(priority = 1)
	private void dresses() {
		
		clickElement(pom.getP7().getDresses());
		
		clickElement(pom.getP3().getIconview());
		
		clickElement(pom.getP7().getDresses1());
		
		clear(pom.getP4().getQuantity());
		
		inputElement(pom.getP4().getQuantity(), "2");
		
		dropdown("Visibletext", pom.getP4().getSize(), "M");
		
		clickElement(pom.getP4().getAddtocard());
		
		log.info("Dresses Purchase Finished");
		
		clickElement(pom.getP5().getProceed_btn());
		clickElement(pom.getP5().getProceed_btn());
		clickElement(pom.getP5().getConfirn_Btn());

		clickElement(pom.getP6().getCheckbox());
		
		clickElement(pom.getP6().getSubmit_btn());
		
		clickElement(pom.getP6().getPayment());
		
		clickElement(pom.getP6().getSubmit_btn());
		
		clickElement(pom.getP6().getBack_btn());
		
		log.info("Program finished");

	}
	
	
	

}
