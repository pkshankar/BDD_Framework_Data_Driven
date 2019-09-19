package StepDefinitions;


import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create_Gmail_Account_Using_Data_Table_Maps_Step_Definition {

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

		for (Map<String, String> userDetails : userDetailsDataTable.asMaps(String.class, String.class)) {

			driver.findElement(By.id("firstName")).sendKeys(userDetails.get("firstname"));
			driver.findElement(By.id("lastName")).sendKeys(userDetails.get("lastname"));
			driver.findElement(By.id("username")).sendKeys(userDetails.get("username"));
			driver.findElement(By.name("Passwd")).sendKeys(userDetails.get("password"));
			driver.findElement(By.name("ConfirmPasswd")).sendKeys(userDetails.get("confirmPassword"));
			driver.navigate().refresh(); //just to check whether I'm able to read data from feature file

		}

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
