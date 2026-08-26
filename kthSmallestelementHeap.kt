import java.util.PriorityQueue

fun main() {
   var arr = arrayOf(7,10,4,3,20,15)
   val ans = findKSmallesElement(arr,3)
   print(ans)
}

fun findKSmallesElement(arr:Array<Int>, K:Int):Int{
    val queue = PriorityQueue<Int>(){a,b -> b.compareTo(a)}
    var check = K
    for(i in 0 until K){
        queue.add(arr[i])
    }
    
    while(check!=arr.size-1){
        val max = queue.poll()
        if(arr[check]<max){
            queue.add(arr[check])
        }else{
            queue.add(max)
        }
        check++
    }
    
    return queue.poll()
    
}

