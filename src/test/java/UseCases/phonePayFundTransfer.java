package UseCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import mavenPaypal.CommonMethods;

public class phonePayFundTransfer {

	@Test
	public static void phonePayTransferAmt(){
		
		CommonMethods cm = new CommonMethods();
		cm.transferAmt("Kiran", "Kumar", "500");
		
	}

}
