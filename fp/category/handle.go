package main

import "errors"

func div(a, b int) (int, error) {
	if b == 0 {
		return 0, errors.New("div by zero")
	} else {
		return a / b, nil
	}

}
func main() {
	result, err := div(10, 2)
	if err != nil {
		println(err)
	} else {
		println(result)
	}

}
