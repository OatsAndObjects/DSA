fun main() {
   var arr = arrayOf(4,3,2,6)
   val ans = minCostRope(arr)
   print(ans)
}

fun minCostRope(arr:Array<Int>):Int{
    val queue = PriorityQueue<Int>()
    arr.forEach{
        queue.add(it)
    }
    
    var cost = 0
    while(queue.size>1){
        var rope = queue.poll()
        rope+=queue.poll()
        cost+=rope
        queue.add(rope)
    }
    return cost
}

