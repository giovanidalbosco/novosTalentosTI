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

    if (umCliente != undefined) {
        http_res = 200;
        content_object = {"content-type": "aplication/json"}
    } else {
        http_res = 404;
        content_object = {};
    }

    res.writeHead(http_res, content_object);
    res.end(JSON.stringify(umCliente));
})

app.post("/api/v1/clientes", (req, res) => {
    let maiorID = Math.max(...fakeData.map(o => o.id));

    console.log(req.body)

    if(req.body != undefined) {
            novoCliente = {
            id: maiorID + 1,
            nome: req.body.nome,
            endereco: req.body.endereco,
            sexo: req.body.sexo,
            telefone: req.body.telefone
        }
        fakeData.push(novoCliente);
        http_res = 201;
        content_object = {"content-type": "aplication/json"};
    } else {
        http_res = 400;
        content_object = {};
        novoCliente = undefined;
    }

    res.writeHead(http_res, content_object);
    res.end(JSON.stringify(novoCliente));
});


app.listen(3000, () => {
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});
