//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Create_Gmail_Account_Without_Examples_Step_Definition {
//
//	WebDriver driver;
//
//	@When("^user is on gmail create account page$")
//	public void user_is_on_gmail_create_account_page() {
//
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\pkshank\\eclipse-workspace\\Enrich_Automation_Framework\\Browser Drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_account_details(String fName, String lName, String uName, String pwd, String confPwd) {
//
//		driver.findElement(By.id("firstName")).sendKeys(fName);
//		driver.findElement(By.id("lastName")).sendKeys(lName);
//		driver.findElement(By.id("username")).sendKeys(uName);
//		driver.findElement(By.name("Passwd")).sendKeys(pwd);
//		driver.findElement(By.name("ConfirmPasswd")).sendKeys(confPwd);
//
//	}
//
//	@Then("^user clicks on next$")
//	public void user_clicks_on_next() {
//
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//	}
//
//	@Then("^user quits the browser$")
//	public void user_quits_the_browser() {
//
//		driver.quit();
//	}
//}
