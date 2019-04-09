fun main() {


    val b = null
    println(b ?:-1)

    val listWithNullls:List<String?> = listOf("A",null)
    for(item in listWithNullls){
        item?.let{println(it)}
    }
    val list:MutableList<String> = mutableListOf("a","b","c")
    var change:Any
    change = list.let{
        it.add("d")
        it.add("e")

    }

    println("list =$list")
    println("change= $change")
    val list2:MutableList<String> = mutableListOf("a","b","c")
    change = list2.apply{
        add("d")
        add("e")
        this.add("f")
    }
    println("list2 =$list2")
    println("change= $change")

    val list3:MutableList<String> = mutableListOf("a","b","c")
    change = with(list3){
        add("d")
        add("e")
        this.add("f")
        size
    }
    println("list3 =$list3")
    println("change= $change")
    val test1 = null
    val test2 = test1 as? Int
    var tes1 = 1
    println(tes1)
    val readWriteMap = hashMapOf("foo" to 1,"bar" to 2)
    println(readWriteMap["foo"])
    val snapshot:Map<String,Int> = HashMap(readWriteMap)
    println(snapshot)

    val map = mutableMapOf(1 to "eins", 2 to "zwei", 3 to "drei")
    println(map.values)
    val mapvalue = map.mapValues{entry -> "${entry.value}"}
    println(mapvalue)
    val a = person("Sakura",500)
    println(a)
    val (name,age) = a
    val a1 = a.component1()
    println("$a1 $age")
    val list1 = listOf<Int>(0, 1, 2)
    println(hasZeros(list1))
    println(processProduct({name -> "${name} 美国"},{name ->"${name} 中国"}))
}