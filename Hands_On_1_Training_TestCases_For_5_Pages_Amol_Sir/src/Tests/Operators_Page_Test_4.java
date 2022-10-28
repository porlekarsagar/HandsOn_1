	

    package Tests;
    import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;
    import com.sun.media.sound.AutoConnectSequencer;
	
	public class Operators_Page_Test_4 {
		
    	WebDriver driver = null;
    	@BeforeClass
    	public void browser_Open() {
    		
    		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.get("file:///D:/JAVA/Selenium%20Set%20up/Selenium%20Set%20up/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
    		
    	}
    	
    	// Test case to verify that Kiran and Darshit  has  way of connect "Whats App Only"
    	@Test
    	public void wayToConnect_1() {
    		System.out.println("=======1. Test case to verify that Kiran and Darshit  has  way of connect \"Whats App Only\"=======");
    		
    		List<WebElement> whatsapps= driver.findElements(By.xpath("//td[2]"));
    		int size = whatsapps.size();
    		System.out.println("Test 1 size :- "+ size);
    		
    		int i =2;
    	
    	    for(WebElement whatsapp: whatsapps) {
    	    	String str = driver.findElement(By.xpath("//tr["+i+"]//td[4]//span")).getText();
    		
    		if ((whatsapp.getText().equals("Kiran")||whatsapp.getText().equals("Darshit"))) {
    			
    			System.out.println("Operator: " + whatsapp.getText() + ":- "+ str);
    			Assert.assertEquals(str , "Whats App Only");
    		}
    		i++;
    	}
    	    System.out.println("================================================");
    	}
    	
    	// Test case to verify that Kiran and Darshit  has  way of connect "Whats App Only"
    	@Test (dependsOnMethods = "wayToConnect_1")
    	public void wayToConnect_2() {
    		
    		System.out.println("=======2. Test case to verify that Kiran and Darshit  has  way of connect \"Whats App Only\"=========");
    		List<WebElement> whatsapps= driver.findElements(By.xpath("//td[2]"));
    		int size = whatsapps.size();
    		System.out.println("Test 2 size:- "+ size);
    		for(WebElement whatsapp : whatsapps) {
    			
    			if (whatsapp.getText().equals("Kiran")) {
    				
    				String act = driver.findElement(By.xpath("//tr[2]//td[4]//span")).getText();
    				
    				Assert.assertEquals(act,"Whats App Only");
    				System.out.println("Kiran :- " + act);
    			}
    			
    			else if (whatsapp.getText().equals("Darshit")) {
    				
    				String act = driver.findElement(By.xpath("//tr[6]//td[4]//span")).getText();
    				
    				Assert.assertEquals(act,"Whats App Only");
    				System.out.println("Darshit :- " + act);
    			}
    		}
    		 System.out.println("================================================");
    	}
    	
    	// Test case to verify that Neelam , Seema and Varsha has all the way of connect ie [Whats App Phone Call SMS eMail]
    	
    	@Test (dependsOnMethods = "wayToConnect_2")
    	public void wayToConnect_3() {
    		
    		System.out.println("=======3. Test case to verify that Neelam, Seema and Varsha has all the way of connect ie [Whats App Phone Call SMS eMail]=========");
    		List<WebElement> whatsapps= driver.findElements(By.xpath("//td[2]"));
    		int size = whatsapps.size();
    		System.out.println("Test 3 size:- "+ size);
    		for (int i=2; i<=size+1; i++) {
    			
	    		String nameOperator = driver.findElement(By.xpath("//tr["+i+"]//td[2]")).getText();
		    	 WebElement connects = driver.findElement(By.xpath("//tr["+i+"]//td[4]"));
		    	//System.out.println("size = " + connects.size());
		    	String con = connects.getText();
	    		
	    		//System.out.println(nameOperator + " has ways to connect are " + con);
	    		
	    		String a = "Whats App Phone Call SMS eMail";
	    			    		
	    		if (nameOperator.contains("Neelam")||nameOperator.contains("Seema")||nameOperator.contains("Varsha")) {
	    		// if(con.contains(a) && con.contains(b)&& con.contains(c)&& con.contains(d)){
	    			//if(con.contains(a)){
	    			//Assert.assertTrue(true);
	    			Assert.assertEquals(con, a);
	    		    System.out.println(nameOperator + " has ways to connect are " + con);
	    		}
	    		//}
    	      }
    		 System.out.println("================================================");
    		
    	}
    	
    	// To find out the Operator available on Sunday
    	@Test   (dependsOnMethods = "wayToConnect_3")
    	public void Operator_4() {
    		
    		System.out.println("=======4. Test case To find out the Operator available on Sunday==========");
    		List<WebElement> days= driver.findElements(By.xpath("//td[6]/b"));
    		int size = days.size();
    		System.out.println("Test 4 size :- "+ size);
    		
    	    for(int i=2; i<= size+1 ; i++) {
    	    	String timings = driver.findElement(By.xpath("//tr["+i+"]/td[6]/b")).getText();
	    		//System.out.println("Timings :- " + timings);
	    		
	    		if (timings.contains("Sunday")) {
	    			
	    			String operator = driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
	    			System.out.println("Operator: " + operator + " is available on Sunday for contact");
	    			Assert.assertTrue(true);
	    		    }
    	    }
    	    System.out.println("================================================");
    	 }
    	
    	// To find out the Operator handling Administration 
    	@Test   (dependsOnMethods = "Operator_4")
    	public void operator_5() {
    		
    		System.out.println("=======5. Test case To find out the Operator handling Administration ==========");
    		List<WebElement> rols= driver.findElements(By.xpath("//td[3]"));
    		int size = rols.size();
    		System.out.println("Test 5 size :- "+ size);
    		
    	    for(int i=2; i<= size+1 ; i++) {
    	    	String rols2 = driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
	    		//System.out.println("Timings :- " + timings);
	    		
	    		if (rols2.contains("Administration")) {
	    			
	    			String operator = driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
	    			System.out.println("Operator: " + operator + " is handling Administration");
	    			Assert.assertTrue(true);
	    		    }
    	    }
    	    System.out.println("================================================");
    	 }
    	
    	// To find out the Operator for Inquiry
    	@Test  (dependsOnMethods = "operator_5")
    	public void operator_6() {
    		
    		System.out.println("=======6. Test case To find out the Operator for Inquiry ==========");
    		List<WebElement> rols= driver.findElements(By.xpath("//td[3]"));
    		int size = rols.size();
    		System.out.println("Test 6 size :- "+ size);
    		
    	    for(int i=2; i<= size+1 ; i++) {
    	    	String rols2 = driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
	    		//System.out.println("Timings :- " + timings);
	    		
	    		if (rols2.contains("Enquiry")) {
	    			
	    			String operator = driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
	    			System.out.println("Operator: " + operator + " for Inquiry");
	    			Assert.assertTrue(true);
	    		    }
    	    }
    	    System.out.println("================================================");
    	 }
    	
    }
   
