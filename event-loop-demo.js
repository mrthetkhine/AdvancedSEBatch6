
f1();
function sleep(ms)
{
    return new Promise((resolve,reject)=>{
        setTimeout(resolve,ms);
    });
}
function sleep2(ms)
{
    let now = new Date();
    while( (new Date()- now)<ms)
        ;
}

async function  f1()
{
    setTimeout(()=>{
        console.log('Hello');
    },0);
    console.log('World');
    //await sleep(5000);
    sleep2(3000);
    console.log('After sleep');
}
