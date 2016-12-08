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

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;

import arsFramework.Actions1;
import arsFramework.SearchResult;
import arsFramework.SeeElement;
import arsFramework.TestcaseTemplate;
import arsFramework.waiting;


/**
 * @author Anuj.Singh
 *
 */
public class myQuickSearch {
	
	public WebDriver driver;
	public String xpth="";
	public String inp = "";
	public String step="";
	public String testcase="";
	//public ExtentReports report;
	
	
    
    
    
	public myQuickSearch(WebDriver driver){
		
		this.driver = driver;
		
	    //report=new ExtentReports("G:\\test\\Reports\\myreport.html");
	    
	}
	
		


public boolean activities1(){
	

	
	//Click on Link for hp_QuickSearchLink
testcase = "Quick Search Test for Activities";
//TestcaseTemplate.testCaseTemplate(testcase);
//ExtentTest extst1;
//extst1=report.startTest(testcase);

	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst1.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(2);
	
    //click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst1.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(2);

	//click on Link for SelectOption
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Activities']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst1.log(LogStatus.FAIL, testcase);
		return false;
		}
	*/
	step="Select Item Activities";
	String option="Activities";
	ac.selectItem(driver, option);
	waiting.pleaseWait(2);
	
	
	//Provide value * to KeyINText
	step="Provide value * to KeyINText";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	inp="*";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Provided value * to KeyINText");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst1.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(2);	
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst1.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(2);	
	
//List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody//td"));
//List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultActivitySearch']/div[2]/table/tbody/tr[1]/td[*]"));
	//List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultTaskInspectionSearch']/div[2]/table/tbody//td"));		
	//List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultTaskInspectionSearch']/div[2]/table/tbody/tr[1]/td[*]"));
	//ars_DefaultActivitySearch
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='ars_DefaultActivitySearch']/div[2]/table/tbody//td"));		
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='ars_DefaultActivitySearch']/div[2]/table/tbody/tr[1]/td[*]"));
	
	
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------ACTIVITIES SEARCH--------------");
return true;
//extst1.log(LogStatus.PASS, testcase);
//report.endTest(extst);
//report.flush();
	
}

public  boolean asset1(){


	//Click on Link for hp_QuickSearchLink
testcase = "Quick Search Test for Activities";
//TestcaseTemplate.testCaseTemplate(testcase);
//ExtentTest extst2;
//extst2=report.startTest(testcase);
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst2.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(2);
	
   //click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst2.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SelectOption
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Assets']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst2.log(LogStatus.FAIL, testcase);
		return false;
		}
	*/
	step="Select Item Assets";
	String option="Assets";
	ac.selectItem(driver, option);
	waiting.pleaseWait(2);
	
	//Link for keyintext is provided
	step="Link for keyintext is provided";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	inp="*";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Link for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst2.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(5);	

//
	step="click on Link for SearchButton is provided";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
	//extst2.log(LogStatus.FAIL, testcase);
		return false;
		}
	waiting.pleaseWait(5);
	
	//xpth=".//*[@name='DefaultAsset']/div[2]/table/tbody/tr[1]/td[1]";
	//WebElement  firstcolvalue = SeeElement.checkElement2(driver, xpth);

//List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody//td"));
//List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody/tr[1]/td[*]"));
	
	List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody//td"));
	List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultAsset']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
System.out.print("--------------FINISH--------------ASSETS SEARCH--------------");
//extst2.log(LogStatus.PASS, testcase);
//report.endTest(extst2);
//report.flush();
return true;
}

public boolean financialYear1(){
		
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
//click on Link for dropdownbox
	
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}

	waiting.pleaseWait(2);  
	
	//click on Link for SelectOption
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Financial Year']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	*/
	step="Select Item Financial Year";
	String option="Financial Year";
	ac.selectItem(driver, option);
	waiting.pleaseWait(2);
	
	//click on Link for keyintext
	inp="*";
	step="click on Link for keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Link for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultFinancialYearConfig']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultFinancialYearConfig']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------Financial Year SEARCH--------------");
return true;
	
	
}

public boolean budgets1(){

	
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
	//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
    //click on Link for SelectOption
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Budgets']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	*/
	step="Select Item Budgets";
	String option="Budgets";
	ac.selectItem(driver, option);
	waiting.pleaseWait(2);

	
	
	//Provide value to keyintext
	inp="*";
	step="Provide value to keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Link for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultBudget']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultBudget SEARCH--------------");
	
	return true;
	
}

public boolean conditions1(){

	
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
    
	//click on Link for SelectOption
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Conditions']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	*/
	step="Select Item Conditions";
	String option="Conditions";
	ac.selectItem(driver, option);
	
	waiting.pleaseWait(2);
	
	//Link for keyintext is provided
	inp="*";
	step="Link for keyintext is provided";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Link for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultConditionSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultConditionSearch SEARCH--------------");
	return true;
		
}

public boolean contracts1(){
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);	
    
	//click on Link for SelectOption
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Contracts']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
		*/
	step="Select Item Contracts";
	String option="Contracts";
	ac.selectItem(driver, option);
	
	
	waiting.pleaseWait(2);	
	
	
	//Provide * for keyintext
	inp="*";
	step="Provide * for keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Link for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);	
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
			
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultContractSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------Financial Year SEARCH--------------");
	return true;
}

