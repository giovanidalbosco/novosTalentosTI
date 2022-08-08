equacao = 0
function entrada(numero) {
    equacao += String(numero)
    tela = document.getElementById("valor")
    tela.value += numero
}

function igual() {
    try {
        equacao = eval(equacao)
        tela = document.getElementById("valor")
        tela.value = equacao
    } catch(Exception) {
        tela.value = 'Operação Inválida!'
    }
}

function apaga() {
    equacao = ''
    tela = document.getElementById("valor")
    tela.value = equacao
}