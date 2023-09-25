package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	//1 launchBrowser
	public static WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
		driver.manage().window().maximize();
		return driver;
	}
	//2 getUrl
	public static  WebDriver getUrl2(String url) {
		 driver.get(url);
		return driver;
		  }
   //3 close
	public static void closeBrowser3() {
		driver.close();
		}
  //4 quit
   public static void quitBrowser4() {
	 driver.quit();
	 }
 //5 forward
    public static void forwordPage5() {
		 driver.navigate().forward();
		 }
 //6 sendKeys
    public static void sendkeys6(WebElement element,String sendkeys) {
		 element.sendKeys(sendkeys);
         }
 //7 click
    public static void click7(WebElement element) {
		 element.click();
	}
  //8 navigateTo
  	public static WebDriver navigateTo8(String url) {
  		 driver.navigate().to(url);
  		return driver;
  		 }
  //9 back
    public static void backPage9() {
		 driver.navigate().back();
		 }
  //10 refresh
    public static void refreshPage10() {
		 driver.navigate().refresh();
    }
  //11 radioButton
    public static void radiobutton11(WebElement element) {
		 element.click();
		 }
  //12 getText
    public static void getText12(WebElement element) {
		 System.out.println(element.getText());
         }
  //13 display
    public static void isDisplay13(WebElement element) {
		 boolean displayed = element.isDisplayed();
		 System.out.println(displayed);
         }
   //14 enable
    public static void isEnable14(WebElement element) {
		 boolean enabled = element.isEnabled();
		 System.out.println(enabled);
		 }
  //15 selected
    public static void isselected15(WebElement element) {
		 boolean selected = element.isSelected();
		 System.out.println(selected);
         }
  //16 getCurrentUrl
	public static void getCurrentUrl16() {
		  System.out.println(driver.getCurrentUrl());
		 
		 }
	public static Actions actionObject() {
		Actions Ac = new Actions(driver);
		return Ac;
		
	}
	
	//17 contextClick
    public static void contextClick17(WebElement element) {
		actionObject().contextClick(element).perform();
         }
  //18 doubleClick
    public static void doubleClick18(WebElement element) {
		  actionObject().doubleClick(element);
         }
  //19 moveToTheElement
    public static void moveToTheElement19(WebElement element) {
		 actionObject().moveToElement(element).perform(); 
         }
  //20 dragAndDrop
    public static void  dragAndDrop20(WebElement source,WebElement target) {
		  actionObject().dragAndDrop(source, target).perform();
         }
  //21 robot
    public static void robot21(int keycode) throws AWTException {
		  Robot R = new Robot();
		  R.keyPress(keycode);
		  R.keyRelease(keycode);
		  }
  //22 getTitle
    public static WebDriver getTitle22() {
		 String title = driver.getTitle();
		 System.out.println(title);
		return driver;
         }
  //23 isMultiples
    public static WebDriver isMultiples23(WebElement element) {
    	Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		return driver;
		 }
    //24 getOptions
    public static WebDriver getOptions24(WebElement element) {
    	Select s = new Select(element);
    	List<WebElement> options = s.getOptions();
    	for (WebElement webElement : options) {
			System.out.println(webElement);
		}
		return driver;
		 }
  //25 getAllSelected
    public static WebDriver getAllSelected25(WebElement element) {
    	Select s = new Select(element);
    	 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
    	 for (WebElement webElement : allSelectedOptions) {
    		 System.out.println(webElement);
			}
		return driver;
		 } 
  //26 getFirstSelected
    public static WebDriver getFirstSelected26 (WebElement element) {
    	Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		return driver;
		 }  
  public static Select dropDownObject(WebElement element) {
	  Select s = new Select(element);
	return s;
	  }
  //27selectByValue
  public static void selectByValue27(WebElement element, String value) {
	  dropDownObject(element).selectByValue(value);
	  }
  //28selectByindex
  public static void selectByIndex28(WebElement element, int num) {
	  dropDownObject(element).selectByIndex(num);
	 }
  //29selectByVisibletext
  public static void selectByVisibletext29(WebElement element, String text) {
	  dropDownObject(element).selectByVisibleText(text);
  }
  //30deselectByValue
  public static void deselectByValue30(WebElement element, String value) {
	  dropDownObject(element).deselectByValue(value);
  }
  //31deselectByIndex
  public static void deselectByIndex31(WebElement element, int num) {
	  dropDownObject(element).deselectByIndex(num);
  }
  //32deselectByVisibletext
  public static void deselectByVisibletext32(WebElement element, String text) {
	  dropDownObject(element).deselectByVisibleText(text);
  }
  //33deselectAll
  public static void deselectAll33(WebElement element) {
	  dropDownObject(element).deselectAll();
	  }
  //34getWindow handles
  public static void windowHandles34() {
	  Set<String>Handles = driver.getWindowHandles();
	  System.out.println(Handles);
	  for (String name : Handles) {
		String title = driver.switchTo().window(name).getTitle();
		System.out.println(title);
	}
		
	}
  //35getWindowHandle
  public static void windowHandle35() {
	  String Handle = driver.getWindowHandle();
	  System.out.println(Handle);
  }
  //36screenshot
  public static void screenShot36(String str) throws IOException {
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File as = ts.getScreenshotAs(OutputType.FILE);
	 File des = new File(str);
	 FileUtils.copyFile(as, des);
	 }
  //37scrollDownandUp
  public static void scroll37(String sdu,Object element) {
	  JavascriptExecutor j = (JavascriptExecutor)driver;
	  j.executeScript(sdu, element);
  }
  //38explicitWait
  public static void explicitWait38(WebElement element) {
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOf(element));
	  }
  //39implicitwait
  public static void implicitWait39(int time,TimeUnit unit) {
	  driver.manage().timeouts().implicitlyWait(time,unit);
  }
   //40frameElement
  public static void frameElement40(WebElement element) {
	  driver.switchTo().frame(element);
  }
  //41frameid
  public static void frameId41(int index) {
	  driver.switchTo().frame(index);
  }
  //42frameString
  public static void frameString42(String value) {
	  driver.switchTo().frame(value);
  }
  //43clear
  public void clear43(WebElement element) {
	 element.clear(); 
	 }
  //44accept
  public static void accept44() {  
	  Alert a = driver.switchTo().alert();
	  a.accept();
	  }
  //45dismiss
  public static void dismiss45() {
	  Alert a = driver.switchTo().alert();
	  a.dismiss();
	  }
  //46Alertinput
  public static void alertInput46(WebElement element,String input) {
	  Alert a = driver.switchTo().alert();
	  a.sendKeys(input);
	  }
  //47getAlerttext
  public static void alertgettext47() {
	  Alert a = driver.switchTo().alert();
	  System.out.println(a.getText());
	  }
  //48Actionclick
  public static  void actionclick48(WebElement elemennt) {
	 actionObject().click(elemennt).perform();
	 }
  //49webtableAlldata
  public static void webtableAlldata49(List<WebElement>element) {
	  List<WebElement>datas=element;
	  for(WebElement allData : datas) {
		  System.out.println(allData.getText());
	  }
}
  //50webtableRowdata
  public static void webtableRowdata50(List<WebElement>element) {
	  List<WebElement>rowdata = element;
	  for (WebElement rdata : rowdata) {
		  System.out.println(rdata.getText());
		}
	}
//51webtablecolumndata
  public static void webtablecolumndata51(List<WebElement>element) {
	  List<WebElement>columndata = element;
	  for (WebElement cdata : columndata) {
		  System.out.println(cdata.getText());
		}
	}
//52webtableSingledata
  public static void webtableSingledata52(WebElement element) {
	 System.out.println(element.getText());
	 }
  //53frameExit
  public static void frameExit53() {
	 driver.switchTo().defaultContent();
}
  //54outerFrame
  public static void outerframe54() {
	 driver.switchTo().parentFrame();
	 }
}
  


  
     
        
		
		
	
    	

        
    	

     




