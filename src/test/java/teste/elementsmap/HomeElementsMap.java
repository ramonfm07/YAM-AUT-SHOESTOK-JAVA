package teste.elementsmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElementsMap {
	
	@FindBy(xpath = "//input[@id='search-input']")
	protected WebElement inputBarraBusca;
	
	@FindBy(xpath = "//h1[@class='logo image']")
	protected WebElement btnHome;
	
	@FindBy(xpath = "//button[@qa-automation='home-search-button']")
	protected WebElement btnBuscar;
	
	@FindBy(xpath = "//a[@qa-automation='home-cart-button']")
	protected WebElement btnCarrinho;
	
	
}
