void function() {
    console.log(mensagem);
}();

//elevação de variáveis
var mensagem = 'Univille';

var exibeMensagem = function() {
    if(true) {
        var escopoFuncao = 'Caelum';
        let escopoBloco = 'Alura';

        console.log(escopoFuncao);
        console.log(escopoBloco);
    }
    console.log(escopoFuncao);
}

exibeMensagem();
console.log(exibeMensagem.name);

void function() {
    //let teste = 1234;
    //let teste = "lalala"; // variáveis declaradas com o letnão podem ser redeclaradas
    const texto = 'Caelum';
    console.log(texto);
    //texto = 'Alura' //não é possível modificar uma variável declarada com const
}();

void function() {
    let frutas = ['laranja', 'maça', 'banana'];
    for (let umafruta in frutas) {
        console.log(`${frutas[umafruta]}`);
    }
}();
