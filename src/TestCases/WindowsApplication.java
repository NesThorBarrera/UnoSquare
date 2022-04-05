package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.ComprarPage;
import ObjectRepository.MicrosoftPage;
import ObjectRepository.WindowsPage;
import junit.framework.Assert;

public class WindowsApplication{
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void MainPage()
	{
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\nezto\\eclipse-workspace\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nezto\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.microsoft.com/es-mx/");
		
		//Microsoft Page
		MicrosoftPage mp = new MicrosoftPage(driver);

		mp.windowslink().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Windows Page
		WindowsPage wp = new WindowsPage(driver);
		wp.searchlink().click();
		wp.searchbar().sendKeys("xbox");
		wp.searchlink().click();
		wp.comprar().click();
		
		ComprarPage cp = new ComprarPage(driver);
		cp.app().click();
		
		//Count items in List1
		List<WebElement> Links = driver.findElements(By.tagName("h3"));
		for(WebElement obkCurrentLinks : Links )
		{
			String LinkText = obkCurrentLinks.getText();
			System.out.println(LinkText);		
		}
		int Linkcount1 = Links.size();

		cp.Link2().click();
	
		//Count items in List2
		List<WebElement> Links2 = driver.findElements(By.tagName("h3"));
		for(WebElement obkCurrentLinks : Links2 )
		{
			String LinkText = obkCurrentLinks.getText();
			System.out.println(LinkText);
		}
		int Linkcount2 = Links2.size();
		
		System.out.println(Linkcount2);
		
		//Count items in List3
		List<WebElement> Links3 = driver.findElements(By.tagName("h3"));
		for(WebElement obkCurrentLinks : Links3 )
		{
			String LinkText = obkCurrentLinks.getText();
			System.out.println(LinkText);
		}
		int Linkcount3 = Links3.size();
		
		int LinkTC = Linkcount1 + Linkcount2 + Linkcount3;
		
		//Print Total App Count
		System.out.println("El Total de Aplicaciones es: " + LinkTC);
	
		cp.Link1().click();
		
		String FPrice = cp.FirstPrice().getText();
		cp.FirstPrice().click();

		
		// explicit wait - until popup is visible
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-newsletter-dialog']/div[3]/div[1]")));
        // click on the compose button as soon as the "compose" button is visible
		
        //Close Popup
		cp.Popup().click();
		
		Assert.assertEquals(FPrice, cp.Price2().getText());
		System.out.println(FPrice + " es el mismo precio que " + cp.Price2().getText());
		
		cp.Options().click();
		WebDriverWait wait1 = new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='buttonPanel_AddToCartButton']")));
	
		cp.AddCart().click();
		
		//Verify we are in Cart Page
		Assert.assertEquals("Resumen del pedido", cp.Carro().getText());
	
		cp.QuitarItem().click();
		
		Assert.assertEquals("Tu carro está vacío.", cp.CarroVacio().getText());
		
		
		
		//String Pop = PopupElement.getText();
		//System.out.println(Pop);
		
		
		//Alert alert = driver.switchTo().alert();
		//alert.getText();
		//System.out.println(alert.getText());
		//alert.dismiss();	
		//cp.ClosePopup().click();
		
		
		//System.out.println(FPrice);
		
		
		//int xpathCount = driver.findElements(By.xpath("Valid_Xpath")).size();

		//java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
	}

	
	


}
