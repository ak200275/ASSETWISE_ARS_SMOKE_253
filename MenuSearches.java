/**
 * 
 */
package ARS_Pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import arsFramework.SearchResult;
import arsFramework.SeeElement;
import arsFramework.waiting;

/**
 * @author Anuj.Singh
 *
 */
public class MenuSearches {
	
	
	
		WebDriver driver;
		
		public MenuSearches(WebDriver driver){
			this.driver=driver;
			Date date = new Date();
			String modifiedDate= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
			System.out.println(modifiedDate);
		}
	
		
		
		//another constructor
		public MenuSearches(){
			Date date = new Date();
			String modifiedDate= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
			System.out.println(modifiedDate);
		}
		
		//Click Menu     //
		
		
		/*
		downarrow_menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[3]/img"));
	      menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
	      hamburger_menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[1]"));
		*/
		
		
		
		
		
		//Search Asset   .//*[@id='mainMenuContainer']//a[.='Search assets']
		//Search Conditions   .//*[@id='mainMenuContainer']//a[.='Search conditions']
		//Search Activities   .//*[@id='mainMenuContainer']//a[.='Search activities']
		//Search Organizations   .//*[@id='mainMenuContainer']//a[.='Search organizations']
		// .//*[@id='mainMenuContainer']//a[.='Search contracts']
		//   .//*[@id='mainMenuContainer']//a[.='Search budgets']
		//     .//*[@id='mainMenuContainer']//a[.='Search task orders']
		//        .//*[@id='mainMenuContainer']//a[.='Search items']
		//          .//*[@id='mainMenuContainer']//a[.='Search price lists']
		//      .//*[@id='mainMenuContainer']//a[.='Search documents']
		//     .//*[@id='mainMenuContainer']//a[.='View All Contacts']
		
		
		
		
		// Search Button         .//*[@id='paneCriteria']//button[.='Search']
		
		
	
		public void menuSearchAssets (){
			
			System.out.println("Menu Search Assets");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchasset = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search assets']"));
			        if(SeeElement.checkElement(menusearchasset)){
			        	menusearchasset.click();
			        	System.out.println("Link for menusearchasset is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchasset is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchasset is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);
			driver.get(hm_page);
			waiting.pleaseWait(9);
			
			
			
		}
		public void menuSearchConditions(){
			
			System.out.println("Menu Search Conditions");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchconditions = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search conditions']"));
			        if(SeeElement.checkElement(menusearchconditions)){
			        	menusearchconditions.click();
			        	System.out.println("Link for menusearchconditions is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchconditions is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchconditions is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);
			driver.get(hm_page);
			waiting.pleaseWait(9);
			
			
			
			
		}
		public void menuSearchActivities(){
			
			System.out.println("Menu Search Activities");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchactivities = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search activities']"));
			        if(SeeElement.checkElement(menusearchactivities)){
			        	menusearchactivities.click();
			        	System.out.println("Link for menusearchactivities is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchactivities is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchactivities is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);
			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuSearchOrganizations(){

			System.out.println("Menu Search Organizations");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchorganizations = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search organizations']"));
			        if(SeeElement.checkElement(menusearchorganizations)){
			        	menusearchorganizations.click();
			        	System.out.println("Link for menusearchorganizations is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchorganizations is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchorganizations is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);
			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuSearchContracts(){

			System.out.println("Menu Search Contracts");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchcontracts = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search contracts']"));
			        if(SeeElement.checkElement(menusearchcontracts)){
			        	menusearchcontracts.click();
			        	System.out.println("Link for menusearchcontracts is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchcontracts is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchcontracts is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);
			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuSearchBudgets(){

			System.out.println("Menu Search Budgets");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbudgets = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search budgets']"));
			        if(SeeElement.checkElement(menusearchbudgets)){
			        	menusearchbudgets.click();
			        	System.out.println("Link for menusearchcontracts is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchcontracts is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchcontracts is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);
			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuSearchTaskOrders(){

			System.out.println("Menu Search Task Orders");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchtaskorders = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search task orders']"));
			        if(SeeElement.checkElement(menusearchtaskorders)){
			        	menusearchtaskorders.click();
			        	System.out.println("Link for menusearchtaskorders is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchtaskorders is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchtaskorders is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);
			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuSearchItems(){

			System.out.println("Menu Search Items");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchitems = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search items']"));
			        if(SeeElement.checkElement(menusearchitems)){
			        	menusearchitems.click();
			        	System.out.println("Link for menusearchitems is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchitems is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchitems is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);

			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuSearchPriceLists(){

			System.out.println("Menu Search Price Lists");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchpricelists = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search price lists']"));
			        if(SeeElement.checkElement(menusearchpricelists)){
			        	menusearchpricelists.click();
			        	System.out.println("Link for menusearchpricelists is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchpricelists is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchpricelists is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultPriceLists']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultPriceLists']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);

			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuSearchDocuments(){

			System.out.println("Menu Search Documents");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchdocuments = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='Search documents']"));
			        if(SeeElement.checkElement(menusearchdocuments)){
			        	menusearchdocuments.click();
			        	System.out.println("Link for menusearchdocuments is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchdocuments is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchdocuments is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click search button
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchbutton = driver.findElement(By.xpath(".//*[@id='paneCriteria']//button[.='Search']"));
			        if(SeeElement.checkElement(menusearchbutton)){
			        	menusearchbutton.click();
			        	System.out.println("Link for menusearchbutton is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchbutton is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchbutton is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);

			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}
		public void menuViewAllContacts(){

			System.out.println("Menu Search View All Contacts");
			String hm_page=driver.getCurrentUrl();
			System.out.println(hm_page);
			
			for(int n=0;n<11;n++){
				
				// click on menu at home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menu = driver.findElement(By.xpath(".//*[@id='vm.poNav']/span[2]"));
			        if(SeeElement.checkElement(menu)){
			        	menu.click();
			        	System.out.println("Link for menu is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menu is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menu is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			
			//Click on search link
			for(int n=0;n<11;n++){
				
				// click on search link at  menu on home page
				try{
					
					System.out.println("Inside Try Block");
					WebElement menusearchviewallcontacts = driver.findElement(By.xpath(".//*[@id='mainMenuContainer']//a[.='View All Contacts']"));
			        if(SeeElement.checkElement(menusearchviewallcontacts)){
			        	menusearchviewallcontacts.click();
			        	System.out.println("Link for menusearchviewallcontacts is Clicked");
			        	waiting.pleaseWait(7);
			        	break;
			        }
			        else{System.out.println("WebElement menusearchviewallcontacts is not present");}
			
				}
				catch(NoSuchElementException ne){
						System.out.println("*********************************************************************WebElement menusearchviewallcontacts is not present");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
												}
				catch(Exception e){
						System.out.println("********General Exception");
						System.out.println("***Wait for few sec please");
						waiting.pleaseWait(3);
									}
							}
			
			

			
			// cellvalues
			//no of coulmns
			List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='docmgr_persons']/div[2]/table/tbody//td"));
			List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='docmgr_persons']/div[2]/table/tbody/tr[1]/td[*]"));
			SearchResult.search(cellvalues, noofcol);

			driver.get(hm_page);
			waiting.pleaseWait(9);
			
		
		}

}
