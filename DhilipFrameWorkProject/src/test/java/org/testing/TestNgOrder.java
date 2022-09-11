package org.testing;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BasePojoClass;
import org.baseclass.BaseXlClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgOrder extends BaseXlClass {
	
	@BeforeClass
	private void browser() {
	
		launchChrome();
		WinMax();
	}
	@AfterClass
	private void browserClose() {
		
		closeBrowser();
	}
	@Test(priority= -5,invocationCount=2)
	private void tc3() throws IOException, InterruptedException {
		
		BasePojoClass l = new BasePojoClass();	
		fill(l.getTextUser(),getData(2, 0));
		fill(l.getTextPass(), getData(2, 1));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	@Test(priority=-2,enabled=true)
	private void tc1() throws IOException, InterruptedException {
		BasePojoClass l = new BasePojoClass();	
		fill(l.getTextUser(),getData(1, 0));
		fill(l.getTextPass(), getData(1, 4));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	@Parameters({"indhu","dhiya"})
	@Test(priority=2)
	private void tc2(@Optional("Mogan")String s1,@Optional("Raju")String s2) throws IOException, InterruptedException {
		BasePojoClass l = new BasePojoClass();	
		fill(l.getTextUser(),getData(2, 0));
		fill(l.getTextPass(),getData(1, 2));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	@BeforeMethod
	private void start() throws InterruptedException {
		System.out.println(new Date());
		loadUrl("https://www.6pm.com/");
		WebElement account = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/a"));
		btnClick(account);
		Thread.sleep(3000);

	}
	@AfterMethod
	private void end() {
		System.out.println(new Date());

	}
	

}
