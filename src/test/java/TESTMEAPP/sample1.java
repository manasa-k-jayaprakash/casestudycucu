package TESTMEAPP;

//import java.util.List;
//import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample1 {
	WebDriver driver;
/*@Given("^click on SignUp$")
public void click_on_SignUp() throws Throwable {


	driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
    System.out.println("User should not logged in");
    driver.findElement(By.partialLinkText("SignUp")).click();
}

@When("^User enters the below credentails$")
public void user_enters_the_below_credentails() throws Throwable {
   System.out.println("User enters the below credentails");
}

@When("^enter the username \"([^\"]*)\"$")
public void enter_the_username(String arg1) throws Throwable {
	 driver.findElement(By.name("userName")).sendKeys(arg1);
}

@When("^enter the firstname \"([^\"]*)\"$")
public void enter_the_firstname(String arg1) throws Throwable {
	  driver.findElement(By.name("firstName")).sendKeys(arg1);
}

@When("^enter the lastname \"([^\"]*)\"$")
public void enter_the_lastname(String arg1) throws Throwable {
	 driver.findElement(By.id("lastName")).sendKeys(arg1);
}

@When("^enter the password \"([^\"]*)\"$")
public void enter_the_password(String arg1) throws Throwable {
	 driver.findElement(By.id("password")).sendKeys(arg1);
}

@When("^enter the confirm password \"([^\"]*)\"$")
public void enter_the_confirm_password(String arg1) throws Throwable {
	 driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
}

@When("^enter the gender \"([^\"]*)\"$")
public void enter_the_gender(String arg1) throws Throwable {
	 driver.findElement(By.xpath("//input[@value='Female']")).click();
}

@When("^E-mail ID \"([^\"]*)\"$")
public void e_mail_ID(String arg1) throws Throwable {
	driver.findElement(By.name("emailAddress")).sendKeys(arg1);
}

@When("^enter the phone no \"([^\"]*)\"$")
public void enter_the_phone_no(String arg1) throws Throwable {
	  driver.findElement(By.name("mobileNumber")).sendKeys(arg1); 
}

@When("^DOB \"([^\"]*)\"$")
public void dob(String arg1) throws Throwable {
	  driver.findElement(By.id("dob")).sendKeys(arg1);
}

@When("^enter the Address \"([^\"]*)\"$")
public void enter_the_Address(String arg1) throws Throwable {
	  driver.findElement(By.name("address")).sendKeys(arg1);
}

@When("^choose the \"([^\"]*)\"$")
public void choose_the(String arg1) throws Throwable {
	driver.findElement(By.name("securityQuestion")).sendKeys(arg1);
	  
}

@When("^enter your fav pet \"([^\"]*)\"$")
public void enter_your_fav_pet(String arg1) throws Throwable {
	  driver.findElement(By.name("answer")).sendKeys(arg1);
}

@When("^User should click Register button$")
public void user_should_click_Register_button() throws Throwable {
	 driver.findElement(By.name("Submit")).click();
}

@Then("^User must be in Login page$")
public void user_must_be_in_Login_page() throws Throwable {
 System.out.println("User must be in Login page");
}
}*/


