(function() {

    let botao = document.getElementById('botao');
    let cep = document.getElementById('cep');
    let retorno = document.getElementById('retorno')

    botao.onclick = function() {
        fetch(`https://cep.awesomeapi.com.br/json/${cep.value}`)
        .then(function(response) { //callback
            
            // response.text().then(function(text) {
            //     console.log(text);
            // });

            response.json().then(function(request) {
                if(response.status === 200) {
                    console.log(request.city);
                    console.log(request.address);
                    retorno.appendChild(document.createTextNode(`Cidade: ${request.city} Rua: ${request.address}`));
                    //retorno.innerHTML += request.cep
                } else {
                    console.log('Errou!');
                }
            });
        });
    }
})();



(async function() {
    const request = await fetch("https://cep.awesomeapi.com.br/json/89203001")
    const endereco = await request.json()
    
    console.log(endereco.city)
})();
