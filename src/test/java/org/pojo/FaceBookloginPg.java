package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookloginPg extends BaseClass {

	public FaceBookloginPg() {
		
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(id = "email")
	private WebElement userName;
	
	@FindBy(id = "pass")
	private WebElement passWord;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
