fun main() {
    var stacks = Stack()
    var String = "AdaLab"
    for (c in String){
        stacks.push(c)
    }
    var result = mutableListOf<Char>()
    while (!stacks.isEmpty()){
        result.add( stacks.pop()!!)
    }
    println(result.joinToString { ""})

//    stacks.push(67)
//    stacks.push(32)
//    stacks.push(45)
//    println(stacks.peek())
//    stacks.pop()
//    stacks.push(18)
//    var x = stacks.pop()
//    var y =stacks.pop()
//    var z=x!!+y!!
//    println(z)

}
class Stack{
    var data = mutableListOf<Char>()

    fun push(value: Char){
        data.add(value)
    }

    fun pop(): Char? {
        if (data.isEmpty()){
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Char?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}