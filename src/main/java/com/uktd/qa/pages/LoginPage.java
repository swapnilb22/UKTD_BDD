package com.uktd.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.uktd.qa.base.TestBase;

public class LoginPage extends TestBase 
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
}
