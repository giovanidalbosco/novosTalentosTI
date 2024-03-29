//closure
(function() {
    let btnInserir = document.getElementById("btninserir");
    let txtProduto = document.getElementById("txtproduto");
    let txtQtde = document.getElementById("txtqtde");
    let itens = document.getElementById("itens");
    let lista = [];
    btnInserir.onclick = click_btninserir;
    txtProduto.onkeydown = entrada_enter;
    txtQtde.onkeydown = entrada_enter;
    onload = atualiza_itens;

    function click_btninserir() {
        adiciona(txtProduto.value,txtQtde.value);
    }

    function click_btnexcluir() {
        exclui(this.id);
    }

    function entrada_enter(tecla) {
        if (tecla.key === 'Enter') {
            adiciona(txtProduto.value,txtQtde.value);
        }
    }

    function adiciona(produto, qtde) {
        lista.push(produto);
        lista.push(qtde)
        localStorage.setItem(0, lista);
        atualiza_itens();
    }

    function exclui(produto) {
        lista.splice(produto,2);
        localStorage.setItem(0, lista);
        atualiza_itens();
    }

    function atualiza_itens() {
        itens.innerHTML = "";
        lista = localStorage.getItem(0).split(',');
        for (let i = 0; i < localStorage.getItem(0).split(',').length; i+=2) {
        //for (let i in lista) {
            let umItem = localStorage.getItem(0).split(',')[i];
            let itemQtde = localStorage.getItem(0).split(',')[i+1];
            let li = document.createElement("li");
            li.appendChild(document.createTextNode(`Produto: ${umItem} Qtde: ${itemQtde}`));
            //li.id = umItem;
            //item = document.getElementById(li.id);
            itens.appendChild(li);
    
            let btn = document.createElement("button");
            btn.textContent = "Excluir";
            li.appendChild(btn);
            txtProduto.value = '';
            txtQtde.value = '';
            
            btn.setAttribute("class", "no-print");
            btn.id = i;
            btn.onclick = click_btnexcluir;
        }
    }

})();