const lista = ['😂','😊','😎','😀'];

for(let umitem of lista) {
    console.log(umitem);
}

const mapa = new Map(); //contem chave e valor

mapa.set('sapo', '🐸');
mapa.set('coruja', '🦉');
mapa.set('jacare', '🐊');

console.log(mapa);
console.log(mapa.get('sapo'));

const valoresUnicos = new Set(); //é uma lista com valores únicos

valoresUnicos.add('🐸');
valoresUnicos.add('🦉');
valoresUnicos.add('🐊');
valoresUnicos.add('🐸');

console.log(valoresUnicos);

function soma(x = 1, y = 2){ //parametros com valor default
    return x + y;
}
console.log(soma()); //x = 1, y = 2
console.log(soma(3)); //x = 3, y = 2
console.log(soma(3,5)); //x = 3, y = 5

let soma2 = (x=1 , y=2) => x + y
console.log(soma2());

function funcao() {
    for(let umItem of arguments) { //utilizando arguments é possivel passar parâmetros para uma função sem parâmetros
        console.log(umItem);
    }
}
funcao(1, 2)

function minhaFuncao(...valores) { //função com numero de argumentos indefinido
    let soma = 0;
    for(let i of valores){
        soma += i;
    }
    console.log(`Soma: ${soma}`);
}

//minhaFuncao(1)
minhaFuncao(1, 3, 6, 7, 8, 9);

const lista4 = ['🐸','🦉','🐊','🐶'];
let a, b, c, d;
[a, b, c, d] = lista4;
console.log(a);
console.log(b);
console.log(c);
console.log(d);

function novaFuncao(a,b,c,d) {
    console.log(a);
    console.log(b);
    console.log(c);
    console.log(d);
}
novaFuncao(...lista4); //SPREAD OPERATOR