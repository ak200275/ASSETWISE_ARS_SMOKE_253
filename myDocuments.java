/**
 * 
 */
package ARS_Pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import arsFramework.Actions1;
import arsFramework.waiting;

/**
 * @author Anuj.Singh
 *
 */
public class myDocuments {
	
	WebDriver driver;
	public String step="";
	public String xpth="";
	public String inp="";
	
	
	
	public myDocuments(WebDriver driver){
		this.driver=driver;
	}
	

	

public void checkdocumentTabs(){
	
	System.out.println("============Document is Created");
	
		waiting.pleaseWait(3);
		System.out.println("============Checking the tabs");
        Actions1 ac=new Actions1(driver);
        

        step="Document Tab";
        xpth=".//*[@class='k-link' and .='Documents']";
        if(ac.displayed(driver, xpth, step)){System.out.println(step+"PASSED");}
        else{System.out.println("ERROR : "+step+"**************************************************************FAILED");}
        System.out.println("--------------------------Checking tabs Completed--------------------------------------");
       
        
        //driver.close();
}


public boolean createDocument1(){
	
	System.out.println("TESTCASE 2: CREATE A NEW DOCUMENT");
	String currentdriver = driver.getCurrentUrl();
	System.out.println(currentdriver);
	Date date = new Date();
	String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
	String document_title= "Document_"+datetime;
	System.out.println(document_title);
	
	Actions1 ac=new Actions1(driver);
	

	//click option for new document on home page
		step="click option for new document on home page";
		xpth=".//a[@class='ng-binding ng-scope' and .='New document']";
		if(ac.enabled(driver, xpth, step)){
			ac.click(driver, xpth, step);
			System.out.println("clicked option for new document on home page");
			}
		else{System.out.println("ERROR: "+step+"clicked option for new document on home page");
		return false;}
    waiting.pleaseWait(11);
	
	//hit drop down box for selecting document type
    step="hit drop down box for selecting document type";
    xpth=".//*[@name='template0']/div/span/span/span[2]/span";
    if(ac.click(driver, xpth, step)){System.out.println("clicked drop down box for selecting document type");}
    else{System.out.println("could not hit drop down box for selecting document type");
    return false;}
    waiting.pleaseWait(3);

/*    
    try{
    //select option Design Document
    step="select option Design Document";
    xpth=".//li[@class='k-item ng-scope' and .='Design Documents']";
    if(ac.displayed(driver, xpth, step)){
    	ac.click(driver, xpth, step);
    }
    else{
    	xpth="(.//li[@data-offset-index='0'])[2]";
    	ac.click(driver, xpth, step);
    	System.out.println("document type  Design Documents was not present");
    }
    }
    catch(Exception e){
    	xpth="(.//li[@data-offset-index='0'])[2]";
    	ac.click(driver, xpth, step);
    }
*/
    
    
    step="select option Design Document";
    String option="Design Documents";
    if(ac.selectItem1(driver, option)){System.out.println("document type  Design Documents was present");}
    else{xpth="(.//li[@data-offset-index='0'])[2]";
	ac.click(driver, xpth, step);
	System.out.println("document type  Design Documents was not present");}
    
    
    
    
    
    
    
    
	waiting.pleaseWait(5);
	
	
	// providing the title to the document
	step="providing the title to the document";
	inp=document_title;
	xpth=".//input[@name='Name']";
	if(ac.input(driver, xpth, inp, step)){System.out.println("Name of the document is provided");}
	else{System.out.println("ERROR : "+step+"**************************************FAILED");
	return false;}
	//driver.findElement(By.xpath(".//input[@name='Name']")).sendKeys(document_title);
	
	waiting.pleaseWait(3);
	
	
	//clicking the dropdown box for approval status
	//    .//div[@dir-form-element-validation='frmApprovalStatus']/span/span/span[2]/span
	step="clicking the dropdown box for approval status";
	xpth=".//div[@dir-form-element-validation='frmApprovalStatus']/span/span/span[2]/span";
	if(ac.click(driver, xpth, step)){System.out.println(step+"PASSED");}
	else{System.out.println("ERROR : "+step+"**************************************FAILED");
	return false;}
	waiting.pleaseWait(3);
	
	
	// Selecting the approval status as N
	step="Selecting the approval status as N";
	xpth=".//li[@class='k-item ng-scope k-state-selected k-state-focused' and .='N']";
	if(ac.click(driver, xpth, step)){System.out.println(step+"PASSED");}
	else{System.out.println("ERROR : "+step+"**************************************FAILED");
	return false;}
	waiting.pleaseWait(3);
	
	//hit save button
	step="hit save button";
	xpth=".//*[@id='footer']/button[@data-ng-click='vm.saveChanges()']";
	if(ac.enabled(driver, xpth, step)){
		ac.click(driver, xpth, step);
		System.out.println(step+"PASSED");
		return true;}
	else{System.out.println("ERROR : "+step+"**************************************FAILED");
	return false;}
	//waiting.pleaseWait(3);

	
	
	
}

	
	
	
	
	
	
	

}
