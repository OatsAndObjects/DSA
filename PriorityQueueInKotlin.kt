import java.util.PriorityQueue

fun main() {
   val maxHeap = PriorityQueue<Int>{a,b -> b.compareTo(a)}
    maxHeap.add(1)
    maxHeap.add(9)
    maxHeap.add(8)
    maxHeap.add(5)
    
    print(maxHeap.poll())
    
    //9
    
    
    val minHeap = PriorityQueue<Int>()
    
    minHeap.add(1)
    minHeap.add(9)
    minHeap.add(8)
    minHeap.add(5)
    
    print(minHeap.poll())
    
    //1
    
}