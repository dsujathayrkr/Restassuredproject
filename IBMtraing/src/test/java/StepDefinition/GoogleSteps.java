package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {
	WebDriver driver;

@Given("^launch google website$")
public void launch_google_website() throws Throwable {
	System.setProperty( "webdriver.chrome.driver",
            "C:\\Users\\SujathaD\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
       
        driver = new ChromeDriver();
  
        driver.get("https:google.com");
    	driver.manage().window().maximize();
}

@When("^the search bar visible$")
public void the_search_bar_visible() throws Throwable {
   System.out.println(driver.findElement(By.name("q")).isDisplayed());
  
}

@Then("^enter text sujatha$")
public void enter_text_sujatha() throws Throwable {
	  driver.findElement(By.name("q")).sendKeys("sujatha");
   
}


}
