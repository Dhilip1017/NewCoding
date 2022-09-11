package org.testing;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BasePojoClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitOrder extends BasePojoClass {

	@BeforeClass
	public static void browserLanch() {
		launchChrome();
		WinMax();
	}

	@AfterClass
	public static void browserClose() {
		closeBrowser();
	}

	@Before
	public void startTime() {
		loadUrl("https://www.6pm.com/");
		WebElement account = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/a"));
		btnClick(account);
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	// valid username and valid password
	@Test
	public void tc1() throws IOException, InterruptedException {
		BasePojoClass l = new BasePojoClass();
		fill(l.getTextUser(), getData(1, 0));
		fill(l.getTextPass(), getData(1, 4));
		btnClick(getBtnLogin());
		Thread.sleep(2000);

	}

	// invalid username and valid password
	@Test
	public void tc3() throws IOException, InterruptedException {
		BasePojoClass l = new BasePojoClass();
		fill(l.getTextUser(), getData(2, 0));
		fill(l.getTextPass(), getData(4, 0));
		btnClick(getBtnLogin());
		Thread.sleep(2000);

	}

	// invalid username and invalid password
	@Test
	public void tc2() throws IOException, InterruptedException {
		BasePojoClass l = new BasePojoClass();
		fill(l.getTextUser(), getData(3, 0));
		fill(l.getTextPass(), getData(3, 4));
		btnClick(getBtnLogin());
		Thread.sleep(2000);

	}

}
