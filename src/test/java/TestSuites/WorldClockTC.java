package TestSuites;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Pages.WorldClock;

public class WorldClockTC extends Base {
	
	WorldClock ha= new WorldClock();
	@BeforeTest
	public void invokeBrowser() {
		logger = report.createTest("Executing Test Cases");

		ha.invokeBrowser();
		reportPass("Browser is Invoked");
	}

	@Test(priority = 1)
	public void testCases() throws InterruptedException, IOException {

		ha.openURL();
		ha.login();
		ha.CurrentTime();
		ha.slideBar();
		ha.DiffTime();
		reportPass("All steps passed successfuly");
	}

	@AfterTest
	public void closeBrowser() throws IOException {
		reportPass("Browser is closed successfuly");
		ha.endReport();
		ha.closeBrowser();
	}

}
