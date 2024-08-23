package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {
	String baseurl="https://www.janasya.com";
	ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
    driver.get(baseurl);
}
@Test
public void test1()
{
	//collection click
   driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16389173641386__header\"]/height-observer/x-header/nav[1]/ul/li[3]/details/summary")).click();
   driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16389173641386__header\"]/height-observer/x-header/nav[1]/ul/li[3]/details/div/ul/li/ul/li[1]/a")).click();
   driver.getTitle();
   String actualtitle=driver.getTitle();
   String exptitle="janasya.com";
   if(actualtitle.equals(exptitle))
   {
	 System.out.println("pass");
   }
   else
   {
	   System.out.println("fail");
   }
   String src=driver.getPageSource();
   if(src.contains("janasya"))
   {
	   System.out.println("pass");
   }
   else
   {
	   System.out.println("fail");
   }
   
}

@Test
public void test2() {

   //cart
   driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16389173641386__header\"]/height-observer/x-header/nav[2]/a[2]/svg")).click();
   Actions act=new Actions(driver);
   WebElement maternity=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16389173641386__header\"]/height-observer/x-header/nav[1]/ul/li[6]/details/summary"));
   act.moveToElement(maternity).perform();
   driver.findElement(By.xpath("//*[@id=\"svgkp\"]/path[1]")).click();
  
  
}
}

   


	
   


