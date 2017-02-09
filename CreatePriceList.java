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
import ARS_Pages.myItems;
import arsFramework.Actions1;
import arsFramework.ReadMe;
import arsFramework.TestcaseTemplate;
import arsFramework.ars_logIn2;
import arsFramework.waiting;



/**
 * @author Anuj.Singh
 *
 */
public class CreatePriceList {

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
      report.endTest(createPricelisttest);
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
