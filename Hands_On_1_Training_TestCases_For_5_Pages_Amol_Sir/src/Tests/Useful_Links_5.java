	
	
	package Tests;

	import java.util.Set;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
    import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	
	public class Useful_Links_5 {
	
	WebDriver driver = null;
	@BeforeClass
	public void browser_Open() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/JAVA/Selenium%20Set%20up/Selenium%20Set%20up/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/links.html");
		
	}
	// To verify that the button in front of "Schedule" is clickable or not 
	@Test  
	public void useful_Links_1 () throws Exception {
		
		System.out.println("===1. To verify that the button in front of Schedule is clickable or not  ==========");
		String windowParent = driver.getWindowHandle();
		driver.findElement(By.xpath("//tr[2]//td[3]//a")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		
		for (String window :windows) {
			if (!window.equals(windowParent)) {
				String title = driver.switchTo().window(window).getTitle();
				Thread.sleep(2000);
			    		System.out.println("Actual Title is : "+ title);
			    		Thread.sleep(2000);
			    		Assert.assertEquals(title, "Page not found | javabyKiran");
			    		driver.close();
			    		driver.switchTo().window(windowParent);
			    		// important step
			    		// here you have to shift to parent window
			    		// otherwise driver will point towards closed window
				}
			
		}
		
		 System.out.println("================================================");
	    }
	
		// To verify that the button in front of "Video Lactures All Topics" is clickable or not 
	
    	@Test  (dependsOnMethods ="useful_Links_1")
    	public void useful_Links_2 () throws Exception {
    		Thread.sleep(2000);
    		System.out.println("===2. To verify that the button in front of \"Video Lactures All Topics\" is clickable or not");
    		driver.findElement(By.xpath("//tr[3]//td[3]//a")).click();
    		String windowParent = driver.getWindowHandle();
    		Thread.sleep(2000);
    		Set<String> windows = driver.getWindowHandles();
    		
    		for (String window :windows) {
    			if (!window.equals(windowParent)) {
    				String title = driver.switchTo().window(window).getTitle();
    				Thread.sleep(2000);
    			    		System.out.println("Actual Title is : "+ title);
    			    		Thread.sleep(2000);
    			    		Assert.assertEquals(title, "Live Videos | javabyKiran");
    			    		driver.close();
    			    		driver.switchTo().window(windowParent);
    				}
    			
    		}
    		
    		 System.out.println("================================================");
    	    }
    	
    	// To verify that the button in front of "Selenium Interview Questions" is clickable or not 
    	
    	@Test  (dependsOnMethods ="useful_Links_2")
    	public void useful_Links_3 () throws Exception {
    		Thread.sleep(2000);
    		System.out.println("===3. To verify that the button in front of \"Selenium Interview Questions\" is clickable or not");
    		driver.findElement(By.xpath("//tr[4]//td[3]//a")).click();
    		String windowParent = driver.getWindowHandle();
    		Thread.sleep(2000);
    		Set<String> windows = driver.getWindowHandles();
    		
    		for (String window :windows) {
    			if (!window.equals(windowParent)) {
    				String title = driver.switchTo().window(window).getTitle();
    				Thread.sleep(2000);
    			    		System.out.println("Actual Title is : "+ title);
    			    	   	Thread.sleep(2000);
    			    		Assert.assertEquals(title, "Page not found | javabyKiran");
    			    		driver.close();
    			    		driver.switchTo().window(windowParent);
    				}
    			
    		}
    		
    		 System.out.println("================================================");
    	    }
    	
// To verify that the button in front of "Java Interview Questions" is clickable or not 
    	
    	@Test  (dependsOnMethods ="useful_Links_3")
    	public void useful_Links_4 () throws Exception {
    		Thread.sleep(2000);
    		System.out.println("===4. To verify that the button in front of \"Java Interview Questions\" is clickable or not");
    		driver.findElement(By.xpath("//tr[5]//td[3]//a")).click();
    		String windowParent = driver.getWindowHandle();
    		Thread.sleep(2000);
    		Set<String> windows = driver.getWindowHandles();
    		
    		for (String window :windows) {
    			if (!window.equals(windowParent)) {
    				String title = driver.switchTo().window(window).getTitle();
    				        Thread.sleep(2000);
    			    		System.out.println("Actual Title is : "+ title);
    			    	   	Thread.sleep(2000);
    			    		Assert.assertEquals(title, "Page not found | javabyKiran");
    			    		driver.close();
    			    		driver.switchTo().window(windowParent);
    				}
    			
    		}
    		
    		 System.out.println("================================================");
    	    }
    	
// To verify that the button in front of "Selenium Interview Questions" is clickable or not 
    	
    	@Test  (dependsOnMethods ="useful_Links_4")
    	public void useful_Links_5 () throws Exception {
    		Thread.sleep(2000);
    		System.out.println("===5. To verify that the button in front of \"Courses\" is clickable or not");
    		driver.findElement(By.xpath("//tr[6]//td[3]//a")).click();
    		String windowParent = driver.getWindowHandle();
    		Thread.sleep(2000);
    		Set<String> windows = driver.getWindowHandles();
    		
    		for (String window :windows) {
    			if (!window.equals(windowParent)) {
    				String title = driver.switchTo().window(window).getTitle();
    			    		Thread.sleep(3000);
    			    		System.out.println("Actual Title is : "+ title);
    			    	   	Thread.sleep(2000);
    			    		Assert.assertEquals(title, "Page not found | javabyKiran");
    			    		driver.close();
    			    		driver.switchTo().window(windowParent);
    				}
    			
    		}
    		
    		 System.out.println("================================================");
    	    }
    	
// To verify that the button in front of "Selenium Interview Questions" is clickable or not 
    	
    	@Test  (dependsOnMethods ="useful_Links_5")
    	public void useful_Links_6 () throws Exception {
    		Thread.sleep(3000);
    		System.out.println("===6. To verify that the button in front of \"Placement\" is clickable or not");
    		driver.findElement(By.xpath("//tr[7]//td[3]//a")).click();
    		String windowParent = driver.getWindowHandle();
    		Thread.sleep(3000);
    		Set<String> windows = driver.getWindowHandles();
    		
    		for (String window :windows) {
    			if (!window.equals(windowParent)) {
    				String title = driver.switchTo().window(window).getTitle();
    			    		Thread.sleep(3000);
    			    		System.out.println("Actual Title is : "+ title);
    			    	   	Thread.sleep(2000);
    			    		Assert.assertEquals(title, "Placement | javabyKiran");
    			    		driver.close();
    			    		driver.switchTo().window(windowParent);
    				}
    			
    		}
    		
    		 System.out.println("================================================");
    	    }
    	
    }
		
		
		
	
