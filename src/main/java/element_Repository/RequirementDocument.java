package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequirementDocument extends BasePage
{
	public RequirementDocument(WebDriver driver){
		super(driver);
	}
	

	@FindBy(xpath = "//input[@id='RequirementDocument']")
	private WebElement requirementDocument;


	public WebElement getRequirementDocument() {
		return requirementDocument;
	}
	
	
	public void performRequirementDocument()
	{
		getRequirementDocument().click();
	}
}
