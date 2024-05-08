package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSrchPg extends BaseClass{

	public AmazonSrchPg() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search Amazon.in']")
	private WebElement srch;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btn;

	public WebElement getSrch() {
		return srch;
	}

	public WebElement getBtn() {
		return btn;
	}
	
}
