const express = require('express');
const app = express();
const bodyparser = require('body-parser'); // serve para simplificar o acesso das informações transmitidas através do get, post

app.use(bodyparser.json());

const fakeData = [ //lista de objetos
    {
        id: 1,
        nome: 'Zezinho',
        endereco: 'Rua lalala',
        sexo: 'Masculino',
        telefone: '5555-1234',
    },
    {
        id: 2,
        nome: 'Mariazinha',
        endereco: 'Rua lululu',
        sexo: 'Feminino',
        telefone: '7777-4321',
    }
];

app.get("/api/v1/clientes", (req, res) => {
    res.writeHead(200, {"content-type": "application/json"});

    res.end(JSON.stringify(fakeData));
});

app.get("/api/v1/clientes/:id", (req, res) => {
    let id = req.params['id'];
    let umCliente = fakeData.find(x => x.id == id);

    if (umCliente != undefined) {
        http_res = 200;
        content_object = {"content-type": "aplication/json"}
    } else {
        http_res = 404;
        content_object = {};
    }

    res.writeHead(http_res, content_object);
    res.end(JSON.stringify(umCliente));
});

app.get("/api/v1/clientes/nome/:nome", (req, res) => {
    let nome = req.params['nome'];
    let umCliente = fakeData.filter(x => x.nome.includes(nome));

    if (umCliente == undefined) {
        http_res = 404;
        content_object = {};
    } else {
        http_res = 200;
        content_object = {"content-type": "aplication/json"};
    }

    res.writeHead(http_res, content_object);
    res.end(JSON.stringify(umCliente));
})

app.post("/api/v1/clientes", (req, res) => {
    let maiorID = Math.max(...fakeData.map(o => o.id));
    if (maiorID == -Infinity) maiorID = 0;

    let novoCliente = req.body;

    if(novoCliente.hasOwnProperty('nome')) {
        novoCliente.id = maiorID + 1;
        fakeData.push(novoCliente);

        http_res = 201;
        content_object = {"content-type": "aplication/json"};
    } else {
        http_res = 400;
        content_object = {};
    }

    res.writeHead(http_res, content_object);
    res.end(JSON.stringify(novoCliente));
});


app.put("/api/v1/clientes/:id", (req, res) => {
    let id = req.params['id'];
    let alteracoes = req.body;
    let umCliente = fakeData.find(x => x.id == id)

    if (umCliente == undefined) {
        http_res = 404;
    } else if (!req.body.hasOwnProperty('nome')) {
        http_res = 400;
    } else {
        http_res = 200;
        umCliente.nome = alteracoes.nome;
        umCliente.endereco = alteracoes.endereco;
        umCliente.sexo = alteracoes.sexo;
        umCliente.telefone = alteracoes.telefone;
    }

    res.writeHead(http_res, {"content-type": "aplication/json"});
    res.end(JSON.stringify(umCliente));
});


app.delete("/api/v1/clientes/:id", (req, res) => {
    let id = req.params['id'];
    let umCliente = fakeData.find(x => x.id = id);
    let posicao = fakeData.indexOf(umCliente);

    if (umCliente == undefined) {
        http_res = 404;
    } else {
        http_res = 200
        fakeData.splice(posicao, 1)
    }

    res.writeHead(http_res, {"content-type": "aplication/json"})
    res.end(JSON.stringify(umCliente))
});


app.listen(3000, () => {
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});
