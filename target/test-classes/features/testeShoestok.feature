# language: pt
Funcionalidade: teste

  #Cenário: Realizar busca
    #Dado que eu esteja na pagina inicial do site shoestok
    #Quando faço uma busca e digito na barra de busca um produto e clico em buscar
    #Então sou direcionado para pagina da lista de resultados da busca

  Cenário: Incluir produto no carrinho
    Dado que eu esteja na pagina inicial do site shoestok
    E faço uma busca e digito na barra de busca um produto e clico em buscar
    Quando clico no item apresentado na lista de resultados
    E sou direcionado para pagina de visualzicao do produto e adiciono para o carrinho
    Então valido o item incluido no carrinho na pagina de pagamento

