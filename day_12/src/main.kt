fun main(args:Array<String>) {

    val list = listOf<Int>(1,2,3)
    println(hasZeros(list))

    println(processProduct({name->"$name 中国" }))

    var str = "HelloWorld"
    println(str div "l")

    val map = mutableMapOf<Int,String>(1 to "eins", 2 to "zwei", 3 to "drei")
    map.forEach{_, value ->println(value)}

    val ints = mutableListOf<String>("Sakura","Marie","misaka","Hatsune")
    val doubled = ints.map({a:String -> 1})
    println(doubled)

    val body ={ ->"密码正确"}
    val lock = Lock()
    println(lock(lock,body))

    fun less(a:Int,b:Int):Boolean = b > a
    val less ={x:Int,y:Int -> y > x}
    val collection = mutableListOf<Int>(1, 2, 3, 4, 5, 9, 7)
    val newList = collection

    println(Max(collection,::less))

    var product = MobilePhone()
    //此处作为参数值传入高阶函数,须要在函数名钱加两个冒号(::)
    processProduct(product,::mobilePhoneArea)
    println(product)
    product.sell("miphone")
}