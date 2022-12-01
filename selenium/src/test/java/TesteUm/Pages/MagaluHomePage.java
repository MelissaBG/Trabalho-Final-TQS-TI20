package TesteUm.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static io.netty.util.ResourceLeakDetector.isEnabled;

public class MagaluHomePage {
    static WebDriver driver;

    public MagaluHomePage(WebDriver driver) {
        this.driver = driver;
    }
   public void preecherCampoBuscarProduto() {
        WebElement buscarProduto = driver.findElement(By.id("input-search"));
        buscarProduto.sendKeys("235abcd");
        buscarProduto.sendKeys(Keys.ENTER);
    }

    public String capturarMensagem(){
        return driver.findElement(By.xpath("//h1[contains(text(),'Sua busca por \"235abcd\" não encontrou resultado al')]")).getText();

    }

    public void validarQtLojas (){
        WebElement validarQtlojas = driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]"));

    }
}

