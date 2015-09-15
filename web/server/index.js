var express = require('express');
var app = express();

app.set('port', (process.env.PORT || 8080));

app.use(express.static(__dirname + '/public'));
app.use('/bower_components',  express.static(__dirname + '/bower_components'));

app.get('/', function(request, response) {
    response.sendFile(__dirname + '/public/index.html');
});

app.listen(app.get('port'), function() {
    console.log('Node app is running on port', app.get('port'));
});
