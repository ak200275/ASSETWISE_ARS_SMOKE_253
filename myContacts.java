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
public class myContacts {

WebDriver driver;
public String step="";
public String xpth="";
public String inp="";



	public myContacts(WebDriver driver){
		this.driver = driver;
	}
	
	
	
	public void createNewConatct(){
		
		System.out.println("=============================Creating New Contact==============================");
		
		Date date = new Date();
		String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
		String fname= "F"+datetime;
		String lname= "L"+datetime;
		String usermail = System.getProperty("user.name"); 
		usermail = usermail+"@bentley.com";
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(usermail);
		String nameToVerify = lname+","+fname;
		System.out.println("Name to be verified is : "+nameToVerify);
		System.out.println(driver.getCurrentUrl());
		//click on New contact link
		//<a class="ng-binding ng-scope" target="" href="#/documents/newcontact" data-ng-if="$index < 4">New contact</a>
		
		
		
		
		//Click on New Contact Link
		step="Click on Contact link";
		xpth=".//a[@class='ng-binding ng-scope' and .='New contact']";
		Actions1 ac=new Actions1(driver);
		if(ac.click(driver, xpth, step)){System.out.println(step+" Passed");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		waiting.pleaseWait(7);
		
		//Attribute form is displayed
		step="Attribute form";
		xpth=".//label[.='Template']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		
		//Click on drop down arrow
		step="Click on drop down arrow";
		xpth=".//span[@class='k-icon k-i-arrow-s' and .='select']";
		if(ac.click(driver, xpth, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		waiting.pleaseWait(1);
		
		//select option Internal Person
		step="select option Internal Person";
		xpth=".//li[@class='k-item ng-scope' and .='Internal Person']";
		if(ac.click(driver, xpth, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		waiting.pleaseWait(7);
		
		//firstname: .//input[name='FirstName']
		step="provide first name";
		inp=fname;
		xpth=".//input[@name='FirstName']";
		if(ac.input(driver, xpth, inp, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		waiting.pleaseWait(1);
		
		//surname: .//input[name='Surname']
		step="surname";
		inp=lname;
		xpth=".//input[@name='Surname']";
		if(ac.input(driver, xpth, inp, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		waiting.pleaseWait(1);
		
		//mail id
		step="mail id";
		inp=usermail;
		xpth=".//input[@name='Body']";
		if(ac.input(driver, xpth, inp, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		
		
				
		
		//Save button
		step="Save button";
		xpth=".//button[@data-ng-click='vm.saveChanges()']";
		if(ac.enabled(driver, xpth, step)){
			ac.click(driver, xpth, step);
			System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		waiting.pleaseWait(7);
		
		
		//validate
		step="validate Page";
		xpth=".//*[@class='k-link' and .='Attributes']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		
		
	}
	
	
	
	public void checkContactTabs(){
		
		Actions1 ac=new Actions1(driver);
	
		//check Attributes
		step="check Attributes";
		xpth=".//*[@class='k-link' and .='Attributes']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+" Passed");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		
		//Check Skills
		step="Check Skills";
		xpth=".//*[@class='k-link' and .='Skills']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+" Passed");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
	
		//Check Permission Roles
		step="Check Permission Roles";
		xpth=".//*[@class='k-link' and .='Permission Roles']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+" Passed");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
				
		//Check Permissions
		step="Check Permissions";
		xpth=".//*[@class='k-link' and .='Permissions']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+" Passed");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		
		
	}
	
	
public boolean createNewConatct1(){
		
		System.out.println("=============================Creating New Contact==============================");
		
		Date date = new Date();
		String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date);
		String fname= "F"+datetime;
		String lname= "L"+datetime;
		String usermail = System.getProperty("user.name"); 
		usermail = usermail+"@bentley.com";
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(usermail);
		String nameToVerify = lname+","+fname;
		System.out.println("Name to be verified is : "+nameToVerify);
		System.out.println(driver.getCurrentUrl());
		//click on New contact link
		//<a class="ng-binding ng-scope" target="" href="#/documents/newcontact" data-ng-if="$index < 4">New contact</a>
		
		
		
		
		//Click on New Contact Link
		step="Click on Contact link";
		xpth=".//a[@class='ng-binding ng-scope' and .='New contact']";
		Actions1 ac=new Actions1(driver);
		if(ac.click(driver, xpth, step)){System.out.println(step+" Passed");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		waiting.pleaseWait(7);
		
		//Attribute form is displayed
		step="Attribute form";
		xpth=".//label[.='Template']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");}
		
		//Click on drop down arrow
		step="Click on drop down arrow";
		xpth=".//span[@class='k-icon k-i-arrow-s' and .='select']";
		if(ac.click(driver, xpth, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		waiting.pleaseWait(1);
		
		//select option Internal Person
		step="select option Internal Person";
		xpth=".//li[@class='k-item ng-scope' and .='Internal Person']";
		if(ac.click(driver, xpth, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		waiting.pleaseWait(7);
		
		//firstname: .//input[name='FirstName']
		step="provide first name";
		inp=fname;
		xpth=".//input[@name='FirstName']";
		if(ac.input(driver, xpth, inp, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		waiting.pleaseWait(1);
		
		//surname: .//input[name='Surname']
		step="surname";
		inp=lname;
		xpth=".//input[@name='Surname']";
		if(ac.input(driver, xpth, inp, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		waiting.pleaseWait(1);
		
		//mail id
		step="mail id";
		inp=usermail;
		xpth=".//input[@name='Body']";
		if(ac.input(driver, xpth, inp, step)){System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		
		
				
		
		//Save button
		step="Save button";
		xpth=".//button[@data-ng-click='vm.saveChanges()']";
		if(ac.enabled(driver, xpth, step)){
			ac.click(driver, xpth, step);
			System.out.println(step+"  PASSED");}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		waiting.pleaseWait(7);
		
		
		//validate
		step="validate Page";
		xpth=".//*[@class='k-link' and .='Attributes']";
		if(ac.displayed(driver, xpth, step)){System.out.println(step+"  PASSED");
		return true;}
		else{System.out.println("ERROR : "+step+"****************************************************************FAILED");
		return false;}
		
		
	}
	
	
	
	
}
