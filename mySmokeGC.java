/**
 * 
 */
package ARS_SMOKE_TESTS;

import java.text.SimpleDateFormat;

/**
 * @author Anuj.Singh
 *
 */



import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.LogStatus;

import arsFramework.ReadMe;
import arsFramework.TestcaseTemplate;
import ARS_Pages.home_page_links;
import ARS_Pages.myAssets;
import ARS_Pages.myContacts;
import ARS_Pages.myDocuments;
import ARS_Pages.myItems;
import ARS_Pages.myMenuSearches;
import ARS_Pages.myQuickSearch;
import ARS_Pages.myTasks;
import arsFramework.waiting;
import arsFramework.Actions1;
import arsFramework.ars_logIn2;

public class mySmokeGC {

   //public static WebDriver driver;
	public static String repository;
    public static String username;
    public static String password;	      
    public static String url;
    public static String testcase;
    public static Date TimeNow;
    

		
	public static void main(String[] args) {
                              // TODO Auto-generated method stub


    		// TODO Auto-generated method stub
            //System.out.println("TEST CASE 1: Log-in");
            url = args[0];
            username = args[1];
            password = args[2];
            repository = args[3];
            
            ReadMe.readMe();
            Date date = new Date();
    		String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
            String Reportname="C:\\ARS_Test\\ARSTestReports\\SMOKETEST_REPORT_GC_"+datetime+".html";
            System.out.println(Reportname);

            
            testcase="Log In Test";
            TestcaseTemplate.testCaseTemplate(testcase);
            
            ExtentReports report;

            report=new ExtentReports(Reportname);
            ExtentTest extst;
            extst=report.startTest(testcase);

            TimeNow = new Date();
            System.out.println(TimeNow);

            //String gekoLocation = "C:\\ARS_Test\\GECKODRIVER\\geckodriver0110win64\\geckodriver.exe";
   		 	//System.setProperty("webdriver.firefox.marionette", gekoLocation);     
            //WebDriver driver = new FirefoxDriver();
            
          String chromeLocation = "C:\\webdrivers\\Chrome\\chromedriver.exe";
   		  System.setProperty("webdriver.chrome.driver", chromeLocation);
          WebDriver driver = new ChromeDriver();
            
            //driver.get(url);
            driver.navigate().to(url);
            //WebDriver driver;
            driver.manage().window().maximize();
            System.out.println("Page is Maximized");
            	   
     	// Log - in page     	   
            	   
            	   System.out.println("This is Smoke Test just to check login and the links on the subsequent page");
            	   
            	   System.out.println("Testing url is : " + url);

            	   Actions1 ac = new Actions1(driver);
            		String step="Check if the text box for password is displayed";
            		String xpth = ".//*[@id='txtPassword']";
            		System.out.println(step);
            		if(ac.displayed(driver, xpth, step)){ 
            			ars_logIn2 loginPage = new ars_logIn2(driver);
            		  loginPage.logIn(repository, username, password);
            		  	 }
            		else{System.out.println("The page could not be displayed properly");
            		}

            		step="Check if the page loaded completely";
            		xpth = ".//*[.='Legal Notices']";
            		if(ac.displayed(driver, xpth, step)){ 
            			System.out.println("The page loaded properly");
            			extst.log(LogStatus.PASS, testcase);
            			report.endTest(extst);
            			report.flush();
            		  	 }
            		else{System.out.println("The page could not be loaded properly");
            		extst.log(LogStatus.FAIL, testcase);
            		report.endTest(extst);
            		report.flush();
            		}
            	               	   
            	
            	   
//driver.quit();
driver.quit();
///*
 
//=====================================================================================================
                          
testcase="Home Page links test";
ExtentTest extst1;
extst1=report.startTest(testcase);
extst1.log(LogStatus.PASS, testcase);
try 
	{	
	
    TestcaseTemplate.testCaseTemplate(testcase);
    TimeNow = new Date();
    System.out.println(TimeNow);

	 driver=newLogin();
	 waiting.pleaseWait(7);
	System.out.println(url);
		home_page_links homePage=new home_page_links(driver);
		System.out.println("homepage object is created");
		homePage.checkLinks();
		homePage.checkMenulinks();
		System.out.println("----------------------Completed Checking links on home page-------------------");
		report.endTest(extst1);
		report.flush();
		}
catch(Exception e)
	{
	extst1.log(LogStatus.FAIL, testcase);
	report.endTest(extst1);
	report.flush();
		System.out.println("*******************************************************Home Page Links are not present");
	
	}

//driver.quit();
driver.quit();
///*

// Create Asset Block
ExtentTest createAssetTest;
testcase="test: Create Asset and check the tabs of the page after saving test";
createAssetTest=report.startTest(testcase);





try
	{

    TestcaseTemplate.testCaseTemplate(testcase);
	            TimeNow = new Date();
            System.out.println(TimeNow);

       	 driver=newLogin();
       	waiting.pleaseWait(7);
	System.out.println("Create Asset");

	Thread.sleep(3);
	//driver.get(url);
	myAssets newasset=new myAssets(driver);
	//newasset.createAsset();
	if(newasset.createAsset1()){
		createAssetTest.log(LogStatus.PASS, testcase);
	} 
	else{
		createAssetTest.log(LogStatus.FAIL, testcase);
	}
	newasset.checkTabs();
	//newasset.addCondition();
	//newasset.addActivity();
	//newasset.addDocument();
	System.out.println("Created Asset");
	//driver.get(url);
	Thread.sleep(3000);
	
		}
catch(Exception e)
	{
	System.out.println("*******************************************************Something went wrong in Create asset page");
	//driver.get(url);
	}
//driver.quit();
driver.quit();

// Document Block
testcase="Create Document test";
ExtentTest createDocumenttest;
createDocumenttest=report.startTest(testcase);

try
{

System.out.println("Test: Create Document and check tabs");

TestcaseTemplate.testCaseTemplate(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
//driver.get(url);
waiting.pleaseWait(5);
myDocuments newdocument = new myDocuments(driver);
//newdocument.createDocument();
if(newdocument.createDocument1()){
	createDocumenttest.log(LogStatus.PASS, testcase);
	report.endTest(createDocumenttest);
	report.flush();
} else{
	createDocumenttest.log(LogStatus.FAIL, testcase);
	report.endTest(createDocumenttest);
	report.flush();
}
//newdocument.createDocument1();
newdocument.checkdocumentTabs();
//driver.get(url);
System.out.println("Test: Create Document and check tabs done");	
	Thread.sleep(4000);
}
catch(Exception e)
{
System.out.println("*******************************************************Something went wrong in Create Document page");
driver.get(url);
}
//driver.quit();
driver.quit();

// Create New Contact Block
testcase="test: Create Person";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createContacttest;
createContacttest=report.startTest(testcase);
try
{
System.out.println("Create Person");
	
	
	TimeNow = new Date();
	System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(12);
myContacts newcontact = new myContacts(driver);
if(newcontact.createNewConatct1()){createContacttest.log(LogStatus.PASS, testcase);
report.endTest(createContacttest);
report.flush();}
else{
	createContacttest.log(LogStatus.FAIL, testcase);
	report.endTest(createContacttest);
	report.flush();
}
newcontact.checkContactTabs();

//driver.get(url);

Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println("*******************************************************Something went wrong in Create Contact page");
driver.get(url);
System.out.println(driver.getCurrentUrl());
waiting.pleaseWait(7);
}
//driver.quit();
driver.quit();
//===============================================================================================================


//Create Organization Block
System.out.println("-------------------------------------------Start of Create Organization");
testcase="Test: Create New Organization";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createNewOrgtest;
createNewOrgtest=report.startTest(testcase);
try
{
System.out.println("Create new Organization and check its tab after saving");
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(12);
myTasks Organization = new myTasks(driver);
//newOrganization.createNewOrganization();
if(Organization.createNewOrganization1()){createNewOrgtest.log(LogStatus.PASS, testcase);
report.endTest(createNewOrgtest);
report.flush();}
else{createNewOrgtest.log(LogStatus.FAIL, testcase);
report.endTest(createNewOrgtest);
report.flush();}
//newOrganization.checkOrganizationTabs();
Organization.checkOrganizationTabs();
driver.quit();






////////////////////////////////////////
////////////////////////////////////////////
///////////////////////////////////////////












/*
//driver.get(url);
driver=newLogin();
waiting.pleaseWait(12);
myTasks Organization1 = new myTasks(driver);
Thread.sleep(3000);
testcase="Create Contract from Organization and check the tabs";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createFromOrgtest;
createFromOrgtest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
if(Organization1.createFromOrg1()){createFromOrgtest.log(LogStatus.PASS, testcase);
report.endTest(createFromOrgtest);
report.flush();}
else{createFromOrgtest.log(LogStatus.FAIL, testcase);
report.endTest(createFromOrgtest);
report.flush();}
Thread.sleep(3000);
Organization.checkContractTabs();
Thread.sleep(3000);
//driver.quit();
driver.quit();
*/

}
catch(Exception e)
{
System.out.println("*******************************************************Something went wrong in Create Organization page");
driver.get(url);
System.out.println(driver.getCurrentUrl());
waiting.pleaseWait(7);

}

System.out.println("----------------------------End of Create Organization");
//===============================================================================================================
//driver.quit();
driver.quit();
	
	
	
//End of Organization Block

//================================================================================================================	
	
	
	
	
	
	

	
	
	
	
	
//==============================================================================================================	
//Create Item block

System.out.println("================================Start of Create Item");
testcase="Test: Create New Item and check the tabs";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createItemtest;
createItemtest=report.startTest(testcase);
try
{
System.out.println("Create new Item");
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(12);
myItems newItem = new myItems(driver);
if(newItem.createNewItem1()){createItemtest.log(LogStatus.PASS, testcase);
report.endTest(createItemtest);
report.flush();}
else{createItemtest.log(LogStatus.FAIL, testcase);
report.endTest(createItemtest);
report.flush();}
newItem.checkNewItemTabs();

//driver.get(url);

Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println("*******************************************************Something went wrong in Create Item page");
driver.get(url);
System.out.println(driver.getCurrentUrl());
waiting.pleaseWait(7);

}

System.out.println("=============================End of Create Item Block");

//driver.quit();	
driver.quit();	
	
	
	
	
//End of the Item Block
//================================================================================================================	
	

	
	
	
	
	
	
	
	
	

//=================================================================================================================	
//Create PriceList Block
	
System.out.println("================================Start of Create Price List");
System.out.println("Create new Price List");
testcase="Test: Create New Price Lists and check its tab";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createPricelisttest;
createPricelisttest=report.startTest(testcase);
try
{

TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(12);
myItems newItem = new myItems(driver);
if(newItem.createNewPriceList1()){createPricelisttest.log(LogStatus.PASS, testcase);
report.endTest(createPricelisttest);
report.flush();}
else{createPricelisttest.log(LogStatus.FAIL, testcase);
report.endTest(createDocumenttest);
report.flush();}
newItem.checkPriceListTabs();

//driver.get(url);

Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println("*******************************************************Something went wrong in Create Pricelist page");
driver.get(url);
System.out.println(driver.getCurrentUrl());
waiting.pleaseWait(7);
}

System.out.println("================================End of Create Price List Block");

//driver.quit();
driver.quit();	
	
	
	
	
//End of the PriceList Block
	
//============================================================================================================
	
	
	
	
	
//========================================================================================================	
//Create a Contract block
	

System.out.println("================================Start of Create Contract");
System.out.println("Create new Contract");
testcase="Test: Create New Contract and check its Tab";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createNewContracttest;
createNewContracttest=report.startTest(testcase);
try
{
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(12);
myTasks Contract = new myTasks(driver);
//newContract.createNewContract();
if(Contract.createNewContract1()){createNewContracttest.log(LogStatus.PASS, testcase);
report.endTest(createNewContracttest);
report.flush();}
else{createNewContracttest.log(LogStatus.FAIL, testcase);
report.endTest(createNewContracttest);
report.flush();}
//newContract.checkContractTabs();
Contract.checkContractTabs();

Thread.sleep(3000);

}
catch(Exception e)
{
System.out.println("*******************************************************Something went wrong in Create Contract page");
driver.get(url);
System.out.println(driver.getCurrentUrl());
waiting.pleaseWait(7);
}

//driver.quit();
driver.quit();

System.out.println("================================End of Create Contract");

//==========================================================================

	
	
	
	
//End of the Contract Block
//============================================================================================================

//===============================================================================================================	
//Create Financial Year Block
System.out.println("================================Start of Financial Year Block");
testcase="Test:Create Financial Year";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createFinancialYearTest;
createFinancialYearTest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(17);
//Tasks FIBUTA = new Tasks(driver);
myTasks FIBUTA = new myTasks(driver);
try
{


//newContract.createNewContract();
System.out.println("Configure Activity Schedule");
//FIBUTA.configureActivitySchedule();



//waiting.pleaseWait(12);
//driver.get(url);
waiting.pleaseWait(12);
System.out.println("Create Financial Year");
if(FIBUTA.createFinancialYear1()){createFinancialYearTest.log(LogStatus.PASS, testcase);
report.endTest(createFinancialYearTest);
report.flush();}
else{createFinancialYearTest.log(LogStatus.FAIL, testcase);
report.endTest(createFinancialYearTest);
report.flush();}
driver.get(url);
waiting.pleaseWait(12);
//extst.log(LogStatus.FAIL, testcase);
//report.endTest(extst);
//FIBUTA.createNewContract();
//waiting.pleaseWait(12);
}	

catch(Exception e)
{
	createFinancialYearTest.log(LogStatus.FAIL, testcase);
	report.endTest(createFinancialYearTest);
	report.flush();
System.out.println("*******************************************************Something went wrong in Create Contract page");
//driver.get(url);
System.out.println(driver.getCurrentUrl());
waiting.pleaseWait(7);
}






System.out.println("Create Budget");
testcase="Test:Create Budget";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createBudgettest;
createBudgettest=report.startTest(testcase);
try{
if(FIBUTA.createBudget1()){createBudgettest.log(LogStatus.PASS, testcase);
report.endTest(createBudgettest);
report.flush();}
else{createBudgettest.log(LogStatus.FAIL, testcase);
report.endTest(createBudgettest);
report.flush();}
//waiting.pleaseWait(12);
//FIBUTA.createTaskOrder();
//waiting.pleaseWait(12);


}	

catch(Exception e)
{
	createBudgettest.log(LogStatus.FAIL, testcase);
	report.endTest(createBudgettest);
	report.flush();
System.out.println("*******************************************************Something went wrong in Create Contract page");
//driver.get(url);
System.out.println(driver.getCurrentUrl());
waiting.pleaseWait(7);
}
//report.endTest(extst2);
//report.flush();
//driver.quit();
driver.quit();

System.out.println("================================End of FIBUTA");

//End of the Financial Year Block

//============================================================================================================


//===============================================================================================================	
//Create Budget Block

	
	
	
	
	
	
//End of the Budget Block

//============================================================================================================


//===============================================================================================================	
//Create Task Order Block

	
	
	
	
	
	
//End of the Task Order Block

//============================================================================================================


//===============================================================================================================	
//Create Configure Activity Schedule Block

	
	
	
	
	
	
//End of the Configure Activity Schedule Block

//============================================================================================================


//------------------------------------------QuickSearch--------------------------------------
//------------------------------------------QuickSearch  Activity--------------------------------------



// /*
testcase="Test: Quick Search Activities";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchActivitiestest;
quickSearchActivitiestest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(12);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch= new myQuickSearch(driver);
if(qsearch.activities1()){quickSearchActivitiestest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchActivitiestest);
report.flush();}
else{quickSearchActivitiestest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchActivitiestest);
report.flush();}
waiting.pleaseWait(5);
System.out.println(driver.getCurrentUrl());
//driver.quit();
driver.quit();
//------------------------------------------QuickSearch  Activities END--------------------------------------
//------------------------------------------QuickSearch  Assets START--------------------------------------
driver=newLogin();
waiting.pleaseWait(12);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch1= new myQuickSearch(driver);
testcase="Test: Quick Search Assets";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchAssetstest;
quickSearchAssetstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch1.asset1()){quickSearchAssetstest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchAssetstest);
report.flush();}
else{quickSearchAssetstest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchAssetstest);
report.flush();}
//driver.quit();
driver.quit();
//waiting.pleaseWait(10);
//------------------------------------------QuickSearch  Assets END--------------------------------------


