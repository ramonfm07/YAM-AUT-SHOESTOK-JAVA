package teste.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import teste.elementsmap.ListaResultadoElementsMap;
import teste.utils.Utils;

public class ListaResultadoPage extends ListaResultadoElementsMap {

	public ListaResultadoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicarItem1() {
		item1.click();

	}

	// ========================================================VALIDAÇÕES==========================================================================

	public Boolean validarPaginaListaResultado() throws InterruptedException {

		Thread.sleep(2);
		return tituloPaginaResultado.isDisplayed();

	}
}
