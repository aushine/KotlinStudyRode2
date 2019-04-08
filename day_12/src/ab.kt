//max(strings,{a, b -> a.length <b.length})
fun hasZeros(ints:List<Int>):Boolean{
    ints.forEach {
        if (it == 0) return true
    }
    return false
}

inline fun processProduct(area:(name:String)->String):String{
    return area("华为")
}
infix fun String.div(str:String):String{
    return this.replace(str,"")
}

fun <T,R>List<T>.map(transform:(T)->R):List<R>{
    val result = arrayListOf<R>()
    for(item in this)
        result.add(transform(item))
    return result
}

class Lock(){
    fun lock(){
        println("上锁")
    }
    fun unlock(){
        println("解锁")
    }
}

fun <T> lock(lock:Lock,body:()->T):T {
        lock.lock()
        try{
            return body()
        }
        finally {
            lock.unlock()
        }

}

fun <T>Max(collection:Collection<T>,less:(T,T) ->Boolean):T?{
    var max:T? = null
    for(it in collection)
        if(max == null || less(max,it))
            max = it
    return max
}
fun compare(a:String,b:String):Boolean = a.length < b.length
interface Product{
    var area:String
    fun sell(name:String)
}
class MobilePhone:Product{
    override var area:String = ""
    override fun sell (name:String){
        println("售出${name}")
    }
    override fun toString():String{
        return area
    }
}
fun mobilePhoneArea(name:String):String{
    return "${name} 中国"
}
fun processProduct(product:Product,area:(name:String)->String):Product{
    product.area = area("华为")
    return product
}

