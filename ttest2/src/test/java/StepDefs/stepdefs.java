package StepDefs;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import Util.WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.implementedmethods;

public class stepdefs {

	@Before()
	public static void init() {
		System.out.println(">>>>>>>>>>>this is before statement<<<<<<<<<<<<");
		System.out.println("********************************************************************");
	}

	@After()
	public static void testlast() {
		System.out.println("this is last statement<<<<<<<<<<<<<<<<<<<<<<");
	}

	@Given("^first line in background$")
	public void first_line_in_background() {
		System.out.println("first line in BACKGROUND");
	}

	@Given("^first line in scenario$")
	public void first_line_in_scenario() {
		System.out.println("firstline");
	}

	@When("^second line in scenario$")
	public void second_line_in_scenario() throws Throwable {
		System.out.println("secondline");
	}

	@Then("^third line in scenario$")
	public void third_line_in_scenario() throws Throwable {
		System.out.println("thirdline");
	}

	////

	@Given("^Second scenario first line$")
	public void Second_scenario_first_line() throws Throwable {
		System.out.println("second scenario first line");
	}

	@When("^Second Scenrio ([^\\*]*) line$")
	public void Second_Scenrio_value_line(String arg1) throws Throwable {
		System.out.println("this is the value" + arg1);
	}
	////

	@Given("^this has only datatable$")
	public void this_has_only_datatable(DataTable table) throws Throwable {
		List<List<String>> value = table.raw();

		System.out.println(value.get(0).get(0));
	}

	@When("^this parameter statement \"([^\"]*)\"$")
	public void this_parameter_statement(String arg1) throws Throwable {
		System.out.println("printing arguement value" + arg1);
	}

}
