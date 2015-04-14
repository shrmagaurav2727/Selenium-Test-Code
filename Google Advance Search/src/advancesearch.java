import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.ls.LSInput;


public class advancesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Starting webdriver 
		 FirefoxDriver fdriver = new FirefoxDriver();
		 
		 fdriver.manage().timeouts().implicitlyWait(6000, TimeUnit.MICROSECONDS);
		 
		 
		 // launching URL
		 
		 fdriver.get("http:www.google.com");
		 fdriver.manage().window().maximize();
		  
		   // Doing Advance Search 
		 
		        WebElement elem1 = fdriver.findElementByXPath("//input[@name='q']");
		        elem1.click();
		        elem1.sendKeys("Google Advance Search");
		        elem1.sendKeys(Keys.RETURN);
		// Clicing on frst link
		        
		        
		        Thread.sleep(3000);
		        
		        WebElement elem2 =  fdriver.findElementByXPath("//ol[@id='rso']//div[2]/li[1]/div[1]/h3[1]/a"); 
		              elem2.click();
		   
		              
		              //Filling up the advance search form
		              //searching word "Mylyn"
		              
		              
		               WebElement elem3= fdriver.findElementByXPath("//input[@name='as_q']");
		                          elem3.sendKeys("What is Mylyn?");
		                       
		               WebElement elem4= fdriver.findElementByXPath("//input[@name='as_epq']");
		                          elem4.sendKeys("use of Mylyn");
		                          
		                          
		               WebElement elem5= fdriver.findElementByXPath("//input[@name='as_oq']");
		                          elem5.sendKeys("testing requirement");
		              
		               WebElement elem6= fdriver.findElementByXPath("//input[@name='as_eq']");
		                          elem6.sendKeys("developer");
		              
		               WebElement elem7= fdriver.findElementByXPath("//input[@name='as_nlo']");
		                          elem7.sendKeys("2012");
		                          
		               WebElement elem8= fdriver.findElementByXPath("//input[@name='as_nhi']");
		                          elem8.sendKeys("2014");
		              
		        //selecting fields from list drop down menus
		                          
		                          Thread.sleep(4000);
		                          
		                         // 1st list
		                          
		                            fdriver.findElementByXPath("//div[@id='lr_button']").click();
		                          
		             java.util.List<WebElement> list1= fdriver.findElements(By.xpath("//ul[@id='lr_menu']/li"));  
		             
		             System.out.println(list1.size());
		             
		             
                             for (WebElement ls:list1){
                            	 System.out.println(ls.getText());
                            	     
                            	      if (ls.getText().equalsIgnoreCase("English"))
                            	      {
                            	    	 ls.click();
                            	      }
                            	      
                            	      else{
                            	    	  
                            	    	  System.out.println("NOt found ");
                            	    	  
                            	      }
                            	      
                            	      // 2nd List
                            	 
                           fdriver.findElementByXPath("//div[@id='cr_button']/div");
                           
                            java.util.List<WebElement> list2=  fdriver.findElementsByXPath("//ul[@id='cr_menu']/li");
                            
                            System.out.println(list2.size());
                            	      
                            	      for (WebElement ls1:list2){
                                              System.out.println(ls1.getText());
                                              
                                         if(ls1.getText().equalsIgnoreCase("India")){
                                        	 
                                        	 ls1.click();
                                         }
                                              
                            // 3rd List 
                                         
                                         
                                         fdriver.findElementByXPath("//div[@id='as_qdr_button']/div");
                                         
                                         java.util.List<WebElement> list3=  fdriver.findElementsByXPath("//ul[@id='as_qdr_menu']/li");
                                         
                                         System.out.println(list3.size());
                                         	      
                                         	      for (WebElement ls3:list2){
                                                           System.out.println(ls1.getText());
                                                           
                                                      if(ls3.getText().equalsIgnoreCase("past week")){
                                                     	 
                                                     	 ls3.click();
                                                      }               
                                         
                                         fdriver.findElementByXPath("//input[@name='as_sitesearch']");
                                         
                             //site search
                                        
                                       fdriver.findElementByXPath("//form[@name='f']/div[5]/div[4]/div[2]/div/input[@name='as_sitesearch']").sendKeys("google.com");
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                            	      }
                            	      
                            	      
                            	      
                            	      
                            	      
                            	      
                            	      
                            	      
                            	 
                            	 
                             }
                            	 
                            	 
		              
                   
                         
                        
                   
//		                Actions  action = new Actions(fdriver);
//		                action.moveToElement(list1).click();
		              
		
		
	}

}
}
