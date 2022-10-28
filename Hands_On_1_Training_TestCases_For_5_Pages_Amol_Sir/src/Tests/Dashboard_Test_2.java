	

	package Tests;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	
	public class Dashboard_Test_2 {

	WebDriver driver = null;
	@BeforeClass
	
	public void dashboardPage() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/JAVA/Selenium%20Set%20up/Selenium%20Set%20up/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	}
	
   @Test
	
	// 1. To verify that after Dashboard, Courses Offered is written
	public void dashboard_Courses_1 () {
	   System.out.println("To verify that after Dashboard, Courses Offered is written");
		String dashboard = driver.findElement(By.xpath("//h1")).getText(); // ?? only Dashboard not locating
		System.out.println(dashboard);
		String courses = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/text()//following-sibling::*")).getText();
		System.out.println(courses);
		Assert.assertEquals(courses,"Courses Offered");
	}
	
	@Test
	// 2. To verify that after Selenium, Automation Testing is written
	public void dashboard_Selenium_2() {
		System.out.println("To verify that after Selenium, Automation Testing is written");
		String selenium = driver.findElement(By.xpath("//h3[text () ='Selenium']")).getText();
		System.out.println(selenium);
		String automation = driver.findElement(By.xpath("//h3[text () ='Selenium']//following-sibling::*")).getText();
		System.out.println(automation);
		Assert.assertEquals(automation,"Automation Testing");
	}
	
  @Test
        //3. To verify that after Java / J2EE, Software Development is written
	public void dashboard_Java_3() {
	    System.out.println("To verify that after Java / J2EE, Software Development is written");
		String java = driver.findElement(By.xpath("//h3[text () ='Java / J2EE']")).getText();
		System.out.println(java);
		String development = driver.findElement(By.xpath("//h3[text () ='Java / J2EE']//following-sibling::*")).getText();
		System.out.println(development);
		Assert.assertEquals(development,"Software Development");
		
	}
	
  @Test
       //4. To verify that after Python, Data Science is written
 	public void dashboard_Python_4 () {
	    System.out.println("To verify that after Python, Data Science is written");
 		String Python = driver.findElement(By.xpath("//h3[text () ='Python']")).getText();
 		System.out.println(Python);
 		String dataScience = driver.findElement(By.xpath("//h3[text () ='Python']//following-sibling::*")).getText();
 		System.out.println(dataScience);
 		Assert.assertEquals(dataScience,"Data Science");
 	}
  
  @Test
  		//5. To verify that after Php, Web Development is written
	public void dashboard_Php_5 () {
	  System.out.println("//To verify that after Php, Web Development is written");
		String Php = driver.findElement(By.xpath("//h3[text () ='Php']")).getText();
		System.out.println(Php);
		String webDevelopment = driver.findElement(By.xpath("//h3[text () ='Php']//following-sibling::*")).getText();
		System.out.println(webDevelopment);
		Assert.assertEquals(webDevelopment,"Web Development");
	}
}
