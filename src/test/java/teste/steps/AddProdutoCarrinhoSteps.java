package teste.steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import teste.pages.HomePage;
import teste.pages.ListaResultadoPage;
import teste.pages.PagamentoPage;
import teste.pages.VisualizarProdutoPage;
import teste.setup.Hooks;

public class AddProdutoCarrinhoSteps {
		
	HomePage homePage = new HomePage(Hooks.getDriver());
	ListaResultadoPage listaResultadoPage = new ListaResultadoPage(Hooks.getDriver());
	VisualizarProdutoPage visualizarProdutoPage = new VisualizarProdutoPage(Hooks.getDriver());
	PagamentoPage pagamentoPage = new PagamentoPage(Hooks.getDriver());
	
	@Quando("clico no item apresentado na lista de resultados")
	public void clico_no_item_apresentado_na_lista_de_resultados() throws InterruptedException {
	    listaResultadoPage.validarPaginaListaResultado();
		listaResultadoPage.clicarItem1();
	}

	@E("sou direcionado para pagina de visualzicao do produto e adiciono para o carrinho")
	public void sou_direcionado_para_pagina_de_visualzicao_do_produto_e_adiciono_para_o_carrinho() throws InterruptedException {
	    visualizarProdutoPage.validarPaginaVisualizarProduto();
	    visualizarProdutoPage.selecionarTamanho();
	    visualizarProdutoPage.clicarBtnConfirmar();
	    
	}

	@Então("valido o item incluido no carrinho na pagina de pagamento")
	public void valido_o_item_incluido_no_carrinho_na_pagina_de_pagamento() throws InterruptedException {
	    pagamentoPage.validarPaginaPagemento();
	    pagamentoPage.validarProdutoItem();
	}
}
