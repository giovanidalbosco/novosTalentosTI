const express = require('express');
const app = new express();

app.get("/", function(req, res) {
    res.json({
        msn: "Eu não acredido!"
    });
})

app.get("/date", function(req, res) {
    res.json({
        date: new Date()
    })
})

app.get("/infinity", function(req, res) {
    let i = 0;
    while (i < 50000) {
        console.log(i++);
    }
})

app.listen(8080);
