	

	package Tests;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	
	public class Login_Tests_1 {

	WebDriver driver = null;
	
	@BeforeClass
	
	public void openBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("file:///D:/JAVA/Selenium%20Set%20up/Selenium%20Set%20up/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyRegisterLink_1()  {
		System.out.println("To verify that Registration link is clickable or not");
		driver.findElement(By.className("text-center")).click();
		//xpath= [text()='Register a new membership']
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"JavaByKiran | Registration Page" );
		System.out.println("====================================");
	}
	
	
	@Test(dependsOnMethods = "verifyRegisterLink_1")
	
	void verifyRegistrationAlertmsg_2() throws Exception {
		System.out.println("To verify Registration alert message");
		driver.findElement(By.id("name")).sendKeys("Kiran");
		driver.findElement(By.id("mobile")).sendKeys("1234567890");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println("Alert message:-  "+alertmsg);
		Assert.assertEquals(alertmsg, "User registered successfully.");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("====================================");
	}
	
	@Test(dependsOnMethods= "verifyRegistrationAlertmsg_2")
	
	public void  verifyregisterBlankPasswordError_3() {
		System.out.println("To verify Registration password blank error");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.xpath("//button")).click();
		String passError = driver.findElement(By.id("password_error")).getText();
		System.out.println("pass Error "+ passError);
		Assert.assertEquals(passError, "Please enter Password.");
		System.out.println("====================================");
	}
	
	@Test(dependsOnMethods= "verifyregisterBlankPass_3")
	
	public void verifyregisterBlankEmailError_4() {
		System.out.println("To verify Registration email blank error");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		String emailError = driver.findElement(By.id("email_error")).getText();
		System.out.println("pass Error "+ emailError);
		Assert.assertEquals(emailError, "Please enter Email.");
		System.out.println("====================================");
		
	}
	
	@Test(dependsOnMethods= "registerBlankEmail_4")
		public void verifyRegisterInvalidEmailError_5() {
		System.out.println("To verify Registration invalid email error");
		driver.findElement(By.id("mobile")).clear();
		driver.findElement(By.id("email")).sendKeys("kirangmail.com");
		driver.findElement(By.xpath("//button")).click();
		String emailError = driver.findElement(By.id("email_error")).getText();
		Assert.assertEquals(emailError, "Please enter valid email.");
		System.out.println("====================================");
		}
	
	@Test(dependsOnMethods= "registerValidEmail_5")
	
	public void verifyRegisterLink2_6() throws Exception {
		System.out.println("To verify home back link");
		driver.findElement(By.className("text-center")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Log in");
		Thread.sleep(3000);
		driver.close();
		System.out.println("====================================");
	}
 }
