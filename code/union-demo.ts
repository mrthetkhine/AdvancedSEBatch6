type Circle ={
    radius :number
}
type Rectangle = {
    width: number,
    height: number
}
type Shape = Circle | Rectangle
function getArea(shape: Shape){
    if('radius' in shape){
        return Math.PI * shape.radius * shape.radius
    }
    return shape.width * shape.height
}
type Color = {
    color:string
}
type ShapeWithColor = Shape & Color
