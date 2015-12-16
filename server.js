/**
 *
 *
 **/
var express = require('express');
var bodyParser = require('body-parser');
var http = require('http');
var https = require('https');

var app = express(); // the main app
var path = require('path');
var fs         = require("fs");

// body parser
app.use(bodyParser.json()); // support json encoded bodies
app.use(bodyParser.urlencoded({ extended: true })); // support encoded bodies

// Express Routes
/**
 * Get's Main Client Page
 * Used to enable short request to /client
 */
app.route('/client')
    .get(function(req, res) {
        console.log('Accessing the client section ...');
        console.log(app.path());
        res.type('.html');
        res.sendFile(path.join(__dirname + '/view/index.html'));
    });
/**
 * Get's Main Admin Dashboard Page
 * Used to enable short request to /admin
 */
app.route('/booking')
    .get(function(req, res) {
        console.log('Accessing the booking section ...');
        console.log(app.path());
        res.type('.html');
        res.sendFile(path.join(__dirname + '/view/booking.html'));
    });

/**
 * Get's Main Admin Dashboard Page
 * Used to enable short request to /admin
 */
app.route('/form')
    .get(function(req, res) {
        console.log('Accessing the form section ...');
        console.log(app.path());
        res.type('.html');
        res.sendFile(path.join(__dirname + '/view/form.html'));
    });

/**
 * Serves everything else
 */
app.route('/*')
    .get(function(req, res) {
        res.sendFile(path.join(__dirname + '/view/'+req.params[0]));
    });

// Bind to port
http.createServer(app).listen(80);


