/**
 * 1. if-else不仅是控制结构，更是表达式
 */
val s = if (2 % 2 == 0) "2是偶数" else "2是奇数"

/**
 * 2. for也可以作为表达式
 */
case class Stu(name: String, age: Int)

val stuList = List(Stu("zhangsan", 3), Stu("lisi", 4), Stu("wangwu", 5))

val result = for (s <- stuList if (s.age == 5)) yield s.name

result.foreach(name => println(name))

/**
 * 3. 语句块中的最后一个表达式作为返回值，很少使用return语句
 */
def add(x: Int, y: Int) = {
  x + y
}
add(1, 2)
