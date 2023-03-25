import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	@Test
	public void helloWorld() {
		
		//mostrar onde está meu drive do navegador
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//abrir o navegador a partir da implementação da interface WebDriver com a classe ChromeDriver
		WebDriver driver = new ChromeDriver();
		//ao abrir o navegador , vá para:
		driver.navigate().to("http://localhost:8080/leiloes");
		driver.quit();
	}
	
}