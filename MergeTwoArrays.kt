import java.util.PriorityQueue

fun main() {
   var arr = arrayOf(10,5,6,2)
   var arr2 = arrayOf(12,7,9)
   val ans = mergeHeaps(arr,arr2)
   print(ans.contentToString())
}

fun mergeHeaps(arr1:Array<Int>,arr2:Array<Int>):Array<Int>{
    val size = arr1.size + arr2.size
    val ans = Array(size) { 0 }
    
    var i = 0

    while (i < arr1.size) {
        ans[i] = arr1[i]
        i++
    }

    var j = 0

    while (j < arr2.size) {
        ans[i] = arr2[j]
        i++
        j++
    }
    
    
    val n = ans.size
    for(i in ((n/2)-1) downTo 0){
        heapify(ans,i)
    }
    
    return ans
    
}


fun heapify(arr:Array<Int>,i:Int){
    var largest = i
    val left = 2*i+1
    val right = 2*i+2
    
    if(left<arr.size && arr[largest]<arr[left]){
        largest = left
    }
    
    if(right<arr.size && arr[largest]<arr[right]){
        largest = right
    }
    
    if(largest!=i){
        swap(arr,largest,i)
        heapify(arr,largest)
    }
    
}

fun swap(arr:Array<Int>,a:Int,b:Int){
   val temp = arr[a]
   arr[a] = arr[b] 
   arr[b] = temp
}
