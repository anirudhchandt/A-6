package ft;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.Homepage;

public class FTestcase01_Test extends BaseClass {

	@Test
	public void launch()
	{
		Homepage home=new Homepage(driver);
		home.getBooksLink().click();
		
	}
}
