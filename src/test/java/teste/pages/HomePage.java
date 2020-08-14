package teste.pages;

import javax.swing.text.Element;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;

import teste.utils.Utils;
import teste.elementsmap.HomeElementsMap;

public class HomePage extends HomeElementsMap {
	
	public HomePage(WebDriver driver) { 
			PageFactory.initElements(driver, this);		
		}
	
	
	public void inserirNomeDoProduto() throws InterruptedException { 
		
		Utils.elementoClicavel(btnBuscar, 20);
		inputBarraBusca.sendKeys("tenis");
		
	
	}
	
	public void clicarBtnBuscar() { 
		Utils.elementoClicavel(btnBuscar, 20);
		btnBuscar.click();
		
		
		
	
	}
		
	
	
	
	
	
//========================================================VALIDA��ES==========================================================================	
	
	
	
	
	public Boolean validarPaginaInicial() throws InterruptedException {
		return btnHome.isDisplayed();
				
	}
}
