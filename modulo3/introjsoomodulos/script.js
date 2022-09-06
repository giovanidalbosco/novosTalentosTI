let pessoa = {
    nome: 'Zezinho',
    idade: 22,
    reservista: true,
    cidade: {nome: 'Joinville', estado: 'Santa Catarina'},
    telefones: ['555-5555', '9999-9999'],
    
    geraEndereco: function() {
        let todosOsTel = "";
        for(let umTelefone of this.telefones) {
            todosOsTel += umTelefone + " ";
        }
        return `${this.cidade.nome} - ${todosOsTel}`;
    },

    //Encapsulamento de variáveis
    get nomeCompleto() {
        return this.nome;
    },

    set nomeCompleto(nome) {
        this.nome = nome;
    }

}

console.log(typeof(pessoa));
console.log(pessoa);
console.log(pessoa.nome);
console.log(pessoa['nome']); //é possível acessar o atributo no formato de index
pessoa.nome = 'Zezinho da Silva'
console.log(pessoa.nome);

pessoa.endereco = 'Rua lalala 100'; //é possível criar novos atributos que não existiam no objeto no momento da sua definição
console.log(pessoa);

console.log(JSON.stringify(pessoa));

let objTexto = '{"nome":"mariazinha"}';
let objjs = JSON.parse(objTexto);
console.log(objjs);

console.log(pessoa.geraEndereco());

//Encapsulamento de variáveis
pessoa.nomeCompleto = 'Zezão';
console.log(pessoa.nomeCompleto);