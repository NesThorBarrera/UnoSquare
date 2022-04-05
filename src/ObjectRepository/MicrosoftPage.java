package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MicrosoftPage {
	
	WebDriver driver;
	public MicrosoftPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By windowslink=By.id("shellmenu_2"); 
	
	
	public WebElement windowslink() //Windows link
	{
		return driver.findElement(windowslink);
	}
	
	


}
