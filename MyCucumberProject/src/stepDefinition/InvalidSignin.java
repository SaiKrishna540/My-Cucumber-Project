package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidSignin {
	
	WebDriver driver;
	
	@Given("^open chrome$")
	public void open_chrome_and_start_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.manage().window().maximize();
	}
	
	@When("^I enter invalid username and valid password$")
	public void i_enter_invalid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("saikrish12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sai143");

	}

	@Then("^User should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

}
