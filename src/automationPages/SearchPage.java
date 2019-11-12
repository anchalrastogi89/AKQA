package automationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	
    @FindBy(xpath ="//span[@class = 'responsive-search-title__count']")
    private WebElement searchCount;
    
    @FindBy(xpath ="//article[@class = 'codified-product-tile hproduct ']")
    private WebElement productDetail;
    
    @FindBy(xpath ="//article[@class = 'codified-product-tile hproduct']")
    private WebElement productID;
  
    
    
    public SearchPage(WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }
    
    public boolean validateSearchPage()
    {
    	if (Integer.parseInt(searchCount.getText()) > 0)
    		return true;
    	else
    		return false;
    }
    
    public ProductDetailPage clickProduct()
    {
    	productDetail.click();
    	ProductDetailPage productDetailPage = new ProductDetailPage(driver);
    	return productDetailPage;
    }
    
    public String getProductId()
    {
    	return productDetail.getAttribute("data-product-id");
    	
    }
}
