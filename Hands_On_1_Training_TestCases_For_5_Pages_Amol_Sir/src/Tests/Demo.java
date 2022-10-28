	package Tests;
	
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Demo {

	
	WebDriver driver = null;
	@BeforeMethod
	
	public void dashboardPage() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ingecnotechnologies.com/other/Wcart/catalog/productCategories/site/view?id=1");
	}
	
	
	@Test
	
	public void demo() {
		//driver.findElement(By.xpath("//h4/a")).click();
		List<WebElement> desktops = driver.findElements(By.xpath("//h4/a"));
		
		System.out.println("Hi");
		
		for(WebElement desktop :desktops ) {
			if (desktop.getText().equals("Apple Cinema 21\""))
			{
				System.out.println("Required : "+ desktop.getText());
				desktop.click();
				break;
			}
			
			else {
				
				System.out.println("Other : "+ desktop.getText());
			}
		}
	}
	
}
