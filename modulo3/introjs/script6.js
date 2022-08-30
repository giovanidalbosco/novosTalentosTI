// function sum(a, b) {
//     setTimeout(() => {
//         return a + b;
//     }, 500);
// }

// const a = sum(2, 2);


// setTimeout(() => {
//     console.log(a);
// }, 600);

// setTimeout(console.log(a), 10);


function sum(a, b, callbackfunction) {
    setTimeout(() => {
        callbackfunction(a + b);
    }, 500);
}

//const b = sum(2, 2);
//console.log(b);

sum(2, 2, function(result) {
    console.log(result);
});


