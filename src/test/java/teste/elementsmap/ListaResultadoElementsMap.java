package teste.elementsmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListaResultadoElementsMap {
	
	@FindBy(xpath = "//h1[@class='search-query']")
	protected WebElement tituloPaginaResultado;
	
	@FindBy(xpath = "//div[@data-position='0']")
	protected WebElement item1;
	
	@FindBy(xpath = "//div[@data-position='1']")
	protected WebElement item2;
	
	@FindBy(xpath = "//div[@data-position='2']")
	protected WebElement item3;
	
	
}
