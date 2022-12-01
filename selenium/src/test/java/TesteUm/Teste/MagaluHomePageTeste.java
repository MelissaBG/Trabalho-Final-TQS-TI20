package TesteUm.Teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import TesteUm.Pages.MagaluHomePage;

public class MagaluHomePageTeste {
    static WebDriver driver;
    static MagaluHomePage magaluHomePage;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/Users/55519/Documents/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.magazineluiza.com.br");
        driver.manage().window().maximize();
        magaluHomePage = new MagaluHomePage(driver);

    }

    @Test
    public void test(){
        //Campo Buscar produto
        magaluHomePage.preecherCampoBuscarProduto();

    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{

    }
}
