package org.sample;

import java.util.Date;

import org.Base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junittest extends BaseClass {
	private WebElement getEmail;
	private WebElement getPassowrd;
	public WebElement getloginbtn;

	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}

	@Before
	public void startDate() {
		launchBrowser();
		WindowMaximize();
	}

	@After
	public void EndDate() {
		closeEntrireBrowser();
	}

	@BeforeClass
	public static void launchTheBrowser() {
		launchBrowser();
		WindowMaximize();
	}

	@AfterClass
	public static void closeTheBrowse() {
	//	closeEntrireBrowser();
	}

	@Test
	public void tc1() {
		System.out.println("Test case 1");
		launchUrl("https://en-gb.facebook.com/");
		String  url  = pageUrl();
		Junittest j = new Junittest();
		passText("ramyasubramani@gmail.com", j.getEmail);
		Assert.assertEquals("check your Url ",url,url.contains("facebook"));
passText("ramya", j.getPassowrd);
	}

	@Test
	public void tc3() {
		System.out.println("Test case 3");
		launchUrl("https://en-gb.facebook.com/");
	}

	@Ignore
	@Test
	public void tc4() {
		System.out.println("Test case 4");
		launchUrl("https://www.myntra.com/");
	}

	@Test
	public void tc5() {
		System.out.println("Test case 5");
		launchUrl("https://www.flipkart.com/");
	}

	public WebElement getemail() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getpassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getloginbtn() {
		// TODO Auto-generated method stub
		return null;
	}
}
