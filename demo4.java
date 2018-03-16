import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo4 {

	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver d1=new FirefoxDriver();
		d1.get("https://www.ubtiinc.com");
		d1.findElement(By.linkText("AEROSPACE")).click();
		 //Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE PERFORMANCE VISIBILITY")).click();
         //Thread.sleep(2000);
 	    d1.findElement(By.className("img-portion")).click();
 	   //Thread.sleep(8000);
 		String URL="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL);
 		d1.findElement(By.linkText("QUALITY MANAGEMENT")).click();
 		//Thread.sleep(20000);
 		String URL1="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL1);
 		d1.findElement(By.linkText("PROGRAM PERFORMANCE")).click();
 		//Thread.sleep(20000);
 		String URL2="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL2);
 		d1.findElement(By.linkText("ALERT MANAGEMENT")).click();
 		//Thread.sleep(20000);
 		String URL3="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL3);
        d1.findElement(By.partialLinkText("CAPSTONE PROGRAM")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE SUPPLIER")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE QUALITY")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE ALERT")).click();
         //Thread.sleep(8000);
        d1.findElement(By.linkText("TRINITY FRAMEWORK")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("DEVELOPMENT")).click();
        // Thread.sleep(8000);
         //d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("DATA")).click();
        // Thread.sleep(8000);
         //d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("ANALYTICS")).click();
        // Thread.sleep(8000);
        // d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("QA")).click();
         //Thread.sleep(8000);
        // d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("OPERATION")).click();
         //Thread.sleep(8000);
         //d1.findElement(By.linkText("learn more.")).click();
         d1.get("https://www.ubtiinc.com");
         d1.findElement(By.linkText("FINANCE")).click();
         Thread.sleep(2000);
         d1.findElement(By.partialLinkText("EDM infographic")).click();
         Thread.sleep(20000);
  		String URL4="https://ubtiinc.com/industries/financial-services/";
  		d1.navigate().to(URL4);
         d1.findElement(By.linkText("Financial Reporting & Analytics System (FRAS) framework")).click();
         Thread.sleep(20000);
   		String URL5="https://ubtiinc.com/industries/financial-services/";
   		d1.navigate().to(URL5);
   		
         
         
     d1.findElement(By.partialLinkText("Request")).click();
	}
	
}
