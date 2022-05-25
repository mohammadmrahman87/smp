package com.EbaySearch.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EbaySearch {
	WebDriver driver;

@Given("I am on Ebay homepage")
public void i_am_on_ebay_homepage() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
    
}

@When("I enter search {string}")
public void i_enter_search(String string) {
	
	WebElement searchBox;
	searchBox=driver.findElement(By.id("gh-ac"));
	searchBox.sendKeys(string);
    
}

@Then("I click on search button")
public void i_click_on_search_button() {
	WebElement searchButton = driver.findElement(By.id("gh-btn"));
    searchButton.click();
}

@Then("I received related search result")
public void i_received_related_search_result() {
	WebElement result = driver.findElement(By.className("srp-controls__count-heading"));
	String nResult= result.getText();
	System.out.println("===============");
	System.out.println(nResult);
	System.out.println("===============");
	driver.close();
}


}
