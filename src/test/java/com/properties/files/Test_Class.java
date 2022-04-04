package com.properties.files;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.automation.configuration.files.File_Reader;
import com.automation.pom.Pom_Class;
import com.base_class.Base_Class;

public class Test_Class extends Base_Class {
	
	public static WebDriver driver = browser_launch("Firefox");
	
	public static Pom_Class pom = new Pom_Class(driver);

	     public static void main(String[] args) throws IOException {
	    	 
	    	String url = File_Reader.get_file().get_configuration().geturl();
			
			getUrl(url);
			
			implicitwait(30, "SECONDS");
					
			//Sigin Methods
			
			clickElement(pom.getP1().getSigin_btn());
			
			//Login Methods
			
			String username = File_Reader.get_file().get_configuration().getusername();
			
			inputElement(pom.getP2().getUsername(),username);
			
			String password = File_Reader.get_file().get_configuration().getpassword();
			
			inputElement(pom.getP2().getPassword(),password);
			
			clickElement(pom.getP2().getSubmit_btn());
			
			//Select Purchase Option
			
			clickElement(pom.getP3().getSelectoption());
			
			//Price Change Methods
			
			dropdown("Index",pom.getP3().getPrize(), "1");
			
			//Icon views Change Methods 
			
			clickElement(pom.getP3().getIconview());
			
			//colour Select Methods
			
			clickElement(pom.getP3().getColor_btn());
			
			//Quantity Select Methods
			
			clear(pom.getP4().getQuantity());
			inputElement(pom.getP4().getQuantity(), "2");
			
		    //Size Select Methods
			
			dropdown("Visibletext", pom.getP4().getSize(), "M");
			
			//Add To Card Methods
			
			clickElement(pom.getP4().getAddtocard());
			
			//Checkout Methods
			
			clickElement(pom.getP5().getProceed_btn());
			clickElement(pom.getP5().getProceed_btn());
			clickElement(pom.getP5().getConfirn_Btn());

			//Check Box Methods
			
			clickElement(pom.getP6().getCheckbox());
			
			clickElement(pom.getP6().getSubmit_btn());
			
			//Payment Methods
			
			clickElement(pom.getP6().getPayment());
			
			//conform Payment Methods
			
			clickElement(pom.getP6().getSubmit_btn());
			
			// FileHandler ScreenShot Methods
			filehandler("//C:\\\\Users\\\\om\\\\Pictures\\\\screenshot picture\\\\New folder\\\\order.png");
			
			//Back to orders Methods
			
			clickElement(pom.getP6().getBack_btn());
			
			//File Utils Methods
			fileutils("//C:\\\\Users\\\\om\\\\Pictures\\\\screenshot picture\\\\New folder\\\\confirmorder.png");

		   }

}
