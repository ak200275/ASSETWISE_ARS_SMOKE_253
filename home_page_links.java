package ARS_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import arsFramework.Actions1;
import arsFramework.waiting;

/**
 * 
 */

/**
 * @author Anuj.Singh
 *
 */
public class home_page_links {
	
	
      WebDriver driver, driver2;
	
      // collection of all the web elements links
      
  	public home_page_links(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		System.out.println("I am in Constructor");
	}
      
  	
      //Menu
      public WebElement user;
      public WebElement quickSearch;
      public WebElement about;
      public WebElement basket;
      public WebElement downarrow_scopes;
      public WebElement scopes; 
      public WebElement downarrow_menu;
      public WebElement menu;
      public WebElement hamburger_menu;
      public WebElement logo;
      //public Actions1 ac;
      public String xpth;
      public String step;
      
      
      
      
      


	public void checkLinks(){
		System.out.println("===========================Testing Assets Links Started=================================");
		waiting.pleaseWait(50);
		try
		
		{
			String homepageurl = driver.getCurrentUrl();
			System.out.println(homepageurl);
			System.out.println("TestCase: Asset Links");	
			
			
				System.out.println("TestCase 3: New asset");
				
		        //driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New asset']")).isDisplayed();
				Actions1 ac = new Actions1(driver);
				xpth=".//a[@class='ng-binding ng-scope' and .='New asset']";
				step="TestCase 3: New asset";
				if(ac.displayed(driver, xpth, step)){System.out.println("Link for New Asset is displayed");}
				try 
				{ 
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New asset']")).isEnabled();
		        System.out.println("Link for New Asset is enabled");
				
				System.out.println("TestCase 3: New asset Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e)
			{
				System.out.println("**********************************************************************************************TestCase 3: New asset Failed");
					
			}

			try 
			{
				System.out.println("TestCase 4: Search assets");
				
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search assets']")).isDisplayed();
		        System.out.println("Link for New Asset is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search assets']")).isEnabled();
		        System.out.println("Link for New Asset is enabled");
				
				System.out.println("TestCase 4: Search assets Passed");
				System.out.println("======================================================================================");

						
			}
			catch(Exception e)
			{
				
				System.out.println("**********************************************************************************************TestCase 4: Search assets Failed");
				
			}
			try 
			{
				
				System.out.println("TestCase 5: Search conditions");
				
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search conditions']")).isDisplayed();
		        System.out.println("Link for Search conditions is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search conditions']")).isEnabled();
		        System.out.println("Link for Search conditions is enabled");
				
				System.out.println("TestCase 5: Search conditions Passed");
				System.out.println("======================================================================================");
				

			}
			catch(Exception e)
			{
				
				System.out.println("**********************************************************************************************TestCase 5: Search conditions Failed");
					
			}
			
			try 
			{
				
				System.out.println("TestCase 6: View All");
				
				driver.findElement(By.xpath("(.//button[@data-ng-click='viewAll()'])[1]")).isDisplayed();
		        System.out.println("Link for Search conditions is displayed");
		        
		        driver.findElement(By.xpath("(.//button[@data-ng-click='viewAll()'])[1]")).isEnabled();
		        System.out.println("Link for Search conditions is enabled");
				
				System.out.println("TestCase 6: View All Passed");
				System.out.println("======================================================================================");
				

			}
			catch(Exception e)
			{
				
				System.out.println("**********************************************************************************************TestCase 6: View All Failed");
					
			}

		}
		catch (Exception e) 
		{
			
			System.out.println("**********************************************************************************************TestCase Asset Links Failed");


		}

		System.out.println("===========================Testing Assets Links End=================================");



		//Activities-----------STRATED---------------------------------------------

		System.out.println("===========================Testing Activities Links Started=================================");

		//--------------------------------------------------------------------------

		try
		{
			System.out.println("TestCase Activities Links");	
			
			try 
			{
				System.out.println("TestCase 7: Search activities");
				
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search activities']")).isDisplayed();
		        System.out.println("Link for Search activities is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search activities']")).isEnabled();
		        //driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search activitiess']")).isEnabled();
		        System.out.println("Link for Search activities is enabled");
				
				System.out.println("TestCase 7: Search activities Passed");
				System.out.println("======================================================================================");
			
				
			}
			catch(Exception e)	{ System.out.println("**********************************************************************************************TestCase 7: Search activities Failed");}

			try 
			{
				System.out.println("TestCase 8: Schedule activities");
				
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Schedule activities']")).isDisplayed();
		        System.out.println("Link for Schedule activities is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Schedule activities']")).isEnabled();
		        System.out.println("Link for Schedule activities is enabled");
				
				System.out.println("TestCase 8: Schedule activities Passed");
				System.out.println("======================================================================================");
				
			}
			catch(Exception e) {System.out.println("**********************************************************************************************TestCase 8: Schedule activities Failed");}
			
			
		}


		catch (Exception e) {System.out.println("**********************************************************************************************TestCase Activities Failed");}

		waiting.pleaseWait(50);



		System.out.println("===========================Testing Activities Links END=================================");

		//Activities-------------END------------------------------------------------
		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */
		//================================Tasks===================================================================
		System.out.println("===========================Testing Tasks Links Started=================================");
		try
		{
			System.out.println("Testing Tasks Links");
			try{
				System.out.println("TestCase 9: New task order");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New task order']")).isDisplayed();
		        System.out.println("Link for New task order is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New task order']")).isEnabled();
		        System.out.println("Link for New task order is enabled");
				
				System.out.println("TestCase 9: New task order Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 9: New organization Failed");}

			
			try{
				System.out.println("TestCase 10: Search task orders");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search task orders']")).isDisplayed();
		        System.out.println("Link for Search task orders is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search task orders']")).isEnabled();
		        System.out.println("Link for Search task orders is enabled");
				
				System.out.println("TestCase 10: Search task orders Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 10: Search organizations failed");}
			
			try{
				System.out.println("TestCase 11: New contract");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New contract']")).isDisplayed();
		        System.out.println("Link for New contract is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New contract']")).isEnabled();
		        System.out.println("Link for New contract is enabled");
				
				System.out.println("TestCase 11: New contract Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 11: New contract Failed");}
			
			try{
				System.out.println("TestCase 12: Search contracts");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search contracts']")).isDisplayed();
		        System.out.println("Link for Search contracts is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search contracts']")).isEnabled();
		        System.out.println("Link for Search contracts is enabled");
				
				System.out.println("TestCase 12: Search contracts Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 12: Search contracts Failed");}
			
			try{
				System.out.println("TestCase 13: Tasks View All");
				driver.findElement(By.xpath("(.//button[@data-ng-click='viewAll()'])[2]")).isDisplayed();
		        System.out.println("Link for Tasks View All is displayed");
		        
		        driver.findElement(By.xpath("(.//button[@data-ng-click='viewAll()'])[2]")).isEnabled();
		        System.out.println("Link for Tasks View All is enabled");
				
				System.out.println("TestCase 13: Tasks View All Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 13: Tasks View All Failed");}
			
		}
		catch(Exception e){System.out.println("**********************************************************************************************Testing Tasks Links Failed");}
		/* 
		 *
		 */
		 System.out.println("===========================Testing Tasks Links Finished=================================");
		 /* 
		 *
		 * 
		 * 
		 */
		 System.out.println("===========================Testing Items Links Started=================================");
		try{
			System.out.println("Testing Items Links");
			try{
				System.out.println("TestCase 14: New item");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New item']")).isDisplayed();
		        System.out.println("Link for New item is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New item']")).isEnabled();
		        System.out.println("Link for New item is enabled");
				
				System.out.println("TestCase 14: New item Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 14: New item Failed");}
			
			try{
				System.out.println("TestCase 15: Search items");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search items']")).isDisplayed();
		        System.out.println("Link for Search items is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search items']")).isEnabled();
		        System.out.println("Link for Search items is enabled");
				
				System.out.println("TestCase 15: Search items Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 15: Search items Failed");}
			
			try{
				System.out.println("TestCase 16: New price list");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New price list']")).isDisplayed();
		        System.out.println("Link for New price list is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New price list']")).isEnabled();
		        System.out.println("Link for New price list is enabled");
				
				System.out.println("TestCase 16: New price list Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 16: New price list Failed");}
			
			try{
				System.out.println("TestCase 17: Search price lists");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search price lists']")).isDisplayed();
		        System.out.println("Link for Search price lists is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search price lists']")).isEnabled();
		        System.out.println("Link for Search price lists is enabled");
				
				System.out.println("TestCase 17: Search price lists Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 17: Search price lists failed");}
		}


		catch(Exception e){System.out.println("**********************************************************************************************Testing Items Links Failed");}


		System.out.println("===========================Testing Items Links End=================================");
		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */
		try{
			System.out.println("Testing Reports Links");
			try{
				System.out.println("TestCase 18: Launch Dashboards");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Launch Dashboards']")).isDisplayed();
		        System.out.println("Link for Launch Dashboards is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Launch Dashboards']")).isEnabled();
		        System.out.println("Link for Launch Dashboards is enabled");
				
				System.out.println("TestCase 18: Launch Dashboards Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 18: Launch Dashboards Failed");}
		}
		catch(Exception e){System.out.println("**********************************************************************************************Testing Reports Links Failed");}
		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */
		System.out.println("===================Testing Map Link Started======================================");
		try{
			System.out.println("Testing Map Link");
			try{
				System.out.println("TestCase 19: Launch map");
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Launch map']")).isDisplayed();
		        System.out.println("Link for Launch map is displayed");
		        
		        driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Launch map']")).isEnabled();
		        System.out.println("Link for Launch map is enabled");
				
				System.out.println("TestCase 19: Launch map Passed");
				System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 19: Launch map Failed");}
		}

		catch(Exception e){System.out.println("**********************************************************************************************Testing Map Link Failed");}

		System.out.println("===================Testing Map Link End======================================");
		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */

		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */
		//Documents---------------STRATED-------------------------------------------
		System.out.println("===================Testing Document Link Started=====================================");
		try
		{
			System.out.println("TestCase Documents Links");	
			
			try 
			{
				System.out.println("TestCase 20: New Document");
				
				
		      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New document']")).isDisplayed();
		      System.out.println("Link for New document is displayed");
		      
		      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New document']")).isEnabled();
		      System.out.println("Link for New document is enabled");
				
				System.out.println("TestCase 20: New document Passed");
				System.out.println("======================================================================================");
			
				
			}
			catch(Exception e)
			{
				System.out.println("**********************************************************************************************TestCase 20: New Document Failed");
				
				
				
			}

			try 
			{
				System.out.println("TestCase 21: Search Documents");
				
				
		      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search documents']")).isDisplayed();
		      System.out.println("Link for Search documents is displayed");
		      
		      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search documents']")).isEnabled();
		      System.out.println("Link for Search documents is enabled");
				
				System.out.println("TestCase 21: Search documents Passed");
				System.out.println("======================================================================================");
			
				
			}
			catch(Exception e)
			{
				
				System.out.println("**********************************************************************************************TestCase 21: Search Documents Failed");
				
				
			}
		}
		catch (Exception e) 
		{
			
			System.out.println("**********************************************************************************************TestCase Documents Failed");


		}


		System.out.println("===================Testing Document Link End=====================================");

		//--------------------------END---------------------------------------------


		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */

		System.out.println("===================Testing Contacts Started=====================================");



		try{
			try{
				System.out.println("TestCase 22: New person");
				
				
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New person']")).isDisplayed();
			      System.out.println("Link for New person is displayed");
			      
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New person']")).isEnabled();
			      System.out.println("Link for New person is enabled");
					
					System.out.println("TestCase 22: New person Passed");
					System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 22: New contact Failed");}
			
			try{
				System.out.println("TestCase 23: Search persons");
				
				
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search persons']")).isDisplayed();
			      System.out.println("Link for Search persons is displayed");
			      
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Search persons']")).isEnabled();
			      System.out.println("Link for Search persons is enabled");
					
					System.out.println("TestCase 23:  Search persons Passed");
					System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 23: View All Contacts Failed");}
		}
		catch(Exception e){System.out.println("**********************************************************************************************************Failed");}
		System.out.println("===================Testing Contacts End==========================================");





		try{
			System.out.println("===================Testing Record Link Started=========================================");
			try{
				System.out.println("TestCase 24: View records");
				
				
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='View records']")).isDisplayed();
			      System.out.println("Link for View records is displayed");
			      
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='View records']")).isEnabled();
			      System.out.println("Link for View records is enabled");
					
					System.out.println("TestCase 24: View records Passed");
					System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 24: View Records Failed");}
		}
		catch(Exception e){System.out.println("**********************************************************************************************Testing Record Link failed ");}
		System.out.println("===================Testing Record End==============================================");
		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */
		try{
			System.out.println("===================Testing Configuration Links Started==============================================");
			try{
				//Configure activity/asset schedules
				System.out.println("TestCase 25: Configure activity schedules");
				
				
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Configure activity schedules']")).isDisplayed();
			      System.out.println("Link for Configure activity schedules is displayed");
			      
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Configure activity schedules']")).isEnabled();
			      System.out.println("Link for Configure activity schedules is enabled");
					
					System.out.println("TestCase 25: Configure activity schedules Passed");
					System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 25: Configure activity/asset schedules Failed");}
			
			try{
				System.out.println("TestCase 26: Configure financial years");
				
				
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Configure financial years']")).isDisplayed();
			      System.out.println("Link for Configure financial years is displayed");
			      
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='Configure financial years']")).isEnabled();
			      System.out.println("Link for Configure financial years is enabled");
					
					System.out.println("TestCase 26: Configure financial years Passed");
					System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 26: Configure financial years Failed");}
			
			//driver.findElement(By.xpath("(.//button[@data-ng-click='viewAll()'])[3]"))
			try{
				System.out.println("TestCase 27: Configuration View All");
				
				
				driver.findElement(By.xpath("(.//button[@data-ng-click='viewAll()'])[3]")).isDisplayed();
			      System.out.println("Link for Configuration View All is displayed");
			      
			      driver.findElement(By.xpath("(.//button[@data-ng-click='viewAll()'])[3]")).isEnabled();
			      System.out.println("Link for Configuration View All is enabled");
					
					System.out.println("TestCase 27: Configuration View All Passed");
					System.out.println("======================================================================================");
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 27: Configuration View All Failed");}
			
		}
		catch(Exception e){System.out.println("**********************************************************************************************Testing Configuration Link failed");}

		System.out.println("===================Testing Configuration Link End==============================================");
		/*
		 * 
		 * 
		 *
		 * 
		 * 
		 */
		try{
			System.out.println("===================================Testing EXOR Link Started================================");
			try{
				System.out.println("TestCase 28: EXOR Link");
				
				
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='EXOR']")).isDisplayed();
			      System.out.println("Link for EXOR is displayed");
			      
			      driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='EXOR']")).isEnabled();
			      System.out.println("Link for EXOR is enabled");
					
					System.out.println("TestCase 28: EXOR LINK Passed");
					System.out.println("======================================================================================");
					//driver.close();
			}
			catch(Exception e){ System.out.println("**********************************************************************************************TestCase 28: EXOR LINK  Failed");}
		}
		catch(Exception e){System.out.println("**********************************************************************************************Failed");}
		System.out.println("===================================Testing EXOR Link END========================");

		System.out.println("------------------------------------------------links check completed-----------------------------------------------");
		//driver.close();
		//String actual = driver.getTitle();
        //System.out.println(actual);

		               }
		               
	public void checkMenulinks(){
		
		
	      user = driver.findElement(By.xpath(".//*[@id='vm.poUser']/img"));
	      quickSearch = driver.findElement(By.xpath(".//*[@id='vm.poQuickSearch']/img"));
	      about = driver.findElement(By.xpath(".//*[@id='vm.poAbout']/img"));
	      basket = driver.findElement(By.xpath(".//img[@data-imagedefault='content/images/basket-navbar.png']"));
	      downarrow_scopes = driver.findElement(By.xpath(".//*[@id='scopeVM.poScopes']/span[2]/img"));
	      scopes = driver.findElement(By.xpath(".//*[@id='scopeVM.poScopes']/span[1]")); 
	      downarrow_menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[3]/img"));
	      menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
	      hamburger_menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[1]"));
	      logo = driver.findElement(By.xpath(".//a[@class='brand']"));
		
	      //waiting.pleaseWait(50);
		try 
		{
			System.out.println("TestCase 29: User");
			user.isDisplayed();
	        System.out.println("Link for User is displayed");
	        user.isEnabled();
	        System.out.println("Link for User is enabled");
			System.out.println("TestCase 29: User Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************User link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 29: User Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 30: Quick Search");
			quickSearch.isDisplayed();
	        System.out.println("Link for Quick Search is displayed");
	        quickSearch.isEnabled();
	        System.out.println("Link for Quick Search is enabled");
			System.out.println("TestCase 30: Quick Search Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************Quick Search on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 30: quick Search Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 31: about");
			about.isDisplayed();
	        System.out.println("Link for about is displayed");
	        about.isEnabled();
	        System.out.println("Link for about is enabled");
			System.out.println("TestCase 31: about Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************about link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 31: about Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 32: basket");
			basket.isDisplayed();
	        System.out.println("Link for basket is displayed");
	        basket.isEnabled();
	        System.out.println("Link for basket is enabled");
			System.out.println("TestCase 32: basket Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************basket link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 32: basket Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 33: downarrow_scopes");
			downarrow_scopes.isDisplayed();
	        System.out.println("Link for downarrow_scopes is displayed");
	        downarrow_scopes.isEnabled();
	        System.out.println("Link for downarrow_scopes is enabled");
			System.out.println("TestCase 33: downarrow_scopes Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************downarrow_scopes link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 33: downarrow_scopes Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 34: scopes");
			scopes.isDisplayed();
	        System.out.println("Link forscopes is displayed");
	        scopes.isEnabled();
	        System.out.println("Link for scopes is enabled");
			System.out.println("TestCase 34: scopes Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************scopes link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 34: scopes Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 35: downarrow_menu");
			downarrow_menu.isDisplayed();
	        System.out.println("Link for downarrow_menu is displayed");
	        downarrow_menu.isEnabled();
	        System.out.println("Link for downarrow_menu is enabled");
			System.out.println("TestCase 35:downarrow_menu Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************downarrow_menu link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 35: downarrow_menu Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 36: menu");
			menu.isDisplayed();
	        System.out.println("Link for menu is displayed");
	        menu.isEnabled();
	        System.out.println("Link for menu is enabled");
			System.out.println("TestCase 36: menu Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************menu link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 36: menu Link Failed");
				}
		
		
		
		try 
		{
			System.out.println("TestCase 37: hamburger_menu");
			hamburger_menu.isDisplayed();
	        System.out.println("Link forhamburger_menu is displayed");
	        hamburger_menu.isEnabled();
	        System.out.println("Link for hamburger_menu is enabled");
			System.out.println("TestCase 37: hamburger_menu Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************hamburger_menu link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 37: hamburger_menu Link Failed");
				}
		
		
		try 
		{
			System.out.println("TestCase 38: logo");
			logo.isDisplayed();
	        System.out.println("Link for logo is displayed");
	        user.isEnabled();
	        System.out.println("Link for logo is enabled");
			System.out.println("TestCase 38: logo Link Passed");
			System.out.println("------------------------------------------------------------------------------");
					
		}

		catch(NoSuchElementException ne){
			System.out.println("************************************************************************************logo link on Menu is not present");
							}
		catch(Exception e)
		{
			System.out.println("**********************************************************************************************TestCase 38: logo Link Failed");
				}
		
		waiting.pleaseWait(5);
	}
	
		
		
	}
	
	
	
	
	
	
	
	


