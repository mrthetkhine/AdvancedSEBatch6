function div(a , b)
{
    if(b==0)
    {
        return [,new Error('Division by zero')];
    }
    else
    {
        return [a/b];   
    }
}
let a = 10;
let b= 2;
let [result,error] = div(a,b);
if(error)
{
    console.log(error);
}
else
{
    console.log(result);
}