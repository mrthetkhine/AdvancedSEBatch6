
/**
 * 
stack {
    items:[],
    top:-1
}
 */
function push(stack,ele)//stack obj literal
{
    stack.items[++stack.top]= ele;
}


function pop(stack)
{
    let ele= stack.items[stack.top--];
    return ele;
}

let stack1={
    items:[],
    top: -1
};
push(stack1,10);
push(stack1,20);

console.log(pop(stack1));
console.log(pop(stack1));