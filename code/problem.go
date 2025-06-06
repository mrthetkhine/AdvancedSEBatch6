package main

import (
	"errors"
	"fmt"
)

func process(a int) (int, error) {
	if a == 0 {
		return 0, errors.New("Zero error")
	} else if a == 1 {
		return 1, errors.New("One error")
	} else {
		return a, nil
	}
}

func main() {
	a := 0
	result, err := process(a)
	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Println(result)
	}
}
