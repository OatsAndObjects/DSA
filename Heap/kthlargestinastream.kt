class KthLargest(private val k: Int, nums: IntArray) {
    val queue = PriorityQueue<Int>()

    init {
        for (num in nums) {
            add(num)
        }
    }

    fun add(`val`: Int): Int {
        if (queue.size < this.k) {
            queue.add(`val`)
        } else if (`val` > queue.peek()) {
            queue.poll()
            queue.add(`val`)
        }

        return queue.peek()
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */