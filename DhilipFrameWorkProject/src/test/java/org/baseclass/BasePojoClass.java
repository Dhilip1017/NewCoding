package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePojoClass extends BaseXlClass {
	
		public BasePojoClass() {
			PageFactory.initElements(driver, this);
		}
	
	// private webElement
		@FindBy(id = "ap_email")
		private WebElement txtuser;
		
		@FindBy(id = "ap_password")
		private WebElement txtpass;
		
		@FindBy(id="signInSubmit")
		private WebElement btnLogin;
		
		public WebElement getTextUser() {
			return txtuser;
		}
		public WebElement getTextPass() {
			return txtpass;
		}
		public WebElement getBtnLogin() {
			return btnLogin;
			
		}

}
