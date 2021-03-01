// 1. 类的声明
class Stu {
  val name: String = "xiaoming"

  def speak() = println(s"my name is $name")
}

(new Stu).speak()

// 2. 主构造函数
// 构造函数不是特殊的方法，他们是除了类的方法定义之外的代码
// 这里增加一个构造函数参数，并用它来初始化内部状态
class Stu(name: String) {

  def speak() = println(s"my name is $name")
}

(new Stu("xiaohong")).speak()
