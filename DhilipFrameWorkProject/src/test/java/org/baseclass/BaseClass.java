package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {

	public static WebDriver driver;

	// 1
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2
	public static void WinMax() {
		driver.manage().window().maximize();
	}

	// 3
	public static void loadUrl(String url) {
		driver.get(url);
	}

	// 4
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}

	// 5
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	// 6
	public static void fill(WebElement ele, String Value) {
		ele.sendKeys(Value);
	}

	// 7
	public static void btnClick(WebElement ele) {
		ele.click();
	}

	// 8
	public static void closeBrowser() {
		driver.close();
	}

	// 9
	public static void rightClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	// 10
	public static void dClick(WebElement ele) {
		Actions b = new Actions(driver);
		b.doubleClick(ele).perform();
	}

	// 11
	public static void quitBrowser() {
		driver.quit();
	}

	// 12
	public static void textPrint(WebElement Print) {
		String text = Print.getText();
		System.out.println(text);
	}

	// 13
	public static void textPrintgivenValue(WebElement Print) {
		String text = Print.getAttribute("value");
		System.out.println(text);
	}

	// 14
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	// 15
	public static void DandD(WebElement ele) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele, null);
	}

	// 16
	public static void move(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele);
	}

	// 17
	public static void keyUp(WebElement ele) {
		Actions a = new Actions(driver);
		a.keyUp(null);
	}

	// 18
	public static void keyDown(WebElement ele) {
		Actions a = new Actions(driver);
		a.keyDown(null);
	}

	// 19
	public static void perform(WebElement ele) {
		Actions a = new Actions(driver);
		a.perform();
	}

	// 20
	public static void build(WebElement ele) {
		Actions a = new Actions(driver);
		a.build();
	}

	// 21
	public static void equals() {
		Actions a = new Actions(driver);
		a.equals(null);
	}

	// 22
	public static void pause(WebElement ele) {
		Actions a = new Actions(driver);
		a.pause(3000);
	}

	// 23
	public static void release(WebElement ele) {
		Actions a = new Actions(driver);
		a.release();
	}

	// 24
	public static void wait(WebElement ele) throws InterruptedException {
		Actions a = new Actions(driver);
		a.wait();
	}

	// 25
	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// 26
	public static void up() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	// 27
	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// 28
	public static void cut() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	// 29
	public static void copy() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// 30
	public static void paste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// 31
	public static void first() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.KEY_FIRST);
	}

	// 32
	public static void last() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.KEY_LAST);
	}

	// 33
	public static void capsLock() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
	}

	// 34
	public static void clear() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CLEAR);
	}

	// 35
	public static void shift() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
	}

	// 36
	public static void pause() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_PAUSE);
	}

	// 37
	public static void stop() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_STOP);
	}

	// 38
	public static void eraseBack() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Z);
	}

	// 39
	public static void eraseFront() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Y);
	}

	// 40
	public static void cancel() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CANCEL);
	}

	// 41
	public static void pageDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	}

	// 42
	public static void pageUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_PAGE_UP);
	}

	// 43
	public static void undo() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_UNDO);
	}

	// 44
	public static void screenShot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dsc = new File("location");
		FileHandler.copy(src, dsc);
	}

	// 45
	public static void scrollUp(WebElement Scrollup) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Scrollup);
	}

	// 46
	public static void scrollDown(WebElement Scrollup) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", Scrollup);
	}

	// 47
	public static void alertAccept(WebElement Scrollup) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// 48
	public static void alertDismiss(WebElement Scrollup) {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.dismiss();
	}

	// 49
	public static void frame() {
		driver.switchTo().frame(0);
	}

	// 50
	public static void windowsHandling() {
		String ParentId = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String childwindow : handles) {
			driver.switchTo().window(childwindow);
		}
	}

	// 51
	public static void webtableRowPrint(WebElement table) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
		}
		List<WebElement> headings = table.findElements(By.tagName("td"));
		for (int j = 0; j < headings.size(); j++) {
			WebElement heading = headings.get(j);
			System.out.println(heading.getText());
		}
	}

	// 52
	public static void webtableNumberOfRowsFind(WebElement table) {
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number of rows : " + rowCount);
	}

	// 53
	public static void webtableParticularRowCellPrint() {
		WebElement print = driver.findElement(By.xpath("//td::td[1]"));
		String text = print.getText();
		System.out.println(text);
	}

	// 54
	public static void javascriptSendKeys(WebElement Print) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','value given')", Print);
	}

	// 55
	public static void javascriptClick(WebElement Click) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Click);
	}

	// 56
	public static void scannerLong() {
		Scanner a = new Scanner(System.in);
		long id = a.nextLong();
	}

	// 57
	public static void scannerString() {
		Scanner a = new Scanner(System.in);
		String Name = a.next();
	}

	// 58
	public static void scannerFloat() {
		Scanner a = new Scanner(System.in);
		float Salary = a.nextFloat();
	}

	// 59
	public static void scannerCharAt() {
		Scanner a = new Scanner(System.in);
		char Gender = a.next().charAt(0);
	}

	// 60
	public static void scannerShort() {
		Scanner a = new Scanner(System.in);
		short Mark = a.nextShort();
	}

	// 61
	public static void scannerInt() {
		Scanner a = new Scanner(System.in);
		int Num = a.nextInt();
	}

	// 62
	public static void stringLength() {
		String a = "value";
		System.out.println(a.length());
	}

	// 63
	public static void stringEquals() {
		String a = "value";
		System.out.println(a.equals(null));
	}

	// 64
	public static void stringReplace() {
		String a = "value";
		System.out.println(a.replace("a", "i"));
	}

	// 65
	public static void stringLowercase() {
		String a = "value";
		System.out.println(a.toLowerCase());
	}

	// 66
	public static void stringUppercase() {
		String a = "value";
		System.err.println(a.toUpperCase());
	}

	// 67
	public static void ArrayList() {
		List<Integer> li = new LinkedList<Integer>();

		li.add(null);
		System.out.println(li);
	}

	// 68
	public static void set() {
		Set<Integer> s = new TreeSet<Integer>();

		s.add(null);
		System.out.println(s);
	}

	// 69
	public static void stringCompare() {
		String a = "value";
		System.out.println(a.compareTo(a));
	}

	// 70
	public static void Trim() {
		String a = "value";
		System.out.println(a.trim());
	}

}
