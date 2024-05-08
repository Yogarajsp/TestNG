package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinDetailPg extends BaseClass {

	public AdactinDetailPg() {
		
		PageFactory.initElements(d, this);
		
	}
	
	@FindAll({
		@FindBy(id = "radiobutton_1"),
		@FindBy(xpath = "//input[@onclick='check_uncheck1();']")	
	})
	private WebElement hotel;
	
	@FindAll({
		@FindBy(id = "continue"),
		@FindBy(xpath = "//input[@type='submit']")
	})
	private WebElement cntue;

	@FindAll({
		@FindBy(id = "first_name"),
		@FindBy(name = "first_name")
	})
	private WebElement frtName;
	
	@FindBy(id = "last_name")
	private WebElement lstName;
	
	@FindBy(id = "address")
	private WebElement add;
	
	@FindBy(id = "cc_num")
	private WebElement cardNo;
	
	@FindBy(id = "cc_type")
	private WebElement cardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expYr;
	
	@FindAll({
		@FindBy(name = "cc_cvv"),
		@FindBy(xpath = "(//input[@onkeypress='return OnlyNumbersonly(event)'])[2]")
	})
	private WebElement ccv;
	
	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYr() {
		return expYr;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getCntue() {
		return cntue;
	}

	public WebElement getFrtName() {
		return frtName;
	}

	public WebElement getLstName() {
		return lstName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}
	
}
