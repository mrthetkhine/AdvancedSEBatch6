package main

import "fmt"

type Flyable interface {
	fly()
}
type Bird struct {
}

func (b Bird) fly() {
	fmt.Println("Bird Fly")
}

type Aeroplane struct {
}

func (a Aeroplane) fly() {
	fmt.Println("Aeroplane Fly")
}
func main() {
	var b Bird
	var a Aeroplane
	var flyable Flyable
	flyable = b
	flyable.fly()

	flyable = a
	flyable.fly()
}
