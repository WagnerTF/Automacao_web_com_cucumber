package ranners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.CriarContaPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/criar_conta.feature",
		glue = "br.steps",
		tags = {"~@ignore"},
		plugin = "pretty", 
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)

public class RunnerTest {
	
@BeforeClass	
public static void reset () {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\chrome_driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	CriarContaPage page = new CriarContaPage(driver);
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	page.setEmailLogin("messyteste@gmail.com");
	page.setSenha("Dkz!Q6MLyd$9A@@");
	page.setBotãoEntrar();
	driver.quit();
	}

}
