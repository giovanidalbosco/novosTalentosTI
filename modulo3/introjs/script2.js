a = 10;
console.log(a + " " + typeof(a));
console.log(`${a} ${typeof(a)}`);

a = 20.5;
console.log(`${a} ${typeof(a)}`);

// o == compara o conteúdo da variável independente do tipo da mesma
console.log(a == 20.5)
console.log(a == '20.5')

 // o === compara o conteúdo da variável considerando o tipo da mesma
console.log(a === 20.5)
console.log(a === '20.5')

a = true;
console.log(`${a} ${typeof(a)}`);

a = 'Hello World!';
console.log(`${a} ${typeof(a)}`);

b = [1 , 2]
b.push(3)
console.log(`${b} ${typeof(b)}`);

a = Array();
a[0] = 'lalala';
a.push('lalala');
console.log(`${a} ${typeof(a)}`);

a = new Object()
a.idade = 20
console.log(a + " " + typeof(a))
console.log(JSON.stringify(a))
console.log(typeof(JSON.stringify(a)))

b.idade = 30
console.log(b.idade + " " + typeof(b.idade))

function minhaFuncao(umNumero) {
    console.log(umNumero)
    console.log('fui clicado...')
    let caixinha = document.getElementById("valor")
    caixinha.value += umNumero
}
