// 1. 基本类型
// Scala的基本类型都是对象
// 1) 八种基本类型: Byte, Short, Int, Long, Boolean, Char, Float, Double
// 2) 这里的 + * / 等都是方法调用
1 + 2 * 3
(1 + 2) * 3
1.0 / 3.0

// 2. 字符串
"hello world"
"hello world".substring(0, 5)
"hello" + 1 + " " + "world" + 2
val x = "world"
s"hello $x"

// 3. 局部变量声明
// 1) val与var的区别 (尽量用val, 自文档描述, 防止错误赋值)
// 2) 语句声明不用分号
// 3) 类型后置声明
val x: Int = 1
x + 2
// error
// x = 3
x

var y: Int = 1
y + 2
y = 3
y

// 4) 类型自动推导推导
val x = 1

// 4. 元祖 (Tuple)
// 1) Tuple中的元素类型可以不相同
// 2) Tuple中的元素都是val声明的
// 3) 用途:
//    [1] 二元组是构成Map结构的基本元素
//    [2] 函数多返回值
val t = (1, true, "hello")
t._1
t._2
t._3
// error
// t._1 = 2

("name", "zhangsan")
"name" -> "zhangsan"

// 5. 数组 (Array)
// 1) Scala数组与Java数组不同
// 2) Scala数组支持泛型
val a = Array[Int](1, 2, 3, 4)
a(0)
a(1)

// 3) 类型推导
val a2 = Array("one", "two", "three", "four")