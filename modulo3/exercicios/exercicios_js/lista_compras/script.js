//closure
(function() {
    let btnInserir = document.getElementById("btninserir");
    let txtProduto = document.getElementById("txtproduto");
    let itens = document.getElementById("itens");
    let lista = [];
    btnInserir.onclick = click_btninserir;
    onload = atualiza_itens;

    function click_btninserir() {
        adiciona(txtProduto.value);
    }

    function click_btnexcluir() {
        exclui(this.id);
    }

    function adiciona(produto) {
        lista.push(produto);
        localStorage.setItem(0, lista);
        atualiza_itens();
    }

    function exclui(produto) {
        lista.splice(produto,1);
        localStorage.setItem(0, lista);
        atualiza_itens();
    }

    function atualiza_itens() {
        itens.innerHTML = "";
        lista = localStorage.getItem(0).split(',');
        for (let i = 0; i < localStorage.getItem(0).split(',').length; i++) {
        //for (let i in lista) {
            let umItem = localStorage.getItem(0).split(',')[i];
            let li = document.createElement("li");
            li.appendChild(document.createTextNode(umItem));
            //li.id = umItem;
            //item = document.getElementById(li.id);
            itens.appendChild(li);

            let btn = document.createElement("button");
            btn.textContent = "Excluir";
            li.appendChild(btn);
            txtProduto.value = '';
            
            btn.id = i
            btn.onclick = click_btnexcluir;
        }
    }

})();