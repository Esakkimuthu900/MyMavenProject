package com.base_class;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class{
	
	public static WebDriver driver;
	public static String Value;
	
public static WebDriver browser_launch(String type) { 
		
		if(type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
public static void getUrl(String url) {
		driver.get(url);
	}
	
public static void clickElement(WebElement element) {
		element.click();
	}
	
public static void inputElement(WebElement element ,String data) {
		element.sendKeys(data);
	}
	
public static void clear(WebElement element) {
		element.clear();
	}
	
public static void dropdown(String type ,WebElement element , String data) {
		Select s = new Select(element);
		
	if (type.equalsIgnoreCase("Value")) {
		s.selectByValue(data);
	}
	else if (type.equalsIgnoreCase("Visibletext")) {
	   s.selectByVisibleText(data);
	}
	else if (type.equalsIgnoreCase("Index")) {
		int index = Integer.parseInt(data);
		s.selectByIndex(index);
	}
}
	
public static void close() {
		driver.close();
	}
	
public static void  filehandler(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File save = new File(path);
		FileHandler.copy(source, save);
	}
	
public static void fileutils(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File souce1 = ts.getScreenshotAs(OutputType.FILE);
		File Save1 = new File(path);
		FileUtils.copyFile(souce1, Save1);

	}
public static void explicitwait(int seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
public static void implicitwait(int seconds, String type) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.valueOf(type));
	}
public static void action(String type , WebElement element) {
		Actions ac = new Actions(driver);
	if (type.equalsIgnoreCase("Click")) {
		ac.click(element).build().perform();
	}
	else if (type.equalsIgnoreCase("doubleclick")) {
		ac.doubleClick(element).build().perform();
	}
	else if (type.equalsIgnoreCase("rightclick")) {
		ac.contextClick(element).build().perform();
	}
	else if (type.equalsIgnoreCase("Move")) {
		ac.moveToElement(element).build().perform();
	}
  }
public static void Drag_And_Drop(WebElement from,WebElement to) {
	
	Actions ac = new Actions(driver);
	ac.clickAndHold(from).moveToElement(to).release(to).build().perform();
	
}
public static void robot(String type ,int values) throws AWTException {
		
		Robot r = new Robot();
		if(type.equalsIgnoreCase("Keypress")) {
			r.keyPress(values);
		}
		else if (type.equalsIgnoreCase("keyrelease")) {
			r.keyRelease(values);
		}
	}
public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	
	}
public static void Default() {
		driver.switchTo().defaultContent();
	}
public static void Alert(String type) {
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
 public static String getdata(String path , int sheetindex , int rowindex ,int cellindex) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new  FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheetAt(sheetindex);
		Row r = s.getRow(rowindex);
		Cell c = r.getCell(cellindex);
		CellType type = c.getCellType();
		
		 if (type.equals(CellType.NUMERIC)) {
			 
			 double nv = c.getNumericCellValue();
			 int i = (int) nv;
			 Value = String.valueOf(i);
		
		}
		 else if (type.equals(CellType.STRING)) {
			 Value = c.getStringCellValue();
		
		} 
		 return Value;
	}
public static void ScrollbyElement(WebElement element ) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
public static void refresh() {
	   driver.navigate().refresh();
   }
public static void Webtablealldata(List<WebElement> element) {
		 
		 for (WebElement coloumtext : element) {
				String text = coloumtext.getText();
				System.out.println(text);
	}	 
}
public static void gettext(WebElement element) {
	 String text = element.getText();
		System.out.println(text);
  }
public static void getposition(WebElement element) {
	
	Point position = element.getLocation();
	int x = position.getX();
	int y = position.getY();
	System.out.println("X value is : "+ x);
	System.out.println("Y value is : "+ y);
}
public static void getdimension( WebElement element) {
	
	int height = element.getSize().getHeight();
	int width = element.getSize().getWidth();
	System.out.println("Height is : " + height);
	System.out.println("Width size : " + width);
}
public static void getattribute(WebElement element) {
	String text = element.getAttribute("value");
	System.out.println(text);
}
public static void navigateto(String value) {
	driver.navigate().to(value);
}
public static void back() {
    driver.navigate().back();
}
public static void forward() {
    driver.navigate().forward();
}

   

}
