const express = require('express'); // é o jeito de importar do node.
const { engine } = require('express-handlebars');
const app = express();
const path = require('path');

app.set('view engine', 'handlebars'); //seta o motor de renderização para o handlebars
app.engine('handlebars', engine()); //mostra para o node qual o motor será usado

app.use('/css', express.static(path.join(__dirname, 'node_modules/bootstrap/dist/css')))
app.use('/js', express.static(path.join(__dirname, 'node_modules/bootstrap/dist/js')))
app.use('/js', express.static(path.join(__dirname, 'node_modules/jquery/dist')))
app.use('/public', express.static(path.join(__dirname, 'public')))

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
    res.render('cliente/cliente', {fakeData: fakeData});
});

app.listen(3000, () => {
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});

