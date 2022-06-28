package stepsDuplicateLead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDuplicateLead {

public ChromeDriver driver;
String m,n;
@Given("Open the Chrome browser")
public void openBrowser()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();

driver.manage().window().maximize();
}
@Given("Load the Url {string}")
public void loadUrl(String url)
{
driver.get(url);
}
@Given("Enter the valid username {string}")
public void enterUserName(String uName)
{
driver.findElement(By.id("username")).sendKeys(uName);
}
@Given("Enter the valid password {string}")
public void enterPassword(String pwd)
{
driver.findElement(By.id("password")).sendKeys(pwd);
}
@When("Click on login button")
public void clickLoginButton()
{
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
}
@Then("Home page should be displayed")
public void verifyHomePage()
{
Boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
if(displayed)
{
System.out.println("home page is displayed");
}
else
{
System.out.println("home page is not displayed");
}

}
@When("Click on CRMSFA")
public void clickCRMSFA()
{
driver.findElement(By.linkText("CRM/SFA")).click();
}
@When("Click on Leads")
public void clickLeads()
{
driver.findElement(By.linkText("Leads")).click();
}
@When("Click on FindLeads")
public void findLeads()
{
driver.findElement(By.linkText("Find Leads")).click();
}
@Given("Enter the emailId {string}")
public void emailId(String email)
{
driver.findElement(By.linkText("Email")).sendKeys(email);
}
@When("Click on Find Leads")
public void clickFind() throws InterruptedException
{
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
}
@Then("Get and print first lead id")
public void getfirstId()
{
String r=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
System.out.println(r);
}
@When("Click on First resulting lead")
public void clickfirstLead()
{
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
}
@Then("Get and print company name of that lead")
public void printCompany()
{
n=driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(n);
}
@When("Click on duplicate lead")
public void clickDup()
{
driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
}
@Then("Duplicate lead page should be displayed")
public void pageDup()
{
System.out.println("title:"+driver.getTitle());
}
@When("Click on submit button")
public void submitclick()
{
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
}
@Then("Get and print company name of this lead")
public void getcompany()
{
m=driver.findElement(By.id("viewLead_companyName_sp")).getText();
            System.out.println(m);
}
@Then("Compare both company names")
public void compare()
{
if(n.equals(m))
{
System.out.println("duplicate record having same name as actual record");
}
else
{
System.out.println("record names are different");
}
}

}
