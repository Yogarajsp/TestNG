package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonIphonePg extends BaseClass {

	public AmazonIphonePg() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Apple iPhone')]")
	private WebElement iPhone;
	
	@FindBy(xpath = "//span[@class='a-price-whole']")
	private WebElement price;

	public WebElement getPrice() {
		return price;
	}

	public WebElement getiPhone() {
		return iPhone;
	}
	
}
