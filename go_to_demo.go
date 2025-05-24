package main

import "fmt"

func main() {
	i := 0
label1:
	fmt.Println("hello")
	goto end
	i += 1
	if i < 10 {
		//fmt.Println("i is ", i)
		goto label1
	}
end:
	fmt.Println("End")
}
