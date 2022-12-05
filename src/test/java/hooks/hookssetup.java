package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hookssetup {

	@Before ("@Example")
	public void beforemthod()
	{
		System.out.println("before Method");
	}
	
	@After
	public void AfterMethod()
	{
		System.out.println("After Method");

	}
}
