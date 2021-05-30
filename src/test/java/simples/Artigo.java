package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

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
       driver.findElement(By.name("search")).clear();
       driver.findElement(By.name("search")).sendKeys("ovos de pascoa");
       driver.findElement(By.name("search")).click();
       assertEquals("ovos de pascoa", driver.getTitle());

    }

    @After
    public void finalizarArtigo(){
     driver.quit();


    }


}
