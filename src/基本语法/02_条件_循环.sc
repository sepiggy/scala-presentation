// 1. if-else
// 1) if-else与大多数语言中一样是控制结构
def evenOrOdd(n: Int) = {
  if (n % 2 == 0) {
    "偶数"
  } else {
    "奇数"
  }
}

evenOrOdd(1)
evenOrOdd(2)

// 2) if-else更是一种表达式! (等价于Java中的 "? :" 表达式)
def evenOrOdd(n: Int) = {
  // if-else作为表达式进行变量赋值
  val res = if (n % 2 == 0) "偶数" else "奇数"
  res
}

evenOrOdd(1)
evenOrOdd(2)

// 2. while
def echo5(msg: String) = {
  var i = 1
  while (i <= 5) {
    println(msg)
    i += 1
  }
}
echo5("hello scala")

// 3. for
// 1) 结构: for (name <- iterable) expression
// 2) iterable可以是String, Range, List
def echo5(msg: String) = {
  for (i <- 1 to 5) {
    println(msg)
  }
}
echo5("hello scala")





