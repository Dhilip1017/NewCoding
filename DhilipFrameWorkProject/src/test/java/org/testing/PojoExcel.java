package org.testing;

import java.io.IOException;

import org.baseclass.BasePojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PojoExcel extends BasePojoClass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	launchChrome(); 	
	WinMax();
	loadUrl("https://www.6pm.com/");
	printTitle();
	printCurrentUrl();
	
	WebElement account = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/a"));
	btnClick(account);
	Thread.sleep(3000);

	BasePojoClass l = new BasePojoClass();
	fill(l.getTextUser(),getData(1, 0));

	WebElement textPass = l.getTextPass();
	fill(textPass, getData(1, 2));
	
	WebElement singIn = l.getBtnLogin();
	btnClick(singIn);

	}
}

