/**
 * 
 */
package ARS_Pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import arsFramework.SeeElement;
import arsFramework.waiting;

/**
 * @author Anuj.Singh
 *
 */
public class FIBUTA {

	WebDriver driver;
	public String FinancialYear;
	
	
	public FIBUTA(WebDriver driver){
		this.driver= driver;
		Date d = new Date();
		String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(d);
		FinancialYear = "FY_"+datetime;
	}
	
	
	
	public void createFinancialYear(){
		
		// Assuming this will be on home page
		
		String hp= driver.getCurrentUrl();
		
		
		//Link                 .//*[.='Configure financial years']
		for(int i=0;i<10;i++){
			try{			
			WebElement ConfigureFinancialYearLink = driver.findElement(By.xpath(".//*[.='Configure financial years']"));
			if(SeeElement.checkElement(ConfigureFinancialYearLink)){
				ConfigureFinancialYearLink.click();
	        	System.out.println("Link for ConfigureFinancialYearLink is Clicked");
	        	waiting.pleaseWait(5);
	        	break;
	        }
				else{System.out.println("The web element is not present yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("*********************************************************************WebElement ConfigureFinancialYearLink is not present");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(3);
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(3);
							}
			
				}
		
		//Click Dropdown box for Actions button                     .//button[@ng-style='vm.buttonstyle']
		for(int i=0;i<10;i++){
			try{			
			WebElement ActionButton = driver.findElement(By.xpath(".//button[@ng-style='vm.buttonstyle']"));
			if(SeeElement.checkElement(ActionButton)){
				ActionButton.click();
	        	System.out.println("Link for Action button is Clicked");
	        	waiting.pleaseWait(5);
	        	break;
	        }
				else{System.out.println("The web element is not present yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("*********************************************************************WebElement Action Button is not present");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(3);
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(3);
							}
			
				}
		
		
		//Select Create Financial Year          .//*[@class='menu-dropdown-item ng-binding' and .='Create financial year']
		for(int i=0;i<10;i++){
			try{			
			WebElement CreateFinancialYearLink = driver.findElement(By.xpath(".//*[@class='menu-dropdown-item ng-binding' and .='Create financial year']"));
			if(SeeElement.checkElement(CreateFinancialYearLink)){
				CreateFinancialYearLink.click();
	        	System.out.println("Link for CreateFinancialYearLink is Clicked");
	        	waiting.pleaseWait(5);
	        	break;
	        }
				else{System.out.println("The web element is not present yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement CreateFinancialYearLink is not present");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
							}
			
				}
		
		
		//provide name
		
		//Date d = new Date();
		//String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(d);
		//FinancialYear = "FY_"+datetime;
		//send Keys                .//input[@name='Name']
		
		
		
		
		
		//provide startdate
		Date sd = new Date();
		String startdate= new SimpleDateFormat("MM/dd/yyyy").format(sd);
		String startyear = new SimpleDateFormat("yyyy").format(sd);
		//send keys   .//input[@name='StartDate']
		
		
		
		int endyear = Integer.parseInt(startyear)+1;
		//provide end date
		//Date ed = new Date();
		String enddate= new SimpleDateFormat("MM/dd").format(sd);
		enddate = enddate+"/"+Integer.toString(endyear);
		
		//           .//input[@name='EndDate']
		
		
		try{
			waiting.pleaseWait(3);
			driver.findElement(By.xpath(".//input[@name='Name']")).sendKeys(FinancialYear);
			waiting.pleaseWait(2);
			driver.findElement(By.xpath(".//input[@name='StartDate']")).sendKeys(startdate);
			waiting.pleaseWait(2);
			driver.findElement(By.xpath(".//input[@name='EndDate']")).sendKeys(enddate);
			waiting.pleaseWait(2);
			driver.findElement(By.xpath(".//button[@data-ng-click='saveFunction()' and .='Save']")).click();
			waiting.pleaseWait(5);
			System.out.println("Financial Year Created");
		}
		catch(NoSuchElementException ne){
			System.out.println("ERROR: *******************************************Financial Year Attributes are not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
									}
		catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
						}
		
		
		//after this end of the method
		driver.get(hp);
	}
	
	
	public void createBudget(){
		
		//Assuming at home page
		
		//get Home page
		
		//View All                    (.//button[@data-ng-click='viewAll()'])[2]
		
		//link of new Budget        .//a[@class='menu-link ng-binding' and .='New budget']
		
		
		//provide Budget Code         .//input[@name='Code']
		//send keys
		
		
		
		//can we send the name of financial year by sending keys          .//*[@id='keyLinkSpan']
		
		
		
		//otherwise will click on button          .//button[.=' ... ']
		
		
		
		//Click on name Filter             (.//a[.='Filter']/span)[1]
		
		
		
		//provide the name of the Financial Year using send keys            .//form/div[1]/input[@class='k-textbox']     FinancialYear
		
		
		//click on filter button                .//button[.='Filter']
		
		
		//click on Update button       .//button[.='Update']
		
		
		//take back to home page
		
		
		
		
		
		
	}
	
	public void createTaskOrder(){
		
		//Assuming at home page
		
				//get Home page
				
				//View All                    (.//button[@data-ng-click='viewAll()'])[2]
		
		
		// New Task Order Link               .//a[@class='menu-link ng-binding' and .='New task order']
		
		
		
		// Task order Type drop down box             .//*[@class='k-icon k-i-arrow-s' and .='select']
		
		
		//Select Option                                 .//div[3]/ul/li[@class='k-item ng-scope' and .='Maintenance Inspection']
		
		
		// Provide name using send keys                .//input[@name='Name']
		
		
		
		//Contract selection button                     (.//button[.=' ... '])[1]
		
		
		// click Filter for name of contract                     (.//*[@class='k-icon k-filter' and .='Filter'])[2]
		
		
		////provide the name of the Contract using send keys            .//form/div[1]/input[@class='k-textbox']     Contractname needs to be seen
		
		
		//click on filter button                .//button[.='Filter']
		
		
		//click on Update button       .//button[.='Update']
		
		
		//click on Budget button for selection    (.//button[.=' ... '])[2]
		
		
		// click on filter of budget code        (.//*[@class='k-icon k-filter' and .='Filter'])[1]
		
		// send keys with Budget Code using xpath         .//form/div[1]/input[@class='k-textbox']
		
		//click on filter button                .//button[.='Filter']
		
		
		//click on Update button       .//button[.='Update']   
		
		
		//Save Changes
		
	
		
		
		
		
	}
	

	
	public void configureActivitySchedule(){
		
		
		//assuming it is on home page                  
		
		
		
		// Click on link at home page                        .//*[@class='ng-binding ng-scope' and .='Configure activity/asset schedules']
		
		
		//activity type drop down box                    (.//*[@class='k-icon k-i-arrow-s' and .='select'])[1]
		
		
		
		// select Option                         .//*[@id='tvClassTreeId_3_tv_active']//span[.='Maintenance Inspection']
		//                                       .//*[@id='tvClassTreeId_3_tv_active']//span[.='Principle']
		//                        .//*[@id='tvClassTreeId_3_tv_active']//span[.='Principle Inspection']
		// 
		
		
		
		
		//Asset type drop down box                      (.//*[@class='k-icon k-i-arrow-s' and .='select'])[2]
		
		
		
		//select option                                     .//div[3]/ul/li[.='Ball']
		
		
		
		//select recurrence pattern drop down box        (.//*[@class='k-icon k-i-arrow-s' and .='select'])[3]
		
		
		// select option                             .//div[3]/ul/li[.='Daily']
		
		
		//Adjust Pattern     drop down                     (.//*[@class='k-icon k-i-arrow-s' and .='select'])[4]
		
		
		// select option                                                       .//div[2]/ul/li[.='1']
		
		
		
		// Save Changes...  
		
		
		
		
		
		
		
	}
	
	
	
}
