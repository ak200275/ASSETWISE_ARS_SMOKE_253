/**
 * 
 */
package arsFramework;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ARS_Pages.home_page_links;
import ARS_Pages.myTasks;

/**
 * @author Anuj.Singh
 *
 */
public class start {

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

        //String gekoLocation = "C:\\ARS_Test\\GECKODRIVER\\geckodriver0110win64\\geckodriver.exe";
		 	//System.setProperty("webdriver.firefox.marionette", gekoLocation);     
        WebDriver driver = new FirefoxDriver();
        
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
//driver.quit();
		
//driver=newLogin();
waiting.pleaseWait(7);
System.out.println(url);
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
//driver=newLogin();
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
//driver.quit();






////////////////////////////////////////
////////////////////////////////////////////
///////////////////////////////////////////













driver.get(url);
//driver=newLogin();
waiting.pleaseWait(12);
//myTasks Organization1 = new myTasks(driver);
Thread.sleep(3000);
testcase="Create Contract from Organization and check the tabs";
TestcaseTemplate.testCaseTemplate(testcase);
ExtentTest createFromOrgtest;
createFromOrgtest=report.startTest(testcase);
TimeNow = new Date();
System.out.println(TimeNow);
if(Organization.createFromOrg1()){createFromOrgtest.log(LogStatus.PASS, testcase);
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

		
		

	}

}
