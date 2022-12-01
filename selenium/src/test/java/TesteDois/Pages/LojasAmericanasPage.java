package TesteDois.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LojasAmericanasPage {
    static WebDriver driver;

    public LojasAmericanasPage(WebDriver driver) {
        this.driver = driver;
    }


    public void pesquisarAmericanasPerto() {
        WebElement pesquisarLojasPerto = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        pesquisarLojasPerto.sendKeys("91520540");
        pesquisarLojasPerto.sendKeys(Keys.ENTER);
    }
    public String validarQuantasLojas() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        return driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
    //    String resultado = resultadoPequisa.
    //    System.out.println(resultado);
    }
    public void pesquisarMartelloHotel() {
        WebElement pesquisarLojasPerto = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        pesquisarLojasPerto.sendKeys("martello hotel");
        pesquisarLojasPerto.sendKeys(Keys.ENTER);
    }
    public String validarMensagemMarteloHotel() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        return driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
    }
    public void pesquisarSapopema() {
        WebElement pesquisarSapopema = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        pesquisarSapopema.sendKeys("sapopema");
        pesquisarSapopema.sendKeys(Keys.ENTER);
    }
    public String validarMensagemSapopema() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
       return driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/span[1]")).getText();
   }
   public void esperarMarteloCEP(){
        waitEsperar().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")));
   }
    public void esperarSapopema(){
        waitEsperar().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/span[1]")));
    }

   private WebDriverWait waitEsperar(){
        return new WebDriverWait(driver,Duration.ofSeconds(5));
   }

}