//QuickSearch  qserch= new QuickSearch(driver);

testcase="Test: Quick Search Organizations";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchOrgTest;
quickSearchOrgTest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch2= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch2.organizations1()){quickSearchOrgTest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchOrgTest);
report.flush();}
else{quickSearchOrgTest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchOrgTest);
report.flush();}
//driver.quit();
driver.quit();

testcase="Test: Quick Search Budgets";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchBudgettest;
quickSearchBudgettest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch3= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch3.budgets1()){quickSearchBudgettest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchBudgettest);
report.flush();}
else{quickSearchBudgettest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchBudgettest);
report.flush();}
//driver.quit();
driver.quit();

testcase="Test: Quick Search Conditions";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchConditionstest;
quickSearchConditionstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch4= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch4.conditions1()){quickSearchConditionstest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchConditionstest);
report.flush();}
else{quickSearchConditionstest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchConditionstest);
report.flush();}
//driver.quit();
driver.quit();

testcase="Test: Quick Search Contracts";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchContractstest;
quickSearchContractstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch5= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch5.contracts1()){quickSearchContractstest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchContractstest);
report.flush();}
else{quickSearchContractstest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchContractstest);
report.flush();}
driver.quit();

testcase="Test: Quick Search Documents";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchDocumentstest;
quickSearchDocumentstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch6= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch6.documents1()){quickSearchDocumentstest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchDocumentstest);
report.flush();}
else{quickSearchDocumentstest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchDocumentstest);
report.flush();}
driver.quit();

