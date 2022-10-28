	
	
	package Tests;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
		import org.testng.annotations.Test;
	
    public class Users_Page_Tests_3 {
    	
        //	@BeforeClass ==== this will give error
    	// Error :- The annotation @BeforeClass is disallowed for this location
    	// we cannot write anywhere, only we have to write before the method
    	
    	WebDriver driver = null;
    	@BeforeClass
    	public void browser_Open() {
    		
    		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.get("file:///D:/JAVA/Selenium%20Set%20up/Selenium%20Set%20up/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
    	}
    	
    	// To verify that All email contains @
		@Test
		public void users_Email_1() {
			 System.out.println("To verify that All email contains @");
			 List<WebElement> emails = driver.findElements(By.xpath("//td[3]")); // ??
			 int size = emails.size();
			 System.out.println("Email Size = "+ size);
			 
		    for (WebElement email: emails) {
		    	
		    	System.out.println(email.getText());
		    	Assert.assertTrue(email.getText().contains("@"));
		    }
			System.out.println( "=====All email contains @=======");
		}
		
		@Test
		public void users_Mobile_2() {
			System.out.println("To verify that All mobile numbers are 10 digits");
			 List<WebElement> mobiles = driver.findElements(By.xpath("//td[4]"));
			 int size = mobiles.size();
			 System.out.println("Mobile Size = "+ size);
			 
		    for (WebElement mobile: mobiles) {
		    	
		    	System.out.println(mobile.getText());
		    	Assert.assertTrue(mobile.getText().length()==10);
		    }
			System.out.println( "All mobile numbers are 10 digits");
		}
		
		
		@Test
		public void users_Gender_3() {
			System.out.println("To verify that All genders are correct, either Male or Female");
			 List<WebElement> genders = driver.findElements(By.xpath("//td[6]"));
			 int size = genders.size();
			 System.out.println("Geneders Size = "+ size);
			 
		    for (WebElement gender: genders) {
		    	
		    	System.out.println(gender.getText());
		    	if ((gender.getText().equals("Male")) || (gender.getText().equals("Female"))) {
		    		
		    		Assert.assertTrue(true);
		    	}
		    	else
		    	{
		    		System.out.println( "====All genders are not correct=======");
		    		Assert.assertTrue(false);
		    		break;
		    	}
		    }
		}
		
		@Test
		public void users_State_4() {
			 System.out.println("To verify that All Users are from Maharashtra or not");
			 List<WebElement> states = driver.findElements(By.xpath("//td[7]"));
			 int size = states.size();
			 System.out.println("Geneders Size = "+ size);
			 
		    for (WebElement state: states) {
		    	System.out.println(state.getText());
		    	Assert.assertEquals(state.getText(), "Maharashtra", "All states are not Maharashtra");
		    }
		}
		
       @Test
		
		public void users_Delet_5() {
    	    System.out.println("To verify that User delete button available or not in the last column");
			 List<WebElement> deletes = driver.findElements(By.xpath("//td[8]"));
			 int size = deletes.size();
			 System.out.println("Delets Size = "+ size);
			 
		    for (WebElement delete: deletes) {
		    	System.out.println(delete.getText());
		    	Assert.assertEquals(delete.getText(), "Delete", "All not have delete option");
		    }
			System.out.println("======All have delete option=====");
		}
	}
