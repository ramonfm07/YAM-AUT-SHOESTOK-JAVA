package teste.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import teste.elementsmap.VisualizarProdutoElementsMap;
import teste.utils.Utils;

public class VisualizarProdutoPage extends VisualizarProdutoElementsMap {

	public VisualizarProdutoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selecionarTamanho() {
		opTamanho.click();
		
	}

	public void clicarBtnConfirmar() {
		Utils.elementoClicavel(btnComprar, 20);
		btnComprar.click();

	}

//========================================================VALIDA��ES==========================================================================	

	public Boolean validarPaginaVisualizarProduto() throws InterruptedException {
		
		Thread.sleep(8);
		return previewProduto.isDisplayed();

	}
}
