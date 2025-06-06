let numbers =[1,-2,3,4,-1,100];
let sum = numbers.reduce((a,b)=>{
    console.log('A ',a, ' B ',b);
    return a+b;
});
console.log('Sum ',sum);
let min = numbers.reduce((a,b)=>{
    return a>b?b:a;
});
console.log('Min ',min);