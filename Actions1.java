
package arsFramework;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import arsFramework.SeeElement;
import arsFramework.waiting;



public class Actions1 {

	public  String xpth,inp;
	public WebDriver driver;
	public WebElement el;
	public String option;
	
	
	public Actions1(WebDriver driver){
		this.driver=driver;
	}
	
	
	
public  boolean enabled(String xpth, String step){
		
		
		this.xpth="\"xpth\"";
		
		//for(int i=0;i<10;i++){
			try{			
			el = driver.findElement(By.xpath(xpth));
			
			if(SeeElement.checkElement(el)){
				if(el.isEnabled()){return true;}
				else{System.out.println("Error: button is not enabled");
				return false;}
	        	//System.out.println("Link for  is Enabled");
	        	//break;
	        }
			else{System.out.println("ERROR: The web element is not Displayed yet..else");
			return false;}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not enabled");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;}
			//}
		
	}
	
	
public  void displayedMethod(String xpth){
		
		
		this.xpth="\"xpth\"";
		
		//for(int i=0;i<10;i++){
			try{			
			el = driver.findElement(By.xpath(xpth));
			if(SeeElement.checkElement(el)){
				el.isDisplayed();
	        	System.out.println("Link for  is Displayed");
	        	//break;
	        }
				else{System.out.println("The web element is not Displayed yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not Displayed");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
										}
			catch(Exception e){
				System.out.println("********General Exception");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);}
			}
	
public  boolean click( WebDriver driver, String xpth, String step){
	
	
	this.xpth="\"xpth\"";
	this.driver = driver;
	
		try{			
		el= SeeElement.checkElement2(driver, xpth);
		}

		catch(NoSuchElementException ne){
			System.out.println("ERROR: ******************************Click***************************************WebElement " +step+ ": FAILED");
			System.out.println("****************Wait for few sec please in No such element");
			waiting.pleaseWait(1);
			return false;
						}
		
		catch(Exception e){
			System.out.println("********General Exception: "+ step);
			System.out.println("***Wait for few sec please in general exception");
			waiting.pleaseWait(1);
			return false;
			}
			el.click();
			return true;

	
}

public String getText(WebDriver driver, String xpth, String step){
	this.xpth="\"xpth\"";
	this.driver=driver;
	String text="";
	try{
		el= SeeElement.checkElement2(driver, xpth);
		
	}
	catch(NoSuchElementException ne){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed");
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		text = "";	
		System.out.println("The Text could not be captured : ");
		return text;
		}
	
	
	catch(Exception e){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed"+":  General Exception");
		System.out.println("***Wait for few sec please"+e.getMessage());
		waiting.pleaseWait(1);
		text = "";
		System.out.println("The Text could not be captured : ");
		return text;
		}
	text = el.getText();
	System.out.println("The Text captured is : "+text);
	return text;
}

public boolean displayed(WebDriver driver, String xpth, String step){
	this.xpth="\"xpth\"";
	this.driver=driver;
	try{
	el= SeeElement.checkElement2(driver, xpth);
			}
	
	catch(NoSuchElementException ne){
		System.out.println("ERROR: *********************************************************************WebElement " +step+ "  is not present");
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		return false;						
		}
	
	
	catch(Exception e){
		System.out.println("********General Exception");
		System.out.println("***Wait for few sec please"+e.getMessage());
		waiting.pleaseWait(1);
		return false;
		}
	
	if(el.isDisplayed()){System.out.println("The Element is displayed");
	return true;}
	else{System.out.println("Error: Element is not Displayed");
	return false;}
	
}

public  boolean enabled(WebDriver driver, String xpth, String step){
	
	
	this.xpth="\"xpth\"";
	this.driver=driver;
	
		try{			
			el= SeeElement.checkElement2(driver, xpth);
		}
		
		catch(NoSuchElementException ne){
			System.out.println("ERROR: ***************************ENABLED******************************************WebElement " +el+ "  is not present");
			waiting.pleaseWait(1);
			return false;	}
		
		catch(Exception e){
			System.out.println("ERROR: ***************************ENABLED******************************************WebElement " +el+ "  is not present");
			System.out.println("***General Exception");
			waiting.pleaseWait(1);
			return false;}
		
		
			if(el.isEnabled()){return true;}
			else{System.out.println("Error: Element is not enabled");
			return false;}
   
}

public boolean input(WebDriver driver, String xpth, String inp, String step){
	this.driver = driver;
	this.xpth="\"xpth\"";
	this.inp=inp;

		try{
			el= SeeElement.checkElement2(driver, xpth);			
		}
        

		
		catch(NoSuchElementException ne){
			System.out.println("ERROR: *********************************************************************WebElement " +step+ "  is not present");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;						
			}
		
		
		catch(Exception e){
			System.out.println("********General Exception");
			System.out.println("***Wait for few sec please"+e.getMessage());
			waiting.pleaseWait(1);
			return false;
			}

		el.clear();
		el.sendKeys(inp);
		return true;
		
}

public void selectItem(WebDriver driver, String option){
	this.option = option;
	this.driver=driver;
	System.out.println(option);
	List<WebElement> options = driver.findElements(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li"));
	
	for(int i=0;i<options.size();i++){
		String s = options.get(i).getText();
		System.out.println("inside for:  "+s);
	if(s.equals(option)){
		
		try{
			System.out.println("Inside IF block before element definition");
		System.out.println(s);
		WebElement e = options.get(i);
		System.out.println("After element definition");						
		//e.click();
		e.isSelected();
		e.click();
		waiting.pleaseWait(3);
		System.out.println("After Clicking the element");
		//waiting.pleaseWait(5);
		
		}
		catch(Exception e){System.out.println(e.getMessage());}
		break;
		
		
	}else{String ss = options.get(i).getText();
	System.out.println(ss);
	WebElement ee = options.get(i);
	//ee.sendKeys(Keys.ARROW_DOWN);
	waiting.pleaseWait(1);
	} }
}

public boolean selectItem1(WebDriver driver, String option){
	this.option = option;
	this.driver=driver;
	System.out.println("Preferred option is : "+option);
	List<WebElement> options = driver.findElements(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li"));
	WebElement e1 = options.get(0);
	e1.sendKeys(Keys.ARROW_DOWN);
	for(int i=0;i<options.size();i++){
		String s = options.get(i).getText();
		System.out.println(i +"  "+": "+s);
		//WebElement e1 = options.get(i);
		//e1.sendKeys(Keys.ARROW_DOWN);
	if(s.equals(option)){
		
		try{
			System.out.println("Inside IF block before element definition");
		System.out.println(s);
		WebElement e = options.get(i);
		System.out.println("After element definition");						
		e.click();
		waiting.pleaseWait(5);
		System.out.println("After Clicking the element");
		//waiting.pleaseWait(5);
		return true;
		}
		
		catch(Exception e){System.out.println(e.getMessage());}
		break;
		}
	
	else{//String ss = options.get(i).getText();
	//System.out.println(ss);
	//WebElement ee = options.get(i);
	//ee.sendKeys(Keys.ARROW_DOWN);
	waiting.pleaseWait(1);
	System.out.println("Select Next");
	//waiting.pleaseWait(1);	
	} 
	
	}
	return false;
}

public boolean message_unsavedChanges(WebDriver driver){
	
	try{
		waiting.pleaseWait(2);
	    xpth= ".//*[@ng-class='customButton.btnClass' and .='No']";
	    driver.findElement(By.xpath(xpth)).click();
	    return true;
	}
	catch(NoSuchElementException ne){
		System.out.println("There may not be the message regarding Unsaved Changes");
		waiting.pleaseWait(1);
		return false;						
		}
	catch(Exception e){ System.out.println("There is no alert for  - Unsaved Changes maessage error");
	return false;}
}

public boolean message_wanttoleavethissite(WebDriver driver){
	
	try{
		waiting.pleaseWait(2);
		Alert alert = driver.switchTo().alert();
		//Alert alert = driver.switchTo().window(arg0)
		alert.accept();
	    return true;
	}
	catch(NoSuchElementException ne){
		System.out.println("There may not be the alert message regarding leaving the site");
		waiting.pleaseWait(1);
		return false;						
		}
	catch(Exception e){ System.out.println("There is no alert for - do you want to leave this site?");
	return false;}
}


public boolean errorCloseFunction(WebDriver driver){
	/*try{
		waiting.pleaseWait(2);
	    xpth= ".//*[@data-ng-click='closeFunction()']";
	    driver.findElement(By.xpath(xpth)).click();
	    return true;
	}
	catch(NoSuchElementException ne){
		System.out.println("There may not be the message regarding Unsaved Changes");
		waiting.pleaseWait(1);
		return false;						
		}
	catch(Exception e){ System.out.println("There is no alert for  - Unsaved Changes maessage error");
	return false;}
	*/
	try{
		waiting.pleaseWait(2);
		Alert alert = driver.switchTo().alert();
		//Alert alert = driver.switchTo().window("Error");
		alert.dismiss();
	    return true;
	}
	catch(NoSuchElementException ne){
		System.out.println("There may not be the alert message regarding leaving the site");
		waiting.pleaseWait(1);
		return false;						
		}
	catch(Exception e){ System.out.println("There is no alert for - do you want to leave this site?");
	return false;}
	
}





public void clearMessages(WebDriver driver){
	
	
	if(errorCloseFunction(driver)){System.out.println(" close");}
	else{System.out.println("close was not present");}
	
	if(message_unsavedChanges(driver)){System.out.println(" 1 message unsaved changes cleared");}
	else{System.out.println("message unsaved changes was not present");}
	
	if(message_wanttoleavethissite(driver)){System.out.println(" 2 message want to leave site cleared");}
	else{System.out.println("message want to leave site was not present");}
	
	if(message_unsavedChanges(driver)){System.out.println(" 3 message unsaved changes cleared");}
	else{System.out.println("message unsaved changes was not present");}
	
	if(message_wanttoleavethissite(driver)){System.out.println(" 4 message want to leave site cleared");}
	else{System.out.println("message want to leave site was not present");}
	
	
	
}


	
}


