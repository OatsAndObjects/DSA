/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val dp = Array(4){-1}
    val houses = arrayOf(2,7,9,3,1)
    var str = houseRobberOptm(4,houses)
    print(str)
} 

fun houseRobberRecur(i:Int,nums:Array<Int>):Int{
    
    if(i<=0){
        return nums[0] 
    }
    
    if(i==2){
        return maxOf(nums[0], nums[1])
    }
    
    return maxOf(nums[i]+houseRobberRecur(i-2,nums), houseRobberRecur(i-1,nums))
}

fun houseRobberTD(i:Int,nums:Array<Int>,dp:Array<Int>):Int{
    if(i<=0){
        return nums[0] 
    }
    
    if(i==2){
        return maxOf(nums[0], nums[1])
    }
   
    if(dp[i]!=-1){
        return dp[i]
    }
    
    dp[i] = maxOf(nums[i]+houseRobberTD(i-2,nums,dp), houseRobberTD(i-1,nums,dp))
    return dp[i]
}

fun houseRobberBU(i:Int,nums:Array<Int>,dp:Array<Int>):Int{
    dp[0]= nums[0]
    
    dp[1]= maxOf(nums[0], nums[1])
    
    
    for(i in 2 until nums.size){
        dp[i] = maxOf(nums[i]+dp[i-2], dp[i-1])
    }
    
    return dp[nums.size-1]
}

fun houseRobberOptm(n:Int,nums:Array<Int>):Int{
    if(n<=0){
        return nums[0]
    }
    
    if(n==2){
        return maxOf(nums[0],nums[1])
    }
    
    var current = -1 
    var prev1 = maxOf(nums[0],nums[1])
    var prev2 = nums[0]
    
    for(i in 2 until nums.size){
        current = maxOf(nums[i]+prev2,prev1)
        prev2 = prev1
        prev1 = current
    }
    return current
}



























