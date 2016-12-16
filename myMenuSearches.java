/**
 * 
 */


/**
 * @author Anuj.Singh
 *
 */




/**
 * 
 */
package ARS_Pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import arsFramework.Actions1;
import arsFramework.SearchResult;
import arsFramework.waiting;

/**
 * @author Anuj.Singh
 *
 */
public class myMenuSearches {
	
	
	
		WebDriver driver;
		public String xpth="";
		public String inp = "";
		public String step="";
		
		public myMenuSearches(WebDriver driver){
			this.driver=driver;
			Date date = new Date();
			String modifiedDate= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
			System.out.println(modifiedDate);
		}
	
		
		
		//another constructor
		public myMenuSearches(){
			Date date = new Date();
			String modifiedDate= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
			System.out.println(modifiedDate);
		}
		
		
		

public boolean menuSearchAssets1(){
	
	System.out.println("Menu Search Assets");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	// click on search link at  menu on home page
	step="click on search link at  menu on home page";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search assets']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchasset is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	//Click search button
	step="click on  menusearchbutton at  menu on home page";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);
	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;
	
	
}

public boolean menuSearchConditions1(){
	
	System.out.println("Menu Search Conditions");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	// click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(3);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(5);
	

	//Link for menusearchconditions
	step="click on Link for menusearchconditions";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search conditions']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu search conditions is Clicked");
		waiting.pleaseWait(3);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//Click on Link for menusearchbutton
	step="click on Link for menusearchconditions";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(3);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(3);
	
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);
	//driver.get(hm_page);
	waiting.pleaseWait(1);
	
	return true;
	
	
}

public boolean menuSearchActivities1(){
	
	System.out.println("Menu Search Activities");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(3);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(3);
	
	
	// click on search link at  menu on home page
	step="menusearchactivities is Clicked";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search activities']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchactivities is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//Link for menusearchbutton
	step="menusearchactivities is Clicked";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);
	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchOrganizations1(){

	System.out.println("Menu Search Organizations");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	// click on search link at  menu on home page
	step="Click on Link for menusearchorganizations";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search organizations']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchorganizations is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	//Click on Link for menusearchbutton
	step="Click on Link for menusearchbutton";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);
	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchContracts1(){

	System.out.println("Menu Search Contracts");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	//Link for menusearchcontracts is Clicked
	step="click on Link for menusearchcontracts";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search contracts']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchcontracts is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//
	step="Click on Link for menusearchbutton ";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);
	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchBudgets1(){

	System.out.println("Menu Search Budgets");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//Link for menusearchbudgets
	step="click on Link for menusearchbudgets";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search budgets']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbudgets is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);


	
	
	//Link for menusearchbutton is Clicked
	step="click on Link for menusearchbutton";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);
	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchTaskOrders1(){

	System.out.println("Menu Search Task Orders");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	
	//
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//Link for menusearchtaskorders is Clicked
	step="click on Link for menusearchtaskorders";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search task orders']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchtaskorders is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
		
	//click on Link for menusearchbutton
	step="click on Link for menusearchbutton";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);
	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchItems1(){

	System.out.println("Menu Search Items");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchitems
	step="click on Link for menusearchitems";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search items']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchitems is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchbutton
	step="click on Link for menusearchbutton";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);

	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchPriceLists1(){

	System.out.println("Menu Search Price Lists");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchpricelists
	step="click on Link for menusearchpricelists";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search price lists']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchpricelists is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchbutton
	step="click on Link for menusearchbutton";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultPriceLists']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultPriceLists']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);

	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchDocuments1(){

	System.out.println("Menu Search Documents");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchdocuments
	step="click on Link for menusearchdocuments";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search documents']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchdocuments is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchbutton
	step="click on Link for menusearchbutton";
	xpth=".//*[@id='paneCriteria']//button[.='Search']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchbutton is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
				
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);

	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuViewAllContacts1(){

	System.out.println("Menu Search View All Contacts");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchviewallcontacts
	step="click on Link for menusearchviewallcontacts";
	xpth=".//*[@id='mainMenuContainer']//a[.='View All Contacts']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchviewallcontacts is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
				
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='docmgr_persons']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='docmgr_persons']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);

	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;

}

public boolean menuSearchContacts1(){
	

	System.out.println("Menu Search Contacts");
	String hm_page=driver.getCurrentUrl();
	System.out.println(hm_page);
	
	//click on menu at home page
	Actions1 ac = new Actions1(driver);
	step="click on menu at home page";
	xpth=".//*[@id='vm.poNav']/span[2]";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menu is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for menusearchviewallcontacts
	step="click on Link for menusearchviewallcontacts";
	//xpth=".//*[@id='mainMenuContainer']//a[.='Search contacts']";
	xpth=".//*[@id='mainMenuContainer']//a[.='Search persons']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for menusearchviewallcontacts is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
				
	// cellvalues
	//no of coulmns
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='docmgr_persons']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='docmgr_persons']/div[2]/table/tbody/tr[1]/td[*]"));
	SearchResult.search(cellvalues, noofcol);

	//driver.get(hm_page);
	waiting.pleaseWait(1);
	return true;
	
	
	
	
}


}
