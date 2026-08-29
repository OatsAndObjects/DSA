import java.util.PriorityQueue

fun main() {
   var arr = arrayOf(2,4,6,8,10)
   val ans = chocolateMagician(arr,5)
   print(ans)
}

fun chocolateMagician(arr:Array<Int>,A:Int):Int{
    val queue = PriorityQueue<Int>(){a,b->b.compareTo(a)}
    var time = A
    arr.forEach{
        queue.add(it)
    }
    
    var maxChoc = 0
    while(time!=0 && !queue.isEmpty()){
        val choc = queue.poll()
        maxChoc+=choc
        if(choc/2!=0){
            queue.add(choc/2)
        }
        time--
    }
    return maxChoc
}