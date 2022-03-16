package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditProfile {
WebDriver driver;

	@Given("^Click on edit profile$")
	public void click_on_edit_profile() throws Throwable {
		System.setProperty( "webdriver.chrome.driver",
	            "C:\\Users\\SujathaD\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	       
	        driver = new ChromeDriver();
	  
	        driver.get("http://elearningm1.upskills.in/ ");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.name("login")).sendKeys("SujathaD");
	    	driver.findElement(By.name("password")).sendKeys("Suj@th@966");
	    	driver.findElement(By.name("submitAuth")).click();
	    	driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[4]/a")).click();
	}

	@When("^upload an image using selenium$")
	public void upload_an_image_using_selenium() throws Throwable {
		WebElement browse = driver.findElement(By.xpath("//*[@id=\"picture_form\"]"));
		   browse.sendKeys("C:\\Users\\SujathaD\\Desktop\\Training folder\\Picture.jpg"); 
		  System.out.println("File is Uploaded Successfully"); 
		  driver.findElement(By.name("cropButton")).click();
		  System.out.println("Image cropped ");
	}

	@Then("^Click on save setting$")
	public void click_on_save_setting() throws Throwable {
		
		 driver.findElement(By.name("apply_change")).click();
		 System.out.println("save button clicked");
		 driver.close();
	}
		
	
}
