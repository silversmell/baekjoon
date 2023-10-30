const input = 
    require('fs').
    readFileSync('/dev/stdin')  
    .toString()
    .split(" ");
    

var a = Number(input[0]);
var b = Number(input[1]);
var c = Number(input[2]);

if(a==b&&b==c){
    console.log(10000+(a*1000));
}
  else if(a!=b&&b!=c&&a!=c){
    var sortNums = input.sort();
    if(sortNums[2]==a){
        console.log(a*100);
    }else if(sortNums[2]==b){
        console.log(b*100);
    }else if(sortNums[2]==c){
        console.log(c*100);
    }
} else{
    if(a==b&&a!=c){
        console.log(1000+(a*100));
    }else if(a==c&&a!=b){
        console.log(1000+(a*100));
    }else if(b==c&&b!=a){
        console.log(1000+(b*100));
    }
}
