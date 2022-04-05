package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsPage {

	
		
		WebDriver driver;
		public WindowsPage(WebDriver driver)
		{
			this.driver=driver;
		}
		By searchlink=By.id("search");
		By searchbar=By.id("cli_shellHeaderSearchInput");
		By comprar=By.xpath("//a[text()='Comprar']");
		
		public WebElement searchlink() //Search button
		{
			return driver.findElement(searchlink);
		}
		
		public WebElement searchbar() //Search bar to type the text
		{
			return driver.findElement(searchbar);
		}
		
		public WebElement comprar() //Comprar button
		{
			return driver.findElement(comprar);
		}
	


}
