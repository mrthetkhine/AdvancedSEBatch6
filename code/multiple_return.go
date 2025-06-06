package main

import (
	"errors"
	"fmt"
)

func div(a, b int) (int, error) {
	if b == 0 {
		return 0, errors.New("Division by zero")
	} else {
		return a / b, nil
	}
}

func main() {
	a := 10
	b := 2
	result, err := div(a, b)
	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Println(result)
	}
}
