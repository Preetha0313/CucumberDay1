package stepsCreateLead;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsCreateLead {

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
	
	@When("Click CreateLead")
	public void clickCreateLead() {
	      driver.findElement(By.linkText("Create Lead")).click();

	}
	
	@Given("Enter the Companyname {string}")
	public void Companyname(String cname) {
	      driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);

	}

	@Given("Enter the Firstname {string}")
	public void Firstname(String fname) {
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("Enter the Lastname {string}")
	public void Lastname(String lname) {
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}
		
	@Given("Enter the FirstLocalname {string}")
	public void Firstlocalname(String flname) {
	      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(flname);

	}
	
	@Given("Enter the Departmentname {string}")
	public void departmentname(String dname) {
	      driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dname);

	}
	
	@Given("Enter the Description {string}")
	public void description(String dspt) {
	      driver.findElement(By.id("createLeadForm_description")).sendKeys(dspt);

	}
	
	@Given("Enter the Email {string}")
	public void email(String email) {
	      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);

	}
	@When("Click on Submit button")
	public void submit() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title is :"+ driver.getTitle());
	}
	
	
	
}
