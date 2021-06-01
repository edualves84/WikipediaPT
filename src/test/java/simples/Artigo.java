package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;
    WebDriver driver;

    @Before
    public void iniciar (){
       url = "https://pt.wikipedia.org/";
       System.setProperty("webdriver.chrome.driver", "drivers/chrome/90/chromedriver.exe" );
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

    }

    @Test 
    public void consultarArtigo(){
       driver.get(url);
        driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa");
        driver.findElement(By.cssSelector("button.wvui-button")).click();
        assertTrue(driver.getTitle().contains("Ovo de Páscoa"));

    }

    @After
    public void finalizarArtigo(){
     driver.quit();


    }


}
