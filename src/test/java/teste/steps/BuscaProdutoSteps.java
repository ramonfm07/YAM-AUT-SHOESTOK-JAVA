package teste.steps;

import org.junit.Assert;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import teste.pages.HomePage;
import teste.pages.ListaResultadoPage;
import teste.setup.Hooks;


public class BuscaProdutoSteps {
	
	HomePage homePage = new HomePage(Hooks.getDriver());
	ListaResultadoPage listaResultadoPage = new ListaResultadoPage(Hooks.getDriver());
	
	
	
	@Dado ("que eu esteja na pagina inicial do site shoestok")
	public void que_eu_esteja_na_pagina_inicial_do_site_shoestok() throws InterruptedException {
		homePage.validarPaginaInicial();
	}
		
		
		
    @Quando ("faço uma busca e digito na barra de busca um produto e clico em buscar")
    public void faco_uma_busca_e_digito_na_barra_de_busca_um_produto_e_clico_em_buscar() throws InterruptedException {
    	homePage.inserirNomeDoProduto();
    	homePage.clicarBtnBuscar();
	}
    
    @Então ("sou direcionado para pagina da lista de resultados da busca")
    public void sou_direcionado_para_pagina_da_lista_de_resultados_da_busca() throws InterruptedException {
    	listaResultadoPage.validarPaginaListaResultado();
	}
}
