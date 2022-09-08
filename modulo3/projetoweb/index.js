const express = require('express'); // é o jeito de importar do node.
const { engine } = require('express-handlebars');
const app = express();


app.set('view engine', 'handlebars'); //seta o motor de renderização para o handlebars
app.engine('handlebars', engine()); //mostra para o node qual o motor será usado

app.get("/", function(req, res) {
    //res.send(`<h1>Eu não acredito! ${req.query['nome']} ${req.query['sobrenome']}</h1>`); // para passar o parâmetro nome é necessário fazer conforme -> http://localhost:3000/?nome=Zé
    res.render('index');
})

app.listen(3000, () => {
    console.log("Servidor online");
    console.log("http://localhost:3000/");
});

