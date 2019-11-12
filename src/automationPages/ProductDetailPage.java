package automationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationFramework.AKQAUtil;

public class ProductDetailPage {	

WebDriver driver;

	@FindBy(xpath ="//div[@class='product-detail__ratings']/span")
	private WebElement productID;
	
    @FindBy(xpath ="//button[@class = 'bui-btn product-fulfillment__main-btn bui-btn--secondary bui-btn--mini bui-btn--block']")
    private WebElement saveToWishlist;
    
    @FindBy(xpath ="//div[@class='bui-tooltip__content']")
    private WebElement saveDialog;
    
    @FindBy(xpath ="//div[@class = 'bui-tooltip__content']//a")
    private WebElement wishListLink;
    
    @FindBy(xpath ="//div[@class = 'bui-tooltip__content']")
    private WebElement wishListDialog;
  
    public ProductDetailPage(WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    public boolean validateProductDetailPage(String SkuId)
    {
    	if (saveToWishlist.isDisplayed() && productID.getText().contains(SkuId))
    		return true;
    	else
    		return false;
    }
    
    public void clickSaveToWishList() throws InterruptedException
    {
    	saveToWishlist.click();
    	AKQAUtil.dynamicWait(driver, saveDialog);
    }
    
    public boolean validateSaveDailog()
    {
    	return wishListDialog.isDisplayed(); 		
    	
    }
    
    public WishListPage navigateToWishlistPage()
    {
    	wishListLink.click();
    	WishListPage wishListPage = new WishListPage(driver);
    	return wishListPage;
    }
    
}
