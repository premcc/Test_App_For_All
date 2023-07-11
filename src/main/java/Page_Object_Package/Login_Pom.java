package Page_Object_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base_Class;

public class Login_Pom extends Base_Class{
	

	
	public Login_Pom()
	{
		PageFactory.initElements(Base_Class.driver, this);
	}
	
	
	@FindBy (xpath = "//button[text()='✕']")
	
	private WebElement crossButton;
	
	
	
	
	@FindBy(name = "q")
	 
	private WebElement searchBar;
@FindBy (xpath = "//a[text()='Login']")
	
	private WebElement loginbutton;



@FindBy (xpath = "//span[text()='Become a Seller']")

private WebElement becomeBestSeller;

@FindBy (className = "exehdJ")
 private WebElement more;



@FindBy (xpath = "//span[text()='Cart']")

private WebElement cart;



public WebElement getCrossButton() {
	return crossButton;
}



public WebElement getSearchBar() {
	return searchBar;
}



public WebElement getLoginbutton() {
	return loginbutton;
}



public WebElement getBecomeBestSeller() {
	return becomeBestSeller;
}



public WebElement getMore() {
	return more;
}



public WebElement getCart() {
	return cart;
}

	
	

}
