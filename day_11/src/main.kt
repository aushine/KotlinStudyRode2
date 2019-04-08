fun main() {

    println(1 av 2)

    var mutableMap = mutableMapOf<String,Any>(
        "name" to "mike",
        "age" to  14
    )
    val user4 = User4(mutableMap)
    println(user4.name)
    println(user4.age)
    user4.name = "Hatsune"
    user4.age = 17
    println(mutableMap)
    mutableMap.put("a",34)
    println(user4.age)


    var map2 = mutableMapOf<String,Any>(
        "name" to "Marie Rose",
        "age" to 17
    )
    val user3 = User3(map2)
    println(user3 .name)
    println(user3.age)
    user3.name = "Hatsune"
    user3.age = 16
    println(user3 .name)
    println(user3.age)
    map2.put("mikoto",17)
    println(user3.age)


    var map = mapOf(
        "name" to "Sakura",
        "age" to 500
    )
    val user2 = User2(map)
    println(user2.age)
    println(user2.name)

    val user1 = User1()
    user1.name = "Hatsune"
    user1.name = "Marie"
    println("username is ${user1.name}")

    val user = User()
    user.name = "Marie"
    user.name = "hatsune"

    val lazyValue:String by lazy{
        //次属性初始化函数的执行部分,仅会执行一次
        println("HelloWorld")
        "Crazy"
    }
    println(lazyValue)
    println(lazyValue)
    val list = listOf<Int>(12,3,4,5)
    val ml = MaxList<Int>(list)
    println(ml.max())
    println(list.max())
    var c1 = MyClass1()
    var c2 = MyClass2()
    c1.name = "Bill"
    c2.name = "Sakura"
    println(c1.name)
    println(c2.name)
}