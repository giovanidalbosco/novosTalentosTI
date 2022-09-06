class Pessoa {
    constructor() { //no JS os atributos de classe devem ser criados no construtor
        this.nome;
        this.idade = 0;
    }

    gerarIdentidade() {
        return `${this.nome} - ${this.idade}`
    }

    get nomeCompleto() {
        return this.nome;
    }

    set nomeCompleto(nome) {
        this.nome = nome;
    }

}

class PessoaJuridica extends Pessoa {
    constructor(cnpj) {
        super(); //é necessário referenciar o construtor da classe pai
        this.CNPJ = cnpj;
    }
}

let umaPessoa = new Pessoa(); //quando há um construtor é obrigatório a instância com new

umaPessoa.nome = 'Zezinho';
console.log(umaPessoa.nome);
console.log(umaPessoa.gerarIdentidade());
umaPessoa.nomeCompleto = 'Zezinho da Silva';
console.log(umaPessoa.nomeCompleto);
umaPessoa.endereco = 'Rua lalala';
console.log(umaPessoa);

let empresa = new PessoaJuridica('012.345.678-90');

console.log(empresa)