/*public class sample1 {
	WebDriver driver;
	@Given("^User must be Registered$")
	public void user_must_be_Registered() throws Throwable {
		driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	    System.out.println("user must be Registered");
	   
	}

	@When("^login with un and pd$")
	public void login_with_un_and_pd(DataTable arg1) throws Throwable {

		List<Map<String, String>> cred=arg1.asMaps(String.class, String.class);
		   for(int i=0;i<cred.size();i++)
		   {
			  System.out.println(cred.get(i).get("username")+"\t"+cred.get(i).get("password"));
				
			   //driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
			   driver.findElement(By.partialLinkText("SignIn")).click();
			      driver.findElement(By.id("userName")).sendKeys(cred.get(i).get("username"));
				  driver.findElement(By.id("password")).sendKeys(cred.get(i).get("password"));
				  driver.findElement(By.name("Login")).click();
				  driver.findElement(By.partialLinkText("SignOut")).click();
				  Thread.sleep(3000);
		   }
		   
	}

	@Then("^user must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
		 System.out.println("User must be in login page");
	}


}*/

	/*public static WebDriver driver;
	   public static WebDriverWait wait;
	 @Given("^Open the TestMeApp$")
	 public void open_the_TestMeApp() throws Throwable 
	 {
		 driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	     driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	       
	       wait=new WebDriverWait(driver,120);
	 }

	 @Given("^Login to the TestMeApp$")
	 public void login_to_the_TestMeApp() throws Throwable 
	 {
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      
	      driver.findElement(By.linkText("SignIn")).click();
	 }

	 @Then("^Inputs \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void inputs_and(String username, String password) throws Throwable 
	 {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
	   driver.findElement(By.name("userName")).sendKeys(username);
	       driver.findElement(By.name("password")).sendKeys(password);
	 }

	 @Then("^Click On login button$")
	 public void click_On_login_button() throws Throwable 
	 {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
	   driver.findElement(By.name("Login")).click();
	 }

	 @Given("^Alex has registered to the TestMeApp$")
	 public void alex_has_registered_to_the_TestMeApp() throws Throwable 
	 {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
	  
	 }

	 @When("^Alex searches for a particular product like headphones$")
	 public void alex_searches_for_a_particular_product_like_headphones() throws Throwable
	 {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
	    driver.findElement(By.name("products")).sendKeys("HeadPhone");
	     driver.findElement(By.xpath(".//input[@value='FIND DETAILS']")).click();
	 }

	 @When("^try to proceed to payment without adding to the cart$")
	 public void try_to_proceed_to_payment_without_adding_to_the_cart() throws Throwable 
	 {
	     // Write code here that turns the phrase above into concrete actions
	    
	    driver.findElement(By.partialLinkText("Add to cart")).click();
	    driver.findElement(By.partialLinkText("Cart")).click();
	    //driver.findElement(By.name("Login")).click();
	    driver.findElement(By.xpath("//input[@value='Remove']")).click();
	    //driver.findElement(By.partialLinkText("Checkout")).click();
	   // throw new PendingException();
	    
	   
	 }

	 @Then("^TestMeApp doesnot show the cart item$")
	 public void testmeapp_doesnot_show_the_cart_item() throws Throwable
	 {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
	   if (driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0) {
	      driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
	      System.out.println("Displays the Image");
	       }
	     else {
	      System.out.println("Icon not found");
	       }  
	  
	 }


	}*/

	
	@Given("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		driver = Utilityclass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
		   driver.findElement(By.partialLinkText("SignIn")).click();
		System.out.println("User must be in home page");
	    
	}

	@When("^User enter login credentails \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_login_credentails_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		 driver.findElement(By.id("password")).sendKeys(arg2);
	   
	}

	@Then("^User enters into Searching product page$")
	public void user_enters_into_Searching_product_page() throws Throwable {
		System.out.println("User enters into Searching product page");
	    
	}

	@Given("^User must be in search home page$")
	public void user_must_be_in_search_home_page() throws Throwable {
	  
	}

	@When("^user enters the product \"([^\"]*)\" to select headphone by clicking on find details$")
	public void user_enters_the_product_to_select_headphone_by_clicking_on_find_details(String arg1) throws Throwable {
	    
	}

	@Then("^User enters into product find details page$")
	public void user_enters_into_product_find_details_page() throws Throwable {
	   
	}

	@Given("^User selects the product$")
	public void user_selects_the_product() throws Throwable {
	 
	}

	@When("^User proceeds with payment$")
	public void user_proceeds_with_payment() throws Throwable {
	
	}

	@Then("^user has purchased the product$")
	public void user_has_purchased_the_product() throws Throwable {
	  
	}


	
}

	