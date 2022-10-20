var priteshFirstModule = require("pritesh-first-module")
var mysql = require('mysql');
priteshFirstModule.printMsg();
console.log(priteshFirstModule.myDateTime());




var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "Gurukrupa@123",
  database: "menagerie"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
  /*
  con.query("SELECT * FROM Manufacturers", function (err, result, fields) {
    if (err) throw err;
    console.log(result);
  });
  */

  con.query("SELECT * FROM Manufacturers", function (err, result, fields) {
    if (err) throw err;
    console.log(fields);
  });

});