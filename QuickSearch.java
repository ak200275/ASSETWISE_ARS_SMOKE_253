/**
 * 
 */
package ARS_Pages;

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
public class QuickSearch {
	
	public WebDriver driver;
	
	public QuickSearch(WebDriver driver){
		
		this.driver = driver;
	}
	
		
	public void activities(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
						//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
								//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Activities']
		//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
		//select option
		//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Assets']

		//keyintext *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		//click SearchButton using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']

		
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
		//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
		
		
		
		//DefaultActivitySearch
		 //                        .//*[@name='DefaultActivitySearch']/div[2]/table/tbody//td
		
		System.out.println("Search for Activities using Quick Search");
		for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Activities']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------ACTIVITIES SEARCH--------------");
		
	}
	public  void asset(){
				
		
		//print url
		//verify url is fit to continue test
		//if not fit then get expected url
		//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		//select option
		//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Assets']
		//keyintext *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'


		
		 //DefaultAsset
		  //          cell values             .//*[@name='DefaultAsset']/div[2]/table/tbody//td
		//no of columns          .//*[@name='DefaultAsset']/div[2]/table/tbody/tr[1]/td[*]
		//needs to define noofcol, and cellvalues List<WebElement>
	
		System.out.println("Search for Assets using Quick Search");
		System.out.println("hp_QuickSearchLink");
		System.out.println(driver.getCurrentUrl());		
for(int n=0;n<11;n++){
			
							
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
		

for(int n=0;n<11;n++){
	
	
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Assets']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

	

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

	
				//click SearchButton using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
			
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}


List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
System.out.print("--------------FINISH--------------ASSETS SEARCH--------------");
		
	}
	public void financialYear(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Financial Year']
				
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				
for(int n=0;n<11;n++){
			
	System.out.println("Search for Financial Year using Quick Search");
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Financial Year']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultFinancialYearConfig']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultFinancialYearConfig']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------Financial Year SEARCH--------------");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void budgets(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Budgets']
				
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				//DefaultBudget
		
		
		System.out.println("Search for Budget using Quick Search");
		
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Budgets']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultBudget SEARCH--------------");
		
		
		
		
		
	}
	public void conditions(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Conditions']
				
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				//DefaultConditionSearch
		
		System.out.println("Search for Conditions using Quick Search");
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Conditions']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultConditionSearch SEARCH--------------");
		
		
		
	}
	public void contracts(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Contracts']
		
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				//DefaultContractSearch	
		System.out.println("Search for Contracts using Quick Search");
		
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Contracts']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------Financial Year SEARCH--------------");
		
	}
	public void documents(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Documents']
				
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
					//DefaultDocumentSearch
		System.out.println("Search for Documents using Quick Search");
		
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("inside try block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Documents']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultDocumentSearch SEARCH--------------");
		
	}
	public void items(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Items']
		
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				//DefaultItemSearch	
		
		System.out.println("Search for Items using Quick Search");
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Items']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultItemSearch SEARCH--------------");
		
		
		
	}
	public void organizations(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Organizations']
				
		
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
					//DefaultOrganizationSearch
		System.out.println("Search for Organizations using Quick Search");
		
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Organizations']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultOrganizationSearch SEARCH--------------");
		
		
		
		
	}
	public void people(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='People']
				
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				//DefaultPerson	
		
		System.out.println("Search for People using Quick Search");
		
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='People']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultPerson']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultPerson']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultPerson SEARCH--------------");
		
		
		
		
	}
	public void priceLists(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Price Lists']
				
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				//	DefaultPriceListSearch
		System.out.println("Search for Price Lists using Quick Search");
		
for(int n=0;n<11;n++){
			
			
			try{
				
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Price Lists']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(9);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultPriceListSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultPriceListSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultPriceListSearch SEARCH--------------");
		
		
		
		
		
	}
	public void taskOrders(){
		
		//click on magnifying glass   .//div[@id=’vm.poQuickSearch’] 
		
				//click on dropdown box:     .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']
				
				
				//select option
				//                  .//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Tasks Orders']
				
		//key in *      .//div[@class='popoverQuickSearch ng-scope']//input[@type='text']  send keys '*'
		
		
				//click search button using    Search button    .//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']
				//DefaultTaskOrderSearch
		System.out.println("Search for Tasks Orders using Quick Search");
		
for(int n=0;n<11;n++){
			
			
			try{	
				System.out.println("Inside Try Block");
				WebElement hp_QuickSearchLink = driver.findElement(By.xpath(".//div[@id='vm.poQuickSearch']"));
		        if(SeeElement.checkElement(hp_QuickSearchLink)){
		        	hp_QuickSearchLink.click();
		        	System.out.println("Link for hp_QuickSearchLink is Clicked");
		        	waiting.pleaseWait(5);
		        	break;
		        }
		        else{System.out.println("WebElement hp_QuickSearchLink is not present");}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************WebElement hp_QuickSearchLink is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(3);
								}
						}
        
			
for(int n=0;n<11;n++){
		
	try{	
		System.out.println("Inside Try Block");
		WebElement dropdownbox = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']"));
        if(SeeElement.checkElement(dropdownbox)){
        	dropdownbox.click();
        	System.out.println("Link for dropdownbox is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement hdropdownbox is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement dropdownbox is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SelectOption = driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Task Orders']"));
        if(SeeElement.checkElement(SelectOption)){
        	SelectOption.click();
        	System.out.println("Link for SelectOption is Clicked");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement SelectOption is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}

for(int n=0;n<11;n++){
	
	try{
		System.out.println("Inside Try Block");
		WebElement keyintext = driver.findElement(By.xpath(".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']"));
        if(SeeElement.checkElement(keyintext)){
        	keyintext.sendKeys("*");;
        	System.out.println("Link for keyintext is provided");
        	waiting.pleaseWait(5);
        	break;
        }
        else{System.out.println("WebElement keyintext is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement keyintext is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
		
for(int n=0;n<11;n++){
	
	try{	
		System.out.println("Inside Try Block");
		WebElement SearchButton = driver.findElement(By.xpath(".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']"));
        if(SeeElement.checkElement(SearchButton)){
        	SearchButton.click();;
        	System.out.println("Link for SearchButton is provided");
        	waiting.pleaseWait(7);
        	break;
        }
        else{System.out.println("WebElement SearchButton is not present");}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************WebElement SearchButton is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(3);
						}
				}
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
		
System.out.println("--------------FINISH--------------DefaultTaskOrderSearch SEARCH--------------");
		
		
		
		
		
	}
	
	

}


