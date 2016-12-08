/**
 * 
 */
package ARS_Pages;

/**
 * @author Anuj.Singh
 *
 */

/**
 * 
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import arsFramework.Actions1;
import arsFramework.SeeElement;
import arsFramework.waiting;



/**
 * @author Anuj.Singh
 *
 */
public class myAssets {
	
	WebDriver driver;
	String url;
	Date date = new Date();
	String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
	String assdoc_title= "AssDoc_"+datetime;
	public String step="";
	public String xpth="";
	public String inp="";
	
	public String assetDetailurl;
	
	public WebElement hp_newassetlink;

	
	
	
	//create Condition
	public WebElement asset_ConditionsTab;
	public WebElement conditions_Actions;
	public WebElement enter_Results;
	public WebElement enter_Date;
	public WebElement conditions_Save;

	//Create Activity
	public WebElement asset_ActivitiesTab;
	public WebElement activities_Actions;
	public WebElement create_activity;
	public WebElement dropdown_status;
	public WebElement select_Draft;
	public WebElement activity_Save;

	//Create Document
	public WebElement asset_DocumentsTab;
	public WebElement document_action;
	public WebElement add_document;
	public WebElement document_dropdown;
	public WebElement document_type;
	public WebElement document_type_index;
	public WebElement title;
	public WebElement doc_Save;
	
	public myAssets(WebDriver driver){
		this.driver= driver;
		//this.url=url;
			}

	public void checkTabs(){
		
		System.out.println("--------------------------Checking the tabs----------------------------------------");
        
     
        	Actions1 ac=new Actions1(driver);
        //Check Attribute tab is present
        step="Check Attribute tab is present";	
        xpth=".//*[@class='k-link' and .='Attributes']";
        if(ac.displayed(driver, xpth, step)){System.out.println("==========Attributes tab is present");}
        else{System.out.println("ERROR"+step+"*********************************************************Attributes tab is not present");}

        System.out.println("URL After Checking the Tabs Completed : "+driver.getCurrentUrl());
         assetDetailurl = driver.getCurrentUrl();
	//driver.close();
		
	}
	

	
	
	
public boolean createAsset1(){
		
		System.out.println("TESTCASE 2: CREATE A NEW ASSET");
        
		//driver.get(url);
            //Create new Asset
		Date date = new Date();
		String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
		String asset_title= "Asset_"+datetime;
		System.out.println(asset_title);
		System.out.println("Creating new Asset");
		System.out.println(driver.getCurrentUrl());
		
		
        System.out.println("Link for New Asset is displayed");
        //driver.findElement(By.xpath(".//a[@class='ng-binding ng-scope' and .='New asset']")).isEnabled();
       // System.out.println("Link for New Asset is enabled");
         Actions1 ac=new Actions1(driver);
         step = "Click on the New Asset link";
         xpth=".//a[@class='ng-binding ng-scope' and .='New asset']";
         if(ac.enabled(driver, xpth, step)){ac.click(driver, xpth, step);
         System.out.println(step+"  done");}
         else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
         return false;}
         waiting.pleaseWait(15);
        
