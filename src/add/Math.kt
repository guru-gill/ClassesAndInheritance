package add

class Math() :Oprations() {
    override fun addTwo(A:Int,B:Int)=A+B+10

}
fun main()
{
    var math=Math()
    var s=math.subtwo(50,7).also { println("hello $it")  }
    math.addTwo(2,3).also { print("add $it") }
}

