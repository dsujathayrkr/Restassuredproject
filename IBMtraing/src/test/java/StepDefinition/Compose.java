package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
public class Compose {
	WebDriver driver;

@Given("^Click Compose$")


public void click_Compose() throws Throwable {
	System.setProperty( "webdriver.chrome.driver",
            "C:\\Users\\SujathaD\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
       
        driver = new ChromeDriver();
  
        driver.get("http://elearningm1.upskills.in/ ");
    	driver.manage().window().maximize();
    	driver.findElement(By.name("login")).sendKeys("SujathaD");
    	driver.findElement(By.name("password")).sendKeys("Suj@th@966");
    	driver.findElement(By.name("submitAuth")).click();
    	driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click();
   
}

@When("^Enter the details$")
public void enter_the_details() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("dsujatha.yrkr@gmail.com");
	driver.findElement(By.name("title")).sendKeys("Training");
	driver.findElement(By.xpath("/html")).sendKeys("Training");
	driver.findElement(By.name("compose")).click();

	driver.close();


}


}




