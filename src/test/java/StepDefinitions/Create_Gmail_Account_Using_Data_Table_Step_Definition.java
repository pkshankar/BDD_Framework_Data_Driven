package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create_Gmail_Account_Using_Data_Table_Step_Definition {
	
	WebDriver driver;

	@When("^user is on gmail create account page$")
	public void user_is_on_gmail_create_account_page() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\pkshank\\eclipse-workspace\\Enrich_Automation_Framework\\Browser Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	}

	@Then("^user enters firstname and lastname and username and password and confirmPassword$")
	public void user_enters_account_details(DataTable userDetailsDataTable) {
		
		List<List<String>> userDetails = userDetailsDataTable.raw();

		driver.findElement(By.id("firstName")).sendKeys(userDetails.get(0).get(0));
		driver.findElement(By.id("lastName")).sendKeys(userDetails.get(0).get(1));
		driver.findElement(By.id("username")).sendKeys(userDetails.get(0).get(2));
		driver.findElement(By.name("Passwd")).sendKeys(userDetails.get(0).get(3));
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(userDetails.get(0).get(4));

	}

	@Then("^user clicks on next$")
	public void user_clicks_on_next() {

		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	@Then("^user quits the browser$")
	public void user_quits_the_browser() {

		driver.quit();
	}
}



