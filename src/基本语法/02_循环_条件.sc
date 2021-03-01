// 1. for
// eg. 找出1到10中的所有偶数
// 写法1
for (i <- 1 to 10) {
  if (i % 2 == 0) print(i + " ")
}

// 写法2
// 与上等价，for支持卫语句
for (i <- 1 to 10; if i % 2 == 0) print(i + " ")

// 2. if-else
// 1) 既是控制结构，更是表达式 (等价于Java中的 "? :" 表达式)
// eg. 计算1到10中所有的偶数和
// 写法1
var total = 0
for (i <- 1 to 10) {
  if (i % 2 == 0) {
    total += i
  }
}
total

// 写法2
//var total = 0
//for (i <- 1 to 10) {
//  total += (if (i % 2 == 0) i)
//}
//total




