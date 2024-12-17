```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 //or another appropriate default value 
  }
  return a + b
}

println myMethod(1, 2) //3
println myMethod(null, 2) //2
println myMethod(1, null) //1
println myMethod(null, null) //0
```