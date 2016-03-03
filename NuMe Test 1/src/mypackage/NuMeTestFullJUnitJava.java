package mypackage;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class NuMeTestFullJUnitJava {
	  private WebDriver driver;
	  private String baseUrl;

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://numeproducts.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testNuMeTestFullJUnitJava() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.xpath(".//*[@id='products-grid-table']/li[1]/span[1]/a/img")).click();
	    driver.findElement(By.id("attribute163")).click();
	    new Select(driver.findElement(By.id("attribute163"))).selectByVisibleText("Turquoise");
	    driver.findElement(By.cssSelector("option[value=\"49\"]")).click();
	    driver.findElement(By.id("product-addtocart-button")).click();
	    driver.findElement(By.xpath(".//*[@id='amconf-image-49']")).click();
	    driver.findElement(By.xpath(".//*[@id='product-addtocart-button']")).click();
	    driver.findElement(By.xpath(".//*[@id='nume-cart']")).click();	    
	    driver.findElement(By.id("field-email")).clear();
	    driver.findElement(By.id("field-email")).sendKeys("sefremov+898989@atypicalbrands.com");
	    driver.findElement(By.id("field-password")).click();
	    driver.findElement(By.id("field-password")).clear();
	    driver.findElement(By.id("field-password")).sendKeys("12345678");
	    driver.findElement(By.xpath(".//*[@id='opc-login-form']/div/div[4]/div[2]/p/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='hair-head']/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/button")).click();
	    driver.findElement(By.xpath(".//*[@id='opc-popup']/div/div/div[5]/button[2]")).click();
	    driver.findElement(By.cssSelector("div.buttons > button.btn.btn-opc-complete")).click();
	  }

	
	  }
	
