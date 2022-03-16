package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUp {
	WebDriver driver ;
	
	@Given("^Launch the website$")
	public void launch_the_website() throws Throwable {
		System.setProperty( "webdriver.chrome.driver",
	            "C:\\Users\\SujathaD\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	       
	        driver = new ChromeDriver();
	  
	        driver.get("http://elearningm1.upskills.in/ ");
	    	driver.manage().window().maximize();
	    
	}

	@When("^Enter all the mandatory fields and register$")
	public void enter_all_the_mandatory_fields_and_register() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login_block\"]/div/ul/li[1]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("sujatha");
		driver.findElement(By.name("lastname")).sendKeys("D");
		driver.findElement(By.name("email")).sendKeys("dsujatha.yrkr@gmail.com");
		driver.findElement(By.name("username")).sendKeys("SujathaDDD");
		driver.findElement(By.name("pass1")).sendKeys("Suj@th@966");
		driver.findElement(By.name("pass2")).sendKeys("Suj@th@966");
		driver.findElement(By.name("submit")).click();
	

	}

	@Then("^Verify message Your personal settings have been registered$")
	public void verify_message_Your_personal_settings_have_been_registered() throws Throwable {
		if(driver.getPageSource().contains("Your personal settings have been registered")) {;
		System.out.println("Your personal settings have been registered Present");}
		
	else{
			System.out.println("Your personal settings have been registered Present");
			}
		
	
	}


}
