// 1. 方法定义
def hello(name: String): String = {
  "hello " + name
}

hello("world")
hello(name = "world")

// 2. 函数定义
// 函数本身是值，可以赋值给变量，可以当作函数的参数和返回值
val hello: String => String = "hello " + _
hello("world")