         step = "Drop Down";
         xpth=".//div[@ng-model='templateIdTracker']/div/span/span/span[2]/span";
         if(ac.enabled(driver, xpth, step)){ac.click(driver, xpth, step);
         System.out.println(step+"  done");}
         else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
         return false;}
         waiting.pleaseWait(3);
         
          step = "Option Selected";
          xpth=".//div[@class='k-list-scroller']/ul/li[.='Bridge And Large Culvert']";
          if(ac.enabled(driver, xpth, step)){ac.click(driver, xpth, step);
          System.out.println(step+"  done");}
          else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
          return false;}
          waiting.pleaseWait(15);
         
         
          step = "Provide name";
          xpth=".//.[@name='Description']";
          inp=asset_title;
          if(ac.enabled(driver, xpth, step)){ac.input(driver, xpth, inp, step);
          System.out.println(step+"  done");}
          else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
          return false;}
          waiting.pleaseWait(3);
         
          step = "Drop Down Error";
          xpth=".//div[@name='template5']/div/span/span/span[2]/span";
          if(ac.enabled(driver, xpth, step)){ac.click(driver, xpth, step);
          System.out.println(step+"  done");}
          else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
          return false;}
          waiting.pleaseWait(3);
         
          step = "Select Under Construction Option";
          xpth=".//div[@class='k-list-scroller']/ul/li[ .='Under Construction']";
          if(ac.enabled(driver, xpth, step)){ac.click(driver, xpth, step);
          System.out.println(step+"  done");}
          else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
          return false;}
          waiting.pleaseWait(3);
         
          step = "Click on Save Button";
          xpth=".//*[@data-ng-click='vm.saveChanges()']";
          if(ac.enabled(driver, xpth, step)){ac.click(driver, xpth, step);
          System.out.println(step+"  done");}
          else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
          return false;}
          waiting.pleaseWait(9);
         
         
         
          step = "Checking if page is loaded successfully after creating Asset";
          xpth=".//span[@class='spa-title ng-binding']";
          if(ac.enabled(driver, xpth, step)){ac.click(driver, xpth, step);
          System.out.println(step+"  done");
          System.out.println("NEW ASSET IS CREATED");
          System.out.println("-----------------------------------------------------------------");
          return true;}
          else{System.out.println("ERROR: "+step+"********************************************************************  Failed");
          return false;}
          //waiting.pleaseWait(9);
         
   
         
