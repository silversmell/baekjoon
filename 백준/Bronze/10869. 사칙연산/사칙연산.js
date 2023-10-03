var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
let a = +input[0];
let b = +input[1];


let a1=  a+b;
let a2 = a-b;
let a3 = a*b;
let a4 = Math.floor(a/b);
let a5 = a%b;
console.log(a1);
console.log(a2);
console.log(a3);
console.log(a4);
console.log(a5);