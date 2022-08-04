// alert("olá mundo!");
console.log("mensagem bonita!");

document.getElementById('titulo').innerHTML = "Univille".toUpperCase();

let resposta = confirm("Voce mora em Joinville?");
alert("sua resposta foi " + resposta);

let outraResposta = prompt("Digite seu nome");
alert("Seu nome é " + outraResposta);

document.write("<p>testando!!</p>");

const style = document.createElement('style');
style.textContent = 'body { backgroud-color : green; }';
document.head.append(style);
