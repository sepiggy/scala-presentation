// 1. 函数声明
// 可以使用def创建函数
// 必须指明参数类型，若返回值类型可以自动推导，可以省略
def add(x: Int, y: Int) = {
  x + y
}

// 2. 匿名函数, 类似Java8的Lambda表达式
val add = (x: Int, y: Int) => x + y

// 3. 偏函数
val add1 = add(1, _)
add1(100)

// 4. 柯里化
// 函数柯里化保证每个函数只有一个输入和输出
def add_curry(x: Int)(y: Int): Int = x + y
val add1 = add_curry(1) _
add1(100)

// 5. 可变长函数
def add(xs: Int*) = {
  var sum = 0
  for (x <- xs) sum += x
  sum
}
add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

