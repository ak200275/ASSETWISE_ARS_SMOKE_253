/**
 * 
 */
package ARS_Pages;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import arsFramework.Actions1;
import arsFramework.waiting;


/**
 * @author Anuj.Singh
 *
 */
public class myItems {


WebDriver driver;
Date date = new Date();
String datetime= new SimpleDateFormat("ddMMMyy_hh").format(date);
public String orgname= "org"+datetime;
//System.out.println(orgname);
public String orgname1 =orgname;
public String step="";
public String xpth="";
public String inp="";






public myItems(WebDriver driver){
	this.driver=driver;
	}


public void checkNewItemTabs(){
	
	//check Attributes
	step="check Attributes";
	xpth=".//*[@class='k-link' and .='Attributes']";
	Actions1 ac=new Actions1(driver);
	if(ac.displayed(driver, xpth, step)){System.out.println("Attributes tab is present");}
	else{System.out.println("Error: "+step+"*******************************************************Attributes tab is NOT present");}
	

	//Check Documents tab
	step="Check Documents tab";
	xpth=".//*[@class='k-link' and .='Documents']";
	if(ac.displayed(driver, xpth, step)){System.out.println("Documents tab is present");}
	else{System.out.println("ERROR : " +step+"*******************************************************Documents tab is NOT present");}
	
/*	
	//Check Responsibilities tab
	step="Check Documents tab";
	xpth=".//*[@class='k-link' and .='Responsibilities']";
	if(ac.displayed(driver, xpth, step)){System.out.println("Responsibilities tab is present");}
	else{System.out.println("ERROR : " +step+"*******************************************************Responsibilities tab is NOT present");}
	
	//Check Security tab
	step="Check Security tab";
	xpth=".//*[@class='k-link' and .='Security']";
	if(ac.displayed(driver, xpth, step)){System.out.println("Security tab is present");}
	else{System.out.println("ERROR : " +step+"*******************************************************Responsibilities tab is NOT present");}
*/
}

public void addContact(){ // To do........
	
	//click on contacts tab
	driver.findElement(By.xpath(".//*[@class='k-link' and .='Contacts']")).click();
	//click on Actions drop down arrow
	driver.findElement(By.xpath(".//button[@data-toggle='dropdown']")).click() ;
	
	//add existing contact
	driver.findElement(By.xpath(".//span[.='Add Existing Contact']")).click();
	
	//
	
}
		
public void checkPriceListTabs(){
			
			Actions1 ac = new Actions1(driver);
			//check Attributes
			step="check Attributes";
			xpth=".//*[@class='k-link' and .='Attributes']";
			if(ac.displayed(driver, xpth, step)){System.out.println("Attributes tab is present");}
			else{System.out.println("ERROR :"+step+"******************************************************************WebElement is not present");}
						
		   //check List Items
			step="check List Items";
			xpth=".//*[@class='k-link' and .='List Items']";
			if(ac.displayed(driver, xpth, step)){System.out.println("List Items tab is present");}
			else{System.out.println("ERROR :"+step+"******************************************************************WebElement is not present");}

					
		}
			
public boolean createNewItem1(){
	
	//click on new item link on home page
	
	
    Date date = new Date();
	String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
	String itemname= "item"+datetime;
	System.out.println(itemname);
	//Click on link of new organization on home page
	step="Click on link of new organization on home page";
	xpth=".//*[@class='ng-binding ng-scope' and .='New item']";
	Actions1 ac=new Actions1(driver);
	if(ac.click(driver, xpth, step)){System.out.println("Clicked on link of New Item on home page");}
	else{System.out.println("ERROR:"+step+"*********************************************************************WebElement is not present");
	return false;}
	waiting.pleaseWait(9);
		
	//Click on type drop down arrow
	step="Click on type drop down arrow";
	//xpth=".//span[@class='k-icon k-i-arrow-s' and .='select']";
	xpth= "(.//*[@class='k-icon k-i-arrow-s'])[1]";
	if(ac.click(driver, xpth, step)){System.out.println("Clicked on type drop down arrow");}
	else{System.out.println("ERROR:"+step+"*********************************************************************WebElement is not present");
	return false;}
	waiting.pleaseWait(3);
	
	//Click to select option
	step="Click to select option";
	//xpth=".//*[@class='k-item ng-scope k-state-selected k-state-focused' and .='Contract Item']";
	xpth=".//li[ .='Contract Item']";
	if(ac.click(driver, xpth, step)){System.out.println("Clicked to select option");}
	else{System.out.println("ERROR:"+step+"*********************************************************************WebElement is not present");
	return false;}
	waiting.pleaseWait(9);

	//provide code
	step="provide name";
	xpth=".//input[@name='Code']";
	inp=itemname;
	if(ac.input(driver, xpth, inp, step)){System.out.println("code provided");}
	else{System.out.println("ERROR:"+step+"*********************************************************************WebElement is not present");
	return false;}
	waiting.pleaseWait(2);
	
	//provide name
	step="provide name";
	xpth=".//input[@name='Name']";
	inp=itemname;
	if(ac.input(driver, xpth, inp, step)){System.out.println("name provided");}
	else{System.out.println("ERROR:"+step+"*********************************************************************WebElement is not present");
	return false;}
	waiting.pleaseWait(2);

	
	//Click to save
	step="Click to save";
	xpth=".//button[@data-ng-click='vm.saveChanges()']";
	if(ac.enabled(driver, xpth, step)){
		ac.click(driver, xpth, step);
		System.out.println("Clicked to save");}
	else{System.out.println("ERROR:"+step+"*********************************************************************WebElement is not present");
	return false;}
	waiting.pleaseWait(9);

	//validate the name on another page after save
	step="validate the name on another page after save";
	xpth=".//span[@class='spa-title ng-binding']";
	String val = ac.getText(driver, xpth, step);
	//String val = driver.findElement(By.xpath(".//span[@class='spa-title ng-binding']")).getText();
	System.out.println(val);
	
	
	if(new String(itemname).equals(val)){System.out.println("name of the Item is validated");
	System.out.println("The new is created and name is validated");
	return true;}
	else{System.out.println("Names do not match");
	System.out.println("Although created but name did not validated");
	return false;}
	
	
}

public boolean createNewPriceList1(){
	
	//click on new item link on home page
			
			
		    Date date = new Date();
			String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
			String pricelistname= "PriceList"+datetime;
			System.out.println(pricelistname);
			
			
			Actions1 ac = new Actions1(driver);
			
			//Click on link of new organization on home page
			step="Click on link of new pricelist on home page";
			//xpth=".//*[@class='ng-binding ng-scope' and .='New price list']";
			xpth=".//*[@class='ng-binding ng-scope' and .='New pricelist']";
			if(ac.click(driver, xpth, step)){System.out.println("Clicked on link of new pricelist on home page");}
			else{System.out.println("ERROR: "+ step+"*********************************************************************WebElement is not present");
			return false;}
			waiting.pleaseWait(9);
			
			
			//Click on type drop down arrow
			step="Click on type drop down arrow";
			xpth="(.//*[@class='k-icon k-i-arrow-s'])[1]";
			if(ac.click(driver, xpth, step)){System.out.println("Clicked on type drop down arrow");}
			else{System.out.println("ERROR: "+ step+"*********************************************************************WebElement is not present");
			return false;}
			waiting.pleaseWait(5);
			
			//select list of standard items
			step="select list of standard items";
			xpth=".//div[@class='k-list-scroller']/ul/li[.='List of Standard Items']";
			if(ac.click(driver, xpth, step)){System.out.println("select list of standard items");}
			else{System.out.println("ERROR: "+ step+"*********************************************************************WebElement is not present");
			return false;}
			waiting.pleaseWait(3);
			
			//provide pricelist name
			step="provide pricelist name";
			xpth=".//input[@name='Name']";
			inp=pricelistname;
			if(ac.input(driver, xpth, inp, step)){System.out.println("provided pricelist name");}
			else{System.out.println("ERROR: "+ step+"*********************************************************************WebElement is not present");
			return false;}
			waiting.pleaseWait(3);

			//Save changes
			step="Save Changes";
			xpth=".//button[@data-ng-click='vm.saveChanges()']";
			if(ac.enabled(driver, xpth, step)){
				ac.click(driver, xpth, step);
				System.out.println("Save changes button Clicked");
			}
			else{System.out.println("ERROR: "+ step+"*********************************************************************WebElement is not present");
			return false;}
			waiting.pleaseWait(5);
			
					
			//validate the name on another page after save
			step="validate the name on another page after save";
			xpth=".//span[@class='spa-title ng-binding']";
			String val = ac.getText(driver, xpth, step);
			//String val = driver.findElement(By.xpath(".//span[@class='spa-title ng-binding']")).getText();
			System.out.println(val);
			pricelistname = "Price List: "+pricelistname;
			System.out.println(pricelistname);
			if(new String(pricelistname).equals(val)){
				System.out.println("Pricelist Created");
				System.out.println("name of the PriceList is validated");
				return true;}
			else{System.out.println("Pricelist Created");
			System.out.println("Names do not match");
			return false;}

			
		}





//end of the class
}








