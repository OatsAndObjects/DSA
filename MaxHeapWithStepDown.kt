fun main(){
   val heap  =  MaxHeap(3,4,5,6,7,8,9,10)
   heap.buildMaxHeap()
}

class MaxHeap(vararg elements:Int){
    private val array =  elements.clone()
    private var size = array.size
    private var totalSize = array.size
    
    
    fun buildMaxHeap(){
        for(i in (totalSize-1)/2 downTo 0){    
            heapify(i)
        }
        printIt()
    }
    
    fun printIt(){
        print(array.take(size).toString())
    }
    
    private fun heapify(index:Int){
        var largest = index
        val left = 2*index+1
        val right = 2*index+2
        
        if(left<totalSize && array[left]>array[largest]){
            largest = left
        }
        
        if(right<totalSize && array[right]>array[largest]){
            largest = right
        }
        
        if(largest!=index){
            swap(largest,index)
            heapify(largest)
        }
    }
    
    fun swap(index1:Int, index2:Int){
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    }
    
}