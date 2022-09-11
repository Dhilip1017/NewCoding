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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovide extends BaseXlClass {
	
	@BeforeClass
	private void browser() {

		launchChrome();
		WinMax();
	}

	@AfterClass
	private void browserClose() {

		closeBrowser();
	}

	@Test(priority = -5, invocationCount = 3)
	private void tc3() throws IOException, InterruptedException {

		BasePojoClass l = new BasePojoClass();
		fill(l.getTextUser(), getData(2, 0));
		fill(l.getTextPass(), getData(2, 1));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}

	@Test(priority = -2, enabled = true)
	private void tc1() throws IOException, InterruptedException {
		BasePojoClass l = new BasePojoClass();
		fill(l.getTextUser(), getData(1, 0));
		fill(l.getTextPass(), getData(1, 4));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}

	@Test(priority = 2, enabled = true, dataProvider = "login")
	private void tc2(String s1, String s2) throws IOException, InterruptedException {
		BasePojoClass l = new BasePojoClass();
		fill(l.getTextUser(), s1);
		fill(l.getTextPass(), s2);
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	
	@DataProvider(name="login")
	private Object[][] loginDataProvider() throws IOException {
		return new Object[][] {
			{getData(1, 0), getData(1, 4) },
			{getData(2, 0), getData(2, 4) },
			{getData(3, 0), getData(3, 4) },
			{getData(4, 0), getData(4, 4) }};
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
