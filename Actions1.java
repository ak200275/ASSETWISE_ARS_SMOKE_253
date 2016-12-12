
package arsFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import arsFramework.SeeElement;
import arsFramework.waiting;



/*
public class Actions1 {

	public  String xpth,inp;
	public WebDriver driver;
	public WebElement el;
	
	
	
	
public Actions1(WebDriver driver){
		this.driver=driver;
		System.out.println("Inside the constructor");
	}
	
	
public  boolean enabled(WebDriver driver, String xpth, String step){
		
	this.driver = driver;
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
	
public boolean displayed(WebDriver driver, String xpth, String step){
	//public boolean displayed(String xpth, String step){
	this.driver = driver;
	this.xpth="\"xpth\"";
	//try{
	
	try{			
	//el = driver.findElement(By.xpath(xpth));
	el= SeeElement.checkElement2(driver, xpth);
	}

	catch(NoSuchElementException ne){
		System.out.println("ERROR: *********************************************************************WebElement " +step+ ": FAILED");
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		return false;
					}
	catch(Exception e){
		System.out.println("********General Exception: "+ step);
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		return false;}
	
	
	
		
		if(SeeElement.checkElement1(el)){
			//el.isDisplayed();
			return true;
		}
		else{
			System.out.println("Element is not displayed");
			return false;
		}
	}

public String getText(String xpth, String step){
	this.xpth="\"xpth\"";
	String text="";
	try{
		el = driver.findElement(By.xpath(xpth));
		if(SeeElement.checkElement1(el)){text = el.getText();}
		else{text = "";}
		
		
		
	}
	catch(NoSuchElementException ne){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed");
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		text = "";						
		}
	
	
	catch(Exception e){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed"+":  General Exception");
		System.out.println("***Wait for few sec please"+e.getMessage());
		waiting.pleaseWait(1);
		text = "";
		}
	
	return text;
}

public boolean input(WebDriver driver, String xpth, String inp, String step){
	this.driver = driver;
	this.xpth="\"xpth\"";
	this.inp=inp;

		try{
			el= SeeElement.checkElement2(driver, xpth);

		if(SeeElement.checkElement1(el)){
			el.clear();
			//el.sendKeys(inp+"-"+datetime);
			el.sendKeys(inp);
        	//System.out.println("Input is given");
        	//break;
        }
			else{System.out.println("The web element is not present yet..else");}
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
	
	
return true;
		
}

public  boolean click( WebDriver driver, String xpth, String step){
	
	
	this.xpth="\"xpth\"";
	this.driver = driver;
	
	//WebElement el1 = SeeElement.checkElement2(driver, xpth);
	//for(int i=0;i<10;i++){
		try{			
		//el = driver.findElement(By.xpath(xpth));
		el= SeeElement.checkElement2(driver, xpth);
		}

		catch(NoSuchElementException ne){
			System.out.println("ERROR: *********************************************************************WebElement " +step+ ": FAILED");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;
						}
		catch(Exception e){
			System.out.println("********General Exception: "+ step);
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;}
		
		if(SeeElement.checkElement1(el)){
			el.click();
        	//System.out.println(step + " done! ");
			
        	//break;
			return true;
        }
		else{return false;}
		
			
			//return false;
		
		
		
		//}
	
		
	
	
	
}



	
	
//end of class	
}
*/




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
			
	//}
	
