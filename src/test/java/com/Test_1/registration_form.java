package com.Test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class registration_form {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement txt_firstname;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement txt_lastname;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement num_phone;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	private WebElement txt_address;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	private WebElement txt_city;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	private WebElement txt_state;
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	private WebElement txt_postalcode;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	private WebElement txt_country;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement txt_usename;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement txt_pssword;


	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	private WebElement txt_cfmpassword;

	 public WebElement gettxt_firstname() {
		 
	return txt_firstname;
	
			
			 
		 }

	public WebElement getTxt_lastname() {
		return txt_lastname;
	}

	public void setTxt_lastname(WebElement txt_lastname) {
		this.txt_lastname = txt_lastname;
	}

	public WebElement getNum_phone() {
		return num_phone;
	}

	public void setNum_phone(WebElement num_phone) {
		this.num_phone = num_phone;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public void setTxt_email(WebElement txt_email) {
		this.txt_email = txt_email;
	}

	public WebElement getTxt_address() {
		return txt_address;
	}

	public void setTxt_address(WebElement txt_address) {
		this.txt_address = txt_address;
	}

	public WebElement getTxt_city() {
		return txt_city;
	}

	public void setTxt_city(WebElement txt_city) {
		this.txt_city = txt_city;
	}

	public WebElement getTxt_state() {
		return txt_state;
	}

	public void setTxt_state(WebElement txt_state) {
		this.txt_state = txt_state;
	}

	public WebElement getTxt_postalcode() {
		return txt_postalcode;
	}

	public void setTxt_postalcode(WebElement txt_postalcode) {
		this.txt_postalcode = txt_postalcode;
	}

	public WebElement getTxt_country() {
		return txt_country;
	}

	public void setTxt_country(WebElement txt_country) {
		this.txt_country = txt_country;
	}

	public WebElement getTxt_usename() {
		return txt_usename;
	}

	public void setTxt_usename(WebElement txt_usename) {
		this.txt_usename = txt_usename;
	}

	public WebElement getTxt_pssword() {
		return txt_pssword;
	}

	public void setTxt_pssword(WebElement txt_pssword) {
		this.txt_pssword = txt_pssword;
	}

	public WebElement getTxt_cfmpassword() {
		return txt_cfmpassword;
	}

	public void setTxt_cfmpassword(WebElement txt_cfmpassword) {
		this.txt_cfmpassword = txt_cfmpassword;
	}
	
	
}
	
	
	



