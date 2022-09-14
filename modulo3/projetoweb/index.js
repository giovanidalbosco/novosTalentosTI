const express = require('express'); // é o jeito de importar do node.
const { engine } = require('express-handlebars');
const app = express();
const path = require('path');
const bodyparser = require('body-parser'); // serve para simplificar o acesso das informações transmitidas através do get, post
const { response } = require('express');


app.use(bodyparser.urlencoded({ extended:false }));
app.set('view engine', 'handlebars'); //seta o motor de renderização para o handlebars
app.engine('handlebars', engine()); //mostra para o node qual o motor será usado

app.use('/css', express.static(path.join(__dirname, 'node_modules/bootstrap/dist/css'))) // "instalação" do css do bootstrap no projeto
app.use('/js', express.static(path.join(__dirname, 'node_modules/bootstrap/dist/js'))) // "instalação" do javascript bootstrap no projeto
app.use('/js', express.static(path.join(__dirname, 'node_modules/jquery/dist'))) // "instalação" do javascript do jquery no projeto
app.use('/public', express.static(path.join(__dirname, 'public'))) // indica o caminho onde os arquivos estáticos do projeto estão alocados

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


app.get("/", function(req, res) {
    //res.send(`<h1>Eu não acredito! ${req.query['nome']} ${req.query['sobrenome']}</h1>`); // para passar o parâmetro nome é necessário fazer conforme -> http://localhost:3000/?nome=Zé
    res.render('index');
});


app.get("/clientes", function(req, res) {

    context = {
        fakeData: fakeData
    }

    res.render('cliente/cliente', context);
});

app.get("/clientes/novo", function(req, res) {
    res.render('cliente/formcliente');
});

app.post("/clientes/save", function(req, res) {
    
    if(req.body.nome === "") {
        // res.redirect("/clientes");
        res.render('cliente/formCLiente', {cliente: req.body})
        return;
    }

    let clienteAntigo = fakeData.find(x => x.id == req.body.id);

    if(clienteAntigo != undefined) {
        clienteAntigo.nome = req.body.nome;
        clienteAntigo.endereco = req.body.endereco;
        clienteAntigo.sexo = req.body.sexo;
        clienteAntigo.telefone = req.body.telefone;
    } else {
        let maiorID = Math.max(...fakeData.map(o => o.id));
        let novoCliente = {
            id: maiorID + 1,
            nome: req.body.nome,
            endereco: req.body.endereco,
            sexo: req.body.sexo,
            telefone: req.body.telefone,
        }

        fakeData.push(novoCliente);
    }

    res.redirect("/clientes");
});

app.get("/clientes/alterar/:id", function(req, res) {
    let id = req.params['id'];
    let umCliente = fakeData.find(x => x.id == id);

    context = {
        cliente: umCliente,
    }

    res.render('cliente/formcliente', context);
});

app.get("/clientes/deletar/:id", function(req,res) {
    let id = req.params['id'];
    id = parseInt(id) - 1;

    fakeData.indexOf()

    fakeData.splice(id,1);

    res.redirect("/clientes");

});

app.listen(3000, () => {
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});
