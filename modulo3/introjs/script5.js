function* infinity() { //o * transforma a função em uma função geradora
    let i = 0;
    while(true) {
        console.log(i++);
        yield; // o yield é um ponto de parada em uma função geradora. pode haver mais de um yield na função
    }
}

function date() {
    console.log(new Date());
}

const infgen = infinity();
console.log(typeof(infgen));
infgen.next();
date();
infgen.next();
