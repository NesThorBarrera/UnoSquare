package ObjectRepository;



	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;


	public class ComprarPage {
		
		WebDriver driver;
		public ComprarPage(WebDriver driver)
		{
			this.driver=driver;
		}
		By app=By.xpath("//span[text()='Aplicaciones']");
		By Link1=By.xpath("//a[text()='1']");
		By Link2=By.xpath("//a[text()='2']");
		By Link3=By.xpath("//a[text()='3']");
		By FirstPrice=By.xpath("//span[contains(@content,'MXN$')][1]");
		By Popup=By.xpath("//*[@id='email-newsletter-dialog']/div[3]/div[1]");
		By Price2=By.xpath("//*[contains(@id,'ProductPrice_productPrice_PriceContainer')]/span");
		By Options=By.xpath("//*[@id='ButtonPanel_buttonPanel_OverflowMenuTrigger']");
		By AddCart=By.xpath("//*[@id='buttonPanel_AddToCartButton']");
		By QuitarItem=By.xpath("//button[contains(text(),'Quitar')]");
		By Carro=By.xpath("//h2[contains(text(),'Resumen del pedido')]");
		By CarroVacio=By.xpath("//p[contains(text(),'Tu carro está vacío')]");
		
		//*[@id="buttonPanel_AddToCartButton"]

	
		public WebElement app() //Windows link
		{
			return driver.findElement(app);
		}
		
		public WebElement Link2() //Windows link
		{
			return driver.findElement(Link2);
		}
		
		public WebElement Link3() //Windows link
		{
			return driver.findElement(Link3);
		}		

		public WebElement Link1() //Windows link
		{
			return driver.findElement(Link1);
		}	
		
		public WebElement FirstPrice() //Windows link
		{
			return driver.findElement(FirstPrice);
		}
		
		public WebElement Popup() //Windows link
		{
			return driver.findElement(Popup);
		}
		
		public WebElement Price2() //Windows link
		{
			return driver.findElement(Price2);
		}
		
		public WebElement Options() //Windows link
		{
			return driver.findElement(Options);
		}
		
		public WebElement AddCart() //Windows link
		{
			return driver.findElement(AddCart);
		}
		
		public WebElement QuitarItem() //Windows link
		{
			return driver.findElement(QuitarItem);
		}

		public WebElement Carro() //Windows link
		{
			return driver.findElement(Carro);
		}

		public WebElement CarroVacio() //Windows link
		{
			return driver.findElement(CarroVacio);
		}
	}

	
