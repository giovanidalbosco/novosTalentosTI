function sum(a, b) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(a + b);
        }, 500);
    });
}

(async function () {
    const result = await sum(2, 2)
        .catch((err) => {
            console.log(err);
        });
    console.log(result);
})();
