package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinEnterPg extends BaseClass{

	public AdactinEnterPg() {
		
		PageFactory.initElements(d, this);
		
	}
	@CacheLookup
	@FindAll({
		
		@FindBy(id = "location")
		
	})
	private WebElement location;
	
	@FindBy(id = "room_type")
	private WebElement room;
	
	@FindBy(id = "room_nos")
	private WebElement roomNo;
	
	@FindBy(id = "adult_room")
	private WebElement adults;
	
	@FindBy(id = "Submit")
	private WebElement srch;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getSrch() {
		return srch;
	}
		
}
