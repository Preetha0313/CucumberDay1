package stepsCreateContact;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsCreateContact {
	
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
	
	@When("Click login button")
	public void clickLogin() {
    	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}
	
	@Then("Home page should be displayed")
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
	
	
	@When("Click Contacts")
	public void clickContact()
	{
		driver.findElement(By.linkText("Contacts")).click();
	}
	
	@When("Click Merge Contacts")
	public void mergeContact() {
		driver.findElement(By.linkText("Merge Contacts")).click();
	}
	
	@Then("Merge contact page should be displayed")
	public void verifyMergeContactpage() {
		System.out.println(driver.getTitle());
	}
	
	@When("Click First Lead")
	public void clickFirstLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(newWindow.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(newWindow.get(0));

	}
	
	@When("Click Second Lead")
	public void secondLead() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> windowHandles1 = driver.getWindowHandles();
	List<String> newWindow1=new ArrayList<String>(windowHandles1);
	driver.switchTo().window(newWindow1.get(1));
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[2]")).click();
	driver.switchTo().window(newWindow1.get(0));
	}
	
	@When("Click Merge Button")
	public void clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	
	
	@Then("Alert box should be displayed")
	public void alertBox() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}
