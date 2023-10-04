var fs = require('fs');
var input = fs.readFileSync('dev/stdin').toString().split(" ");
let a = +input[0];
let b = +input[1];
let c = +input[2];

let a1 = (a+b)%c;
let a2 = ((a%c)+(b%c))%c;
let a3 = (a*b)%c;
let a4 = ((a%c)*(b%c))%c;
console.log(a1);
console.log(a2);
console.log(a3);
console.log(a4);