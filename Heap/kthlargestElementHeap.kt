import java.util.PriorityQueue

fun main() {
   var arr = arrayOf(3,2,3,1,2,4,5,5,6)
   val ans = findKLargestElement(arr,4)
   print(ans)
}

fun findKLargestElement(arr:Array<Int>,K:Int):Int{
    val queue = PriorityQueue<Int>()
    for(i in 0 until K){
        queue.add(arr[i])
    }
    
    for(i in K until arr.size){
        if(queue.peek()<arr[i]){
            queue.poll()
            queue.add(arr[i])
        }
    }
    
    return queue.poll()
}

