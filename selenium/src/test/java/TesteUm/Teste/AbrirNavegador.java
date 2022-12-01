package TesteUm.Teste;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador {
    static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:/Users/Tecnico - TI/Documents/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com.br/");
    }
    @Test
    public void test(){

    }
//    @AfterClass

}
