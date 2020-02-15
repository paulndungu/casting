import java.lang.annotation.Inherited

open class sum(){
    open fun sum(n1:Int , n2:Int, n3:Int): Int{
        return n1+n2+n3
    }
    fun sub(n1:Int,n2: Int,n3: Int): Int {
        return n1-n2-n3
    }
}
//----------------------------------------------------------------------------------------------------------------------
class multipurpose(): sum() {
    override fun sum(n1:Int , n2:Int, n3:Int): Int {
        return n1 + n2 + n3+4
    }
    fun div(n1:Float,n2:Float):Float{
        return n1/n2
    }
    fun prod(n1:Int,n2:Int):Int{
        return n1*n2
    }
    fun brack(n1:Int,n2:Int,n3:Int,n4:Int):Int{
        return (n1+n2)-(n3+n4)
    }
}

fun main(){

    var sum= sum()
    var add=sum.sum(11,12,13)
    println("Addition: $add")

    val sub= sum()
    var subract=sub.sub(11,12,13)
    println("Subtarction= $subract")

    println("------------------------------------")
//    ------------------------------------------------------------------------------------------------------------------
    val div= multipurpose()
    var over=div.div(21f,22f)
    println("Division: $over")

    val prod= multipurpose()
    var multiply=prod.prod(21,22)
    println("Multiplication: $multiply")

    val brack= multipurpose()
    var brackets=brack.brack(21,22,23,24)
    println("Brackets: $brackets")
//    ------------------------------------------------------
    val insum=sum()
    var insum2:Int?
    insum2=brack.sum(11,12,13)
    println("Inherited sum: $insum2")

}