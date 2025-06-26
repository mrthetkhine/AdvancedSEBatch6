type Leaf = {
    name: string
}
type TreeNode = {
    name: string,
    children?: Leaf | Leaf[]
}

let tree: TreeNode = {
    name: "Root",
    children: [
        {
            name: "Child1",
            
        },
        {
            name: "Child2",
            
        }
    ]
}
console.log(tree);