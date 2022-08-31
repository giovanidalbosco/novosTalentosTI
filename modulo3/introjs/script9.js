let lista = ['café','café','leite','café'];
console.log(lista);
for(let i = 0; i < 4; i++) {
    if(lista[i] === 'leite') {
        lista[i] = 'suco';
    }
}
console.log(`lista: ${lista}`);

let novalista = lista.map((x) => (x === 'suco'?'leite':x)); //map mapeia cada elemento da lista, passando por uma função que pode alterar o valor do elemento
console.log(novalista);
novalista = lista.map(function (item) {
    if(item === 'suco')
        return 'leite';
    return item;
})
console.log(`novalista: ${novalista}`);


//for x in lista: x === 'suco'?'leite':x

let lista2 = novalista.map((x) => (x === 'leite'?1:0));
console.log(`lista2: ${lista2}`);
let total = lista2.reduce((soma, item) => soma + item); //reduce realiza a redução dos elementos de um array para um único valor, a partir de uma função que recebe dois parâmetros(acumulador, item)
console.log(total);

let total2 = [1,2,3].map((z) => (z + 1));
console.log(total2);

//Arrow function: função javaScript escrita em uma única linha (normalmente) para representar uma lógica simples.

let lista3 = novalista.filter((item) => item === 'café'); //filter filtra os elementos a partir de uma outra função que deve retornar verdadeiro ou falso

console.log(`lista3: ${lista3}`);

let procura = lista3.find((item) => item === 'café');
console.log(procura);

let posicao = lista3.findIndex((item) => item === 'café');
console.log(posicao);

let preencher = lista.fill('sapo');
console.log(preencher);

let algum = lista.some((item) => item === 'sapo');
console.log(algum);

let todos = lista.every((item) => item === 'sapo');
console.log(todos)