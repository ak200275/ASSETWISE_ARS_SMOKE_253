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
public class QuickSearch {

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
        
        //------------------------------------------QuickSearch--------------------------------------
        //------------------------------------------QuickSearch  Activity--------------------------------------



        ///*
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
        ///*
        //------------------------------------------QuickSearch  Assets START--------------------------------------
        driver=newLogin();
        waiting.pleaseWait(12);
        //System.out.println(driver.getCurrentUrl());
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



        ///*
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
        



        ///*
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
        




        ///*
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
        



       // /*
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
        



        ///*
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
        



       // /*
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
        


        ///*
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
        


        ///*
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
        



        ///*
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