public boolean documents1(){

	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
    //Link for SelectOption
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Documents']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	*/
	step="Select Item Documents";
	String option="Documents";
	ac.selectItem(driver, option);
	
	
	
	waiting.pleaseWait(2);
	
	//Provide * to textfield
	inp="*";
	step="Provide * to textfield";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Value * to keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	

List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultDocumentSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultDocumentSearch SEARCH--------------");
	return true;
}

public boolean items1(){

	
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
    //click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SelectOption
	
	/*
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Items']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	*/
	step="Select Item Items";
	String option="Items";
	ac.selectItem(driver, option);
	
	
	
	waiting.pleaseWait(2);
	
	//Provide value *  for keyintext
	step="Provide value *  for keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Link for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultItemSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultItemSearch SEARCH--------------");
	
	return true;
	
}

public boolean organizations1(){

	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(3);
    
//Select dropdown = new Select(driver.findElement(By.id("designation")));
	//Select dropdown = new Select(driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Organizations']")));
	//dropdown.selectByValue("Organizations");
	//driver.findElement(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Organizations']")).click();
	///div[2]/div/div[2]/ul
	//Select dropdown = new Select(driver.findElement(By.xpath(".//div[2]/div/div[2]/ul")));
	//dropdown.selectByValue("Organizations");
	//List<WebElement> brands = driver.findElements(By.xpath("//*[@id='brand-type']/div[1]/ul[1]/li"));
	
	/*
	List<WebElement> options = driver.findElements(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li"));
	
	for(int i=0;i<options.size();i++){
		String s = options.get(i).getText();
		System.out.println(s);
	if(s.equals("Organizations")){
		
		try{
		System.out.println("Inside IF block before element definition");
		WebElement e = options.get(i);
		System.out.println("After element definition");						
		e.click();
		//waiting.pleaseWait(5);
		System.out.println("After Clicking the element");
		//waiting.pleaseWait(5);
		
		}
		catch(Exception e){System.out.println(e.getMessage());}
		break;
		
		
	}else{String ss = options.get(i).getText();
	System.out.println(ss);
	WebElement ee = options.get(i);
	ee.sendKeys(Keys.ARROW_DOWN);
	waiting.pleaseWait(1);
	} }
	*/
	
	step="Select Item Organizations";
	String option="Organizations";
	ac.selectItem(driver, option);
	
	
	
	
	
	//waiting.pleaseWait(10);
	
	/*
	//click on Link for SelectOption
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Organizations']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	
	*/
	waiting.pleaseWait(2);
	
	//Provide Value * for keyintext
	inp="*";
	step="Provide Value * for keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Value * for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultOrganizationSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultOrganizationSearch SEARCH--------------");
	
	return true;
	
	
}

public boolean people1(){

	
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SelectOption
	
	/*
	step="click on Link for SelectOption";
	//xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='People']";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Persons']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	*/
	step="Select Item Persons";
	String option="Persons";
	ac.selectItem(driver, option);
	
	waiting.pleaseWait(2);
	
	//Provide value * for keyintext
	step="Provide value * for keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Value for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//		click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(3);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultPerson']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultPerson']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultPerson SEARCH--------------");
	
	return true;
	
	
}

public boolean priceLists1(){

	
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	/*
	//click on Link for SelectOption
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Price Lists']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	*/
	
	step="Select Item Price Lists";
	String option="Price Lists";
	ac.selectItem(driver, option);
	
	
	
	
	//Provide Value * for keyintext
	inp="*";
	step="Provide Value * for keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Value * for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultPriceListSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultPriceListSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultPriceListSearch SEARCH--------------");
	
	return true;
	
	
	
}

public boolean taskOrders1(){

	
	//Click on Link for hp_QuickSearchLink
	Actions1 ac = new Actions1(driver);
	step="click on Link for hp_QuickSearchLink";
	xpth=".//div[@id='vm.poQuickSearch']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for hp_QuickSearchLink is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for dropdownbox
	step="click on Link for dropdownbox";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//span[@class='k-icon k-i-arrow-s' and .='select']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for dropdownbox is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	/*
	//click on Link for SelectOption
	step="click on Link for SelectOption";
	xpth=".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li[.='Task Orders']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SelectOption is Clicked");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	*/
	step="Select Item Task Orders";
	String option="Task Orders";
	ac.selectItem(driver, option);
	
	
	
	//Provide Value * for keyintext
	inp="*";
	step="Provide Value * for keyintext";
	xpth=".//div[@class='popoverQuickSearch ng-scope']//input[@type='text']";
	if(ac.input(driver, xpth, inp, step)){
		System.out.println("Value * for keyintext is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
	//click on Link for SearchButton
	step="click on Link for SearchButton";
	xpth=".//div[@class='navbarright']//div[@class='popoverQuickSearch ng-scope']//button[@ng-click='arsQuickSearch.openSearch()']";
	if(ac.click(driver, xpth, step)){
		System.out.println("Link for SearchButton is provided");
		waiting.pleaseWait(2);
		}
	else{System.out.println("ERROR: Could Not perform "+step);
		return false;
		}
	waiting.pleaseWait(2);
	
//financial year search not working?
List<WebElement> cellvalues = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody//td"));
List<WebElement> noofcol = driver.findElements(By.xpath(".//*[@name='DefaultTaskOrderSearch']/div[2]/table/tbody/tr[1]/td[*]"));
SearchResult.search(cellvalues, noofcol);
	
System.out.println("--------------FINISH--------------DefaultTaskOrderSearch SEARCH--------------");
	
	return true;
	
	
	
}




}


