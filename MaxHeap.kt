/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val maxHeap = MaxHeap(6)
    maxHeap.insert(10)
    maxHeap.insert(4)
    maxHeap.insert(6)
    maxHeap.insert(8)
    maxHeap.insert(12)
    maxHeap.insert(14)
    maxHeap.print()
    maxHeap.delete()
    maxHeap.print()
}


class MaxHeap(n:Int){
    private val arr = Array<Int>(n){0}
    private var size = 0
    private var totalSize = n
    
    fun insert(values:Int){
        if(size>=totalSize){
           print("HeapOverflow")
           return
        }
        
        arr[size] = values
        var index = size
        size++
        
        while(index>0 && arr[(index-1)/2]<arr[index]){
           swap((index-1)/2,index,arr)
           index = (index-1)/2
        }
        
    }
    
    fun delete(){
        if(size==0){
            print("Heap is Empty")
            return
        }
        arr[0]= arr[size-1]
        arr[size-1] = 0
        size--
        if(size==0) return
        heapify(0)        
    }
    
   fun print(){
       print(arr.take(size).toString())
   }
    
    fun heapify(index:Int){
        var largest = index
        val left = 2*index+1
        val right = 2*index+2
        
        if(left<size && arr[largest]<arr[left]){
            largest = left
        }
        
        if(right<size && arr[largest]<arr[right]){
            largest = right
        }
        
        if(largest!=index){
            swap(largest,index,arr)
            heapify(largest)
        }
        
    }
    
    fun swap(a:Int,b:Int,arr:Array<Int>){
        val temp = arr[a]
        arr[a] = arr[b]
        arr[b] = temp
    }
}