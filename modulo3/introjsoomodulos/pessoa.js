export default class Pessoa { //para realizar um export default só pode ter um export no arquivo
    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

/*export*/ class Cidade {
    constructor(nome) {
        this.nome = nome;
    }
}

/*export*/ function soma(num1, num2) {
    return num1 + num2;
}

// o export pode ser feito tambem conforme abaixo:
// obs.: para isso é necessário retirar o export da frente de cada classe, função, ...

// export {
//     Pessoa, Cidade, soma,
// }