testcase="Test: Quick Search People";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchPeopletest;
quickSearchPeopletest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch7= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch7.people1()){quickSearchPeopletest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchPeopletest);
report.flush();}
else{quickSearchPeopletest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchPeopletest);
report.flush();}
driver.quit();

testcase="Test: Quick Search PriceLists";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchPriceListtest;
quickSearchPriceListtest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch8= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch8.priceLists1()){quickSearchPriceListtest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchPriceListtest);
report.flush();}
else{quickSearchPriceListtest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchPriceListtest);
report.flush();}
driver.quit();

testcase="Test: Quick Search Items";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchItemstest;
quickSearchItemstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch9= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
if(qsearch9.items1()){quickSearchItemstest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchItemstest);
report.flush();}
else{quickSearchItemstest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchItemstest);
report.flush();}
driver.quit();

testcase="Test: Quick Search Tasks Orders";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest quickSearchTasksOrdertest;
quickSearchTasksOrdertest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
System.out.println(driver.getCurrentUrl());
myQuickSearch  qsearch10= new myQuickSearch(driver);
//driver.get(url);
waiting.pleaseWait(5);
//qsearch10.taskOrders1();
if(qsearch10.taskOrders1()){quickSearchTasksOrdertest.log(LogStatus.PASS, testcase);
report.endTest(quickSearchTasksOrdertest);
report.flush();}
else{quickSearchTasksOrdertest.log(LogStatus.FAIL, testcase);
report.endTest(quickSearchTasksOrdertest);
report.flush();}
driver.quit();





