const input = require('fs').readFileSync('/dev/stdin').toString().split("\n");

for(var i = 1;i<=input[0];i++){
    var a = input[i].split(' ');
   console.log("Case #"+i+": "+ (Number(a[0])+Number(a[1])));
    
}
    