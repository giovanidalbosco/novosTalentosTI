function infinity() {
    let i = 0;
    while(true) {
        console.log(i++);
    }
}

function infinity2() {
    let i = 0;
    setTimeout(function() {
        console.log(i++)
        return i;
    }, 1000);
}

function date() {
    console.log(new Date());
    fazQrrCoisa();
}

function fazQrrCoisa() {
    console.log("qqr coisa");
}

//infinity();
let resultado = infinity2();
console.log("Result " + resultado);
date();
