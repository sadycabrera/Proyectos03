package tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSourch {
	
	@Test
	public void testSourch()
	{
	    // Write code here that turns the phrase above into concrete actions
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Proyectos Java\\Proyecto03\\drivers\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		//  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://www.onlineexambuilder.com/es/");
		  System.out.println("Cargando..https://www.facebook.com/");
	}

}
