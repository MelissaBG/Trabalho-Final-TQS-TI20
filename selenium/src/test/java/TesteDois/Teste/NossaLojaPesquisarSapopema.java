package TesteDois.Teste;

import TesteDois.Pages.LojasAmericanasPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NossaLojaPesquisarSapopema {
    static WebDriver driver;
    static LojasAmericanasPage lojasAmericanasPage;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/Users/55519/Documents/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas");
        driver.manage().window().maximize();
        lojasAmericanasPage =new LojasAmericanasPage(driver);

    }

    @Test
    public void test() throws InterruptedException {
        //Metodos

        lojasAmericanasPage.pesquisarSapopema();
        lojasAmericanasPage.esperarSapopema();
        Assert.assertEquals("Não encontramos nenhuma loja próxima /n" +
                "a você. Tente um novo endereço" , lojasAmericanasPage.validarMensagemSapopema());
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{

    }
}
