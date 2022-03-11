package Week3Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
        driver.findElement(By.name("searchVal")).sendKeys("bags" ,Keys.ENTER);
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click(); 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
        Thread.sleep(3000);
        String numberOfItems = driver.findElement(By.className("length")).getText();
        System.out.println("Total number of items : " + numberOfItems);
        
        //Get the list of brand of the products displayed in the page and print the list.
        List<WebElement> brand =driver.findElements(By.className("brand"));
        int NumberofBrands = brand.size();
        System.out.println("The Number of Brands " + NumberofBrands);
        
        for (int i=0;i<NumberofBrands;i++)
        {
        	System.out.println("The Brand Names are " + brand.get(i).getText());
        }
        
     // Get the list of names of the bags and print it
        
        List<WebElement> bags = driver.findElements(By.className("nameCls"));
        int NumberofBags = bags.size();
        System.out.println("The Number of bags " + NumberofBags);
        for (int i=0;i<NumberofBags;i++)
        {
        	System.out.println("The Bag Names are " + bags.get(i).getText());
        }
        
	}

}
