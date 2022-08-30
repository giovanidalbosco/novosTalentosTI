function sum(a, b) {
    return new Promise(function(resolve, reject) { //a Promise termina quando o código chega em um resolve ou um reject
        if(a < 0 || b < 0) {
            reject("Valores negativos não suportados");
        }
        setTimeout(() => {
           resolve(a + b); 
        }, 500);
    });
}

const a = sum(2, 2).then((result) => { //then retorna uma Promisse quando a mesma retorna um resolve
    console.log(result);
}).catch((err) => { //catch retorna uma Promisse quando a mesma retorna um reject
    console.log(err);
});
console.log(a);