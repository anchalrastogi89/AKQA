package automationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationFramework.AKQAUtil;

public class WishListPage {

WebDriver driver;
	
    @FindBy(xpath ="//a[@class = 'btn-primary margin-btm-double pull-right']")
    private WebElement printWishList;
    
    @FindBy(xpath ="//*[@class = 'fineline']")
    private WebElement productID;
    
   
    public WishListPage(WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }
    
    public boolean validateWishListlPage()
    {
    	if (AKQAUtil.dynamicWait(driver, printWishList).isDisplayed())
    		return true;
    	else
    		return false;
    }
    
    public boolean validateWishListItem(String SkuId)
    {
    	if(productID.getText().contains(SkuId))
    		return true;
    	else
    		return false;
    }
}