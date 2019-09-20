package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_And_Tagged_Hooks_Concept_Step_Definition {

	@Before
	public void setUp() {

		System.out.println("LAUNCH BROWSER");
		System.out.println("ENTER URL");
	}

	@After
	public void tearDown() {

		System.out.println("CLOSE BROWSER");
	}

	@Before("@SearchFeature")
	public void before_search_feature() {

		System.out.println("BEFORE SEARCH FEATURE");
	}

	@After("@SearchFeature")
	public void after_search_feature() {

		System.out.println("AFTER SEARCH FEATURE");
	}
	
	@Before("@SortFeature")
	public void before_sort_feature() {
		
		
		System.out.println("BEFORE SORT FEATURE ");
	}
	
	@After("@SortFeature")
	public void after_sort_feature() {
		
		
		System.out.println("AFTER SORT FEATURE ");
	}

	@Given("^scenario-1-given$")
	public void scenario_1_given() {

		System.out.println("SCENARIO 1 GIVEN");
	}

	@When("^scenario-1-when$")
	public void scenario_1_when() {

		System.out.println("SCENARIO 1 WHEN");
	}

	@Then("^scenario-1-then$")
	public void scenario_1_then() {

		System.out.println("SCENARIO 1 THEN");
	}

	@Given("^scenario-2-given$")
	public void scenario_2_given() {

		System.out.println("SCENARIO 2 GIVEN");
	}

	@When("^scenario-2-when$")
	public void scenario_2_when() {

		System.out.println("SCENARIO 2 WHEN");
	}

	@Then("^scenario-2-then$")
	public void scenario_2_then() {

		System.out.println("SCENARIO 2 THEN");
	}

	@Given("^scenario-3-given$")
	public void scenario_3_given() {

		System.out.println("SCENARIO 3 GIVEN");
	}

	@When("^scenario-3-when$")
	public void scenario_3_when() {

		System.out.println("SCENARIO 3 WHEN");
	}

	@Then("^scenario-3-then$")
	public void scenario_3_then() {

		System.out.println("SCENARIO 3 THEN");
	}

}
