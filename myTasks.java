/**
 * 
 */
package ARS_Pages;

/**
 * @author Anuj.Singh
 *
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import arsFramework.Actions1;
import arsFramework.waiting;

public class myTasks {

	WebDriver driver;
	
	public myTasks(WebDriver driver){
		this.driver=driver;
		Date date = new Date();
		String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
		FinancialYear = "FY_"+datetime;
		orgname= "org"+datetime;		
	}
	
	Date date = new Date();
	String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
	//FinancialYear = "FY_"+datetime;
	public String orgname= "org"+datetime;
	//System.out.println(orgname);
	public String orgname1 =orgname;
	public String xpth="";
	public String inp = "";
	public String step="";
	public String contractname="Contract_"+datetime;;
	public String taskordername="";
	public String BudgetCode="";
	public String FinancialYear="";
	
	
	
	

public void checkOrganizationTabs() {
		// TODO Auto-generated method stub
		//check Attributes
			
			String step="check attribute";
			xpth = ".//*[@class='k-link' and .='Attributes']";
			Actions1 ac = new Actions1(driver);
			if(ac.displayed(driver, xpth, step)){System.out.println("step : "+step+": is passed");}
			else{System.out.println("************************************* Error in step : "+step+": is Failed");}
			

			
		//Check Contacts
			step="Check Contacts";
			xpth=".//*[@class='k-link' and .='Contacts']";
			if(ac.displayed(driver, xpth, step)){System.out.println("step : "+step+": is passed");}
			else{System.out.println("************************************* Error in step : "+step+": is Failed");}
		
		
				
		//Check Contracts
			step="Check Contracts";
			xpth=".//*[@class='k-link' and .='Contracts']";
			if(ac.displayed(driver, xpth, step)){System.out.println("step : "+step+": is passed");}
			else{System.out.println("************************************* Error in step : "+step+": is Failed");}
		
	}
	
public void addContact(){ 
	
	//click on contacts tab
	driver.findElement(By.xpath(".//*[@class='k-link' and .='Contacts']")).click();
	//click on Actions drop down arrow
	driver.findElement(By.xpath(".//button[@data-toggle='dropdown']")).click() ;
	
	//add existing contact
	driver.findElement(By.xpath(".//span[.='Add Existing Contact']")).click();
	
	//
	
}
	

public void checkContractTabs(){
	
	
	//check Attributes
	Actions1 ac= new Actions1(driver);
	String step="Check Attributes";
	xpth=".//*[@class='k-link' and .='Attributes']";
	if(ac.displayed(driver, xpth, step)){System.out.println("Attributes tab is present");}
	else{System.out.println("Error*******************************************************Attributes tab is NOT present");}	
	
	
     //check Items
	step="check Items";
	xpth=".//*[@class='k-link' and .='Items']";
	if(ac.displayed(driver, xpth, step)){System.out.println("Items tab is present");}
	else{System.out.println("ERROR*******************************************************Items tab is NOT present");}
		

	 //check Items breakdown
	step="check Items breakdown";
	xpth=".//*[@class='k-link' and .='Items breakdown']";
	if(ac.displayed(driver, xpth, step)){System.out.println("Items breakdown tab is present");}
	else{System.out.println("ERROR*******************************************************Items breakdown tab is NOT present");}	
	

	 //check Summary
	step="check Summar";
	xpth=".//*[@class='k-link' and .='Summary']";
	if(ac.displayed(driver, xpth, step)){System.out.println("Summary tab is present");}
	else{System.out.println("ERROR*******************************************************Summary tab is NOT present");}		

}
	
public boolean createNewOrganization1(){

	System.out.println(orgname);
	String step = "link of new organization on home page";
    Actions1 ac = new Actions1(driver);
    try{
    xpth = ".//*[@class='ng-binding ng-scope' and .='New organization']";
    if(ac.displayed(driver, xpth, step)){
    ac.click(driver, xpth, step);
    }
    else{
    	xpth="(.//*[@data-ng-click='viewAll()'])[2]";
    	ac.click(driver, xpth, step);
    	waiting.pleaseWait(7);
    	xpth=".//*[@class='menu-link ng-binding' and .='New organization']";
    	ac.click(driver, xpth, step);
    	waiting.pleaseWait(7);
    	
    }
    }
    catch(Exception e){
    	xpth="(.//*[@data-ng-click='viewAll()'])[2]";
    	ac.click(driver, xpth, step);
    	waiting.pleaseWait(7);
    	xpth=".//*[@class='menu-link ng-binding' and .='New organization']";
    	ac.click(driver, xpth, step);
    	waiting.pleaseWait(7);
    	
    }
    
    
	waiting.pleaseWait(9);
	//Click on type drop down arrow
	step="Click on type drop down arrow";
	xpth=".//span[@class='k-icon k-i-arrow-s' and .='select']";
	//ac.click(xpth, step);
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	waiting.pleaseWait(9);

	step="Selection of option";
	xpth=".//div[@class='k-list-scroller']/ul/li[1]";
	//ac.click(xpth, step);
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	waiting.pleaseWait(9);
	
	//provide the name
	step="provide the name for organization";
	xpth=".//input[@name='Name']";
	inp=orgname;
	//ac.input(xpth, inp, step);
	if(ac.input(driver, xpth, inp, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	//hit save button
	step="Hit Save Button";
	xpth=".//button[@data-ng-click='vm.saveChanges()']";
	//ac.click(xpth, step);
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	waiting.pleaseWait(5);
	
	
	
	//validate the name on another page after save
	step="validate the name on another page after save";
	xpth=".//span[@class='spa-title ng-binding']";
	String val=ac.getText(driver, xpth, step);
	System.out.println(val);
	if(new String(orgname).equals(val)){System.out.println("name of the org is validated");}
	else{System.out.println("Names do not match");}
	
	return true;
		
}

public boolean createNewContract1(){
	

    Date date = new Date();
	String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
	String contractname= "Contract_"+datetime;
	System.out.println(contractname);
	
	
	
	
	//Click on link of new organization on home page
	String step="Click on link of new organization on home page";
	xpth=".//*[@class='ng-binding ng-scope' and .='New contract']";
	Actions1 ac= new Actions1(driver);
	//ac.click(xpth, step);
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	waiting.pleaseWait(9);
	
	
	
	
	//Click on type drop down arrow
	step="Click on type drop down arrow";
	xpth=".//div[@data-text-field='Description']/span/span/span[2]/span[1]";
	//ac.click(xpth, step);
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	waiting.pleaseWait(3);
	
	
	
	
	
	
	String optoin1="position: absolute; font-size: 14px; font-family: \"Open Sans Light\",\"+\"Helvetica Neue\",Helvetica,Arial,sans-serif; font-stretch: normal; font-style: normal; font-weight: 400; line-height: 20px; width: 292.8px; height: auto; display: none; transform: translateY(-60px);";
	String option2 = "\".//div[@class='k-animation-container' and style='";
	String option3 = "']/div/div[3]/ul/li[.='Service Contract']\"";
	String option = option2+optoin1+option3;
	//System.out.println(option);
	step="Service Contract option selected";
	//xpth=option;
	xpth=".//li[.='Service Contract']";
	//ac.click(xpth, step);
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	waiting.pleaseWait(5);
	

	step="provide Contract Name";
	xpth=".//input[@name='Name']";
	String inp=contractname;
	if(ac.input(driver, xpth, inp, step)){System.out.println("Contract name is provided");}
	else{System.out.println("Contract Name could not be provided");
	return false;}
	waiting.pleaseWait(5);
	
	//status needs to be selected now.. 
	
	
	
	// drop down box of status                 (.//span[@class='k-icon k-i-arrow-s' and .='select'])[2]
	step="drop down box of status";
	xpth="(.//span[@class='k-icon k-i-arrow-s' and .='select'])[2]";
	if(ac.click(driver, xpth, step)){System.out.println("Drop down box arrow is hit");}
	else{System.out.println("Drop down box arrow could not be hit");
	return false;}
	waiting.pleaseWait(2);
	
	
	// option to be selected         .//div[3]/ul/li[@class='k-item ng-scope' and .='Unapproved']
	step="option to be selected ";
	xpth=".//div[3]/ul/li[@class='k-item ng-scope' and .='Unapproved']";
	if(ac.click(driver, xpth, step)){System.out.println("Option Unapproved is Selected");}
	else{System.out.println("No option could be selected");
	return false;}
	waiting.pleaseWait(2);

	//Hit save button
	step="Hit save button";
	xpth=".//button[@data-ng-click='vm.saveChanges()']";
	if(ac.enabled(driver, xpth, step)){
		ac.click(driver, xpth, step);
		System.out.println("Option Unapproved is Selected");}
	else{System.out.println("Save button was not clicked");
	return false;}
	waiting.pleaseWait(5);
	
	
	
	
	//validate the name on another page after save
	//String val = driver.findElement(By.xpath(".//span[@class='spa-title ng-binding']")).getText();
	String val="";
	step="validate the name on another page after save";
	xpth=".//span[@class='spa-title ng-binding']";
	val=ac.getText(driver, xpth, step);
	System.out.println(val);
	//contractname = "Contract: "+contractname;
	System.out.println(contractname);
	if(new String(contractname).equals(val)){System.out.println("name of the Contract is validated");}
	else{System.out.println("Names do not match");}

	return true;
	
	
}

public boolean createFromOrg1(){
	
	//Click on new Contract on home page
	waiting.pleaseWait(5);
	
		Actions1 ac= new Actions1(driver);
		String step="Click on new Contract link";
		xpth=".//*[@class='ng-binding ng-scope' and .='New contract']";
		//if(ac.click(xpth, step)){System.out.println("New Contract is clicked");}
		//else{System.out.println("ERROR*********************************************************************WebElement is not present");}
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		
		waiting.pleaseWait(9);
		
		
	//Click on type drop down arrow
		step="Click on type drop down arrow";
		xpth=".//div[@data-text-field='Description']/span/span/span[2]/span[1]";
		//if(ac.click(xpth, step)){}
		//else{System.out.println("ERROR********************************************************************WebElement Drop Down is not present");}
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		waiting.pleaseWait(5);
	
	
	//Click on contractor button -- .//button[@ng-click='foreignKeyController.openGrid()']
		step="Click on contractor button";
		xpth=".//button[@ng-click='foreignKeyController.openGrid()']";
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		//if(ac.click(xpth, step)){System.out.println("Clicked on contractor button");}
		//else{System.out.println("ERROR********************************************************************WebElement Contractor is not present");}
		waiting.pleaseWait(9);
	
	
	//click on filter for name---.//th[@data-title='Name']/a[1]/span
		step="click on filter for name";
		xpth=".//th[@data-title='Name']/a[1]/span";
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		//if(ac.click(xpth, step)){System.out.println("click on filter for name");}
		//else{System.out.println("ERROR*********************************************************************WebElement Filter is not present");}
		waiting.pleaseWait(9);
		System.out.println(orgname);
		
		
	//provide the values = .//form[@class='k-filter-menu k-popup k-group k-reset k-state-border-up']/div/input and send keys would be name of the org
		step="provide the values";
		xpth=".//form[@class='k-filter-menu k-popup k-group k-reset k-state-border-up']/div/input";
		inp=orgname;
		//if(ac.input(xpth, inp, step)){System.out.println("provided the values");}
		//else{System.out.println("ERROR*******************************************************************Could not provide the values");}
		if(ac.input(driver, xpth, inp, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		waiting.pleaseWait(9);
	
	//hit button filter =  .//form[@class='k-filter-menu k-popup k-group k-reset k-state-border-up']/div[1]/div[2]/button[.='Filter']
		step="hit button filter";
		xpth=".//form[@class='k-filter-menu k-popup k-group k-reset k-state-border-up']/div[1]/div[2]/button[.='Filter']";
		//if(ac.click(xpth, step)){System.out.println("hit button filter");}
		//else{System.out.println("ERROR*********************************************************************WebElement filter button is not present");}
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		waiting.pleaseWait(7);
		
		
		
	//hit update button = .//div[@class='spa-modal-footer ng-scope spa-modal-footer-addlocation']/button[1]
		step="hit update button";
		xpth=".//div[@class='spa-modal-footer ng-scope spa-modal-footer-addlocation']/button[1]";
		//if(ac.click(xpth, step)){System.out.println("hit update button");}
		//else{System.out.println("ERROR*****************************************************************WebElement Update is not present");}
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		waiting.pleaseWait(5);
		
		
		// hit drop down button
		step="Drop Down";
		xpth="(.//span[@class='k-icon k-i-arrow-s' and .='select'])[2]";
		//if(ac.enabled(xpth, step)){
			//ac.click(xpth, step);
			//System.out.println("drop down key to select option is clicked");}
		//else{System.out.println("ERROR*********************************************************************WebElement Drop Down is not present");}
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		waiting.pleaseWait(2);
		
		
		// option to be selected         .//div[3]/ul/li[@class='k-item ng-scope' and .='Unapproved']
		step="option to be selected";
		xpth=".//div[3]/ul/li[@class='k-item ng-scope' and .='Unapproved']";
		//if(ac.click(xpth, step)){System.out.println("Select Options");}
		//else{System.out.println("ERROR*********************************************************************WebElement option is not present");}
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
		else{System.out.println(step+" : Failed!");
		return false;}
		waiting.pleaseWait(2);
		
		
		//Hit save button
		step="Hit save button";
		xpth=".//button[@data-ng-click='vm.saveChanges()']";
		//if(ac.enabled(xpth, step)){
			//ac.click(xpth, step);
			//System.out.println("hit save changes button");
			//}
		//else{System.out.println("ERROR*********************************************************************WebElement Save button is not present");}
		if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");
		waiting.pleaseWait(5);
		return true;}
		else{System.out.println(step+" : Failed!");
		return false;}
		//waiting.pleaseWait(5);
	
	//check tabs to see if the next page appeared.
}

public boolean createFinancialYear1(){
	
	// Assuming this will be on home page

	String hp= driver.getCurrentUrl();
	//FinancialYear = "FY_"+datetime;

	//Link                 .//*[.='Configure financial years']
	Actions1 ac=new Actions1(driver);
	String step="Configure Financial Years";
	xpth=".//*[@class='ng-binding ng-scope' and .='Configure financial years']";
	//if(ac.click(xpth, step)){System.out.println("Link for ConfigureFinancialYearLink is Clicked");}
	//else{System.out.println("ERROR***************************************************************WebElement ConfigureFinancialYearLink is not present");}
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	


//Click Dropdown box for Actions button                     .//button[@ng-style='vm.buttonstyle']  did not work
//                                                         .//div[@data-ng-controller='financial.year.controller as vm']//button/div[1]
	step="Click Dropdown box for Actions button";
	xpth=".//div[@data-ng-controller='financial.year.controller as vm']//button/div[1]";
	//if(ac.click(xpth, step)){System.out.println("Link for Action button is Clicked");}
	//else{System.out.println("ERROR****************************************************************WebElement Action Button is not present");}
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}


	//Select Create Financial Year          .//*[@class='menu-dropdown-item ng-binding' and .='Create financial year']...  now changed to 'Create'
	step="Select Create Financial Year";
	try{
	xpth=".//*[@class='menu-dropdown-item ng-binding' and .='Create financial year']";
	if(ac.displayed(driver, xpth, step)){
		ac.click(driver, xpth, step);
		System.out.println("Link for CreateFinancialYearLink is Clicked");}
	}
	catch(Exception e){
		xpth=".//*[@class='menu-dropdown-item ng-binding' and .='Create']";
		if(ac.click(driver, xpth, step)){System.out.println("Link for Create is Clicked");}
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
	return false;
							}
catch(Exception e1){
	System.out.println("********General Exception");
	System.out.println("***Wait for few sec please");
	waiting.pleaseWait(1);
	return false;
				}

return true;
//after this end of the method
//driver.get(hp);
}

public boolean createBudget1(){
	
	
	
	//Assuming at home page
	
			//get Home page
			String myurl = driver.getCurrentUrl();
			//View All                    (.//button[@data-ng-click='viewAll()'])[2]
	step = "View All Click";
	Actions1 ac = new Actions1(driver);
	xpth = "(.//button[@data-ng-click='viewAll()'])[2]";

	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	
	waiting.pleaseWait(3);
	
	
			//link of new Budget        .//a[@class='menu-link ng-binding' and .='New budget']
	step = "link of new Budget";
	xpth = ".//a[@class='menu-link ng-binding' and .='New budget']";

	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	waiting.pleaseWait(7);
	
	
			
			//provide Budget Code         .//input[@name='Code']
			//send keys
	step="provide Budget Code";
	Date date = new Date();
	String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
	BudgetCode="BudgetCode_"+datetime;
    xpth = ".//input[@name='Code']";
    //ac.inputMethod(xpth, BudgetCode);
    if(ac.input(driver, xpth, BudgetCode, step)){System.out.println(step+" :  Done!! ");}
	else{
		System.out.println(step+" : *********************************************************************************************** FAILED ");
		return false;}
    waiting.pleaseWait(5);	
			
			//can we send the name of financial year by sending keys          .//*[@id='keyLinkSpan']

			
			//otherwise will click on button          .//button[.=' ... ']
    xpth = ".//button[.=' ... ']";
	//ac.clickMethod(xpth);
    step="Click on button ...";
	//if(ac.click(xpth, step)){System.out.println(step+" :  Done!! ");}
	//else{
		//System.out.println(step+" : *********************************************************************************************** FAILED ");
		//return;}
    if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	waiting.pleaseWait(5);
			
			
			//Click on name Filter             (.//a[.='Filter']/span)[1]
    xpth = "(.//a[.='Filter']/span)[1]";
    step="Click on name Filter";

    if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	waiting.pleaseWait(5);	
			
			
			//provide the name of the Financial Year using send keys            .//form/div[1]/input[@class='k-textbox']     FinancialYear
    xpth = ".//form/div[1]/input[@class='k-textbox']";
    step="provide the name of the Financial Year";
	//ac.inputMethod(xpth,FinancialYear);
    if(ac.input(driver, xpth, FinancialYear, step)){System.out.println(step+" :  Done!! ");}
	else{
		System.out.println(step+" : *********************************************************************************************** FAILED ");
		return false;}
	waiting.pleaseWait(5);	
			
			//click on filter button                .//button[.='Filter']
    xpth = ".//button[.='Filter']";
    step="Click on Filter button";

    if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	waiting.pleaseWait(5);	
			
			//click on Update button       .//button[.='Update']
	xpth = ".//button[.='Update']";
	step="Click Update button";
	//ac.clickMethod(xpth);
	if(ac.enabled(driver, xpth, step)){}
	else{
		System.out.println(step+" : *********************************************************************************************** FAILED ");
		return false;}

	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	waiting.pleaseWait(5);	
	
	//hit save button
	step="Hit Save button";
	xpth=".//button[@data-ng-click='vm.saveChanges()']";
	//ac.click(xpth, step);
	if(ac.click(driver, xpth, step)){System.out.println(step+" : Done!");}
	else{System.out.println(step+" : Failed!");
	return false;}
	
	waiting.pleaseWait(9);
	return true;		
			//take back to home page
	//driver.get(myurl);
	
}

public boolean createTaskOrder1(){
	
	//Assuming at home page
	
			//get Home page
	String myurl = driver.getCurrentUrl();
			//View All                    (.//button[@data-ng-click='viewAll()'])[2]
	Actions1 ac = new Actions1(driver);
	xpth = "(.//button[@data-ng-click='viewAll()'])[2]";
	step="View All button on home page";
	//ac.clickMethod(xpth);
	if(ac.click(driver, xpth, step)){System.out.println(step+" :  Done!! ");}
	else{
		System.out.println(step+" : *********************************************************************************************** FAILED ");
		return false;}
	waiting.pleaseWait(3);
	
	// New Task Order Link               .//a[@class='menu-link ng-binding' and .='New task order']
	xpth = ".//a[@class='menu-link ng-binding' and .='New task order']";
	step="New Task Order Link";
	//ac.clickMethod(xpth);
	if(ac.click(driver, xpth, step)){System.out.println(step+" :  Done!! ");}
	else{
		System.out.println(step+" : *********************************************************************************************** FAILED ");
		return false;}
	waiting.pleaseWait(3);
	
	
	// Task order Type drop down box             .//*[@class='k-icon k-i-arrow-s' and .='select']
	xpth = ".//*[@class='k-icon k-i-arrow-s' and .='select']";
	step="Task Order Type Drop Down Box";
	//ac.clickMethod(xpth);
	if(ac.click(driver, xpth, step)){System.out.println(step+" :  Done!! ");}
	else{
		System.out.println(step+" : *********************************************************************************************** FAILED ");
		return false;}
	waiting.pleaseWait(3);
	
	//Select Option                                 .//div[3]/ul/li[@class='k-item ng-scope' and .='Maintenance Inspection']
	xpth = ".//div[3]/ul/li[@class='k-item ng-scope' and .='Maintenance Inspection']";
	step="Select Option";
	//ac.clickMethod(xpth);
	if(ac.click(driver, xpth, step)){System.out.println(step+" :  Done!! ");}
	else{
		System.out.println(step+" : *********************************************************************************************** FAILED ");
		return false;}
	waiting.pleaseWait(3);
	
	// Provide name using send keys                .//input[@name='Name']
    step="Provide name using send keys";
	xpth = ".//input[@name='Name']";
    Date d = new Date();
    String datetime = new SimpleDateFormat("ddMMMyy_hhmm").format(d);
    taskordername = "taskorder_"+datetime;
    inp=taskordername;
    if(ac.input(driver, xpth, inp, step)){System.out.println("Task order name provided");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	
	waiting.pleaseWait(5);
	
	
	//Contract selection button                     (.//button[.=' ... '])[1]
	step="Contract selection button";
	xpth = "(.//button[.=' ... '])[1]";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
	else{System.out.println(step+" : *********************************************************************************************** FAILED ");
	return false;}
	waiting.pleaseWait(3);
	
	// click Filter for name of contract                     (.//*[@class='k-icon k-filter' and .='Filter'])[2]
	
	
	////provide the name of the Contract using send keys            .//form/div[1]/input[@class='k-textbox']     Contractname needs to be seen
    step="provide the name of the Contract using send keys ";
	xpth = ".//form/div[1]/input[@class='k-textbox']";
	if(ac.input(driver, xpth, inp, step)){System.out.println(step+" done");}
	else{System.out.println(step+" : *********************************************************************************************** FAILED ");
	return false;}
	waiting.pleaseWait(5);
	
	//click on filter button                .//button[.='Filter']
	step="click on filter button";
    xpth = ".//button[.='Filter']";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(5);
	
	//click on Update button       .//button[.='Update']
	step="click on Update button";
    xpth = ".//button[.='Update']";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
    waiting.pleaseWait(5);
	
	//click on Budget button for selection    (.//button[.=' ... '])[2]
    step="click on Budget button for selection";
    xpth = "(.//button[.=' ... '])[2]";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(5);
	
	// click on filter of budget code        (.//*[@class='k-icon k-filter' and .='Filter'])[1]
	step="click on filter of budget code";
    xpth = "(.//*[@class='k-icon k-filter' and .='Filter'])[1]";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(5);
	
	// send keys with Budget Code using xpath         .//form/div[1]/input[@class='k-textbox']
	step="send keys with Budget Code using xpath";
    xpth = ".//form/div[1]/input[@class='k-textbox']";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(5);
	
	//click on filter button                .//button[.='Filter']
	step="click on filter button";
    xpth = ".//button[.='Filter']";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(5);
	
	//click on Update button       .//button[.='Update'] 
	step="click on Update button";
    xpth = ".//button[.='Update']";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(5);
	
	//Save Changes
	step="Save Changes";
    xpth = ".//button[@data-ng-click='vm.saveChanges()']";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");
    waiting.pleaseWait(5);
    return true;}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	//waiting.pleaseWait(5);

	
	//take it to back to home page
	//driver.get(myurl);
	
}

public boolean configureActivitySchedule1(){
	
	
	//assuming it is on home page                  
	String myurl = driver.getCurrentUrl();
	System.out.println(myurl);
	
	// Click on link at home page                        .//*[@class='ng-binding ng-scope' and .='Configure activity/asset schedules']
	step="Click on link at home page";
	Actions1 ac = new Actions1(driver);
	xpth = ".//*[@class='ng-binding ng-scope' and .='Configure activity/asset schedules']";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(7);
	
	//activity type drop down box                    (.//*[@class='k-icon k-i-arrow-s' and .='select'])[1]
	step="activity type drop down box";
	xpth = "(.//*[@class='k-icon k-i-arrow-s' and .='select'])[1]";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	
	// select Option                         .//*[@id='tvClassTreeId_3_tv_active']//span[.='Maintenance Inspection']   -- did not work
	//                     .//span[.='Maintenance Inspection']
	step="Click on Maintenance inspection";
	xpth = ".//span[.='Maintenance Inspection']";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	
	
	//                                       .//*[@id='tvClassTreeId_3_tv_active']//span[.='Principle']
	step="Click on Principle";
	xpth = ".//*[@id='tvClassTreeId_2_tv_active']//span[.='Principle']";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	
	
	
	//                        .//*[@id='tvClassTreeId_3_tv_active']//span[.='Principle Inspection']
	step="select Principle Inspection";
	xpth = ".//*[@id='tvClassTreeId_2_tv_active']//span[.='Principle Inspection']";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(5);
	// 
	
	
	
	
	//Asset type drop down box                      (.//*[@class='k-icon k-i-arrow-s' and .='select'])[2]
	step="Asset type drop down box";
	xpth = "(.//*[@class='k-icon k-i-arrow-s' and .='select'])[2]";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	
	//select option                                     .//div[3]/ul/li[.='Ball']
	//xpth = ".//div[3]/ul/li[.='Ball']";
	step="select option";
	xpth = ".//div[3]/ul/li[@data-offset-index='0']";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	
	//select recurrence pattern drop down box        (.//*[@class='k-icon k-i-arrow-s' and .='select'])[3]
	step="select recurrence pattern drop down box";
	xpth = "(.//*[@class='k-icon k-i-arrow-s' and .='select'])[3]";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	// select option                             .//div[3]/ul/li[.='Daily']
	step="select option";
	xpth = ".//div[3]/ul/li[.='Daily']";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	//Adjust Pattern     drop down                     (.//*[@class='k-icon k-i-arrow-s' and .='select'])[4]
	step="Adjust Pattern     drop down";
	xpth = "(.//*[@class='k-icon k-i-arrow-s' and .='select'])[4]";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	// select option                                                       .//div[2]/ul/li[.='1']
	step="select option";
	xpth = ".//div[2]/ul/li[.='1']";
	if(ac.click(driver, xpth, step)){System.out.println(step+" done");}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	waiting.pleaseWait(3);
	
	
	// Save Changes...  
	
	step="Save Changes..";
    xpth = ".//button[@data-ng-click='vm.saveChanges()']";
    if(ac.click(driver, xpth, step)){System.out.println(step+" done");
    waiting.pleaseWait(5);
    return true;}
    else{System.out.println(step+" : *********************************************************************************************** FAILED ");
    return false;}
	//waiting.pleaseWait(5);
	
	
	//driver.get(myurl);
	
}

	
	
	
}

