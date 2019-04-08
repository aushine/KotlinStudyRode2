import java.nio.ReadOnlyBufferException
import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


fun printHello(name:String?):Unit{
    return Unit
}
fun double(x:Int) :Int{
    return 0
}
infix fun Int.av(x:Int):Int{
    return 11
}

class User4(var map:MutableMap<String,Any>){
    var name:String by map
    var age:Int by map
}

class User3(var map:MutableMap<String,Any>){
    var name :String by map
    var age:Int by map

}

class User2(var map:Map<String,Any>){
    val name:String by map
    val age:Int by map
}
class User1{
    var name:String by Delegates.vetoable("Sakura"){
        prop,old,new ->
        println("旧值 $old  新值 $new")
        var result = true
        if(new.equals("Marie")){
            result = false
            println("name 属性的值不能是 Marie " )
        }
        result//一个布尔型属性,表示是允许还是否决属性的赋值
    }
}

class User{
    var name :String by Delegates.observable("Sakura"){
        prop,old,new -> //响应器函数的三个参数
        println("旧值 $old 新值 $new")

    }
}


class DelTest:ReadOnlyProperty<Nothing?,Int>{
    override fun getValue(thisRef: Nothing?, property: KProperty<*>): Int {
        return 10
    }
}

class MaxList<T:Comparable<T>>(list:List<T>):List<T> by list{
    fun max():T ?{
        if(size < 0)
            return null
        var t :T = get(0)
        forEach{
            it:T->
            if(t<it)
                t = it
        }
        return t
    }
}

public fun <T>delegate(initializer: () -> T):Delegate<T> = Delegate(initializer)
class MyClass1{
    //name委托给了delegate函数,并且指定了初始化函数
    var name:String by delegate{
        //此处的代码是委托类的初始化函数(通过主构造器传入)
        println("MyClass1.name初始化函数调用")
        "<Myclass2>"

    }
}
    class MyClass2{
        var name:String by delegate{
            println("MyClass2.name初始化函数调用")
            "<MyClass2>"
        }
    }
    class Delegate<T>(initializer:() -> T){
        var name:String = ""
        var className = initializer()
        operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
            println("${className}.get已经被调用")
            return name
        }
        operator fun setValue(thisRef:Any?,property:KProperty<*>,value:String){
            println("${className}.set已经被调用")
            name = value
        }
    }
