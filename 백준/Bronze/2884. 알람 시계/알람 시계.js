const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(" ");
function solution(H, M) {
    let hour = Number(H);
    let minute = Number(M)-45;
    if(0 > minute){
        hour--;
        if(hour < 0)hour += 24;
        minute += 60;
        console.log(hour+" "+minute);
    }else{
        console.log(hour+" "+minute);
    };
};

solution(input[0],input[1])