//driver.quit();
//------------------------------------------QuickSearch--------------------------------------

//*/


//------------------------------------------MenuSearch--------------------------------------
//newLogin();
//driver.get(url);
//WebDriver driver=newLogin();
//driver = driver2;
testcase="Test: Menu Search Assets";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchAssetstest;
menuSearchAssetstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch= new myMenuSearches(driver);
if(msearch.menuSearchAssets1()){
	menuSearchAssetstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchAssetstest);
	report.flush();
} else{
	menuSearchAssetstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchAssetstest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Activities";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchActivitiestest;
menuSearchActivitiestest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch1= new myMenuSearches(driver);
if(msearch1.menuSearchActivities1()){
	menuSearchActivitiestest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchActivitiestest);
	report.flush();
} else{
	menuSearchActivitiestest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchActivitiestest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Budget";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchBudgettest;
menuSearchBudgettest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch2= new myMenuSearches(driver);
if(msearch2.menuSearchBudgets1()){
	menuSearchBudgettest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchBudgettest);
	report.flush();
} else{
	menuSearchBudgettest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchBudgettest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Conditions";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchConditionstest;
menuSearchConditionstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch3= new myMenuSearches(driver);
if(msearch3.menuSearchConditions1()){
	menuSearchConditionstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchConditionstest);
	report.flush();
} else{
	menuSearchConditionstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchConditionstest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Contracts";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchContractstest;
menuSearchContractstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch4= new myMenuSearches(driver);
if(msearch4.menuSearchContracts1()){
	menuSearchContractstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchContractstest);
	report.flush();
} else{
	menuSearchContractstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchContractstest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Documents";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchDocumentstest;
menuSearchDocumentstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch5= new myMenuSearches(driver);
if(msearch5.menuSearchDocuments1()){
	menuSearchDocumentstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchDocumentstest);
	report.flush();
} else{
	menuSearchDocumentstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchDocumentstest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Items";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchItemstest;
menuSearchItemstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch6= new myMenuSearches(driver);
if(msearch6.menuSearchItems1()){
	menuSearchItemstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchItemstest);
	report.flush();
} else{
	menuSearchItemstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchItemstest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Organizations";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchOrgtest;
menuSearchOrgtest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch7= new myMenuSearches(driver);
if(msearch7.menuSearchOrganizations1()){
	menuSearchOrgtest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchOrgtest);
	report.flush();
} else{
	menuSearchOrgtest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchOrgtest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search PriceLists";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchPriceListstest;
menuSearchPriceListstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch8= new myMenuSearches(driver);
if(msearch8.menuSearchPriceLists1()){
	menuSearchPriceListstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchPriceListstest);
	report.flush();
} else{
	menuSearchPriceListstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchPriceListstest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Tasks Orders";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchTaskOrderstest;
menuSearchTaskOrderstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch9= new myMenuSearches(driver);
msearch9.menuSearchItems1();
if(msearch9.menuSearchTaskOrders1()){
	menuSearchTaskOrderstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchTaskOrderstest);
	report.flush();
} else{
	menuSearchTaskOrderstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchTaskOrderstest);
	report.flush();
}
driver.quit();

