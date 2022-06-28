package stepsEditLead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsEditLead {
	
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
	
	@Given("Enter the Firstname {string}")
	public void enterFirstname(String fname) {
	      driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys(fname);
          
	}
	
	@When("Click FindLeads Button")
	public void clickFindLeadsButton() throws InterruptedException{
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      Thread.sleep(2000);
	}
	
	@When("Click on first resulting lead")
	public void clickFirstResultingLead() {
	      driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	
	@When("Click Edit")
	public void clickEdit() throws InterruptedException {
	      driver.findElement(By.linkText("Edit")).click();
	      Thread.sleep(1000);
	}
	
	
	
	@Given("Change the Companyname {string}")
	public void changetheCompanyname(String cname) {
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);

	}
	
	@When("Click Update")
	public void clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		WebElement p=driver.findElement(By.id("viewLead_companyName_sp"));
        System.out.println("The Changed name is : " + p.getText());

		
	}
}
	
	
