package stepsDeleteLead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDeleteLead {
	
public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void openBrowser() {
		
		  WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Given("Load the application url {string}")
	public void loadURL(String url) {
     driver.get(url);
	}
	
	@Given("Enter the username {string}")
	public void enterUsername(String uName) {
		WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
		eleUserName.sendKeys(uName);
	}
	
	@Given("Enter the password {string}")
    public void enterPassword(String pwd) {
    	driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys(pwd);
    }
	
	@When("Click on Login button")
    public void clickLoginbutton() {
    	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    }
	
	@Then("Homepage should be displayed")
    public void verifyHomepage() {
    	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
    	if(displayed) {
    		System.out.println("Home Page is Displayed");
    	} else {
    		
    		System.out.println("Home Page is not Displayed");
    	}
    		}
	
	@When("Click CRMSFA")
	public void clickthecrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		}
	
	@When("Click Leads")
	public void clickLeads() {
	      driver.findElement(By.linkText("Leads")).click();   
       }
	
	@When("Click FindLeads")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		
	}
	
	@When("Click Phone")
	public void clickPhone() {
	      driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	
	@Given("Enter Phone Number {string}")
	public void enterphnnum(String phonenum) {
	      driver.findElement(By.name("phoneNumber")).sendKeys(phonenum);

	}
	
	@When("Click FindLeads Button")
	public void findLeadbutton() throws InterruptedException {
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      Thread.sleep(2000);

	}
	
	@Then("Capture lead ID of First Resulting lead")
	public void enterleadID() throws InterruptedException {
		String  i= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	      System.out.println(i);
	      Thread.sleep(2000);
	}
	
	@When("Click on first resulting lead")
	public void firstResultinglead() {
	      driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

	}
	
	@When("Click Delete")
	public void clickDelete() {
	      driver.findElement(By.linkText("Delete")).click();

	}
	
	@When("Click Find Leads")
	public void clickFindleads() {
	      driver.findElement(By.linkText("Find Leads")).click();

	}
	
	@Then("Enter captured lead ID")
	public void captureLeadid() {
	      driver.findElement(By.xpath("//input[@name='id']")).click();

	}
	
	@When("Click FindLeads button")
	public void findLeadButton() {
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	
    @Then("Verify the deleted records not found")
    public void verifyDeleterecords() {
    	
    if(driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).isDisplayed())
    {
   	 
        
   	 System.out.println("No Records found");
    }
    
    else 
    
    {
   	 System.out.println("Records are displayed");
   	 
    }
    }
    }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