/*	
public  boolean click(String xpth, String step){
		
		
		this.xpth="\"xpth\"";
		
		//for(int i=0;i<10;i++){
			try{			
			el = driver.findElement(By.xpath(xpth));
			if(SeeElement.checkElement1(el)){
				el.click();
	        	//System.out.println(step + " done! ");
				
	        	//break;
	        }
				else{System.out.println("The web element is not present yet..else");}
			}
			
			catch(NoSuchElementException ne){
				System.out.println("ERROR: *********************************************************************WebElement " +step+ ": FAILED");
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;
							}
			catch(Exception e){
				System.out.println("********General Exception: "+ step);
				System.out.println("***Wait for few sec please");
				waiting.pleaseWait(1);
				return false;}
			//}
		
			return true;
		
		
		
	}
		
public boolean input(String xpth, String inp, String step){
	
	this.xpth="\"xpth\"";
	this.inp=inp;
	//Date date = new Date();
	//String datetime= new SimpleDateFormat("ddMMMyy_hhmm").format(date); 
	//System.out.println(inp);
	//System.out.println(xpth);
	
	//for(int i=0;i<10;i++){
		try{
			//System.out.println("Finding username box");
		el = driver.findElement(By.xpath(xpth));
		//System.out.println("web element defined");
		if(SeeElement.checkElement1(el)){
			el.clear();
			//el.sendKeys(inp+"-"+datetime);
			el.sendKeys(inp);
        	//System.out.println("Input is given");
        	//break;
        }
			else{System.out.println("The web element is not present yet..else");}
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
		//}
	
return true;
		
}

public boolean displayed(String xpth, String step){
	this.xpth="\"xpth\"";
	//try{
		el = driver.findElement(By.xpath(xpth));
		if(SeeElement.checkElement1(el)){
			//el.isDisplayed();
			return true;
		}
		else{
			System.out.println("Element is not displayed");
			return false;
		}
	//}
	// /*
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
		
	// *  /
	
	//return true;

}

public String getText(String xpth, String step){
	this.xpth="\"xpth\"";
	String text="";
	try{
		el = driver.findElement(By.xpath(xpth));
		if(SeeElement.checkElement1(el)){text = el.getText();}
		else{text = "";}
		
		
		
	}
	catch(NoSuchElementException ne){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed");
		System.out.println("***Wait for few sec please");
		waiting.pleaseWait(1);
		text = "";						
		}
	
	
	catch(Exception e){
		System.out.println("ERROR: ********************************************************************" +step+ "  Failed"+":  General Exception");
		System.out.println("***Wait for few sec please"+e.getMessage());
		waiting.pleaseWait(1);
		text = "";
		}
	
	return text;
}

public  boolean click1(String xpth, String step){
	
	
	this.xpth="\"xpth\"";
	
	//for(int i=0;i<10;i++){
		try{			
		el = driver.findElement(By.xpath(xpth));
		}

		catch(NoSuchElementException ne){
			System.out.println("ERROR: *********************************************************************WebElement " +step+ ": FAILED");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;
						}
		catch(Exception e){
			System.out.println("********General Exception: "+ step);
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;}
		
		if(SeeElement.checkElement1(el)){
			el.click();
        	//System.out.println(step + " done! ");
			
        	//break;
			return true;
        }
		else{return false;}
		
			
			//return false;
		
		
		
		//}
	
		
	
	
	
}

*/




/*
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
*/
	
public  boolean click( WebDriver driver, String xpth, String step){
	
	
	this.xpth="\"xpth\"";
	this.driver = driver;
	
		try{			
		el= SeeElement.checkElement2(driver, xpth);
		}

		catch(NoSuchElementException ne){
			System.out.println("ERROR: *********************************************************************WebElement " +step+ ": FAILED");
			System.out.println("***Wait for few sec please");
			waiting.pleaseWait(1);
			return false;
						}
		
		catch(Exception e){
			System.out.println("********General Exception: "+ step);
			System.out.println("***Wait for few sec please");
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
			System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not present");
			waiting.pleaseWait(1);
			return false;	}
		
		catch(Exception e){
			System.out.println("ERROR: *********************************************************************WebElement " +el+ "  is not present");
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
		System.out.println(s);
	if(s.equals(option)){
		
		try{
			System.out.println("Inside IF block before element definition");
		System.out.println(s);
		WebElement e = options.get(i);
		System.out.println("After element definition");						
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
	ee.sendKeys(Keys.ARROW_DOWN);
	waiting.pleaseWait(1);
	} }
}


public boolean selectItem1(WebDriver driver, String option){
	this.option = option;
	this.driver=driver;
	System.out.println(option);
	List<WebElement> options = driver.findElements(By.xpath(".//div[@class='k-animation-container']// ul[@class='k-list k-reset']/li"));
	
	for(int i=0;i<options.size();i++){
		String s = options.get(i).getText();
		System.out.println(s);
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
		
		
	}else{String ss = options.get(i).getText();
	System.out.println(ss);
	WebElement ee = options.get(i);
	ee.sendKeys(Keys.ARROW_DOWN);
	waiting.pleaseWait(1);
	} }
	return false;
}




	
}