testcase="Test: Menu Search Contacts";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest menuSearchContactstest;
menuSearchContactstest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
driver=newLogin();
waiting.pleaseWait(7);
myMenuSearches  msearch10= new myMenuSearches(driver);
if(msearch10.menuSearchContacts1()){
	menuSearchContactstest.log(LogStatus.PASS, testcase);
	report.endTest(menuSearchContactstest);
	report.flush();
} else{
	menuSearchContactstest.log(LogStatus.FAIL, testcase);
	report.endTest(menuSearchContactstest);
	report.flush();
}
driver.quit();

















}              
//	End of the main Method
	
	
	
	
	
	
public static void waitkaro() {
                              // TODO Auto-generated method stub
                              try {
                                             //Thread.sleep(5000);
                                             Thread.sleep(500);
                              } catch (InterruptedException e) {
                                             // TODO Auto-generated catch block
                                             e.printStackTrace();
                              }
                            
               }




public static WebDriver newLogin(){

    Date myTime = new Date();
    System.out.println(myTime);
    //String gekoLocation = "C:\\ARS_Test\\GECKODRIVER\\geckodriver0110win64\\geckodriver.exe";
	//System.setProperty("webdriver.firefox.marionette", gekoLocation);
   // WebDriver driver = new FirefoxDriver();
    String chromeLocation = "C:\\webdrivers\\Chrome\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", chromeLocation);
    WebDriver driver = new ChromeDriver();
    //driver.get(url);
    driver.navigate().to(url);
    driver.manage().window().maximize();
/*
 
*/	
	Actions1 ac=new Actions1(driver);
	String step="Check if the text box for password is displayed";
	String xpth = ".//*[@id='txtPassword']";
	
	if(ac.displayed(driver, xpth, step)){ 
		ars_logIn2 loginPage = new ars_logIn2(driver);
	  loginPage.logIn(repository, username, password);
	  	 }
	else{System.out.println("The page could not be displayed properly");
	}

	step="Check if the page loaded completely";
	xpth = ".//*[.='Legal Notices']";
	if(ac.displayed(driver, xpth, step)){ 
		System.out.println("The page loaded properly");
	  	 }
	else{System.out.println("The page could not be loaded properly");
	}
    
    
    
	return driver;
	
	
	
}
              
             

}
//End of the class
