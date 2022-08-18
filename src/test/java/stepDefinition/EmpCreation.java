package stepDefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpCreation {
	WebDriver Driver;
	@Given("^user navigate to organgehrm url \"([^\"]*)\"$")
	public void user_navigate_to_organgehrm_url(String url) throws Throwable {
		Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(url);
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	}

	@When("^user login as \"([^\"]*)\"and password \"([^\"]*)\"$")
	public void user_login_as_and_password(String user, String pass) throws Throwable {
	   Driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user);
	   Driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		Driver.findElement(By.id("btnLogin")).click();
	   }

	@When("^user click pim$")
	public void user_click_pim() throws Throwable {
	   Driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	}

	@When("^user click add button$")
	public void user_click_add_button() throws Throwable {
		 Driver.findElement(By.id("btnAdd")).click();
	}

	@When("^user enter \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_enter_and_and(String fname, String mname, String lname) throws Throwable {
	 Driver.findElement(By.name("firstName")).sendKeys();  
	 Driver.findElement(By.name("middleName")).sendKeys(); 
	 Driver.findElement(By.name("lastName")).sendKeys(); 
	}

	@When("^user click save button$")
	public void user_click_save_button() throws Throwable {
	  Driver.findElement(By.id("btnSave")).click();
	}

	@Then("^user validate url$")
	public void user_validate_url() throws Throwable {
	   String expected ="empNumber";
	   String actual = Driver.getCurrentUrl();
	   if(actual.contains(expected)) {
		   System.out.println("emp creation success::"+expected+"  "+actual);
	   }
	   else
	   {
		   System.out.println("emp creation fail::"+expected+"  "+actual);
   
	   }
	}

	@Then("user close browser$")
	public void user_click_logout_button() throws Throwable {
		Driver.close();
		
	   	}


}
