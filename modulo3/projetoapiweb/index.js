const express = require('express');
const app = express();

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


app.listen(3000, () => {
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});
