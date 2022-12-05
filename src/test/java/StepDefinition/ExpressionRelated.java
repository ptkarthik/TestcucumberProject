package StepDefinition;

import io.cucumber.java.en.Given;

public class ExpressionRelated {
	@Given("i have {int} laptop")
	public void i_have_laptop(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(int1);
	}
	@Given("i have {double} GDP")
	public void i_have_gdp(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(double1);
	}
	@Given("I have {string} younger than {string} and elder Than {string}")
	public void i_have_younger_than_and_elder_than(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(string+"is younger than"+string2+"and elder than"+string3);
	}



	
}
