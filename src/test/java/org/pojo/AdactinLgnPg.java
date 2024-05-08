package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLgnPg extends BaseClass{

	public AdactinLgnPg() {
		
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(id = "username")
	private WebElement txtUser;
	
	@FindBy(id = "password")
	private WebElement txtPass;
	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(id = "login")
	private WebElement btnLogin;
	
}
		

