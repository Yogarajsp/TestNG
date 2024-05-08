package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaytmHomePg extends BaseClass {

	public PaytmHomePg() {
		
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),' For Business')]")
	private WebElement bussiness;

	public WebElement getBussiness() {
		return bussiness;
	}
		
}
