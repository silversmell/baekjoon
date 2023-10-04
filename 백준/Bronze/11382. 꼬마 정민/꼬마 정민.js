var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(" ");
let a = +input[0];
let b = +input[1];
let c = +input[2];

console.log(a+b+c);