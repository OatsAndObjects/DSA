fun main() {
   var arr = arrayOf(1,3,6,5,9,8)
   val ans = heapHeight(6,arr)
   print(ans)
}

fun heapHeight(n:Int, arr:Array<Int>):Int{
    if(n==1)return 1
    var height = 0
    var size = n
    while(size>1){
        height++
        size/=2
    }
    return height
}