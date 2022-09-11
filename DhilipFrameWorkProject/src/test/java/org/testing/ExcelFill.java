package org.testing;

import java.io.IOException;

import org.baseclass.BaseXlClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelFill extends BaseXlClass {
	
public static void main(String[] args) throws IOException {
	launchChrome();
	WinMax();
	loadUrl("https://www.6pm.com/");
	printTitle();
	printCurrentUrl();
	
	WebElement account = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/a"));
	btnClick(account);
	
	WebElement user = driver.findElement(By.id("ap_email"));
	String u = getData(1, 0);
	System.out.println(u);
	fill(user, u);
	
	WebElement textPass = driver.findElement(By.id("ap_password"));
	String p = getData(1, 1);
	System.out.println(p);
	fill(textPass, p);
	
	WebElement btn = driver.findElement(By.id("signInSubmit"));
	btnClick(btn);

}
}