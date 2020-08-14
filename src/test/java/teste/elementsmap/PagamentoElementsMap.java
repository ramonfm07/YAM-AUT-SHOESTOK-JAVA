package teste.elementsmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagamentoElementsMap {

	@FindBy(xpath = "//h1[contains(.,'Meu')]")
	protected WebElement tituloMeuCarrinho;
	
	@FindBy(xpath = "//div[@class='product-item']")
	protected WebElement produtoItem;
	
	@FindBy(xpath = "//a[@qa-auto='cart-keep-buying']")
	protected WebElement btnEscolherMaisPdt;
	
	
}
