package teste.elementsmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisualizarProdutoElementsMap {
	@FindBy(xpath = "//button[@id='buy-button-now']")
	protected WebElement btnComprar;
	
	@FindBy(xpath = "//div[@id='preview']")
	protected WebElement previewProduto;
	
	@FindBy(xpath = "(//a[@qa-automation='product-size']/following::a[@data-label='40'])[1]")
	protected WebElement opTamanho;
	
	
	
}
