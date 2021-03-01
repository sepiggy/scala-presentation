// 1. 可以用class关键字声明一个类，并用new关键字进行实例化
class Foo(x: Int) {
  def printMsg(msg: String): Unit = {
    println(msg + x)
  }
}

class Foo(val x: Int) {
  def printMsg(msg: String): Unit = {
    println(msg + x)
  }
}

class Foo(var x: Int) {
  def printMsg(msg: String): Unit = {
    println(msg + x)
  }
}

val f = new Foo(1)
f.printMsg("hello")
f.x
f.x = 2

// 2. Trait类似于面向对象的接口
trait 图形 {
  def 周长: Double
}

class 长方形(x: Double, y: Double) extends 图形 {
  def 周长 = 2 * (x + y)
}

class 圆形(r: Double) extends 图形 {
  def 周长 = 2 * 3.14 * r
}

