package teste.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import teste.elementsmap.PagamentoElementsMap;
import teste.elementsmap.VisualizarProdutoElementsMap;
import teste.utils.Utils;

public class PagamentoPage extends PagamentoElementsMap {
	

		public PagamentoPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}


		public void clicarBtnEscolherMaisPdt() {
			btnEscolherMaisPdt.click();

		}

	//========================================================VALIDAÇÕES==========================================================================	

		public Boolean validarPaginaPagemento() throws InterruptedException {
			
			return tituloMeuCarrinho.isDisplayed();

		}
		
		public Boolean validarProdutoItem() throws InterruptedException {

			
			return produtoItem.isDisplayed();

		}
	}


