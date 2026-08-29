fun main() {
   var arr = arrayOf(2,3)
   val ans = profitMax(arr,3)
   print(ans)
}

fun profitMax(arr:Array<Int>,B:Int):Int{
    val queue = PriorityQueue<Int>(){a,b->b.compareTo(a)}
    var audience = B
    var sum = 0
    arr.forEach{
        queue.add(it)
    }
    
    while(audience>0 && !queue.isEmpty()){
        val max = queue.poll()
        sum+=max
        if(max-1!=0){
            queue.add(max-1)
        }
        audience--
    }
    return sum
}