let obj = {
    name : "TK",
    age : 40,
    items: [10,20,30]//ref
};
let obj2= {
    ... obj
}
console.log('Obj == obj2 ',obj == obj2);
console.log('Obj ',obj);
console.log('Obj2 ',obj2);

obj.items.push(100);
console.log('Obj.items ',obj.items);
console.log('Obj2.items ',obj2.items);
console.log('Obj.items == obj2.items ',obj.items == obj2.items);

let obj3 = JSON.parse(JSON.stringify(obj2));
obj3.items.push(200);

console.log('Obj3.items ',obj3.items);
console.log('Obj2.items ',obj2.items);