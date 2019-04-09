
@Target (AnnotationTarget.CLASS,AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class MyAnnotatonClass
//operator fun<K,V>Map.Entry<K,V>.component1()=getKey()
//operator fun <K, V> Map.Entry<K, V>.component2() = getValue()

@MyAnnotatonClass class Foo{
    @MyAnnotatonClass fun baz(@MyAnnotatonClass foo:Int):Int{
        return (@MyAnnotatonClass 1)
    }
}
annotation class special(val why:String)

class A{
    inner class B{
        fun Int.foo(){
            val a = this@A
            val b = this@B

            val c = this //foo的接收者
            val c1 = this@foo

            val funList = lambda@ fun String.(){
                val d = this
            }
            val funLit2 = {s:String ->
                val d1 = this
            }
        }
    }
}

fun Long.downTo(other:Int):LongProgression{
    return LongProgression.fromClosedRange(this,other.toLong(),-1L)

}
fun <T> async(block:suspend ()->T){

}
data class person(var name:String,var age:Int)
fun deletePerson(id:Int):person{
    println("已成功删除指定person")
    val person = person("Bill",34)
    return person
}
inline fun processProduct(area1:(name:String)->String,
                          noinline area2:(name:String)->String):String{
    return area1("apple")+" "+area2("xiaomi")
}
fun hasZeros(ints:List<Int>):Boolean{
    ints.forEach {
        if (it == 0)  return true
    }
    return false
}








