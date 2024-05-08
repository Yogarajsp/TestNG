package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakemyTripSrchPg extends BaseClass{

	public MakemyTripSrchPg() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']")
	private WebElement from;
	
	@FindBy(xpath = "flt_fsw_inputBox searchToCity inactiveWidget ")
	private WebElement to;
	
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement srch;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getSrch() {
		return srch;
	}
	
}