//driver.close();


 
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	//Adding Condition to newly created asset
	
	public void addCondition(){
		
		//asset condition
		System.out.println("Inside Add Condition method :"+driver.getCurrentUrl());
		String assetDetailurl = driver.getCurrentUrl();
		//driver.get(assetDetailurl);
		
		
		System.out.println("asset_ConditionsTab");
		
		
		
		
		for(int n=0;n<11;n++){
			
			System.out.println("asset_ConditionsTab");	
			
			try{	
			asset_ConditionsTab = driver.findElement(By.xpath(".//*[@class='k-link' and .='Conditions']"));
						if(SeeElement.checkElement(asset_ConditionsTab))
									{ asset_ConditionsTab.click();
									System.out.println("asset_ConditionsTab clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset Conditions tab is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		//condition action
		
		System.out.println("conditions_Actions");
		
		for(int n=0;n<11;n++){
			
			System.out.println("conditions_Actions");
			
			try{	
				conditions_Actions = driver.findElement(By.xpath(".//button/div/div[.='Actions']"));
						if(SeeElement.checkElement(conditions_Actions))
									{ conditions_Actions.click();
									System.out.println("conditions_Actions clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************conditions Actions is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}	
		
		//enter results
		
		//System.out.println("enter_Results");
		for(int n=0;n<11;n++){
			
			System.out.println("enter_Results "+n);
			
			try{	
				enter_Results = driver.findElement(By.xpath(".//span[@class='menu-dropdown-item ng-binding' and .='Enter results']"));
						if(SeeElement.checkElement(enter_Results))
									{ enter_Results.click();
									System.out.println("enter_Results clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************enter_Results is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		//enter date

		for(int n=0;n<5;n++){
			
			System.out.println("enter_Date");
			
			try{
				Date date = new Date();
				String modifiedDate= new SimpleDateFormat("MM/dd/yyyy").format(date);
				
				//enter_Date = driver.findElement(By.xpath(".//input[@name='StartDate']"));// .sendkeys("8/19/2016");
				enter_Date = driver.findElement(By.xpath(".//input[@name='DateDiscovered']"));// .sendkeys("8/19/2016");
				//                      .//input[@name='DateDiscovered']
				//name is changed from 'StartDate' to 'DateDiscovered'
				
				System.out.println("enter_Date");
						if(SeeElement.checkElement(enter_Date))
									{ enter_Date.sendKeys(modifiedDate);
									System.out.println("entered_Date");
									waiting.pleaseWait(10);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************enter_Date is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		//condition type needs to be done......click on Drop down box  
		//                   (.//*[@class='k-icon k-i-arrow-s' and .='select'])[1]
		
		
for(int n=0;n<11;n++){
			
			System.out.println("Drop down box");
			
			try{
				
				
				WebElement DropDownBox = driver.findElement(By.xpath(".//*[@class='k-icon k-i-arrow-s' and .='select'])[1]"));
				//                      .//input[@name='DateDiscovered']
				//name is changed from 'StartDate' to 'DateDiscovered'
				
				System.out.println("DropDownBox");
						if(SeeElement.checkElement(DropDownBox))
									{ DropDownBox.click();
									System.out.println("DropDownBox is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like DropDownBox is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************DropDownBox is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		
		
		
		
		
		
		
		//Select Option
		//(.//ul/li[.='Structure Defect'])[1]
		


for(int n=0;n<11;n++){
	
	
	try{
		
		System.out.println("SelectOption");
		
		WebElement SelectOption = driver.findElement(By.xpath(".//ul/li[.='Structure Defect'])[1]"));

				if(SeeElement.checkElement(SelectOption))
							{ SelectOption.click();
							System.out.println("SelectOption is clicked");
							waiting.pleaseWait(7);
							break;
							}
				else { 	System.out.println("looks like SelectOption is not present yet");	}

	}
	catch(NoSuchElementException ne){
			System.out.println("*********************************************************************SelectOption is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(2);
									}
	catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(2);
						}
				}






		
		
		
		//save

		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("conditions_Save");
			
			try{	
				conditions_Save = driver.findElement(By.xpath(".//button[@data-ng-click='vm.saveChanges()']"));
				System.out.println("conditions_Save");
						if(SeeElement.checkElement(conditions_Save))
									{ conditions_Save.click();
									System.out.println("Condition save button clicked Test Passed");
									//System.out.println("conditions_Save is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************enter_Results is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		//needs validation
		
		

						}
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	//Adding Activity to newly Created Asset
	
	public void addActivity(){
		
		String thisurl = driver.getCurrentUrl();
		System.out.println(thisurl);
		if(assetDetailurl.contentEquals(thisurl)){ System.out.println("Correct URL to test");}
		else{System.out.println("this url is not as expected");
		driver.get(assetDetailurl);
		//if(driver.findElement(By.xpath(".//*[@id='modelId_1']/form/div[3]/button[2]")).displayed){}
		//else{}
		
		
		try{}
		catch(Exception e){}
		

		
		System.out.println(assetDetailurl);
		waiting.pleaseWait(7);
		
		}
		
		for(int n=0;n<10;n++){
			
			System.out.println(n);
			
			System.out.println("asset_ActivitiesTab");
			
			try{	
				System.out.println(n);
				asset_ActivitiesTab = driver.findElement(By.xpath(".//*[@class='k-link' and .='Activities']"));
						if(SeeElement.checkElement(asset_ActivitiesTab))
									{ asset_ActivitiesTab.click();
									System.out.println("(asset_ActivitiesTab is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset activity tab is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		
		for(int n=0;n<10;n++){
			
			System.out.println(n);
			System.out.println("activities_Actions");
			try{	
				activities_Actions = driver.findElement(By.xpath(".//button/div/div[.='Actions']"));
						if(SeeElement.checkElement(activities_Actions))
									{ activities_Actions.click();
									System.out.println("(activities_Actions is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************activities_Actions  is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		
		for(int n=0;n<10;n++){
			
			System.out.println(n);
			System.out.println("create_activity");
			
			try{	
				create_activity = driver.findElement(By.xpath(".//span[@class='menu-dropdown-item ng-binding' and .='Create activity']"));		
				if(SeeElement.checkElement(create_activity))
									{ create_activity.click();
									System.out.println("create_activity is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************create_activity tab is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		
		for(int n=0;n<10;n++){
			
			System.out.println(n);
			System.out.println("dropdown_status");
			try{	
				dropdown_status = driver.findElement(By.xpath("(.//span[@class='k-icon k-i-arrow-s' and .='select'])[2]"));		
				if(SeeElement.checkElement(dropdown_status))
									{ dropdown_status.click();
									System.out.println("dropdown_status is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************dropdown_status tab is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		for(int n=0;n<10;n++){
			
			System.out.println(n);
			System.out.println("select_Draft");
			try{	
				
				select_Draft = driver.findElement(By.xpath(".//li[@class='k-item ng-scope' and .='Draft']"));
						if(SeeElement.checkElement(select_Draft))
									{ select_Draft.click();
									System.out.println("select_Draft is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************select_Draft is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		for(int n=0;n<10;n++){
			
			System.out.println(n);
			System.out.println("activity_Save");
			try{	
				activity_Save = driver.findElement(By.xpath(".//button[@data-ng-click='vm.saveChanges()']"));		
				if(SeeElement.checkElement(activity_Save))
									{ activity_Save.click();
									System.out.println("activity_Save is clicked");
									waiting.pleaseWait(10);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************activity_Save is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(2);
								}
						}
		
		
		
		
	}
	
	
	public void addDocument(){
		
		
				
		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("asset_DocumentsTab");
			try{	
				asset_DocumentsTab = driver.findElement(By.xpath(".//*[@class='k-link' and .='Documents']"));		
				if(SeeElement.checkElement(asset_DocumentsTab))
									{ asset_DocumentsTab.click();
									System.out.println("asset_DocumentsTab is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset asset_DocumentsTab is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
								}
						}
		
		
		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("document_action");
			try{	
				waiting.pleaseWait(7);
				document_action = driver.findElement(By.xpath("(.//button/div/div[.='Actions'])[2]"));		
				if(SeeElement.checkElement(document_action))
									{ document_action.click();
									System.out.println("document_action is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset document_action is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
								}
						}
		
		
		
		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("add_document");
			try{	
				add_document = driver.findElement(By.xpath(".//span[@class='menu-dropdown-item ng-binding' and .='Add new document']"));		
				if(SeeElement.checkElement(add_document))
									{ add_document.click();
									System.out.println("add_document is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset add_document is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
								}
						}
		
		
		
		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("document_dropdown");
			try{	
				document_dropdown = driver.findElement(By.xpath("(.//span[@class='k-icon k-i-arrow-s' and .='select'])[1]"));		
				if(SeeElement.checkElement(document_dropdown))
									{ document_dropdown.click();
									System.out.println("document_dropdown is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset document_dropdown is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
								}
						}
		
		//document_type_index= driver.findElement(By.xpath(".//li[@data-offset-index='0']"));
		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("document_type");
			try{	
				document_type = driver.findElement(By.xpath(".//li[@class='k-item ng-scope' and .='Approval Documents']"));		
				if(SeeElement.checkElement(document_type))
									{ document_type.click();
									System.out.println("document_type is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset document_type is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
								}
						}
	
		
		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("title");
			try{	
				title = driver.findElement(By.xpath(".//input[@name='Name']"));		
				if(SeeElement.checkElement(title))
									{ title.click();
									System.out.println("title is clicked");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset document title is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
								}
						}
		
		
		
		for(int n=0;n<11;n++){
			
			System.out.println(n);
			System.out.println("doc_Save");
			try{	
				doc_Save = driver.findElement(By.xpath(".//button[@data-ng-click='vm.saveChanges()']"));		
				if(SeeElement.checkElement(doc_Save))
									{ doc_Save.click();
									System.out.println("doc_Save");
									waiting.pleaseWait(7);
									break;
									}
						else { 	System.out.println("looks like object is not present yet");	}
		
			}
			catch(NoSuchElementException ne){
					System.out.println("*********************************************************************Asset doc_Save is not present");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
											}
			catch(Exception e){
					System.out.println("********General Exception");
					System.out.println("***Wait for few sec please");
					waiting.pleaseWait(n);
								}
						}
		
		
		
		
		
		
		
		
		
	}
	
	
	public void addLocation(){	}
	public void searchAssetsFromHomePage(){}
	public void searchConditionsFromHomePage(){}

	
	
	
	

}
