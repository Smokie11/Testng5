package org.pojo;

import javax.xml.xpath.XPath;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBys({
		
		@FindBy(xpath="//button[@class='swal-button swal-button--confirm']"),
		@FindBy(xpath="//button[text()='OK']")
		
	})
	
	private WebElement alertBtn;
	
	
	@FindAll({

			@FindBy(xpath = "(//input[@type='text'])[1]"),
			@FindBy(xpath = "(//input[@aria-label='Text input with dropdown button'])[1]"),
			@FindBy(xpath = "//input[@class='form-control form-control-line col-md-8 m-t-20 ng-valid ng-touched ng-dirty ng-valid-parse ng-empty']")

	})

	private WebElement userid;

	public WebElement getUserid() {
		return userid;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getAlertBtn() {
		return alertBtn;
	}


	public WebElement getEntervalue() {
		return entervalue;
	}


	public WebElement getNovaluebtn() {
		return novaluebtn;
	}


	public WebElement getUserError() {
		return userError;
	}


	public WebElement getInvalidUser() {
		return invalidUser;
	}
	
	

	
	
	
	
	

	@FindAll({

			@FindBy(xpath = "//input[@ng-model='Password']"),
			@FindBy(xpath = "//input[@class='form-control form-control-line col-md-8 ng-pristine ng-valid ng-empty ng-touched']"),
			@FindBy(xpath = "(//input[@type='password'])[1]")

	})
	private WebElement password;

	@FindAll({

			@FindBy(xpath = "//a[text()='Log In']"),
			@FindBy(xpath = "(//a[@class='btn btn-md btn-successcal col-lg-3 pull-right ng-binding'])[1]"),
			@FindBy(xpath = "//a[@ng-click='login();']"),
			
			})

	private WebElement loginbtn;

	@FindBys({

			@FindBy(xpath = "//div[@class='swal-title']"),
			@FindBy(xpath = "//div[text()='Please enter Username & password']")
			})

	private WebElement entervalue;

	@FindBys({

		@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']"),
		@FindBy(xpath = "//button[text()='OK']") })

private WebElement novaluebtn;
	
	@FindBys({

		@FindBy(xpath = "//div[@class='swal-title']"),
		@FindBy(xpath = "//div[text()='Please enter Username']") })

private WebElement userError;
	

	public WebElement getEnterPass() {
		return enterPass;
	}

	@FindBys({

			@FindBy(xpath = "//div[@class='swal-title']"), @FindBy(xpath = "//div[text()='Invalid User']") })

	private WebElement invalidUser;

	@FindBys({
		
		@FindBy(xpath="//div[text()='Please enter Password']"),
		@FindBy(xpath="//div[@class='swal-title']")
		
	})
	
	private WebElement enterPass;
	
	@FindBys({
		
		@FindBy(xpath="//button[@class='swal-button swal-button--confirm']"),
		
		@FindBy(xpath="//button[text()='OK']")
	})
	
	
	
	private WebElement profile;
	@FindBys
	({
		@FindBy(xpath = "//td[@id='td-id-1']e']"),
		@FindBy(xpath = "//a[@class='btn btn-success collapsed']"),
		@FindBy(xpath = "//i[@id='btnContinue']")	
	})
	
	

	private WebElement menu;
	@FindBys
	({
		
		@FindBy(xpath = "(//h6[@class='main-btntext ng-binding'])[2]")
	
	})
	
	private WebElement media;
	@FindBys
	({
		
		@FindBy(xpath = "//span[text()='Media Plans']")
	
	})
	
	
	private WebElement add;
	@FindBys
	({
		
		@FindBy(xpath = "//a[@id='txtsearchresultP']")
	
	})
	
	

	private WebElement save;
	@FindBys
	({
		
		@FindBy(xpath = "//button[@id='btnSave']")
	
	})
	
	
	private WebElement confirm;
	@FindBys
	({
		
		@FindBy(xpath = "//button[@class='confirm']")
	
	})
	
	
	private WebElement cancel;
	@FindBys
	({
		
		@FindBy(xpath = "//a[@class='btn btn-danger btn-md ng-binding']")
	
	})
	
	
	

	private WebElement con;
	@FindBys
	({
		
		@FindBy(xpath = "//button[@tabindex='1']")
	
	})
	
	
	
	private WebElement master;
	@FindBys
	({
		
		@FindBy(xpath = "(//h6[@class='main-btntext ng-binding'])[3]"),
		
		
		
	})
	

	private WebElement market;
	@FindBys
	({
		
		@FindBy(xpath = "//span[text()='Markets']"),
		@FindBy(xpath = "(//a[@id='txtsearchresultP'])[1]")
		
		
		
		
	})

	
		
	
	private WebElement passbtn;

	public WebElement getPassbtn() {
		return passbtn;
	}
	
	// path
	@FindBy(xpath="(//input[@type='text'])[2]")	
	//Code
	private WebElement Code;
	//Get Property
	public WebElement getCode() {
		return Code;
	}
	
	//Path for the code control
	

	@FindAll
	({
		
		@FindBy(xpath = "(//input[@id='txtComments1'])[1]"),
		@FindBy(xpath = "//input[@ng-model='MarketData.Headers.ADPK_DESC1']"),
        @FindBy(xpath="//input[@tabindex='2']")	
		
		
	})
	private WebElement Desc1;
	public WebElement getDesc1() {
		return Desc1;
	}
	
	@FindBy(xpath = "(//input[@id='txtComments2'])[1]")
	private WebElement Desc2;
	public WebElement getDesc2() {
		return Desc2;
	}
	
	
	
	@FindAll
	({
		
		@FindBy(xpath = "(//input[@id='txtComments1'])[2]"),
		@FindBy(xpath = "//input[@tabindex='4']"),
        @FindBy(xpath="//input[@ng-model='MarketData.Headers.ADPK_REMS1']")	
		
		
		
	})
	
	private WebElement Remarks1;
	public WebElement getRemarks1() {
		return Remarks1;
	}
	
	
	@FindBy(xpath = "(//input[@id='txtComments2'])[2]")
	private WebElement Remarks2;
	public WebElement getRemarks2() {
		return Remarks2;
	}
	
	
	
@FindBy(xpath  ="//option[text()='Select']")
	private WebElement Status;
	public WebElement getStatus() {
		return Status;
	}
	
	@FindBy(xpath = "//input[@id='txtSortOrder']")
	private WebElement Sortorder;
	public WebElement getSortorder() {
		return Sortorder;
	}
	
	
}
