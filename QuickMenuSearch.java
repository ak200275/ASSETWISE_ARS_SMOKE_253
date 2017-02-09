/**
 * 
 */
package UnitTest;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ARS_Pages.myAssets;
import ARS_Pages.myContacts;
import ARS_Pages.myDocuments;
import ARS_Pages.myMenuSearches;
import ARS_Pages.myQuickSearch;
import arsFramework.Actions1;
import arsFramework.ReadMe;
import arsFramework.TestcaseTemplate;
import arsFramework.ars_logIn2;
import arsFramework.waiting;



/**
 * @author Anuj.Singh
 *
 */
public class QuickMenuSearch {

	/**
	 * @param args
	 */
	
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
        url =  "http://pghdemoarsweb01/ars_demo";                                                //args[0];
        username =  "admin";                                           //args[1];
        password =  "admin";                                             //args[2];
        repository =  "ARS_DEMO_ORACLE";                                             //args[3];
       
        ReadMe.readMe();
        Date date = new Date();
		String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
        String Reportname="C:\\ARS_Test\\ARSTestReports\\ARS_SMOKETEST_REPORT_"+datetime+".html";
        System.out.println(Reportname);

        
        testcase="Log In Test";
        TestcaseTemplate.testCaseTemplate(testcase);
        
        ExtentReports report;

        report=new ExtentReports(Reportname);
        ExtentTest extst;
        extst=report.startTest(testcase);

        TimeNow = new Date();
        System.out.println(TimeNow);

        String gekoLocation = "C:\\ARS_Test\\GECKODRIVER\\geckodriver0110win64\\geckodriver.exe";
		System.setProperty("webdriver.firefox.marionette", gekoLocation);     
        WebDriver driver = new FirefoxDriver();
        driver.quit();
        /* 
      //String chromeLocation = "C:\\webdrivers\\Chrome\\chromedriver.exe";
		 	//System.setProperty("webdriver.chrome.driver", chromeLocation);
       //WebDriver driver = new ChromeDriver();
        
        
        //String IELocation = "C:\\webdrivers\\IE\\64\\IEDriverServer.exe";
 		  //System.setProperty("webdriver.ie.driver", IELocation);
        //WebDriver driver = new InternetExplorerDriver();
        
        
        //driver.get(url);
        driver.navigate().to(url);
        //WebDriver driver;
        driver.manage().window().maximize();
        System.out.println("Page is Maximized");
        url=driver.getCurrentUrl();
        	   
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
        	               	   

		
//driver=newLogin();
waiting.pleaseWait(9);
System.out.println(url);

driver.quit();
*/
//===============================================================================================================

      //------------------------------------------MenuSearch--------------------------------------
      //newLogin();
      //driver.get(url);
      //WebDriver driver=newLogin();
      //driver = driver2;

      ///*
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
      



     // /*
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
      



     // /*
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
      


      ///*
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
      

     // /*
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
      



     // /*
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
      



      ///*
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
      


     // /*
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
      





      ///*
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
      



     // /*
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
      


      ///*

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
      

        
        

//===============================================================================================================


	}
	
	
	
	
	
	
//===================================================================================================================
	public static WebDriver newLogin(){

	    Date myTime = new Date();
	    System.out.println(myTime);
	    //String gekoLocation = "C:\\ARS_Test\\GECKODRIVER\\geckodriver0110win64\\geckodriver.exe";
		//System.setProperty("webdriver.firefox.marionette", gekoLocation);

	    WebDriver driver = new FirefoxDriver();
	    //driver.get(url);
	    driver.navigate().to(url);
	    driver.manage().window().maximize();
		
		Actions1 ac=new Actions1(driver);
		String step="Check if the text box for password is displayed";
		String xpth = ".//*[@id='txtPassword']";
		
		if(ac.displayed(driver, xpth, step)){ 
			ars_logIn2 loginPage = new ars_logIn2(driver);
		  loginPage.logIn(repository, username, password);
		  	 }
		else{System.out.println("The page could not be displayed properly");}

		step="Check if the page loaded completely";
		xpth = ".//*[.='Legal Notices']";
		if(ac.displayed(driver, xpth, step)){ 
			System.out.println("The page loaded properly");
		  	 }
		else{System.out.println("The page could not be loaded properly");
		}
	   
		return driver;
		
	}
//===============================================================================================================
}
